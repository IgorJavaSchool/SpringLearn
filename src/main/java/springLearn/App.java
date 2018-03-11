package springLearn;

/**
 * @author Yanevskyy Igor igor2000@inbox.ru.
 */
public class App {
    private Client client;
    private EventLogger logger;
    private int count;

    public App(Client client, EventLogger logger) {
        this.client = client;
        this.logger = logger;
        this.count = 1;
    }

    public App() {
    }

    public void logEvent(String message){
        System.out.println("Message №" + count++ + " " + message);
    }

    public Client getClient() {
        return client;
    }

    public EventLogger getLogger() {
        return logger;
    }

    public static void main(String[] args) {

    }
}
