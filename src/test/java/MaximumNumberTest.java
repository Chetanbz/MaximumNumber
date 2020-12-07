import org.junit.Assert;
import org.junit.Test;

public class MaximumNumberTest {


    @Test
    public void testMaximumNumberAtFirstPosition() {
        Integer x =15;
        Integer y = 12;
        Integer z = 10;
        MaximumNumber<Integer> max = new MaximumNumber<>();
        Integer result = max.maximum(x,y,z);
        Assert.assertEquals(x,result);
    }
    @Test
    public void testMaximumNumberAtSecondPosition() {
        Integer x =10;
        Integer y = 15;
        Integer z = 12;
        MaximumNumber<Integer> max = new MaximumNumber<>();
        Integer result = max.maximum(x,y,z);
        Assert.assertEquals(y,result);
    }
    @Test
    public void testMaximumNumberAtThirdPosition() {
        Integer x =10;
        Integer y = 12;
        Integer z = 15;
        MaximumNumber<Integer> max = new MaximumNumber<>();
        Integer result = max.maximum(x,y,z);
        Assert.assertEquals(z,result);
    }
    @Test
    public void testMaximumNumberAtFirstPositionFloat() {
        Double x = 15.2;
        Double y = 12.5;
        Double z = 10.9;
        MaximumNumber<Double> max = new MaximumNumber<>();
        Double result = max.maximum(x,y,z);
        Assert.assertEquals(x,result);
    }
    @Test
    public void testMaximumNumberAtSecondPositionFloat() {
        Double x = 1.2;
        Double y = 12.5;
        Double z = 10.9;
        MaximumNumber<Double> max = new MaximumNumber<>();
        Double result = max.maximum(x,y,z);
        Assert.assertEquals(y,result);
    }
    @Test
    public void testMaximumNumberAtThirdPositionFloat() {
        Double x = 15.2;
        Double y = 12.5;
        Double z = 20.9;
        MaximumNumber<Double> max = new MaximumNumber<>();
        Double result = max.maximum(x,y,z);
        Assert.assertEquals(z,result);
    }
    @Test
    public void testMaximumNumberAtFirstPositionString() {
        String x = "zambare";
        String y = "rohit";
        String z = "chetan";
        MaximumNumber<String> max = new MaximumNumber<>();
        String result = max.maximum(x,y,z);
        Assert.assertEquals(x,result);
    }
    @Test
    public void testMaximumNumberAtSecondPositionString() {
        String x = "chetan";
        String y = "rohit";
        String z = "aman";
        MaximumNumber<String> max = new MaximumNumber<>();
        String result = max.maximum(x,y,z);
        Assert.assertEquals(y,result);
    }
    @Test
    public void testMaximumNumberAtThirdPositionString() {
        String x = "chetan";
        String y = "rohit";
        String z = "zambare";
        MaximumNumber<String> max = new MaximumNumber<>();
        String result = max.maximum(x,y,z);
        Assert.assertEquals(z,result);
    }
    @Test
    public void testMaximumNumberVariableArgument() {
        Integer x =15;
        Integer y = 12;
        Integer z = 10;
        Integer z1 = 13;
        MaximumNumber<Integer> max = new MaximumNumber<>();
        Integer result = max.maximum(x,y,z,z1);
        Assert.assertEquals(x,result);
    }
    @Test
    public void testMaximumNumberVariableArgumentForSix() {
        Integer x =15;
        Integer y = 12;
        Integer z = 10;
        Integer x1 =150;
        Integer y1 = 12;
        Integer z1 = 10;
        MaximumNumber<Integer> max = new MaximumNumber<>();
        Integer result = max.maximum(x,y,z,x1,y1,z1);
        Assert.assertEquals(x1,result);
    }
}
