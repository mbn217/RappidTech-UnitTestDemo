import org.junit.Assert;
import org.junit.Test;

public class MultiplyingNumbersTests {
    Calculator calculator = new Calculator();


    @Test
    public void multiplyTwoPositiveNumbers(){
        int expectedResult = 15;
        int actualResult = calculator.multiply(3,5);

        Assert.assertEquals("The multiplication of the two positve number is correct" , expectedResult, actualResult);

    }






}
