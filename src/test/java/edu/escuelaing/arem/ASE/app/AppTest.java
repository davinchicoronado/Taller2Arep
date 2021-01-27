package edu.escuelaing.arem.ASE.app;

import static org.junit.Assert.assertEquals;

import static org.junit.Assert.assertTrue;

import org.junit.Test;

/**
 * Unit test for simple App.
 */
public class AppTest
{
    private final App aplicacion=new App();
    
    @Test
    public void calculateMean1(){
        try{
            double result= aplicacion.calculateMean("prueba1.txt");
            assertEquals(result,550.6,0.0);
            
        }catch(Exception e){
            assertTrue(false);
        }
    
    
    }
    @Test
    public void calculateDeviation1(){
        try{
            double result = aplicacion.calculateStandardDeviation("prueba1.txt");
            assertEquals(result,572.03,0.0);
            
        }catch(Exception e){
            assertTrue(false);
        }
    
    }
    @Test
    public void calculateMean2(){
        try{
            double result = aplicacion.calculateMean("prueba2.txt");
            assertEquals(result,60.32,0.0);
            
        }catch(Exception e){
            assertTrue(false);
        }
    }
    
    @Test
    public void calculateDeviation2(){
        try{
            double result= aplicacion.calculateStandardDeviation("prueba2.txt");
            assertEquals(result,62.26,0.0);
            
        }catch(Exception e){
            assertTrue(false);
        }
    
    }


}
