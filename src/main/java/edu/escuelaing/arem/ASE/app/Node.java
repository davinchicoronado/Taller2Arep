/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.escuelaing.arem.ASE.app;

/**
 *
 * @author David Coronado
 * @param <E> Este parametro sera el tipo de valor que guardara el Nodo
 */
public class Node <E>{
    
    private E value;
    private Node<E> priorNode;
    private Node<E> nextNode;
    private Node<E> lastNode;
    
    
    public Node(E value,  Node priorNode){
        
        this.value=value;
        this.priorNode=priorNode;  
    }
    
    public Node(E value){
        this.value=value;
        
    }
    

    public E getValue() {
        return value;
    }
        
    public Node getPriorNode() {
        return priorNode;
    }

    public void setNextNode(Node nextNode) {
        this.nextNode = nextNode;
    }

    public Node getNextNode() {
        return nextNode;
    }

    public void setLastNode(Node lastNode) {
        this.lastNode = lastNode;
    }

    public void setPriorNode(Node<E> priorNode) {
        this.priorNode = priorNode;
    }
    
    
    
    
}
