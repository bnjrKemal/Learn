package file;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

public class fileOutputStream {

	@SuppressWarnings("resource")
	public static void main(String[] args) throws IOException{
		File dosya = new File("C:\\Users\\Kemal\\Desktop\\Spigot\\text-2.txt");
		
		//------------------------------------\\
		FileOutputStream dYaz = new FileOutputStream(dosya);
		//------------------------------------//
		
		var gir = new Scanner(System.in);
		System.out.println("Dosyaya yazýlacak metin: ");
		String d = gir.nextLine();
		dYaz.write(d.getBytes());
		dYaz.close();
		
	}
	
}
