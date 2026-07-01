public class ObserverPatternTest {

    public static void main(String[] args) {

        StockMarket stockMarket = new StockMarket();

        Observer mobile = new MobileApp("Alice");
        Observer web = new WebApp("Bob");

        stockMarket.registerObserver(mobile);
        stockMarket.registerObserver(web);

        stockMarket.setStock("TCS", 3850.75);

        System.out.println("\nRemoving Web App Observer...\n");

        stockMarket.deregisterObserver(web);

        stockMarket.setStock("Infosys", 1645.50);

    }

}