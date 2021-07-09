package file;

import java.io.IOException;
import java.io.RandomAccessFile;

public class randomAccessFile {

	/*
	 * int = 4 byte
	 * long = 8 byte
	 * float = 4 byte
	 * double = 8 byte
	 */
	
	
	private static RandomAccessFile dRas;
	
	public static void main(String[] args) throws IOException {
		
		int dizi[] = {1, 4, 2, 5, 3, 9, 14, 19, 6, 13, 12};
		dRas = new RandomAccessFile("Random.dat", "rw");
		for(int i : dizi) {
			dRas.writeInt(i);
			}
		try {
			System.out.println("Dosya uzunluðu : " + dRas.length());
			dRas.seek(0); //1.kayýta konumlan
			System.out.println("1. sayý : " + dRas.readInt());
			dRas.seek(1 * 4);
			System.out.println("2. sayý : " + dRas.readInt());
			dRas.seek(10 * 4);
			System.out.println("11. sayý : " + dRas.readInt());
			dRas.writeInt(54);
			dRas.seek(dRas.length());
			System.out.println("Dosya uzunluðu : " + dRas.length());
			dRas.seek(11 * 4);
			System.out.println("12. sayý : " + dRas.readInt());
		}
		catch(IOException e) {
			System.out.println("Okuma yazma hatasý");
		
		}
		}

}