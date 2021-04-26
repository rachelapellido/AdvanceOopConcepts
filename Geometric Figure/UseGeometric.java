
public class UseGeometric {

	public static void main (String[]args) {
		double height,width,area;
		String figuret;
		
		GeometricFigure[] type = new GeometricFigure[5];
		type[0] = new Square(15,3, "==Square==");
		type[1] = new Triangle(20,3, "==Triangle==");
		type[2] = new Square(12,4, "==Square==");
		type[3] = new Triangle(6,3, "==Triangle==");
		type[4] = new Square(100,2, "==Square==");

		for(int i = 0; i <type.length; i++)
		{
			height = type[i].getHeight();
			width = type[i].getWidth();
			figuret = type[i].getType();
			area = type[i].Area(height, width);
			System.out.println( figuret + "\nHeight: " + height + "\nWidth: " + width + "\nArea: " + area);
			
		}
	}
}
