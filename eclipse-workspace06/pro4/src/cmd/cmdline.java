package cmd;

public class cmdline {
//command line arguments
	/*
	 * there 4 kinds of inputs
	 * 1.using buffered reader
	 * 2.using scanner 
	 * 3.command line argument
	 * 4.file concept 
	 */
	public static void main(String[] a) {
		/*
		 * run ->run configuration->java application->main
		 * -->select the class-->goto argument-->type the 
		 * argument in the program arguments text box-->click
		 *  apply
		 * click run 
		 */
		System.out.println(a[0]);
		// a[0] a[1] is a string
		System.out.println(a[1]);
	//converting a[0] to integer and storing in variable b
		int b=Integer.parseInt(a[0]);
		System.out.println(b);
	}

}
