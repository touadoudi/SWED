import java.util.ArrayList;
import java.util.List;

public class Website implements Subject {
    private List<Observer> observers;
    private String url;
    private String content;
    private ComparisonStrategy strategy;

    public Website(String url, ComparisonStrategy strategy) {
        this.observers = new ArrayList<>();
        this.url = url;
        this.content = "";
        this.strategy = strategy;
    }

    public void setComparisonStrategy(ComparisonStrategy strategy) {
        this.strategy = strategy;
    }

    @Override
    public void attach(Observer o) {
        observers.add(o);
    }

    @Override
    public void detach(Observer o) {
        observers.remove(o);
    }

    @Override
    public void notifyObservers() {
        for (Observer o : observers) {
            o.update(url);
        }
    }

    public void setContent(String newContent) {
        if (!strategy.isIdentical(this.content, newContent)) {
            this.content = newContent;
            notifyObservers();
        }
    }
}