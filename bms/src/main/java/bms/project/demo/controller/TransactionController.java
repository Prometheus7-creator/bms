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

import bms.project.demo.Entity.Transaction;
import bms.project.demo.repository.TransactionRepository;

@RestController
public class TransactionController {
	@Autowired
	TransactionRepository tranRepository;

	@GetMapping (path="/getAllTransactions")
	public List<Transaction> getAllTransactions()
	{
		List<Transaction> tranLst=tranRepository.findAll();           //http://localhost:8080/getAllTransactions
		return tranLst;
	}

	@PostMapping (path="/insertTransactions")
	public String insertTransaction(@RequestBody Transaction tranobj)
	{
	System.out.println("Received Data : " +tranobj);
	tranRepository.save(tranobj);
	return "Record inserted successfuly";
	}

	@DeleteMapping (path="/deleteTransaction/{id}")
	public String deleteTransaction(@PathVariable int id)
	{
		System.out.println("Given id is : " +id);
	    tranRepository.deleteById(id);
		return "Record deleted Successfully";
		
	}
}