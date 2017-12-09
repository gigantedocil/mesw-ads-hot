/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hot.repository;

import java.util.List;

/**
 *
 * @author Me
 * @param <T>
 */
public interface IRepository <T> {
    
    boolean add(T object);

    boolean remove(T object);

    boolean exists(T object);
    
    T find(String objectName);

    List<T> retrieveAll();    
}
