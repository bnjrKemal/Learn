package file;

import java.nio.file.Path;
import java.nio.file.Paths;

public class getfilename {

	public static void main(String[] args) {
		Path strDosya = Paths.get("C:\\Users\\Kemal\\Desktop\\Spigot\\MetinC.txt");
		String dosya = strDosya.getFileName().toString();
		System.out.println(dosya);
		if(dosya.endsWith(".txt")) System.out.println("Metin dosyasýdýr.");
		else if(dosya.endsWith(".sk")) System.out.println("Skript dosyasýdýr.");
		else if(dosya.endsWith(".doc")) System.out.println("Word dosyasýdýr.");
		else if(dosya.endsWith(".java")) System.out.println("Java dosyasýdýr.");
		else System.out.println("Farklý bir tip dosyadýr.");
	}

}
