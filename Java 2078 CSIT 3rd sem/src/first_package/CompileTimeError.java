package first_package;

public class CompileTimeError {
	
	public  static void main(String[] args) {
		
		//compile time error 
		// Syntax error: write invalid code highlighted as red
		//Semantic error for eg. int int = 100
		
		//Primitive data type
		int num1 = 10;
		double num2 = 10.56;
		char gender ='M';
		boolean flag = true;
		float salary = 1234.56f;
		byte rollNo = 12;
		long id = 23455664L;
		short height = 45;
		


		//Non primitive data type
		String name = "Rup Jung Malla";
		Object data = "Texas International College";
		
		System.out.println("Int num1 : "+num1);
		System.out.println("double num2 : "+num2);
		System.out.println("String name : "+name);
		System.out.println("Character gender : "+gender);
		System.out.println("Boolean flage : "+flag);
		System.out.println("Object data : "+data);
		System.out.println("Float salary: "+salary);
	}
}
