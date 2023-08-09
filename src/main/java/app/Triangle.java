package app;

public class Triangle {
	    private int side1;
	    private int side2;
	    private int side3;

	    public Triangle(int side1, int side2, int side3) {
	        this.side1 = side1;
	        this.side2 = side2;
	        this.side3 = side3;
	    }

	    public Triangle() {
			// TODO Auto-generated constructor stub
		}

		public String showType() {
	        if (side1 == side2 && side2 == side3) {
	            return "Equilateral";
	        } else if (side1 == side2 || side1 == side3 || side2 == side3) {
	            return "Isosceles";
	        } else {
	            return "Scalene";
	        }
	    }
	    
    public static void main(String[] args) {
        Triangle t1 = new Triangle(5, 5, 5);
        System.out.println("Triangle t1 is " + t1.showType());
    }
}

