package March21;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class train {
	/**
	 * @param args
	 * @throws IOException
	 */
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int testcases = Integer.parseInt(br.readLine());
		
		while(testcases > 0){
			
			String line= br.readLine();
			if (line.length()==2) System.out.println("NO LOOP");
			else if(numberOf(line, 'M')==numberOf(line,'F')) System.out.println("LOOP");
			else System.out.println("NO LOOP");
			
			--testcases;
		}
	}
	
	public static int numberOf(String a, char c){
		int n=0;
		for(int i=0; i<a.length(); ++i){
			if(a.charAt(i)==c) ++n;
		}
		return n;
		
	}
}
