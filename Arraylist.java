/*
                                           ARRAY LIST
         ------------------------------------------------------------------------------
        |                PURPOSE                |               FUNCTION               |   
         ------------------------------------------------------------------------------
        | To add an element                     |   ___.add(element)                   |
         ------------------------------------------------------------------------------
        | To add an element                     |   ___.add(index, element)            |
         ------------------------------------------------------------------------------
        | To replace a element at a position    |   ___.set(index, element)            |
         ------------------------------------------------------------------------------
        | To remove an element at a index       |   ___.remove(index)                  |
         ------------------------------------------------------------------------------
        | To remove a specific element          |   ___.remove(new Integer(element))   |
         ------------------------------------------------------------------------------
        | To remove a particular string         |   ___.remove("string")               |
         ------------------------------------------------------------------------------
        | To get the Index of an element        |   ___.indexOf(element)               |
         ------------------------------------------------------------------------------
        | To get the Last Index of an element   |   ___.lastIndexOf(element)           |
         ------------------------------------------------------------------------------
        | To clear the ArrayList                |   ___.clear()                        |
         ------------------------------------------------------------------------------
        | To get a element at a position        |   ___.get(index)                     |
         ------------------------------------------------------------------------------
        | To increase the size of ArrayList     |   ___.ensureCapacity(size)           |
         ------------------------------------------------------------------------------
        | To reduce the size of array to        |   ___.trimToSize()                   |
        | element count                         |                                      |
         ------------------------------------------------------------------------------


        In addition to the functions in ArrayList , LinkedList has these functions also

                                         LINEKED LIST
         ------------------------------------------------------------------------------
        |                PURPOSE                |               FUNCTION               |   
         ------------------------------------------------------------------------------
        | To add an element at first index      |   ___.addFirst(element)              |
         ------------------------------------------------------------------------------
        | To add an element at last index       |   ___.add(index, element)            |
         ------------------------------------------------------------------------------
        | To remove an element at first index   |   ___.removeFirst(element)           |
         ------------------------------------------------------------------------------
        | To remove an element at last index    |   ___.removeLast(index, element)     |
         ------------------------------------------------------------------------------



                            Difference between LinkedList and ArrayList

                                         LINEKED LIST
         ------------------------------------------------------------------------------
        |             LINKED LIST               |               ARRAY LIST             |   
         ------------------------------------------------------------------------------
        | Faster in inserting an element        |   Slower than LinkedList             |
         ------------------------------------------------------------------------------
        | Faster in deleting an element         |   Slower than LinkedList             |
         ------------------------------------------------------------------------------
        | Slower than ArrayList                 |   Faster in searching an element     |
         ------------------------------------------------------------------------------
        | Pointer used to point an element      |   Uses index to point an element     |
         ------------------------------------------------------------------------------
        | Takes more space                      |   Takes less space memory            |
         ------------------------------------------------------------------------------


*/import java.util.ArrayList;
public class Arraylist{
        
    static ArrayList<Integer> array = new ArrayList<Integer>(10);
    public static void main(String args[]){
        
        array.add(1);
        array.add(2);
        array.add(4);
        array.add(4);
        array.add(5);
        array.add(6);

        print_array();

        array.set(2, 3);
        array.remove(new Integer(6));

        print_array();

        array.trimToSize();
        System.out.println("ELEMENT AT SPECIFIC POSITION  --> " + array.get(2));

        array.clear();
        System.out.println("AFTER CLEARING ARRAY --> " + array);

    }
    public static void print_array(){
         System.out.println("ARRAY_LIST HAS "+array.size()+" ELEMENTS");
        for(Integer x:array){
            System.out.println(x);
        }
        
    }
}