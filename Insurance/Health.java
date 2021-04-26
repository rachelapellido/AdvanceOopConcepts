import javax.swing.JOptionPane;

public class Health extends Insurance {

	public Health(String InType, double MonthlyPrice) {
		super("Health", MonthlyPrice);
		setCost();
	}
	@Override
	void setCost() {
		MonthlyPrice = 196;
		
	}
	@Override
	void display() {
		JOptionPane.showMessageDialog(null, "Type of Insurance is " + getTypeHealth());
		JOptionPane.showMessageDialog(null, "Fee per Month is: " + getPriceHealth() + "$");
	}
}