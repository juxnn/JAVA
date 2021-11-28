package backjoon;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class B15552 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int n = Integer.parseInt(br.readLine());
		
		for(int i =0; i<n; i++) {
			
			int A = Integer.parseInt(br.readLine());
			int B = Integer.parseInt(br.readLine());
			bw.write(A*B);
		}
		br.close();
		bw.flush();
		bw.close();
		
	}
}
