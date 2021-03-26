package utility;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;


public class TestRectangle {

    @Test
    public void testAreaOfRectangleForPositiveValuedLengthAndBreadth() {
        int length = 4;
        int breadth = 2;
        int expectedArea = 8;
        int actualArea;

        Rectangle rectangle = new Rectangle(length, breadth);
        actualArea = rectangle.area();

        assertEquals(expectedArea, actualArea);
    }

    @Test
    public void testAreaOfRectangleForZeroValuedLength(){
        int length=0;
        int breadth=2;
        int expectedArea=0;
        int actualArea;

        Rectangle rectangle = new Rectangle(length,breadth);
        actualArea=rectangle.area();

        assertEquals(expectedArea,actualArea);
    }


    @Test
    public void testAreaOfRectangleForNegativeValuedLength() {
        int length = -1;
        int breadth = 2;
        String expectedMsg = "side cannot be negative";

        Rectangle rectangle = new Rectangle(length, breadth);
        Throwable exception= Assertions.assertThrows(RuntimeException.class, () -> {
            rectangle.area();
        });

        assertEquals(expectedMsg,exception.getMessage());
    }


    @Test
    public void testAreaOfRectangleForNegativeValuedBreadth() {

        int length=2;
        int breadth = -2;
        String expectedMsg = "side cannot be negative";

        Rectangle rectangle = new Rectangle(length, breadth);
        Throwable exception=Assertions.assertThrows(RuntimeException.class, () -> {
            rectangle.area();
        });

        assertEquals(expectedMsg,exception.getMessage());
    }

    @Test
    public void testAreaOfRectangleForNegativeValuedLengthAndBreadth() {
        int length = -1;
        int breadth = -2;
        String expectedMsg = "side cannot be negative";

        Rectangle rectangle = new Rectangle(length, breadth);
        Throwable exception=Assertions.assertThrows(RuntimeException.class, () -> {
            rectangle.area();
        });

        assertEquals(expectedMsg,exception.getMessage());
    }

    @Test
    public void testPerimeterOfRectangleForPositiveValuedLengthAndBreadth(){
        int length=4;
        int breadth=2;
        int expectedPerimeter = 12;
        int actualPerimeter;

        Rectangle rectangle = new Rectangle(length,breadth);
        actualPerimeter = rectangle.perimeter();

        assertEquals(expectedPerimeter,actualPerimeter);
    }

    @Test
    public void testPerimeterOfRectangleForNegativeValuedLength(){
        int length=-4;
        int breadth=2;
        int expectedPerimeter = -4;
        int actualPerimeter;

        Rectangle newRectangle = new Rectangle(length,breadth);
        actualPerimeter = newRectangle.perimeter();

        assertEquals(expectedPerimeter,actualPerimeter);
    }
    @Test
    public void testPerimeterOfRectangleForNegativeValuedBreadth(){
        int length=4;
        int breadth=-2;
        int expectedPerimeter = 4;
        int actualPerimeter;

        Rectangle newRectangle = new Rectangle(length,breadth);
        actualPerimeter = newRectangle.perimeter();

        assertEquals(expectedPerimeter,actualPerimeter);
    }


    @Test
    public void testPerimeterOfRectangleForZeroValuedLength(){
        int length=0;
        int breadth=4;
        int expectedPerimeter = 8;
        int actualPerimeter;

        Rectangle newRectangle = new Rectangle(length,breadth);
        actualPerimeter = newRectangle.perimeter();

        assertEquals(expectedPerimeter,actualPerimeter);
    }

    @Test
    public void testPerimeterOfRectangleForZeroValuedBreadth(){
        int length=2;
        int breadth=0;
        int expectedPerimeter = 4;
        int actualPerimeter;

        Rectangle newRectangle = new Rectangle(length,breadth);
        actualPerimeter = newRectangle.perimeter();

        assertEquals(expectedPerimeter,actualPerimeter);
    }


}




