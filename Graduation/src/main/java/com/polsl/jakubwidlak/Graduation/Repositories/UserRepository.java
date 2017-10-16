package com.polsl.jakubwidlak.Graduation.Repositories;

import com.polsl.jakubwidlak.Graduation.domain.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Integer> {

}