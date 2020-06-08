import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class NormalTest {
    @Test
    public void should_return_normal_sellin_and_quality() throws Exception {
        Normal normal = new Normal(1,1);
        assertEquals(normal.getSellIn(),1);
        assertEquals(normal.getQuality(),1);
    }
}
