package file;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class binaryYazFile {
	
	public static void main(String[] args) {
		
		try {
			
			char dizi[] = {'x', 'y', 'z'};
			File dosya = new File("C:\\Users\\Kemal\\Desktop\\Spigot\\write.bin");
			ObjectOutputStream bDosya = new ObjectOutputStream(new FileOutputStream(dosya));
			bDosya.writeObject(dizi);
			bDosya.close();
			
		}catch(IOException e) {
			
		}
		
	}
	
}
