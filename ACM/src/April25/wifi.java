package April25;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class wifi {

	static int M[];
	
	public static boolean check(int mid, int routers, int houses){
		int used = 1;
		int range = M[0] + mid;
		
		for(int i=0; i<houses; i++){
			if (M[i] > range){ 
				range = M[i] + mid; 
				used++; 
			}
		}
		
		return (used <= routers);
		
	}
	
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int testcases = Integer.parseInt(br.readLine());
		
		for(int i=0; i<testcases; i++){
			
			String []aux = br.readLine().split(" ");
			int routers = Integer.parseInt(aux[0]);
			int houses = Integer.parseInt(aux[1]);
			
			M = new int[100000 + 10];
			for(int j=0; j<houses; j++){
				int ind = Integer.parseInt(br.readLine());
				M[i] = ind;
			}
			
			Arrays.sort(M);
			
			if(routers >= houses){
				System.out.println("0.0");
				continue;
			}
			
			//sort M ¿?
			
	        int lo = 0;
	        int hi = M.length;
	 
	        while ( hi - lo > 1 ) {
	            int mid = (lo + hi) / 2;
	            if ( check (mid * 2, routers, houses) ) hi = mid;
	            else lo = mid;
	        }
	        
	        System.out.println(hi);
	        
	        lo *= 10;
	        hi *= 10;
	 
	        for ( int k = 0; k < houses; k++ ) 
	        	M[k] *= 10;
	 
	        while ( hi - lo > 1 ) {
	            int mid = (lo + hi) / 2;
	            if ( check (mid * 2, routers, houses) ) hi = mid;
	            else lo = mid;
	        }
	        
	        System.out.println(hi);
	        //System.out.printf("%1f.%1f\n", hi / 10, hi % 10);
			
		}
		
	
	
	}	
}

