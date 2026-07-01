public class WebApp implements Observer {

    private String user;

    public WebApp(String user) {
        this.user = user;
    }

    @Override
    public void update(String stockName, double price) {
        System.out.println("Web App [" + user + "] Notification:");
        System.out.println(stockName + " price updated to Rs." + price);
    }

}