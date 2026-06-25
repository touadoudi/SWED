public class TextStrategy implements ComparisonStrategy {
    @Override
    public boolean isIdentical(String oldContent, String newContent) {
        if (oldContent == null || newContent == null) return false;
        
        String textOld = oldContent.replaceAll("<[^>]*>", "");
        String textNew = newContent.replaceAll("<[^>]*>", "");
        
        return textOld.equals(textNew);
    }
}