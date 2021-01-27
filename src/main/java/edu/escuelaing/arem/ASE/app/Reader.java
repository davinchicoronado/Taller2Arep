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
        BufferedReader br;
        FileReader fr;
        MyLinkedList<Double> sample = new MyLinkedList<>();
        try{
            fr = new FileReader(route);
            br = new BufferedReader(fr);
            String line;
            while ((line = br.readLine()) != null) {
                sample.add(Double.parseDouble(line));
            }
            br.close();
            fr.close();
           
        }
        catch(Exception ex){
            System.out.println(ex);
        }
        return sample;
    }
    
}
