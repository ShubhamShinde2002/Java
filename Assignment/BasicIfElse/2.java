// WAP to check no is less than 10 or greater than 10
import java.io.*;
class smallBig{
	public static void main(String[] args)throws IOException{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter the Input:");
		int input=Integer.parseInt(br.readLine());

		if(input>10){
			System.out.println(input +"is a greater than 10");
		}else{

			System.out.println(input +"is a less than 10");
		}

		
	}
}
