//d d d d
//c c c c
//b b b b
//a a a a
import java.io.*;
class Demo8{
	public static void main(String[] args)throws IOException{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		int rows=Integer.parseInt(br.readLine());
		int cols=Integer.parseInt(br.readLine());
		char ch='d';
		for(int i=0;i<rows;i++){
			for(int j=0;j<cols; j++){
				System.out.print(ch);
				System.out.print(" ");
			}
			ch--;

				System.out.println();

		}

	}
}
