
import org.junit.Test;
import static org.junit.Assert.*;
public class MyFirstTest {
    @Test
    public void testIfCompanyIsStillCodeup(){
        String expected = "Codeup";
        String actual = "Codeup";

        assertEquals(expected, actual);
    }
}
