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
public class ArrayGList<T> implements GList<T> {

    private T[] array;
    private int size;

    public ArrayGList(int laenge) {
        this.size = 0;
        array = (T[]) new Object[laenge];
    }

    @Override
    public int getLength() {
        return size;
    }

    @Override
    public int insertLast(T value) {
        try {
            array[size] = value;
            size++;
            return 0;
        } catch (Exception e) {
            return -1;
        }
    }

    @Override
    public T getFirst() {
        if (size != 0) {
            return array[0];
        }
        return null;
       
    }

    @Override
    public int deleteFirst() {
        if (size != 0) {

            for (int i = 0; i < size - 1; i++) {
                array[i] = array[i + 1];
            }
            array[size - 1] = null;
            size--;
            return 0;

        }
        return -1;
    }

    @Override
    public boolean search(T value) {
            
        for (int i = 0; i < size; i++) {
            if (array[i].equals(value) ) {
             //   (double)array[i]-value;
                return true;
            }
        }
        return false;
    }

    @Override
    public void print() {
        System.out.println("Inhalt:");
        for (int i = 0; i < size; i++) {
            System.out.println(array[i]);
        }
    }
    
    int append (T[] values)
    {
        if((array.length-size)>=values.length){
            for (int i = 0; i <values.length; i++) {
                insertLast(values[i]);
               
            }
             return 0;
        }
        return -1;
    }
}
