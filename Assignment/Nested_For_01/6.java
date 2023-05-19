//9 8 7
//9 8 7
//9 8 7
import java.io.*;
class Demo6{
	public static void main(String[] args)throws IOException{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		int rows=Integer.parseInt(br.readLine());
		int cols=Integer.parseInt(br.readLine());

		for(int i=0;i<rows;i++){
			int x=9;
			for(int j=0;j<cols; j++){
				System.out.print(x);
				System.out.print(" ");
				x--;
			}

				System.out.println();

		}

	}
}
