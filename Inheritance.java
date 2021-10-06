/*
    Inheritance
    The clases in java can be inherited/extended which will retain the property of the base(extended) class
 */


public class Inheritance{
    public static void main(String args[]){
        Triangle tri = new Triangle();
        Rectangle rect = new Rectangle();

        rect.set_values(10, 20);
        tri.set_values(20, 20);

        System.out.println("AREA OF Triangle : "+tri.Triangle_area());
        System.out.println("AREA OF Rectangle : "+rect.Rectangle_area());

    }
}
class Polygon{
    protected int height;
    protected int width;

    protected void set_values(int height, int width){
        this.height = height;
        this.width = width;
    }
}

class Triangle extends Polygon{
    protected int Triangle_area(){
        return (height*width)/2;
    }
}

class Rectangle extends Polygon{
    protected int Rectangle_area(){
        return height*width;
    }
}