package file;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class metindosyayaveriEkleme {

	public static void main(String[] args) throws IOException {
		
		File dosya = new File("C:\\Users\\Kemal\\Desktop\\Spigot\\MetinC.txt");
		BufferedWriter dYaz = new BufferedWriter(new FileWriter(dosya, true));
		String str;
		str = "Ne deniyorum onlar\n";
		dYaz.write(str);
		dYaz.close();

	}

}
