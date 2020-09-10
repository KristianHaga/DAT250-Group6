package no.hvl.dat250.model;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "pollUser")
public class User {
    @Id
    private String userName;
    private String password;
    private String firstName;
    private String lastName;

    @OneToMany(mappedBy = "creator")
    private List<Poll> polls;

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public List<Poll> getPolls() {
        return polls;
    }

    public void setPolls(List<Poll> polls) {
        this.polls = polls;
    }

    @Override
    public String toString() {
        return "User{" +
                "\n     userName='" + userName + '\'' +
                "\n     password='" + password + '\'' +
                "\n     firstName='" + firstName + '\'' +
                "\n     lastName='" + lastName + '\'' +
                "\n     polls=" + polls + "\n" +
                '}';
    }
}
