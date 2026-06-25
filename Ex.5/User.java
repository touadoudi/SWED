public class User implements Observer { 
private String name; 
public User(String name) { 
this.name = name; 
} 
@Override 
public void update(String url) { 
System.out.println("Notification for " + name + ": Website " 
+ url + " was updated."); 
} 
}