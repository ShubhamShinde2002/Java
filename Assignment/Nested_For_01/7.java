//D D D D
//D D D D
//D D D D
//D D D D
import java.io.*;
class Demo7{
	public static void main(String[] args)throws IOException{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		int rows=Integer.parseInt(br.readLine());
		int cols=Integer.parseInt(br.readLine());
		char ch='D';

		for(int i=0;i<rows;i++){
			for(int j=0;j<cols; j++){
				System.out.print(ch);
				System.out.print(" ");
			}

				System.out.println();

		}

	}
}
