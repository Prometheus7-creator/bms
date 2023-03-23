package bms.project.demo.Entity;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table
public class RtgsTransaction extends Transaction{
	@Id
	private String transactionID;
	@Override
	public Boolean verifyTransactionAmount(String transactionType,double amount)
	{
		return true;
	}
}
