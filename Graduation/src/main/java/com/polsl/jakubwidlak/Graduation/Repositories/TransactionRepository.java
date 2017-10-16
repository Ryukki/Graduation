package com.polsl.jakubwidlak.Graduation.Repositories;

import com.polsl.jakubwidlak.Graduation.domain.Transaction;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TransactionRepository extends JpaRepository<Transaction, Integer> {

}