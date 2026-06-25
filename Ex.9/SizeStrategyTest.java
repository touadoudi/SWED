import org.junit.Test;
import static org.junit.Assert.*;

public class SizeStrategyTest {
    
    @Test
    public void testIdenticalSize() {
        ComparisonStrategy strategy = new SizeStrategy();
        assertTrue(strategy.isIdentical("Hello", "Hello"));
    }
    
    @Test
    public void testDifferentSize() {
        ComparisonStrategy strategy = new SizeStrategy();
        assertFalse(strategy.isIdentical("Hello", "World!"));
    }
    
    @Test
    public void testNullOldContent() {
        ComparisonStrategy strategy = new SizeStrategy();
        assertFalse(strategy.isIdentical(null, "Hello"));
    }
    
    @Test
    public void testEmptyOldContent() {
        ComparisonStrategy strategy = new SizeStrategy();
        assertFalse(strategy.isIdentical("", "Hello"));
    }
}