package March28;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.PriorityQueue;
import java.util.Queue;

public class addall {

	/**
	 * @param args
	 * @throws IOException 
	 * @throws NumberFormatException 
	 */
	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		while (Integer.parseInt(br.readLine()) != 0) {
			Queue<Integer> pp = new PriorityQueue<Integer>();
			String[] line = br.readLine().split(" ");
			for (String s : line) {
				pp.add(Integer.parseInt(s));	
			}
			int sum=0;
			while(pp.size()!=1){
				int valor= pp.remove()+pp.remove();
				sum+=valor;
				pp.add(valor);
			}
			
			System.out.println(sum);

		}

	}
}
