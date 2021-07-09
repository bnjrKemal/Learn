package rehber;

import java.io.IOException;
import java.io.RandomAccessFile;
import java.util.Scanner;

public class rehber {
	
	private static int REC_SIZE = 48;
	private static int AD_SIZE = 5;
	private static int SOY_SIZE = 10;
	private static int TEL_SIZE = 5;
	private static long kNo = 0;
	private static String Ad, Soyad, Telefon;
	static RandomAccessFile dRas;
	static Scanner input = new Scanner(System.in);
	
	public static void main(String[] args) throws IOException {
		dRas = new RandomAccessFile("Rehber.dat", "rw");
		char ch;
		do {
			System.out.printf("[1] Kayýt ekle \n");
			System.out.printf("[2] Kayýt listele \n");
			System.out.printf("[3] Çýkýþ\n");
			ch = input.next().charAt(0);
			switch(ch) {
			case '1': kayitEkle(); break;
			case '2': kayitListele(dRas); break;
			case '3': break;
			}
		}while(ch != '3');
		dRas.close();
	}

	public static void kayitListele(RandomAccessFile dosya) throws IOException {
		long numRecords = dosya.length()/REC_SIZE;
		dosya.seek(0);
		System.out.printf("__========================__\n");
		for(int i = 0; i < numRecords; i++) {
			kNo = dosya.readLong();
			Ad = readString(dosya, AD_SIZE);
			Soyad = readString(dosya, SOY_SIZE);
			Telefon = readString(dosya, TEL_SIZE);
			System.out.println(kNo + " " + Ad + "\t" + Soyad + "\t" + Telefon);
		}
		System.out.printf("__========================__\n");
		
		
	}

	public static String readString(RandomAccessFile dosya, int fixedSize) throws IOException {
		String value = "";
		for(int i = 0; i<fixedSize; i++) value += dosya.readChar();
		return value;
	}

	private static void kayitEkle() throws IOException{
		dRas = new RandomAccessFile("Rehber.dat", "rw");
		String cvp = "e";
		do {
			kNo++;
			System.out.println(kNo + ".kayýt\n");
			input.nextLine();
			System.out.print("Ad: \n");
			Ad = input.nextLine();
			System.out.println("Soyad: \n");
			Soyad = input.nextLine();
			System.out.println("Telefon: \n");
			Telefon = input.nextLine();
			writeRecord(dRas);
			System.out.println("\nDevam etmek istiyor musun? (e/h)");
			cvp = input.next();
		}while(cvp.equalsIgnoreCase("e"));
		System.out.println();
		
	}

	public static void writeRecord(RandomAccessFile dosya) throws IOException {
		long dosyaPos = (kNo - 1) * REC_SIZE;
		dosya.seek(dosyaPos);
		dosya.writeLong(kNo);
		writeString(dosya, Ad, AD_SIZE);
		writeString(dosya, Soyad, SOY_SIZE);
		writeString(dosya, Telefon, TEL_SIZE);	
	}

	public static void writeString(RandomAccessFile dosya, String arg, int fixedSize) throws IOException {
		int size = arg.length();
		if(size <= fixedSize) {
			dosya.writeChars(arg);
			for(int i = size; i<fixedSize; i++) dosya.writeChar(' ');
		}else dosya.writeChars(arg.substring(0, fixedSize));
		
	}
	
	

}
