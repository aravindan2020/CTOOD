package p1;

import java.util.Scanner;

public class ShapeDimDemo {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		ShapeDim c=new ShapeDim();
		System.out.println(c.findArea(sc.nextDouble()));
		System.out.println(c.findArea(sc.nextInt()));
		System.out.println(c.findArea(sc.nextFloat(),sc.nextFloat()));
		System.out.println(c.findArea(sc.nextDouble(),sc.nextDouble()));
		sc.close();

	}

}
