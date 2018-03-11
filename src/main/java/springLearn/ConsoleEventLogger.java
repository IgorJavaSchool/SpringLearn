package springLearn;

/**
 * @author Yanevskyy Igor igor2000@inbox.ru.
 */
public class ConsoleEventLogger implements EventLogger {

    public void logevent(Event event) {
        System.out.println(event);
    }
}
