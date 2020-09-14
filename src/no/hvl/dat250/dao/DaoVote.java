package no.hvl.dat250.dao;

import no.hvl.dat250.model.Vote;

import javax.persistence.EntityManager;
import javax.persistence.Query;
import java.util.List;

public class DaoVote extends AbstractDao {

    public DaoVote(EntityManager em) {
        this.em = em;
        setClass(Vote.class);
    }
}
