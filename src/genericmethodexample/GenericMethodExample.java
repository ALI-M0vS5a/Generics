/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package genericmethodexample;

/**
 *
 * @author LAU
 */
public class GenericMethodExample {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Integer[] ints = {10,20,30,40,50,60,70,80};
        String[] Daysoftheweek = {"Monday","Tuesday","wednesday","Thursday",
            "Friday","saturday","Sunday"};
        print(ints);
        print(Daysoftheweek);
        System.out.println(countGreaterThan(ints,50));
    }
    public static <T extends Comparable<T>> int countGreaterThan(T[] list,T elem){
        int count = 0;
        for(T element: list){
            if(element.compareTo(elem) > 0)
                count++;
        }
        return count;
    }
    public static <E> void print(E[] list){
        for(E element:list){
            System.out.print(element+" ");
        }
        System.out.println("");
    }
}
