package stringMetodlar;

public class hanzar {

	public static void main(String[] args) {
		char kA[] = {'h', 'a', 'n', 'z', 'a', 'r', '\0'};
		System.out.println((int)kA[kA.length - 1]);
		System.out.println(kA[3]);
		
		String kB = "HANZAR";
		System.out.println(kB.charAt(5));

		System.out.println((int)'\0'); //0
		System.out.println((int)'0'); //48
		
	}
	
}
