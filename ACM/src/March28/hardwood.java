package March28;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.TreeMap;
import java.util.Map;

public class hardwood {

	/**
	 * @param args
	 * @throws IOException 
	 * @throws NumberFormatException 
	 */
	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		String line;
		
		int testcases = 0;
		if((line=br.readLine()) != null)
			testcases = Integer.parseInt(line);
		
		Map<String, Integer> tm = new TreeMap<String, Integer>();
		
		br.readLine();
		
		while(testcases > 0){
			
			double total = 0.0;
			
			while((line=br.readLine())!=null && !(line.equals(""))){
				
				if(tm.containsKey(line))
					tm.put(line, tm.get(line)+1);
				else{
					tm.put(line,1);
				}
				total++;
			}
			
			for (String key: tm.keySet()) {
				double per = 100.0 * (tm.get(key) / total);
				
				System.out.print(key);
				System.out.printf("%.4f\n", per);
				
			}
			
			testcases--;
			if(testcases != 0)
				System.out.println();
			tm.clear();
		}
				
	}

}
