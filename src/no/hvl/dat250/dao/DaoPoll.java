package no.hvl.dat250.dao;

import no.hvl.dat250.model.Poll;
import no.hvl.dat250.model.User;

import javax.persistence.EntityManager;
import javax.persistence.Query;
import java.util.List;

public class DaoPoll extends AbstractDao {

    public DaoPoll(EntityManager em) {
        this.em = em;
        setClass(Poll.class);
    }

    public List<Poll> findPublicPolls() {
        Query q = em.createQuery( "SELECT p FROM Poll p WHERE p.isPublic = TRUE");
        return q.getResultList();
    }

    public List<Poll> findPrivatePolls() {
        Query q = em.createQuery( "SELECT p FROM Poll p WHERE p.isPublic = FALSE");
        return q.getResultList();
    }

    public List<Poll> findActivePolls() {
        Query q = em.createQuery( "SELECT p FROM Poll p WHERE p.isActive = TRUE");
        return q.getResultList();
    }

    public List<Poll> findNonActivePolls() {
        Query q = em.createQuery( "SELECT p FROM Poll p WHERE p.isActive = FALSE");
        return q.getResultList();
    }
}
