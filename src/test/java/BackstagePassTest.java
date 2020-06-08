import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class BackstagePassTest {
    @Test
    public void should_return_backstagePass_sellin_and_quality() {
        BackstagePass backstagePass = new BackstagePass(1,1);
        assertEquals(backstagePass.getSellIn(),1);
        assertEquals(backstagePass.getQuality(),1);
    }

    @Test
    public void should_return_zero_when_sellin_less_than_zero() {
        BackstagePass backstagePass = new BackstagePass(0,50);
        backstagePass.refresh();
        assertEquals(backstagePass.getSellIn(),-1);
        assertEquals(backstagePass.getQuality(),0);
    }

    @Test
    public void should_add_one_when_quality_less_than_fifty_and_sellin_greater_than_ten() {
        BackstagePass backstagePass = new BackstagePass(12,40);
        backstagePass.refresh();
        assertEquals(backstagePass.getSellIn(),11);
        assertEquals(backstagePass.getQuality(),41);
    }

    @Test
    public void should_return_fifty_when_quality_is_fifty_and_sellin_above_zero() {
        BackstagePass sellInGreaterThanTen = new BackstagePass(12,50);
        sellInGreaterThanTen.refresh();
        assertEquals(sellInGreaterThanTen.getSellIn(),11);
        assertEquals(sellInGreaterThanTen.getQuality(),50);
        BackstagePass sellInBetweenSixAndTen = new BackstagePass(10,50);
        sellInBetweenSixAndTen.refresh();
        assertEquals(sellInBetweenSixAndTen.getSellIn(),9);
        assertEquals(sellInBetweenSixAndTen.getQuality(),50);
        BackstagePass sellInBetweenZeroAndFive = new BackstagePass(5,50);
        sellInBetweenZeroAndFive.refresh();
        assertEquals(sellInBetweenZeroAndFive.getSellIn(),4);
        assertEquals(sellInBetweenZeroAndFive.getQuality(),50);
    }
}
