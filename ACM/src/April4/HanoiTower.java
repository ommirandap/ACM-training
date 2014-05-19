package April4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;

public class HanoiTower {
	static int max=0;
	//static HashSet<Integer> hm = new HashSet();
	
	public static void main(String[] args) throws NumberFormatException,
			IOException {
		// TODO Auto-generated method stub

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int testcases = Integer.parseInt(br.readLine());
		
//		for(int i = 0; i < 50; i++){
//			hm.add(i*i);
//		}
				
		while(testcases>0){
			int pegs = Integer.parseInt(br.readLine());
			int [] cab= new int [pegs];
			
			max=0;
			backtracking(0,cab,0);
			System.out.println(max);	
			
			--testcases;
		}
	}
	
	public static boolean sonCuadrados(int a, int b){
		return Math.sqrt(a+b)%1==0; 
		//return hm.contains((Integer)a + b);
	}
	
	public static void backtracking(int valor, int [] pegs, int index){
		if(max<valor-1) max=valor-1;
		boolean comb=false;
		for(int i=0; i<index; ++i){
			if (sonCuadrados(pegs[i], valor)){
				int []pegs2= pegs.clone();
				pegs2[i]=valor;
				comb=true;
				backtracking(valor+1, pegs2, index);
			}
		}
		if(index<pegs.length && !comb){
			pegs[index]=valor;
			backtracking(valor+1, pegs, index+1);
		}
		
	}
}
