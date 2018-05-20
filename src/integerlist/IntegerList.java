/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package integerlist;

/**
 *
 * @author Wladislaw
 */
public interface IntegerList<T>{

    int getLength();
    int insertLast(T value);
    T getFirst();
    int deleteFirst();
    boolean search(T value);
    void print();
    
}
