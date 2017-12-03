package domain;

@Entity
@Table(name="SENDINGRULE")
public class OfferSendingRule {
    @Id
    @Column(name="SR_ID")
    @GeneratedValue(strategy= GenerationType.AUTO)
    private Long sr_id;

    @Column(name="SR_OFFERID")
    private Long sr_offerId;

    @OneToOne(name="SR_ACTION")
    private UserAction sr_action;
}
