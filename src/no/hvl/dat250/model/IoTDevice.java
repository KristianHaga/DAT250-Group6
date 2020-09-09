package no.hvl.dat250.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class IoTDevice {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
}
