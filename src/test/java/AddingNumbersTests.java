import org.junit.Assert;
import org.junit.Test;

public class AddingNumbersTests {
    Calculator calculator = new Calculator();


    @Test
    public void addTwoPositiveNumbers(){
        int expectedResult = 30;
        int actualResult = calculator.add(10,20);

        Assert.assertEquals("The sum of the two positve number is correct" , expectedResult, actualResult);

    }


    @Test
    public void addTwoNegativeNumbers(){
        int expectedResult = -30;
        int actualResult = calculator.add(-10,-20);

        Assert.assertEquals("The sum of the two negative number is correct" , expectedResult, actualResult);

    }



}
