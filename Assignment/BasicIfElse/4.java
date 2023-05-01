// WAP to check no from 0 to 5 and print it spelling . If the no is greater than 5 print no is greater than 5
import java.io.*;
class Demoif{
	public static void main(String[] args)throws IOException{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter the Input:");
		int input=Integer.parseInt(br.readLine());

		if(input<0){
			System.out.println("?????");
		}else if(input<=5){

			if(input==0)
				System.out.println("Zero");
			if(input==1)
				System.out.println("One");
			if(input==2)
				System.out.println("Two");
			if(input==3)
				System.out.println("three");
			if(input==4)
				System.out.println("Four");
			if(input==5)
				System.out.println("Five");
		
		}
		else{

				System.out.println("No is greater than 5");
		}

		
	}
}
