import java.util.*;

interface Observer {
    void update(float price);
}

interface Stock {
    void register(Observer o);

    void deregister(Observer o);

    void notifyObservers();
}

class StockMarket implements Stock {
    private List<Observer> observers = new ArrayList<>();
    private float price;

    public void register(Observer o) {
        observers.add(o);
    }

    public void deregister(Observer o) {
        observers.remove(o);
    }

    public void setPrice(float price) {
        this.price = price;
        notifyObservers();
    }

    public void notifyObservers() {
        for (Observer o : observers) {
            o.update(price);
        }
    }
}

class MobileApp implements Observer {
    public void update(float price) {
        System.out.println("Mobile App: Stock price updated to " + price);
    }
}

class WebApp implements Observer {
    public void update(float price) {
        System.out.println("Web App: Stock price updated to " + price);
    }
}

// ObserverTest.java
public class ObserverTest {
    public static void main(String[] args) {
        StockMarket market = new StockMarket();
        Observer mobile = new MobileApp();
        Observer web = new WebApp();

        market.register(mobile);
        market.register(web);

        market.setPrice(100.0f);
        market.setPrice(120.0f);
    }
}