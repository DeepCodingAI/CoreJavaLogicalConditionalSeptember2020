package logical;

public class ApplyLogicalOperator {

	public static void main(String[] args) {
		int num1 = 13;
		int num2 = 9;
		                          
		if((num1 % 2 == 0) || (num1 > num2)) {
			System.out.println(num1 + " either it is Even and it is greater than " + num2);
		}else {
			System.out.println(num1 + " is either not Even and it is not greater than " + num2);
		}

	}

}
