/*

        HASH _ SET
        Set will contain only the unique elements whereas List can contain duplicate elements.


        OPERATIONS IN SET
        1. ___.add(element)
        2. ___.remove(element)
        3. ___.clear()
        4. ___.clone()
        5. ___.contains()  return true when set contains element
        6. ___.isEmpty()  return true when set is empty
        7. ___.iterator()
        8. ___.size()
        9. ___.spliterator() used to create a late-binding and fail-fast spliterator over the elements in the set

 */
import java.util.*;
 public class Hash_Set{
     public static void main(String args[]){
         HashSet<String> set = new HashSet<String>();
         set.add("v");
         set.add("vk");
         set.add("vishnu");
         set.add("vishnu"); // Here duplicate element given into the set but it only the unique elements.

         System.out.println(set);
         
     }
 }