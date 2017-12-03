package domain;

import javax.persistence.*;
import java.sql.Date;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name="TRANSACTION")
public class Transaction {
    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private Long t_id;

    @Column
    private Double t_price;

    @Column
    private Date t_date;

    @Column
    private Integer t_pointsEarned;

    @Column
    private Integer t_pointsSpent;

    @ManyToOne
    private User t_user;

    public Transaction(Double price, Date date, Integer pointsEarned, Integer pointsSpent, User user) {
        this.t_price = price;
        this.t_date = date;
        this.t_pointsEarned = pointsEarned;
        this.t_pointsSpent = pointsSpent;
        this.t_user = user;
    }

    protected Transaction() {}

    public Long getT_id() {
        return t_id;
    }

    public Double getT_price() {
        return t_price;
    }

    public Date getT_date() {
        return t_date;
    }

    public Integer getT_pointsEarned() {
        return t_pointsEarned;
    }

    public Integer getT_pointsSpent() {
        return t_pointsSpent;
    }

    public User getT_user() {
        return t_user;
    }
}