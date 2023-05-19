//C B A
//C B A
//C B A
import java.io.*;
class Demo9{
	public static void main(String[] args)throws IOException{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		int rows=Integer.parseInt(br.readLine());
		int cols=Integer.parseInt(br.readLine());

		for(int i=0;i<rows;i++){
			char ch='C';
			for(int j=0;j<cols; j++){
				System.out.print(ch);
				System.out.print(" ");
				ch--;
			}

				System.out.println();

		}

	}
}
