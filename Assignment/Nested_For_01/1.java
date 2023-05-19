// C2W C2W C2W
// C2W C2W C2W
// C2W C2W C2W
import java.io.*;
class Demo1{
	public static void main(String[] args)throws IOException{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		int rows=Integer.parseInt(br.readLine());
		int cols=Integer.parseInt(br.readLine());
		char ch='C';
		char ch1='W';
		int x=2;

		for(int i=0;i<rows;i++){
			for(int j=0;j<cols; j++){
				System.out.print(ch);
				System.out.print(x);
				System.out.print(ch1);
				System.out.print(" ");
			}

				System.out.println();

		}

	}
}
