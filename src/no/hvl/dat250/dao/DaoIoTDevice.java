package no.hvl.dat250.dao;

import no.hvl.dat250.model.IoTDevice;

import javax.persistence.EntityManager;

public class DaoIoTDevice extends AbstractDao {

    public DaoIoTDevice(EntityManager em) {
        this.em = em;
        setClass(IoTDevice.class);
    }

}
