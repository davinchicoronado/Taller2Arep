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
            double result= aplicacion.calculateMean("160,591,114,229,230,270,128,1657,624,1503");
            assertEquals(result,550.6,0.0);
            
        }catch(Exception e){
            assertTrue(false);
        }
    
    
    }
    @Test
    public void calculateDeviation1(){
        try{
            double result = aplicacion.calculateStandardDeviation("160,591,114,229,230,270,128,1657,624,1503");
            assertEquals(result,572.03,0.0);
            
        }catch(Exception e){
            assertTrue(false);
        }
    
    }
    @Test
    public void calculateMean2(){
        try{
            double result = aplicacion.calculateMean("15.0,69.9,6.5,22.4,28.4,65.9,19.4,198.7,38.8,138.2");
            assertEquals(result,60.32,0.0);
            
        }catch(Exception e){
            assertTrue(false);
        }
    }
    
    @Test
    public void calculateDeviation2(){
        try{
            
            double result= aplicacion.calculateStandardDeviation("15.0,69.9,6.5,22.4,28.4,65.9,19.4,198.7,38.8,138.2");
            assertEquals(result,62.26,0.0);
            
        }catch(Exception e){
            assertTrue(false);
        }
    
    }


}
