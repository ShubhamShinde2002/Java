// WAP to print even no reverse and odd no reverse difference by 2
import java.io.*;
class oddEvenRev{
	public static void main(String[] args)throws IOException{
	BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		int x= Integer.parseInt(br.readLine());
			if(x%2==1){
				int y;
				while(x>0){
					y=x-2;

				System.out.println(y);
				x=x-2;
				}
			}else{
				while(x>0){
				System.out.println(x);
				x--;
				}
			}
		}
		
	}

