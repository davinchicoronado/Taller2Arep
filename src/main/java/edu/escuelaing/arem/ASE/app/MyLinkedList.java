/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.escuelaing.arem.ASE.app;


import java.util.Collection;
import java.util.Iterator;




/**
 *
 * @author David Coronado
 * @param <E> Este valor va a ser el tipo de colleccion a crear generalmente de valor Numerico
 */
public class MyLinkedList<E> implements Collection<E>{
    
    private Node<E> firstNode;
    private Node<E> lastNode;
    private int size;
    
    
    public MyLinkedList(){
    
        this.size=0;
        firstNode=null;
    
    }
    
    @Override
    public int size() {
        return size;
    }

    @Override
    public boolean isEmpty() {
        if (size==0){
            return true;
        }
        return false;
    }

    @Override
    public boolean contains(Object o) {
        E value = (E)o;
        boolean rep = false;
        Iterator<E> iterador = iterator();
         while(iterador.hasNext()){
            if(iterador.next().equals(value)){
                rep = true;
                break;
            }
        }

        return rep;
    }

    @Override
    public Iterator iterator() {    
        Iterator<E> iterador = new IteradorLinkedList(firstNode);
        return iterador;
    }

    @Override
    public Object[] toArray() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Object[] toArray(Object[] ts) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean add(E element) {
        Node<E> newNode;
        if(size==0){
            newNode = new Node(element);
            firstNode = newNode;
            lastNode = newNode;
        }
        else{
            newNode = new Node(element,lastNode);
            lastNode.setNextNode(newNode);
            lastNode = newNode;
            firstNode.setLastNode(lastNode);
            lastNode.setNextNode(null);
        }
        size++;
        return true;
    }

    @Override
    public boolean remove(Object o) {
        E value = (E)o;
        IteradorLinkedList<E> iterador = new IteradorLinkedList(firstNode);
        while(iterador.hasNext()){
            Node<E> currentNode = iterador.nextNode();
            if(currentNode.getValue().equals(value)){
                currentNode.getPriorNode().setNextNode(currentNode.getNextNode());
                currentNode.getNextNode().setPriorNode(currentNode.getPriorNode());
            }
            
        }
        return true;
    }

    @Override
    public boolean containsAll(Collection clctn) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean addAll(Collection clctn) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean removeAll(Collection clctn) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean retainAll(Collection clctn) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void clear() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    
 


    
}
