package com.rsc.srm.fs.basic;

public class Payment extends BaseModel {

	private String txnRefNumber;
	
	private Integer amount;

	public String getTxnRefNumber() {
		return txnRefNumber;
	}

	public void setTxnRefNumber(String txnRefNumber) {
		this.txnRefNumber = txnRefNumber;
	}

	public Payment(int id,String txnRefNumber, Integer amount) {
		super(id);
		this.txnRefNumber = txnRefNumber;
		this.amount = amount;
	}

	public Integer getAmount() {
		return amount;
	}

	public void setAmount(Integer amount) {
		this.amount = amount;
	}

	@Override
	public String toString() {
		return "Payment [txnRefNumber=" + txnRefNumber + ", amount=" + amount + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((amount == null) ? 0 : amount.hashCode());
		result = prime * result + ((txnRefNumber == null) ? 0 : txnRefNumber.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Payment other = (Payment) obj;
		if (amount == null) {
			if (other.amount != null)
				return false;
		} else if (!amount.equals(other.amount))
			return false;
		if (txnRefNumber == null) {
			if (other.txnRefNumber != null)
				return false;
		} else if (!txnRefNumber.equals(other.txnRefNumber))
			return false;
		return true;
	}
	
	
	
}
