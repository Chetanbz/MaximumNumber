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
}
