package com.pols.jakubwidlak.Graduation.domain;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name="REVIEW")
public class Review {
    @Id
    @GeneratedValue
    private rw_id;

    @Column
    private Date rw_date;

    @ManyToOne
    private User rw_user;

    public Review(Date date, User user) {
        this.rw_date = date;
        this.rw_user = user;
    }

    protected Review() {}

    public Date getRw_date() {
        return rw_date;
    }

    public User getRw_user() {
        return rw_user;
    }
}