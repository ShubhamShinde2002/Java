// WAP to check month and print it days . If the month is invalid print Invalid Month
import java.io.*;
class Demoelse{
	public static void main(String[] args)throws IOException{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter the Month:");
		int input=Integer.parseInt(br.readLine());

		if(input<=0){
			System.out.println("?????");
		}else if(input<=12){

			
			if(input==1)
				System.out.println("31 days");
			if(input==2)
				System.out.println("28 days");
			if(input==3)
				System.out.println("31 days");
			if(input==4)
				System.out.println("30 days");
			if(input==5)
				System.out.println("31 days");
			if(input==6)
				System.out.println("30 days");
			if(input==7)
				System.out.println("31 days");
			if(input==8)
				System.out.println("31 days");
			if(input==9)
				System.out.println("30 days");
			if(input==10)
				System.out.println("31 days");
			if(input==11)
				System.out.println("30 days");
			if(input==12)
				System.out.println("31 days");
		
		}
		else{

				System.out.println("Invalid Month");
		}

		
	}
}
