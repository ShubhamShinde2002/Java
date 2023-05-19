// 14 14 14 14 
// 15 15 15 15
// 16 16 16 16
// 17 17 17 17
import java.io.*;
class Demo3{
	public static void main(String[] args)throws IOException{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		int rows=Integer.parseInt(br.readLine());
		int cols=Integer.parseInt(br.readLine());
		for(int i=0;i<rows;i++){
			int x=14+i;
			for(int j=0;j<cols; j++){
				System.out.print(x+" ");
			}

				System.out.println();

		}

	}
}
