import java.util.*;
//���� ����
public class BankFunc {
	int amount;
	
	public BankFunc(int var) {
		this.amount =var;
		System.out.println("���� ���� ����"+this.amount);
	}
	//�Ա�
	public void addAmount(int var) {
		this.amount = this.amount+var;
		System.out.println("���� ���� ����"+this.amount);
	}
	//���
	public void minusAmout(int var) {
		this.amount = this.amount-var;
		System.out.println("���� ���� ����"+this.amount);
	}
	public void Money() {
		System.out.println("���� ���� ����"+this.amount);
	}
	
}
