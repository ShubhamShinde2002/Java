// WAP to check week day
import java.io.*;
class weekDay{
	public static void main(String[] args)throws IOException{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter the day:");
		int input=Integer.parseInt(br.readLine());

		if(input<=0){
			System.out.println("?????");
		}
	       	if(input<=7){
			if(input==1)
				System.out.println("Monday");
			if(input==2)
				System.out.println("Tuesday");
			if(input==3)
				System.out.println("Wedsnesday");
			if(input==4)
				System.out.println("Thursday");
			if(input==5)
				System.out.println("Friday");
			if(input==6)
				System.out.println("Staturday");
			if(input==7)
				System.out.println("Sunday");
		
		}
		if(input>7){

				System.out.println("???????");
		}

		
	}
}
