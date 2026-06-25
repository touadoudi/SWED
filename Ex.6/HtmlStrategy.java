public class HtmlStrategy implements ComparisonStrategy {
    @Override
    public boolean isIdentical(String oldContent, String newContent) {
        if (oldContent == null || newContent == null) return false;
        return oldContent.equals(newContent);
    }
}