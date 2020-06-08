import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class NormalTest {
    @Test
    public void should_return_normal_sellin_and_quality() throws Exception {
        Normal normal = new Normal(1,1);
        assertEquals(normal.getSellIn(),1);
        assertEquals(normal.getQuality(),1);
    }

    @Test
    public void should_return_zero_when_quality_is_zero_and_sellin_greater_than_zero() throws Exception {
        Normal normal = new Normal(5,0);
        normal.refresh();
        assertEquals(normal.getSellIn(),4);
        assertEquals(normal.getQuality(),0);
    }

    @Test
    public void should_subtract_one_when_quality_greater_than_zero_and_sellin_greater_than_zero() throws Exception {
        Normal normal = new Normal(5,3);
        normal.refresh();
        assertEquals(normal.getSellIn(),4);
        assertEquals(normal.getQuality(),2);
    }
}
