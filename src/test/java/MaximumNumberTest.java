import org.junit.Assert;
import org.junit.Test;

public class MaximumNumberTest {


    @Test
    public void testMaximumNumberAtFirstPosition() {
        Integer x =15;
        Integer y = 12;
        Integer z = 10;
        MaximumNumber<Integer> max = new MaximumNumber<>();
        Integer result = max.maximum(z,y,x);
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
}
