import javax.swing.JOptionPane;
public class Life extends Insurance {

	public Life(String InType, double MonthlyPrice) {
		super("Life", MonthlyPrice);
		setCost();
	}

	void setCost() {
		MonthlyPrice= 36;
		
	}
	void display() {
		JOptionPane.showMessageDialog(null, "Type of Insurance is " + getTypeLife());
		JOptionPane.showMessageDialog(null, "Fee per Month is: " + getPriceLife() + "$");
	}

}