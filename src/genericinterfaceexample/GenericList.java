/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package genericinterfaceexample;

/**
 *
 * @author LAU
 * @param <T>
 */
public class GenericList<T> implements GenericInterface<T> {
    public T myList;
    @Override
    public void add(T t){
        myList = t;
    }

    
    
}
