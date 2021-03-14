import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.util.Locale;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestMain {
    private final ByteArrayOutputStream outContent = new ByteArrayOutputStream();
    private final PrintStream originalOut = System.out;

    public TestMain() {
        Locale.setDefault(new Locale("en", "US"));
    }

    @BeforeEach
    public void setUpStreams() {
        System.setOut(new PrintStream(outContent));
    }

    @AfterEach
    public void restoreStreams() {
        System.setOut(originalOut);
    }

    @Test
    public void testMain1() {
        String data = "123";
        System.setIn(new ByteArrayInputStream(data.getBytes()));
        Main.main(null);
        int expected = 6;
        String result = outContent.toString().replaceAll("[\\r\\n]", "");
        int actual = Integer.parseInt(result);
        assertEquals(expected, actual);
    }

    @Test
    public void testMain2() {
        String data = "555";
        System.setIn(new ByteArrayInputStream(data.getBytes()));
        Main.main(null);
        int expected = 15;
        String result = outContent.toString().replaceAll("[\\r\\n]", "");
        int actual = Integer.parseInt(result);
        assertEquals(expected, actual);
    }

    @Test
    public void testMain3() {
        String data = "639";
        System.setIn(new ByteArrayInputStream(data.getBytes()));
        Main.main(null);
        int expected = 18;
        String result = outContent.toString().replaceAll("[\\r\\n]", "");
        int actual = Integer.parseInt(result);
        assertEquals(expected, actual);
    }

    @Test
    public void testMain4() {
        String data = "798";
        System.setIn(new ByteArrayInputStream(data.getBytes()));
        Main.main(null);
        int expected = 24;
        String result = outContent.toString().replaceAll("[\\r\\n]", "");
        int actual = Integer.parseInt(result);
        assertEquals(expected, actual);
    }

    @Test
    public void testMain5() {
        String data = "803";
        System.setIn(new ByteArrayInputStream(data.getBytes()));
        Main.main(null);
        int expected = 11;
        String result = outContent.toString().replaceAll("[\\r\\n]", "");
        int actual = Integer.parseInt(result);
        assertEquals(expected, actual);
    }


}