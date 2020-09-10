package no.hvl.dat250.main;

import no.hvl.dat250.model.User;
import no.hvl.dat250.model.Poll;
import no.hvl.dat250.model.IoTDevice;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;
import java.util.ArrayList;
import java.util.List;


public class Main {
    public static void main(String[] args) {
        EntityManagerFactory factory = Persistence.createEntityManagerFactory("polls");
        EntityManager em = factory.createEntityManager();

        // Creating User
        User user = new User();
        user.setUserName("OlaNordmann");
        user.setFirstName("Ola");
        user.setLastName("Nordmann");
        user.setPassword("123456789");

        // Creating Poll
        Poll poll = new Poll();
        poll.setQuestion("Red or Blue");
        poll.setAlternativ1("Red");
        poll.setAlternativ2("Blue");
        poll.setTimeLimit(100);
        poll.setPublic(true);
        poll.setActive(false);
        poll.setCreator(user);

        // Creating IoT Device
        IoTDevice iotDevice = new IoTDevice();
        iotDevice.setPoll(poll);

        user.setPolls(new ArrayList<Poll>() { { add(poll); } });
        poll.setIotDevices(new ArrayList<IoTDevice>() { { add(iotDevice); } });

        em.getTransaction().begin();

        em.persist(user);
        em.persist(poll);
        em.persist(iotDevice);

        Query q = em.createQuery("select u from User u");
        List<User> userList = q.getResultList();
        for (User usr : userList) {
            System.out.println(usr);
        }

        em.close();
    }
}