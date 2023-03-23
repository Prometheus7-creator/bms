package bms.project.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import bms.project.demo.Entity.Transaction; 

public interface TransactionRepository extends JpaRepository<Transaction,Integer>{

}