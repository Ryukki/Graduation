package Repositories;

import domain.Rating;
import org.springframework.data.jpa.repository.JpaRepository;

@Repository
public interface RatingRepository extends JpaRepository<Rating, Integer> {

}