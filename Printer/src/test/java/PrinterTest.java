import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PrinterTest {

    private Printer printer;

    @Before
    public void before(){
        printer = new Printer(100, 3, 5);
    }

    @Test
    public void paperAmount(){
        assertEquals(100,printer.getPaper());
    }

    @Test
    public void enoughPaper(){
        printer = new Printer(100, 3, 5);
        assertEquals(true,printer.printCopies());
    }

    @Test
    public void notEnoughPaper(){
        printer = new Printer(100, 3, 100);
        assertEquals(false,printer.printCopies());
    }

    @Test
    public void tonerAmount(){
        printer = new Printer(100, 3, 5);
        assertEquals(85,printer.getToner());
    }



}
