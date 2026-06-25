import org.junit.Test;
import static org.junit.Assert.*;

public class TextStrategyTest {
    
    @Test
    public void testIdenticalText() {
        ComparisonStrategy strategy = new TextStrategy();
        assertTrue(strategy.isIdentical("<p>Hello</p>", "Hello"));
    }
    
    @Test
    public void testDifferentText() {
        ComparisonStrategy strategy = new TextStrategy();
        assertFalse(strategy.isIdentical("<p>Hello</p>", "World"));
    }
    
    @Test
    public void testNullOldContent() {
        ComparisonStrategy strategy = new TextStrategy();
        assertFalse(strategy.isIdentical(null, "Hello"));
    }
    
    @Test
    public void testEmptyOldContent() {
        ComparisonStrategy strategy = new TextStrategy();
        assertFalse(strategy.isIdentical("", "Hello"));
    }
}