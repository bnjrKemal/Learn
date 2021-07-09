package file;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class fileWriter {

	static Scanner gir = new Scanner(System.in);
	
	public static void main(String[] args) throws IOException {

		File dosya = new File("C:\\Users\\Kemal\\Desktop\\Spigot\\text.txt");
		dosya.createNewFile();
		
		//------------------------------------\\
		FileWriter dYaz = new FileWriter(dosya);
		//------------------------------------//
		
		System.out.println("Dosyaya yazýlacak metin: ");
		dYaz.write(gir.next());
		dYaz.flush(); //veri akýþ kanalýný temizle
		dYaz.close(); //dosyayý kapat
	}
	
}
