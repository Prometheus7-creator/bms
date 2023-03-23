package bms.project.demo.repository;
import org.springframework.data.jpa.repository.JpaRepository;
import bms.project.demo.Entity.NeftTransaction; 

public interface NeftRepository extends JpaRepository<NeftTransaction, Long> {

}