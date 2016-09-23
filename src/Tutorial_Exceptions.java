import java.util.Scanner;

public class Tutorial_Exceptions {
	public static int dividebyN(int n) throws Exception{
		if(n==0){
			throw new Exception("Division by zero");
		}
		else{
			return n;
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input=new Scanner(System.in);
		int n=0;
		System.out.println("Enter a number");
		try{
			n=input.nextInt();
			System.out.println("You typed: "+n);
		}
		catch(Exception e){
			System.out.println("You typed the wrong number ");
		}
		try{
			int x=dividebyN(n);
		}
		catch (Exception e1){
			e1.printStackTrace();
		}
		System.out.println("This is the end");
	}

}
