import static org.junit.Assert.*;
import org.junit.*;
import java.util.ArrayList;
import java.util.List;

public class ListTests {

    public class LongStringChecker implements StringChecker {
        @Override
        public boolean checkString(String s) {
            if (s.length() > 5) {
                return true;
            } else {
                return false;
            }
        }
    }

    @Test
    public void testFilter() {
        ArrayList<String> input = new ArrayList<>();
        input.add("cat");
        input.add("dog");
        input.add("monkey");
        input.add("bird");
        input.add("tiger");
        input.add("giraffe");
        ArrayList<String> expected = new ArrayList<>();
        expected.add("monkey");
        expected.add("giraffe");
        LongStringChecker lsc = new LongStringChecker();
        ArrayList<String> output = (ArrayList<String>) ListExamples.filter(input, lsc);
        assertEquals(expected, output);
    }
}

