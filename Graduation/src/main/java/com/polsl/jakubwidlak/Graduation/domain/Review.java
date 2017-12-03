package domain;

import javax.persistence.*;
import java.sql.Date;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name="REVIEW")
public class Review {
    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private Long rw_id;

    @Column
    private Date rw_date;

    @ManyToOne
    private User rw_user;

    public Review(Date date, User user) {
        this.rw_date = date;
        this.rw_user = user;
    }

    protected Review() {}

    public Long getRw_id() {
        return rw_id;
    }

    public Date getRw_date() {
        return rw_date;
    }

    public User getRw_user() {
        return rw_user;
    }
}