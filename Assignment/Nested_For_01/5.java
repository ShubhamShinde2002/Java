// 12 12 12
// 11 11 11 
// 10 10 10
import java.io.*;
class Demo5{
	public static void main(String[] args)throws IOException{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		int rows=Integer.parseInt(br.readLine());
		int cols=Integer.parseInt(br.readLine());

		for(int i=0;i<rows;i++){
			int x=12-i;
			for(int j=0;j<cols; j++){
				System.out.print(x);
				System.out.print(" ");
			}

				System.out.println();

		}

	}
}
