package utility;

public class Rectangle {

    int length;
    int breadth;

    public Rectangle(int length, int breadth) {

        this.length = length;
        this.breadth = breadth;

    }

    public int area() {

        if(length <0 || breadth<0){
            throw new RuntimeException("side cannot be negative");
        }

        return (length * breadth);
    }

    public int perimeter() {

        return 2*(length + breadth);
    }


}
