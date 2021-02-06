/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.escuelaing.arem.ASE.app;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;

/**
 *
 * @author David Coronado
 */
public class Reader {
    
    public MyLinkedList readText(String route){

        MyLinkedList<Double> sample = new MyLinkedList<>();
        String[] res = route.split("[,]",0);
        for(String myStr:res){
            sample.add(Double.parseDouble(myStr));
        }
        return sample;
    }
    
}
