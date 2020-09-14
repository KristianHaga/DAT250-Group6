package no.hvl.dat250.dao;

import no.hvl.dat250.model.Poll;
import no.hvl.dat250.model.User;

import javax.persistence.EntityManager;
import javax.persistence.Query;
import java.util.List;

public class DaoUser extends AbstractDao {

    public DaoUser(EntityManager em) {
        this.em = em;
        setClass(User.class);
    }

    public List<Poll> findPollsCreated(String userName) {
        Query q = em.createQuery("SELECT u.pollsCreated FROM User u WHERE u.userName = '" + userName + "'");
        return q.getResultList();
    }

    public List<Poll> findPollsVotedOn(String userName) {
        Query q = em.createQuery("SELECT u.pollsVotedOn FROM User u WHERE u.userName = '" + userName + "'");
        return q.getResultList();
    }
}