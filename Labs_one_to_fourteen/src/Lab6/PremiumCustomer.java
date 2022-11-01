package Lab6;

import Lab7.OverBalanceException;

public class PremiumCustomer extends Customer implements Premium {

	private int vipCard;
	private int years;

	public PremiumCustomer(String name, double balance, StringBuilder items, double cartCost, int vipCardNumber,
			int yearsAsPremium) {
		super(name, balance, items, cartCost);
		this.vipCard = vipCardNumber;
		this.years = yearsAsPremium;
	}

	public int getVipCard() {
		return vipCard;
	}

	public void setVipCard(int vipCard) {
		this.vipCard = vipCard;
	}

	public int getYears() {
		return years;
	}

	public void setYears(int years) {
		this.years = years;
	}

	@Override
	public double discountPrice(double discount) {

		double discountedPrice = super.cartCost * discount;

		return discountedPrice;
	}

	@Override
	public void buy() throws OverBalanceException {
		double itemsCostAfterDiscount = super.cartCost - discountPrice(0.15);
		if (super.balance < itemsCostAfterDiscount)
			throw new OverBalanceException();
		else {
			super.balance = super.balance - itemsCostAfterDiscount;
			super.cartCost = 0;
			super.items = null;
		}
	}

	@Override
	public String toString() {
		return "PremiumCustomer [vipCard=" + getVipCard() + ", years=" + getYears() + ", name=" + getName() + ", balance=" + getBalance()
				+ ", items=" + getItems() + ", cartCost=" + getCartCost() + "]";
	}

}