/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.escuelaing.arem.ASE.app;

/**
 *
 * @author David Coronado
 */
import spark.Request;
import spark.Response;
import static spark.Spark.*;
public class SparkWebApp {
    
    
    public static void main(String[] args) {
        port(getPort());
        
        get("/hello", (req, res) -> inputDataPage(req, res));
        get("/results", (req, res) -> resultsPage(req, res));
        
    }
    private static String inputDataPage(Request req, Response res) {
       String pageContent
                = "<!DOCTYPE html>"
                + "<html>"
                + "<body>"
                + "<h2>Calculadora de media y desviación estandar</h2>"
                + "<br><br><p> Ingresa el conjunto de datos separados por una coma (,) </p>"
                + "<form action=\"/results\">"
                + "  Dates:<br>"
                + "  <input type=\"text\" name=\"Dates\" value=\"\">"
                + "  <br><br>"
                + "  <input type=\"submit\" value=\"Submit\">"
                + "</form>"
                + "<p>If you click the \"Submit\" button, the form-data will be sent to a page called \"/results\".</p>"
                + "</body>"
                + "</html>";
        return pageContent;
    }
    private static String resultsPage(Request req, Response res) {
        
        App calculadora = new App();
        String value = req.queryParams("Dates");
        String pageContent="<h2>Promedio</h2><br>"
                            +String.valueOf(calculadora.calculateMean(value))      
                            +"<br><h2>Desviación estandar</h2><br>"
                            +String.valueOf(calculadora.calculateStandardDeviation(value));           
        return pageContent;
    }

    static int getPort() {
            if (System.getenv("PORT") != null) {
                    return Integer.parseInt(System.getenv("PORT"));
            }
            return 4567; //returns default port if heroku-port isn't set(i.e. on localhost)
 }
}
