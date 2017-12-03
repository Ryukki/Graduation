package businesslogic;

import Repositories.*;
import domain.*;

import java.util.List;

@Service
public class AdminDataService {

    private UserRepository userRepository;
    private OfferRepository offerRepository;
    private LevelRepository levelRepository;
    private SendingRuleRepository sendingRuleRepository;

    @Autowired
    public AdminDataService(UserRepository userRepository, OfferRepository offerRepository, LevelRepository levelRepository, SendingRuleRepository sendingRuleRepository) {
        this.userRepository = userRepository;
        this.offerRepository = offerRepository;
        this.levelRepository = levelRepository;
        this.sendingRuleRepository = sendingRuleRepository;
    }

    public List<LoyaltyLevel> getLoyaltyLevels(){
        List<LoyaltyLevel> levelList = levelRepository.findAll();
    }
}
