package bms.project.demo.Entity;

public class RtgsTransaction extends Transaction{

	@Override
	public Boolean verifyTransactionAmount(String transactionType,double amount)
	{
		return true;
	}
}
