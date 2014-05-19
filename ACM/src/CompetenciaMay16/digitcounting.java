package CompetenciaMay16;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class digitcounting {

	/**
	 * @param args
	 * @throws IOException 
	 * @throws NumberFormatException 
	 */
	
	static int [] arr;
	
	static public void ble(int a, int b){
		for(int i=1; i<=a; i++){
			arr[i%10]+=b;
		}
	}
	
	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int testcases = Integer.parseInt(br.readLine());
		
		for(int i=0; i<testcases; i++){
			
			int max = Integer.parseInt(br.readLine());
			arr = new int[10];
			
			int _log = (int) Math.log10(max);
			
			for(int digito=0; digito<=_log; ++digito){
				int dec=(int)Math.pow(10, digito);
				int izq=max/(dec*10);
				if(izq*dec!=0)	ble(10, izq*dec);
				int val= max%(dec*10)/dec;
				if(val>0) ble(val-1,dec);
				int der=max%dec;
				arr[val]+=der;
				
			}
			for(int j=0; j<10; ++j){
				
			System.out.print(arr[j]);
			if(j!=9) System.out.print(" ");
			}
			System.out.println("");
		}
		
	}

}
