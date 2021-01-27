/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.escuelaing.arem.ASE.app;

import java.util.Iterator;

/**
 *
 * @author David Coronado
 * @param <E>
 */
public class IteradorLinkedList<E> implements Iterator<E> {
    
    Node<E> current;
    
    public IteradorLinkedList(Node<E> first){
        this.current=first;
    }

    @Override
    public boolean hasNext() {
        boolean resp=true;
        if (current==null){
            resp=false;
        }
        return resp;
    }

    @Override
    public E next() {
        E nodevalue = current.getValue();
        current = current.getNextNode();
        return nodevalue;
    }
    
    public E prior(){
        E nodevalue = current.getValue();
        current = current.getPriorNode();
        return nodevalue;
    }
    
    public Node<E> nextNode(){
        Node<E> prov = current;
        current = current.getNextNode();
        return prov;
    }
    
}
