package bms.project.demo.Entity;

import java.util.Date;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Entity
@Table(name="transaction")
public abstract class Transaction {
    @Id
    private String transactionId="101A";
    @Column(name="transactionType")
	private String transactionType;
	@Column(name="senderUserId")
	private int senderUserId;
	@Column(name="receiverUserId")
	private int receiverUserId;
	@Column(name="senderAccountNo")
	private int senderAccountNo;
	@Column(name="receiverAccountNo")
	private int receiverAccountNo;
	@Column(name="amount")
	private double amount;          //amount to be transferred
	@Column(name="transactionStatus")
	private String transactionStatus;
	@Column(name="timestamp")
	private Date timestamp;
	@Column(name="bankId")
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
