import java.util.ArrayList;
import java.util.Arrays;

public class Start {
    public static void main(String[] args) {
        LineComparision obj = new LineComparision();
        double lengthOne = obj.calculateLength(6, 7, 9, 8);
        double lengthTwo = obj.calculateLength(5, 4, 7, 5);
        System.out.println("Length of Line 1 is: "+lengthOne);
        System.out.println("Length of Line 2 is: "+lengthTwo);
        obj.checkLineEqality(lengthOne,lengthTwo);
        obj.checkLineComparision(lengthOne,lengthTwo);

        }
}
