import java.util.*;

public class Bank {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		BankFunc b =new BankFunc(sc.nextInt());
		b.addAmount(2000);
		b.minusAmout(200);
		b.Money();		
	}
}
