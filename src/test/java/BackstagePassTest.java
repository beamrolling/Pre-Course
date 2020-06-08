import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class BackstagePassTest {
    @Test
    public void should_return_backstagePass_sellin_and_quality() throws Exception {
        BackstagePass backstagePass = new BackstagePass(1,1);
        assertEquals(backstagePass.getSellIn(),1);
        assertEquals(backstagePass.getQuality(),1);
    }

    @Test
    public void should_return_zero_when_sellin_less_than_zero() throws Exception {
        BackstagePass backstagePass = new BackstagePass(0,50);
        backstagePass.refresh();
        assertEquals(backstagePass.getSellIn(),-1);
        assertEquals(backstagePass.getQuality(),0);
    }
}
