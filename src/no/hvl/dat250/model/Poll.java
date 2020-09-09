package no.hvl.dat250.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Poll {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
    private String question;
    private String alternativ1;
    private String getAlternativ2;
    private int alternativ1Respons = 0;
    private int alternativ2Respons = 0;
    private Boolean isPublic;
    private int timeLimit;
    private Boolean active;

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

    public String getGetAlternativ2() {
        return getAlternativ2;
    }

    public void setGetAlternativ2(String getAlternativ2) {
        this.getAlternativ2 = getAlternativ2;
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

    public Boolean getPublic() {
        return isPublic;
    }

    public void setPublic(Boolean aPublic) {
        isPublic = aPublic;
    }

    public int getTimeLimit() {
        return timeLimit;
    }

    public void setTimeLimit(int timeLimit) {
        this.timeLimit = timeLimit;
    }

    public Boolean getActive() {
        return active;
    }

    public void setActive(Boolean active) {
        this.active = active;
    }
}
