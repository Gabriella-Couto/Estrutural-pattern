package exercicio_5_1;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

public class IOFacade {
	
	private final InputStream is;
	
	public IOFacade(InputStream inputStream) {
		this.is = inputStream;
	}
	
	public void ReadFile() throws IOException {
		
		InputStreamReader isr = new InputStreamReader(is);
		BufferedReader br = new BufferedReader(isr);
		
		String s = br.readLine();
		
		while (s != null) {
			
			System.out.println(s);
            s = br.readLine();
			
		}
		
		br.close();
		
	}

}
