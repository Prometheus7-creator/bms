package bms.project.demo.Entity;
import jakarta.persistence.*;
import lombok.*;

@Entity
@Table
@ToString
@Getter
@Setter
public class NeftTransaction extends Transaction {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long transactionID;
	@Override
	public Boolean verifyTransactionAmount(String transactionType,double amount)
	{
		return true;
	}

}