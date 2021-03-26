package utility;
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

}


