package Decorator;

public class dosademo {

	public static void main(String[] args) {
		Dosa d=new Plaindosa();
		System.out.println("Cost: " + d.getcost() + ", Description: " + d.Description());
		d=new Masaladosa(d);
		System.out.println("Cost: " + d.getcost() + ", Description: " + d.Description());
		d=new pesarattu(d);
		System.out.println("Cost: " + d.getcost() + ", Description: " + d.Description());

	}

}
