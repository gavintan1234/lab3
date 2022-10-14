import static org.junit.Assert.*;
import org.junit.*;

public class ListTests {

    class LongStringChecker implements StringChecker {
        @Override
        public boolean checkString(String s) {
            if (s.length() > 5) {
                return true;
            } else {
                return false;
            }
        }
    }
}

