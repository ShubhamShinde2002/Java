// 4 5 6 7
// 4 5 6 7
// 4 5 6 7
// 4 5 6 7
import java.io.*;
class Demo2{
	public static void main(String[] args)throws IOException{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		int rows=Integer.parseInt(br.readLine());
		int cols=Integer.parseInt(br.readLine());
		for(int i=0;i<rows;i++){
			int x=4;
			for(int j=0;j<cols; j++){
				System.out.print(x+" ");
				x++;
			}

				System.out.println();

		}

	}
}
