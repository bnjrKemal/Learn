package file;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class kopyalama {

	public static void main(String[] args) {
		
		try {
		
			File reaD = new File("C:\\Users\\Kemal\\Desktop\\Spigot\\read.txt");
			File writE = new File("C:\\Users\\Kemal\\Desktop\\Spigot\\write.txt");
			BufferedReader br = new BufferedReader(new FileReader(reaD));
			BufferedWriter bw = new BufferedWriter(new FileWriter(writE));
			String satir;
			while((satir= br.readLine()) != null) {
				bw.write(satir);
				bw.newLine();
			}
			
			bw.flush();
			bw.close();
			br.close();
			
		}catch(IOException e) {
			e.printStackTrace();
		}	
	}
}
