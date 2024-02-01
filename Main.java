
public class Main {

	public static void main(String[] args) {
		RegularPolygon regularpolygon1=new RegularPolygon();
		RegularPolygon regularpolygon2=new RegularPolygon(6,4);
		RegularPolygon regularpolygon3=new RegularPolygon(10,4,5.6,7.8);

		System.out.println("polygon 1-Perimeter: " + regularpolygon1.getPerimeter() + ", Area: " + regularpolygon1.getArea() );
		System.out.println("polygon 2-Perimeter: " + regularpolygon2.getPerimeter() + ", Area: " + regularpolygon2.getArea() );
		System.out.println("polygon 3-Perimeter: " + regularpolygon3.getPerimeter() + ", Area: " + regularpolygon3.getArea() );

	}

}
