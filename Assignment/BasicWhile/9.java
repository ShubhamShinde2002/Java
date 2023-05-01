// WAP to print given no in reverse
import java.io.*;
class rev{
	public static void main(String[] args)throws IOException{
	BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		int x= Integer.parseInt(br.readLine());
		int y;
		while(x!=0){
			y=x%10;
			System.out.print(y);
			x=x/10;
		}
	}
		
	}

