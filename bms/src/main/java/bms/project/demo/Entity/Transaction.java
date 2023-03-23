package bms.project.demo.Entity;

import java.util.Date;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.MappedSuperclass;
import jakarta.persistence.Table;
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@MappedSuperclass
public abstract class Transaction {
   
//    private String transactionId;
    
	private String transactionType;
	
	private int senderUserId;
	
	private int receiverUserId;
	
	private int senderAccountNo;
	
	private int receiverAccountNo;

	private double amount;          //amount to be transferred
	
	private String transactionStatus;

	private Date timestamp;

	private String bankId;
     

	
	public Boolean checkBalance(int senderAccountNo)
	{
		double balance=0;
		if(balance>=this.amount)
			return true;
		return false;
	}
	
	public Boolean verify(String bankId,int senderAccountNo)
	{
		return true;
	}
	
	abstract public Boolean verifyTransactionAmount(String transactionType,double amount);
  
	
}
