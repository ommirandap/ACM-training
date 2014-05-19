package March21;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ones {

	/**
	 * @param args
	 * @throws IOException
	 */
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String line;
				
		while ((line = br.readLine())!= null) {

			int a = Integer.parseInt(line);
			int n=0; //guarda restos
			int i;
			for (i=0; true; ++i){
				n=((n%a)*(10%a))%a+(1%a);
				if (n%a==0) break;
			}
			System.out.println(i+1);
		}

	}

}
