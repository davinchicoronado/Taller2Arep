package edu.escuelaing.arem.ASE.app;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import org.apache.commons.math3.util.Precision;



/**
 *
 *@author David Coronado
 */
public class App 
{   

    /**
    * Calcula la madia dada una linkedlist con los valores de la muestra
    * @param conjunto de números separados por coma
    * @return el valor de la media de tipo double 
    */
    public double calculateMean(String directory){
        
        double mean=0;
 
        Reader lector = new Reader();
        Collection<Double> sample = lector.readText(directory);
        
        Iterator<Double> iterador = sample.iterator();
        while(iterador.hasNext()){
            mean+=iterador.next();;
           
        }
        mean=Precision.round(mean/sample.size(),2);
        return mean;
    
    }
      /**
    * Calcula la desviacion estandar dada una linkedlist con los valores de la muestra
    * @param conjunto de números separados por coma
    * @return el valor de la desviacion de la muestra de tipo double 
    */
    public double calculateStandardDeviation(String directory){
        
        double varianza=0;
        double desviation;
        Reader lector = new Reader();

        Collection<Double> sample = lector.readText(directory);
       
        double mean=0;
        Iterator<Double> iterador = sample.iterator();
        while(iterador.hasNext()){
            mean+=iterador.next();
            
        }
        mean=mean/sample.size();
        
        Iterator<Double> iterador2 = sample.iterator();
        while(iterador2.hasNext()){
            desviation=iterador2.next();
            varianza+=((desviation-mean)*(desviation-mean));
        }
        varianza = (varianza)/(sample.size()-1);
        desviation = Precision.round(Math.sqrt(varianza),2);
        return desviation;
    }
}
