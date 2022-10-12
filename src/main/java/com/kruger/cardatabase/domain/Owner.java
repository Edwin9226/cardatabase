package com.kruger.cardatabase.domain;

import lombok.Data;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "owner")
@Data
public class Owner {
    @Id
    @GeneratedValue(generator = "seq_owner")
    @SequenceGenerator(name = "seq_owner", sequenceName = "DB_SEQ_OWNER",allocationSize = 1)
    private long ownerid;
    private String firstName, lastName;

    public Owner() {}

    public Owner(String firstName, String lastName) {
        super();
        this.firstName = firstName;
        this.lastName = lastName;
    }
@OneToMany(cascade = CascadeType.ALL, mappedBy = "owner")
    private List<Car> cars;
}
