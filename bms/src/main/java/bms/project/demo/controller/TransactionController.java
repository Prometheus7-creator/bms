package bms.project.demo.controller;
import java.util.List;
//import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
//import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import bms.project.demo.Entity.NeftTransaction;
import bms.project.demo.Entity.RtgsTransaction;
import bms.project.demo.repository.NeftRepository;
import bms.project.demo.repository.RtgsRepository;

@RestController
public class TransactionController {
	@Autowired
	NeftRepository neftRepository;
	
	@Autowired
	RtgsRepository rtgsRepository;

	@GetMapping (path="/getAllTransactions")
	public List<NeftTransaction> getAllTransactions()
	{
		List<NeftTransaction> tranLst=neftRepository.findAll();           //http://localhost:8080/getAllTransactions
		return tranLst;
	}

	@PostMapping (path="/insertTransactions")
	public String insertTransaction(@RequestBody NeftTransaction tranobj)
	{
	System.out.println("Received Data : " +tranobj);
	neftRepository.save(tranobj);
	return "Record inserted successfuly";
	}

	@DeleteMapping (path="/deleteTransaction/{id}")
	public String deleteTransaction(@PathVariable long id)
	{
		System.out.println("Given id is : " +id);
	    neftRepository.deleteById(id);
		return "Record deleted Successfully";
		
	}
}