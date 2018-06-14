package _22strategy;

public class Factory {
	private Cash cash;
	
	public Factory(Cash cash){
		this.cash = cash;
	}
	
	public double discount(double money){
		return this.cash.method(money);
	}

}
