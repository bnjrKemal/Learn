package file;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class bufferedReader {

	private static BufferedReader dOku;
	
	public static void main(String[] args) throws IOException {
		
		File dosya = new File("C:\\Users\\Kemal\\Desktop\\Spigot\\text-2.txt");
		dOku = new BufferedReader(new FileReader(dosya));
		while(true) {
			if(!dOku.ready()) break;
			String str = dOku.readLine();
			System.out.println(str);
		}
		
		
	}

}
