/*
                       Access LEVELS
---------------------------------------------------------------
|    MODIFIERS   |  CLASS  |  PACKAGE  |  SUBCLASS  |  WORLD  |
---------------------------------------------------------------
|     PUBLIC     |    Y    |     Y     |      Y     |     Y   |
---------------------------------------------------------------
|    PROTECTED   |    Y    |     Y     |      Y     |     N   |
---------------------------------------------------------------
|   NO MODIFIER  |    Y    |     Y     |      N     |     N   |
---------------------------------------------------------------
|    PRIVATE     |    Y    |     N     |      N     |     N   |
---------------------------------------------------------------

 */

public class Access_modifier{
    public static void main(String args[]){
        Access a = new Access();
        // a.id = 148; // this cannot be Accesssed by the subclass or any another class
        // instead use getter and setter for Accessing the private modifier
        a.setid(148);
        a.name = "vishnu";
        a.age = 19;
        a.salary = (float)25000.00;

        System.out.println(a.getid() + " This id variable defined as a PRIVATE modifier.");
        System.out.println(a.name + " This name variable defined as a PUBLIC modifier.");
        System.out.println(a.age + " This age variable defined as a PROTECTED modifier.");
        System.out.println(a.salary + " This salary variable defined as with no modifier.");

    }
}


class Access{
    private int id;
    public String name;
    protected int age;
    float salary;

    public int getid(){
        return id;
    }
    public void setid(int id){
        this.id = id;
    }
}