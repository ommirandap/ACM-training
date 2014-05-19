package March28;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.Queue;

public class datastructure {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String line;
		while ((line = br.readLine()) != null) {
			int n = Integer.parseInt(line);

			//Stack<Integer> s = new Stack<Integer>();
			//Queue<Integer> q = new LinkedList<Integer>();
			String s="";
			String q="";
			Queue<Integer> pp = new PriorityQueue<Integer>(n, new Comp());

			boolean st = true;
			boolean qu = true;
			boolean pi = true;
			boolean flag = false;

			while (n > 0) {
				flag = false;
				String[] str = br.readLine().split(" ");
				int i = Integer.parseInt(str[1]);
				if (Integer.parseInt(str[0]) == 1) {
					s=i+s;
					q=i+q;
					pp.add(i);
				} else {
					int s0=Integer.parseInt(s.charAt(0)+"");
					int q0=Integer.parseInt(q.charAt(q.length()-1)+"");
					s=s.substring(1);
					q=q.substring(0,q.length()-1);
					if ( s0!= i)
						st = false;
					if ( q0!= i)
						qu = false;
					if (pp.remove() != i)
						pi = false;
				}

				--n;
				if (!st && !qu && !pi) {
					System.out.println("impossible");
					flag = true;
					break;
				}
			}
			if (flag)
				continue;
			if (st && !qu && !pi)
				System.out.println("stack");
			else if (!st && qu && !pi)
				System.out.println("queue");
			else if (!st && !qu && pi)
				System.out.println("priority queue");
			else if (!st && !qu && !pi)
				System.out.println("impossible");
			else
				System.out.println("not sure");
		}

	}

}

class Comp implements Comparator<Integer> {
	public int compare(Integer i1, Integer i2) {
		if (i1 > i2)
			return -1;
		if (i1 < i2)
			return 1;
		return 0;
	}
}
