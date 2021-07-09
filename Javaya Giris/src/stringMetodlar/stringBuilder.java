package stringMetodlar;

public class stringBuilder {

	public static void main(String[] args) {
		StringBuilder s = new StringBuilder("Kemallettin  lekber");
		
		s.insert(s.length(), "ov");
		System.out.println(s);
		s.setCharAt(12, 'E');
		System.out.println(s);
		s.replace(5, 11, "");
		System.out.println(s);
		s.reverse();
		System.out.println(s);

	}

}
