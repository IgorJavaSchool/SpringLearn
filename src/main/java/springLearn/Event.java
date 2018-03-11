package springLearn;

import java.text.DateFormat;
import java.util.Date;
import java.util.Random;

public class Event {
    private int ID = new Random(100l).nextInt();
    private String msg;
    private Date mDate;
    private DateFormat df;

    public Event(Date date, DateFormat df) {
        mDate = date;
        this.df = df;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    @Override
    public String toString() {
        return "Event{" +
                "ID=" + ID +
                ", msg='" + msg + '\'' +
                ", mDate=" + df.format(mDate) +
                '}';
    }
}
