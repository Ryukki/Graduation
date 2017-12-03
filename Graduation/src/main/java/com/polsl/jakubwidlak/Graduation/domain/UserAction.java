package domain;


public class UserAction {
    @Id
    @Column(name="UA_ID")
    @GeneratedValue(strategy= GenerationType.AUTO)
    private Long ua_id;

    @Column(name="ACTIONENUM")
    private ActionEnum actionEnum;

    @Column(name="UA_LOYALTYLEVEL")
    private LoyaltyLevel ua_loyaltyLevel;

    @Column(name="UA_CURRENTPOINTS")
    private Integer ua_currentPoints;

    public ActionEnum getActionEnum() {
        return actionEnum;
    }

    public LoyaltyLevel getLoyaltyLevel() {
        return loyaltyLevel;
    }

    public Integer getCurrentPoints() {
        return currentPoints;
    }
}
