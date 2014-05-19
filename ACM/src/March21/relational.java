package March21;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class relational {

	/**
	 * @param args
	 * @throws IOException 
	 */
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int testcases = Integer.parseInt(br.readLine());
		
		while(testcases > 0){
			
			String [] st = br.readLine().split(" ");
			int a = Integer.parseInt(st[0]);
			int b = Integer.parseInt(st[1]);
			
			if(a == b)
				System.out.println("=");
			else{
				if(a < b)
					System.out.println("<");
				else
					System.out.println(">");
			}
			testcases--;
		}
		
				
	}

}
