class Rectangle {
    double length , breadth;

    Rectangle(double length , double breadth){
        this.length = length;
        this.breadth = breadth;
    }

    double calculateArea(){
        return length*breadth;
    }

    double calculatePerimeter(){
        return 2*(length+breadth);
    }

    void display(){
        System.out.println("Length = " + length);
        System.out.println("Breadth = " + breadth);
        System.out.println("Area = " + calculateArea());
        System.out.println("Perimeter = " + calculatePerimeter());
    }
}

public class Rectangle1{
    public static void main(String args[]){
        Rectangle r1 = new Rectangle(5.0 , 3.0);
        r1.display();
    }
}