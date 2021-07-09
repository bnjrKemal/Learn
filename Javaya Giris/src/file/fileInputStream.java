package file;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

public class fileInputStream {

	@SuppressWarnings("resource")
	public static void main(String[] args) throws IOException{
		int i ;
		File dosya = new File("C:\\Users\\Kemal\\Desktop\\Spigot\\text-2.txt");
		FileInputStream dOku = new FileInputStream(dosya);
		do {
			i = dOku.read();
			if(i !=  -1) System.out.print((char) i);
		}while(i != -1);
		
	}

}
