import java.util.ArrayList;

public class GameTicker implements Subject {

    private ArrayList<String> updates = new ArrayList<>();
    private ArrayList<Observer> observers = new ArrayList<>();

    public void register(Observer o) {
        observers.add(o);
        }

    public void remove(Observer o) {
        observers.remove(o);
    }

    public void notifyObservers() {
        for (Observer observer : observers) {
            observer.update();
        }
    }

    public void addUpdate(String text) {
        updates.add(text);
        notifyObservers();
    }

    public String getLatestUpdate() {
        if (updates.isEmpty()) {
            return "no updates yet";
        }

        return updates.get(updates.size() - 1);
    }
}
