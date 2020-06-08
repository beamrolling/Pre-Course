import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class BackstagePassTest {
    @Test
    public void should_return_backstagePass_sellin_and_quality() throws Exception {
        Normal normal = new Normal(1,1);
        assertEquals(normal.getSellIn(),1);
        assertEquals(normal.getQuality(),1);
    }
}
