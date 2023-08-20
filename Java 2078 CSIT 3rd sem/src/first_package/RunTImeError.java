package first_package;

public class RunTImeError {
	public static void main(String[] args) {
		
		int num1=10;
		int num2=2;
		
		//without using try catch block if code throws error it is known as run time error
		//for eg. int result = num1/num2;
		
		//to handle run time exception always use try catch
		
		int result=0;
		
		try {
			 result = num1/num2;

		}
		catch(Exception e) {
			

		}
		System.out.println("Result : "+result);

		
	}
}
