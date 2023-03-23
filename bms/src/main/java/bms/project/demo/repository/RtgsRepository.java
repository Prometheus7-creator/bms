package bms.project.demo.repository;
import org.springframework.data.jpa.repository.JpaRepository;
import bms.project.demo.Entity.RtgsTransaction; 

public interface RtgsRepository extends JpaRepository<RtgsTransaction, Integer> {

}
