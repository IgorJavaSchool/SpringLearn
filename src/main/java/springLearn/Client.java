package springLearn;

/**
 * @author Yanevskyy Igor igor2000@inbox.ru.
 */
public class Client {
    private long id;
    private String fullName;

    public Client(long id, String fullName) {
        this.id = id;
        this.fullName = fullName;
    }

    public Client() {
    }

    public long getId() {
        return id;
    }

    public String getFullName() {
        return fullName;
    }
}
