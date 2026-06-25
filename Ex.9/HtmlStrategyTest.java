import org.junit.Test;
import static org.junit.Assert.*;

public class HtmlStrategyTest {
    
    @Test
    public void testIdenticalHtml() {
        ComparisonStrategy strategy = new HtmlStrategy();
        assertTrue(strategy.isIdentical("Hello", "Hello"));
    }
    
    @Test
    public void testDifferentHtml() {
        ComparisonStrategy strategy = new HtmlStrategy();
        assertFalse(strategy.isIdentical("Hello", "World"));
    }
    
    @Test
    public void testNullOldContent() {
        ComparisonStrategy strategy = new HtmlStrategy();
        assertFalse(strategy.isIdentical(null, "Hello"));
    }
    
    @Test
    public void testEmptyOldContent() {
        ComparisonStrategy strategy = new HtmlStrategy();
        assertFalse(strategy.isIdentical("", "Hello"));
    }
}