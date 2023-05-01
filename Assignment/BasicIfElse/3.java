// WAP to check no is positive or negative
import java.io.*;
class positvieNegative{
	public static void main(String[] args)throws IOException{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter the Input:");
		int input=Integer.parseInt(br.readLine());
		if(input==0)

			System.out.println("??????");
		else{

		if(input>0){
			System.out.println(input +"is a positive number");
		}else{

			System.out.println(input +"is a negative Number");
		}

		}
	}
}
