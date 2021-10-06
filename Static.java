/*
public class Static{
    public static void main(String args[]){
        class_1 obj = new class_1();
        class_1.method_static(); // static method should be accessed using class name.
        obj.method_without_static(); // non-static method can be accessed by the instance of the class.
    }
}

class class_1{
    public static void method_static(){
        System.out.println("This method should be accessed by using class name.");
    }
    public void method_without_static(){
        System.out.println("This method should be accessed by using instance of a class.");
    }
}

*/


/*
The meaning of Static is 
Static method belongs to the class where it is defined
Static variable is constant for that class.(The value of the Static variable of a class will not get changed for the imstances of that class)
*/

public class Static{
    public static void main(String args[]){
        Student s1 = new Student();
        Student s2 = new Student();

        System.out.println(Student.No_of_Students);
        Student.del_student();
        System.out.println(Student.getnoofstudents());
    }
}

class Student{
    String name;
    int id;
    float percentage;
    static int No_of_Students = 0;
    public void setname(String name){
        this.name = name;
    }
    public void setid(int id){
        this.id = id;
    }
    public void setpercentage(float percentage){
        this.percentage = (float)percentage;
    }

    public String getname(){
        return name;
    }
    public int getid(){
        return id;
    }
    public float getpercentage(){
        return percentage;
    }
    Student(){
        No_of_Students++;
    }
    public static int getnoofstudents(){
        return No_of_Students;
    }
    public static void del_student(){
        No_of_Students--;
    }
}
