// WAP to print countdown of days and submit the assignment
import java.io.*;
class daysCountDown{
	public static void main(String[] args)throws IOException{
	BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		int x= Integer.parseInt(br.readLine());
		while(x!=0){
			System.out.println(x+" "+"days remaining");
			x--;
		}
		if(x==0){
			System.out.println("0 days Assignment is Overdue");
		}
		}
		
	}

