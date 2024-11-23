import java.lang.*;
import java.util.*;
public class Expression2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter height of cubiod: ");
		float height = scanner.nextFloat();
		System.out.println("Enter length of cubiod: ");
		float length = scanner.nextFloat();
		System.out.println("Enter breadth of cubiod: ");
		float breadth = scanner.nextFloat();
		double volume = length*breadth*height;
		System.out.println("volume of the cubiod: "+volume);
		double area = 2*(length*breadth+length*height+breadth*height);
		System.out.println("Area of the cubiod: "+area);
	}

}
