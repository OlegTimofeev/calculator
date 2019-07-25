import org.junit.Test;

public class MathTest {

    Calculator calculator = new Calculator();

    @Test
    public void addTest(){
        assertEquals(4,calculator.add(2,2));
        assertEquals(4.5,calculator.add(2,2.5));
        asserEquals(5.0,calculator.add(2.5,2.5));
    }
    @Test
    public void subtractionTest(){
        assertEquals(2,calculator.sub(4,2));
        assertEquals(1.5,calculator.sub(4,2.5));
        asserEquals(0.0,calculator.sub(2.5,2.5));
    }
    @Test
    public void multiplicationTest(){
        assertEquals(6,calculator.mult(3,2));
        assertEquals(5,calculator.mult(2,2.5));
        asserEquals(6.25,calculator.mult(2.5,2.5));
    }
    @Test
    public void divisionTest(){
        assertEquals(4.5,calculator.div(9,2));
        asserEquals(2.0,calculator.div(5,2.5));
    }
    @Test(expected = IllegalArgumentException)
    public void divisionTest(){
        calculator.div(0,3)

    }
    @Test
    public void sqrtTest(){
        assertEquals(3,calculator.sqrt(9));
        assertEquals(3.2,calculator.sqrt(10));
    }
    @Test(expected = IllegalArgumentException)
    public void sqrtTest(){
        calculator.sqrt(-1);
    }
}