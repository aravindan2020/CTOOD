
public class demo {

	public static void main(String[] args) {
		Box<Integer> integerBox = new Box<>();
        integerBox.setValue(10);
        System.out.println("Integer Value: " + integerBox.getValue());

        // Creating a Box for String
        Box<String> stringBox = new Box<>();
        stringBox.setValue("Hello, Generics!");
        System.out.println("String Value: " + stringBox.getValue());

	}

}
