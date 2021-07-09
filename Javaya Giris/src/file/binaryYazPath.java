package file;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class binaryYazPath {

	public static void main(String[] args) throws IOException{
		
		byte dizi[] = {'x', 'y', 'z'};
		Path dosya = Paths.get("C:\\Users\\Kemal\\Desktop\\Spigot\\binaryPath.bin");
		Files.write(dosya, dizi);

	}

}
