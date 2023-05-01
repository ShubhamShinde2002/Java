// WAP to count digit of no
import java.io.*;
class digitOfNo{
	public static void main(String[] args)throws IOException{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter the Input:");

		int x=Integer.parseInt(br.readLine());
		int count=0;
		while(x!=0){
			count++;
			x=x/10;
		}
		System.out.println(count);
	}
}
