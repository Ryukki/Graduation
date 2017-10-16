package com.pols.jakubwidlak.Graduation.domain;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name="USER")
public class User {
    @Id
    @GeneratedValue
    private Long u_id;

    @Column
    private String u_name;

    @Column
    private String u_surname;

    @Column
    private String u_mail;

    @Column
    private Long u_totalPoints;

    @Column
    private Integer u_currentPoints;

    @OneToMany(fetch = FetchType.EAGER, mappedBy="user", cascade = CascadeType.ALL)
    private List<Transaction> transactionList = new ArrayList<>();

    @OneToMany(fetch = FetchType.EAGER, mappedBy="user", cascade = CascadeType.ALL)
    private List<Review> reviewList = new ArrayList<>();

    @OneToMany(fetch = FetchType.EAGER, mappedBy="user", cascade = CascadeType.ALL)
    private List<Rating> ratingList = new ArrayList<>();

    public User(String name, String surname, String mail) {
        this.u_name = name;
        this.u_surname = surname;
        this.u_mail = mail;
        this.u_currentPoints = 0;
        this.u_totalPoints = 0;
    }

    protected User () {}

    public String getU_name() {
        return u_name;
    }

    public String getU_surname() {
        return u_surname;
    }

    public String getU_mail() {
        return u_mail;
    }

    public Long getU_totalPoints() {
        return u_totalPoints;
    }

    public Integer getU_currentPoints() {
        return u_currentPoints;
    }

    public void addTransaction(Transaction transaction) {this.transactionList.add(transaction); }

    public void addReview(Review review) {this.reviewList.add(review); }

    public void addRating(Rating rating) {this.ratingList.add(rating); }

    public void changePoints(Integer points) {
        if (points>0)
            this.u_totalPoints=+points;
        this.u_currentPoints+=points;
    }
}