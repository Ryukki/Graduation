package domain;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name="USER")
public class User {
    @Id
    @Column(name="U_ID")
    @GeneratedValue(strategy= GenerationType.AUTO)
    private Long u_id;

    @Column(name="U_NAME")
    private String u_name;

    @Column(name="U_SURNAME")
    private String u_surname;

    @Column(name="U_MAIL")
    private String u_mail;

    @Column(name="U_TOTALPOINTS")
    private Long u_totalPoints;

    @Column(name="U_CURRENTPOINTS")
    private Integer u_currentPoints;

    @OneToMany(fetch = FetchType.EAGER, mappedBy="user", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<Transaction> transactionList = new ArrayList<>();

    @OneToMany(fetch = FetchType.EAGER, mappedBy="user", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<Review> reviewList = new ArrayList<>();

    @OneToMany(fetch = FetchType.EAGER, mappedBy="user", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<Rating> ratingList = new ArrayList<>();

    public User(String name, String surname, String mail) {
        this.u_name = name;
        this.u_surname = surname;
        this.u_mail = mail;
        this.u_currentPoints = 0;
        this.u_totalPoints = Long.valueOf(0);
    }

    protected User () {}

    public Long getU_id() {
        return u_id;
    }

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
            this.u_totalPoints= Long.valueOf(+points);
        this.u_currentPoints+=points;
    }
}