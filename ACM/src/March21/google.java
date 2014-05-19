package March21;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class google {
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int testcases = Integer.parseInt(br.readLine());
		int cont=0;
		while(testcases > 0){
			++cont;
			String out="";
			int n=0;
			for (int i=0; i<10; ++i){
				String [] line= br.readLine().split(" ");
				if(Integer.parseInt(line[1])>n){
					n=Integer.parseInt(line[1]);
					out=line[0];
				}
				else if(Integer.parseInt(line[1])==n){
					out=out+"\n"+line[0];
				}
				
			}
			System.out.println("Case #"+cont+":");
			System.out.println(out);
				
			
			--testcases;
		}
	}
	

}
