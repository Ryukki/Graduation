package domain;

import javax.persistence.*;
import java.sql.Date;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name="RATING")
public class Rating {
    @Id
    @GeneratedValue
    private Long rg_id;

    @Column
    private Date rg_date;

    @ManyToOne
    private User rg_user;

    public Rating(Date date, User user) {
        this.rg_date = date;
        this.rg_user = user;
    }

    protected Rating() {}

    public Long getRg_id() {
        return rg_id;
    }

    public Date getRg_date() {
        return rg_date;
    }

    public User getRg_user() {
        return rg_user;
    }
}