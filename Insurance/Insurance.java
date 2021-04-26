public abstract class Insurance {
	public String InType;
	public double MonthlyPrice;
	

	public Insurance(String  InType, double MonthlyPrice ) {
		// TODO Auto-generated constructor stub
		this. InType =  InType;
		this.MonthlyPrice = MonthlyPrice;
	}
	public String getTypeLife()
	{
		return InType;
	}
	public String getTypeHealth() {
		return InType;
	}
	public double getPriceLife()
	{
		return MonthlyPrice;
	}
	public double getPriceHealth()
	{
		return MonthlyPrice;
	}
	abstract void setCost();
	abstract void display();
	

}