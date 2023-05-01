// WAP to check Pythagorus theorem
import java.io.*;
class pythagorusTherom{
	public static void main(String[] args)throws IOException{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter the Input3:");
		int input1=Integer.parseInt(br.readLine());
		System.out.println("Enter the Input2:");
		int input2=Integer.parseInt(br.readLine());
		System.out.println("Enter the Input1:");
		int input3=Integer.parseInt(br.readLine());

		int x=(input1*input1)+(input2*input2);

		int y=(input3*input3);

		if(x==y){
			System.out.println("It is Pythagorean Triplet");
		}else{
			System.out.println("It is Not Pythagorean Triplet");
		}

		
	}
}
