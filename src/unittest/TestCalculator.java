package unittest;

import org.testng.Assert;

public class TestCalculator {
    public static void main(String[] args) {
        Calculator cal = new Calculator();
        int result1 = cal.addition(50,6);
        Assert.assertEquals(56,result1);
        int result2 = cal.subtraction(15,9);
        Assert.assertEquals(6,result2);

    }

}
