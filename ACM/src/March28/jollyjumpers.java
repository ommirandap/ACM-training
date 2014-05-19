package March28;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.PriorityQueue;
import java.util.Queue;

public class jollyjumpers {

	public static void main(String[] args) throws NumberFormatException,
			IOException {
		// TODO Auto-generated method stub

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String line;

		while ((line = br.readLine()) != null) {

			String[] nStr = line.split(" ");
			int[] n = new int[Integer.parseInt(nStr[0])];
			n[0]=1;

			for (int i = 1; i < nStr.length - 1; i++) {
				int a = Integer.parseInt(nStr[i]);
				int b = Integer.parseInt(nStr[i + 1]);
				
				int samir = Math.abs(a -b);
				if(samir < Integer.parseInt(nStr[0]))
					n[Math.abs(a - b)] = 1;
				else{
					n[0]=0;
					break;
				}
			}
			boolean ble = true;
			for (Integer i : n) {
				if (i == 0) {
					ble = !ble;
					break;
				}
			}

			if (ble)
				System.out.println("Jolly");
			else
				System.out.println("Not jolly");

		}
	}
}
