// WAP to calculate profit or loss
import java.io.*;
class profitLoss{
	public static void main(String[] args)throws IOException{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter the Selling price:");
		int input1=Integer.parseInt(br.readLine());
		System.out.println("Enter the cost price:");
		int input2=Integer.parseInt(br.readLine());

		int x=input1-input2;

		if(x>0){
			System.out.println("Profit is "+x);
		}else{

			System.out.println("Loss of "+x);
		}
		if(x==0){
			System.out.println("?????");
		}

		
	}
}
