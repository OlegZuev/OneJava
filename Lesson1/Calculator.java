public class Calculator{
	public static void main(String[]args){
		int num1 = 10;
		int num2 = 3;
		int i = 0;
		char mathoperation = '+';
		if (mathoperation == '+'){
			System.out.print(num1+num2);
		}
		else if (mathoperation == '-'){
			System.out.print(num1-num2);
		}
		else if (mathoperation == '/'){
			System.out.print(num1/num2);
		}
		else if (mathoperation == '*'){
			System.out.print(num1*num2);
		}
		else if (mathoperation == '^'){
			for (i = num2; i > 1; i--){
				num1*=num1;
			}
			System.out.print(num1);
		}
		else if (mathoperation == '%'){
			System.out.print(num1%num2);
		}
	}
}