/*
               
               LIST ITERATORS
               1.___.hasNext() 
               2.___.hasPrevious
               3.___.next()
               4.___.previous()

*/

import java.util.*;
public class List_Iterator{
    public static void main(String args[]){
        LinkedList<String> list = new LinkedList<String>();
        list.add("vishnu");
        list.add("vishnukumar");
        list.add("v");
        list.add("vk");
        ListIterator<String> itr = list.listIterator();
        System.out.println("Array List : \n");
        while(itr.hasNext()){
            System.out.println(itr.next());
        }

        System.out.println("\n List Array in Reverse Order \n");
        while(itr.hasPrevious()){
            System.out.println(itr.previous());
        }

    }
}