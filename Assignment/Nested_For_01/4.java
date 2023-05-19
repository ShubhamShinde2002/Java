//1A 1A 1A 
//1A 1A 1A 
//1A 1A 1A 
import java.io.*;
class Demo4{
	public static void main(String[] args)throws IOException{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		int rows=Integer.parseInt(br.readLine());
		int cols=Integer.parseInt(br.readLine());
		char ch='A';
		int x=1;

		for(int i=0;i<rows;i++){
			for(int j=0;j<cols; j++){
				System.out.print(ch);
				System.out.print(x);
				System.out.print(" ");
			}

				System.out.println();

		}

	}
}
