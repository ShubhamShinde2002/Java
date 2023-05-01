// WAP to check no is odd or even
import java.io.*;
class oddEven{
	public static void main(String[] args)throws IOException{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter the Input:");
		int input=Integer.parseInt(br.readLine());

		if(input%2==0){
			System.out.println(input +"is a even Number");
		}else{

			System.out.println(input +"is a odd Number");
		}

		
	}
}
