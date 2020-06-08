import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class NormalTest {
    @Test
    public void should_return_normal_sellin_and_quality() {
        Normal normal = new Normal(1,1);
        assertEquals(normal.getSellIn(),1);
        assertEquals(normal.getQuality(),1);
    }

    @Test
    public void should_return_zero_when_quality_is_zero() {
        Normal positiveSellIn = new Normal(5,0);
        Normal negativeSellIn = new Normal(-1,0);
        positiveSellIn.refresh();
        assertEquals(positiveSellIn.getSellIn(),4);
        assertEquals(positiveSellIn.getQuality(),0);
        negativeSellIn.refresh();
        assertEquals(negativeSellIn.getSellIn(),-2);
        assertEquals(negativeSellIn.getQuality(),0);
    }

    @Test
    public void should_subtract_one_when_quality_greater_than_zero_and_sellin_greater_than_zero() {
        Normal normal = new Normal(5,3);
        normal.refresh();
        assertEquals(normal.getSellIn(),4);
        assertEquals(normal.getQuality(),2);
    }

    @Test
    public void should_return_zero_when_quality_less_than_veloocity_and_sellin_less_than_zero() {
        Normal normal = new Normal(-1,1);
        normal.refresh();;
        assertEquals(normal.getSellIn(),-2);
        assertEquals(normal.getQuality(),0);
    }

    @Test
    public void should_subtract_velocity_when_when_quality_grater_than_veloocity_and_sellin_less_than_zero() {
        Normal normal = new Normal(-1,3);
        normal.refresh();
        assertEquals(normal.getSellIn(),-2);
        assertEquals(normal.getQuality(),1);
    }
}
