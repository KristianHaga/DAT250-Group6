package no.hvl.dat250.main;

import no.hvl.dat250.model.Poll;
import no.hvl.dat250.model.User;
import no.hvl.dat250.model.IoTDevice;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;
import java.util.List;

public class Main {
    private static final String PERSISTENCE_UNIT_NAME = "polls";
    private static EntityManagerFactory factory;

    public static void main(String[] args) {
        factory = Persistence.createEntityManagerFactory(PERSISTENCE_UNIT_NAME);
        EntityManager em = factory.createEntityManager();

        // read the existing entries and write to console
        Query q = em.createQuery("select p from Poll p");
        List<Poll> polls = q.getResultList();
        for (Poll poll : polls) {
            System.out.println("Question: " + poll.getQuestion());
        }
        System.out.println("Size: " + polls.size());

        // create new Poll
        em.getTransaction().begin();

        User user = new User();
        user.setUserName("OlaNordmann");
        user.setPassword("123456789");
        user.setFirstName("Ola");
        user.setLastName("Nordmann");

        Poll poll = new Poll();
        poll.setQuestion("Yes or No");
        poll.setAlternativ1("Yes");
        poll.setGetAlternativ2("No");
        poll.setPublic(false);
        poll.setTimeLimit(10);
        poll.setActive(false);

        IoTDevice ioTDevice = new IoTDevice();

        //em.persist(user);
        em.persist(poll);
        //em.persist(ioTDevice);

        em.getTransaction().commit();

        em.close();
    }
}