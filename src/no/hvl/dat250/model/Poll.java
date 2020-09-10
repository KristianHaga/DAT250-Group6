package no.hvl.dat250.model;

import javax.persistence.*;
import java.util.List;

@Entity
public class Poll {
    @Id
    @GeneratedValue(strategy = GenerationType.TABLE)
    private long id;
    private String question;
    private String alternativ1;
    private String alternativ2;
    private int alternativ1Respons = 0;
    private int alternativ2Respons = 0;
    private int timeLimit;
    private Boolean isPublic;
    private Boolean isActive;

    @ManyToOne
    private User creator;

    @OneToMany(mappedBy = "poll")
    private List<IoTDevice> iotDevices;

    public String getQuestion() {
        return question;
    }

    public void setQuestion(String question) {
        this.question = question;
    }

    public String getAlternativ1() {
        return alternativ1;
    }

    public void setAlternativ1(String alternativ1) {
        this.alternativ1 = alternativ1;
    }

    public String getAlternativ2() {
        return alternativ2;
    }

    public void setAlternativ2(String alternativ2) {
        this.alternativ2 = alternativ2;
    }

    public int getAlternativ1Respons() {
        return alternativ1Respons;
    }

    public void setAlternativ1Respons(int alternativ1Respons) {
        this.alternativ1Respons = alternativ1Respons;
    }

    public int getAlternativ2Respons() {
        return alternativ2Respons;
    }

    public void setAlternativ2Respons(int alternativ2Respons) {
        this.alternativ2Respons = alternativ2Respons;
    }

    public int getTimeLimit() {
        return timeLimit;
    }

    public void setTimeLimit(int timeLimit) {
        this.timeLimit = timeLimit;
    }

    public Boolean getPublic() {
        return isPublic;
    }

    public void setPublic(Boolean aPublic) {
        isPublic = aPublic;
    }

    public Boolean getActive() {
        return isActive;
    }

    public void setActive(Boolean active) {
        isActive = active;
    }

    public User getCreator() {
        return creator;
    }

    public void setCreator(User creator) {
        this.creator = creator;
    }

    public List<IoTDevice> getIotDevices() {
        return iotDevices;
    }

    public void setIotDevices(List<IoTDevice> iotDevices) {
        this.iotDevices = iotDevices;
    }

    @Override
    public String toString() {
        return " Poll{" +
                "\n         id=" + id +
                "\n         question='" + question + '\'' +
                "\n         alternativ1='" + alternativ1 + '\'' +
                "\n         alternativ2='" + alternativ2 + '\'' +
                "\n         alternativ1Respons=" + alternativ1Respons +
                "\n         alternativ2Respons=" + alternativ2Respons +
                "\n         timeLimit=" + timeLimit +
                "\n         isPublic=" + isPublic +
                "\n         isActive=" + isActive +
                "\n         iotDevices=" + iotDevices + "\n     " +
                '}';
    }
}
