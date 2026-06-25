public class Main {
    public static void main(String[] args) {
        ComparisonStrategy htmlCheck = new HtmlStrategy();
        Website fhWeb = new Website("https://www.frankfurt-university.de", htmlCheck);
        
        User student = new User("Student A");
        fhWeb.attach(student);
        
        System.out.println("--- HTML Check ---");
        fhWeb.setContent("<html><body>Hello</body></html>");
        fhWeb.setContent("<html><body>Hello</body></html>");
        
        System.out.println("--- Size Check ---");
        fhWeb.setComparisonStrategy(new SizeStrategy());
        fhWeb.setContent("<html><body>World</body></html>"); 
        
        System.out.println("--- Text Check ---");
        fhWeb.setComparisonStrategy(new TextStrategy());
        fhWeb.setContent("<div><span>World</span></div>"); 
        fhWeb.setContent("<div><span>New Text!</span></div>"); 
    }
}