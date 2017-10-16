package com.polsl.jakubwidlak.Graduation.Repositories;

import com.polsl.jakubwidlak.Graduation.domain.Rating;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RatingRepository extends JpaRepository<Rating, Integer> {

}