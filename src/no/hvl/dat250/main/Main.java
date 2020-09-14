package no.hvl.dat250.main;

import no.hvl.dat250.dao.DaoPoll;
import no.hvl.dat250.dao.DaoUser;
import no.hvl.dat250.model.User;
import no.hvl.dat250.model.Poll;
import no.hvl.dat250.model.IoTDevice;
import no.hvl.dat250.model.Vote;

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

        DaoPoll daoPoll = new DaoPoll(em);
        DaoUser daoUser = new DaoUser(em);

        List<User> users = daoUser.findAll();
        System.out.println("-------- Users ----------");
        for(User user : users) {
            System.out.println(user.getUserName() + " " + user.getLastName());
        }

        System.out.println("-------- Polls ----------");
        List<Poll> polls = daoUser.findPollsCreated("Ola");
        for(Poll poll : polls) {
            System.out.println(poll.getVote().getQuestion());
        }
        System.out.println("-------------------------");


        /*
        List<Poll> polls = daoPoll.findPublicPolls();
        for(Poll poll : polls) {
            System.out.println(poll.getCreator().getUserName());
        }
        */

        em.close();
    }
}