public class Main { 
public static void main(String[] args) { 
Website fhWeb = new Website("https://www.frankfurtuniversity.de"); 
User student1 = new User("Student A"); 
User student2 = new User("Student B"); 
fhWeb.attach(student1); 
fhWeb.attach(student2); 
fhWeb.setContent("New cafeteria menu is online."); 
fhWeb.detach(student1); 
fhWeb.setContent("Exam results published."); 
} 
}