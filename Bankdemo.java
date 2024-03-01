
public class Bankdemo {

	public static void main(String[] args) {
		Bank SBIATM=Bank.getInstance();
		Bank ICICIATM=Bank.getInstance();
		SBIATM.deposit(2000);
		ICICIATM.withdraw(1500);
		}

}
