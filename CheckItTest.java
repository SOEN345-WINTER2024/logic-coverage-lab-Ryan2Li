import static org.junit.Assert.assertEquals;
import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

public class CheckItTest {
    //a || (b && c)
    @Test
    public void testPredicate1() {
        final PrintStream originalOut = System.out;
        ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outputStream));


        CheckIt.checkIt(true, true, false);


        String printedOutput = outputStream.toString().trim();

        assertEquals("P is true", printedOutput);

        System.setOut(originalOut);
    }

    @Test
    public void testPredicate2() {
        final PrintStream originalOut = System.out;
        ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outputStream));


        CheckIt.checkIt(false, true, false);


        String printedOutput = outputStream.toString().trim();

        assertEquals("P isn't true", printedOutput);

        System.setOut(originalOut);
    }

    @Test
    public void testClause1() {
        final PrintStream originalOut = System.out;
        ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outputStream));


        CheckIt.checkIt(true, true, true);


        String printedOutput = outputStream.toString().trim();

        assertEquals("P is true", printedOutput);

        System.setOut(originalOut);
    }

    @Test
    public void testClause2() {
        final PrintStream originalOut = System.out;
        ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outputStream));


        CheckIt.checkIt(false, false, false);


        String printedOutput = outputStream.toString().trim();

        assertEquals("P isn't true", printedOutput);

        System.setOut(originalOut);
    }

    @Test
    public void testCACC1() {
        final PrintStream originalOut = System.out;
        ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outputStream));


        CheckIt.checkIt(true, false, true);


        String printedOutput = outputStream.toString().trim();

        assertEquals("P is true", printedOutput);

        System.setOut(originalOut);
    }

    @Test
    public void testCACC2() {
        final PrintStream originalOut = System.out;
        ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outputStream));


        CheckIt.checkIt(false, false, true);


        String printedOutput = outputStream.toString().trim();

        assertEquals("P isn't true", printedOutput);

        System.setOut(originalOut);
    }

    @Test
    public void testRACC1() {
        final PrintStream originalOut = System.out;
        ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outputStream));


        CheckIt.checkIt(true, true, false);


        String printedOutput = outputStream.toString().trim();

        assertEquals("P is true", printedOutput);

        System.setOut(originalOut);
    }

    @Test
    public void testRACC2() {
        final PrintStream originalOut = System.out;
        ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outputStream));


        CheckIt.checkIt(false, true, false);


        String printedOutput = outputStream.toString().trim();

        assertEquals("P isn't true", printedOutput);

        System.setOut(originalOut);
    }

}
