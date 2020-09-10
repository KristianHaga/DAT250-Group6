package no.hvl.dat250.model;

import javax.persistence.*;

@Entity
public class IoTDevice {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    @ManyToOne
    private Poll poll;

    public Poll getPoll() {
        return poll;
    }

    public void setPoll(Poll poll) {
        this.poll = poll;
    }

    @Override
    public String toString() {
        return " IoTDevice{" +
                "\n             id=" + id + "\n         " +
                '}';
    }
}
