package stringMetodlar;

public class split {

	public static void main(String[] args) {
		String s = "K,e,m,a,l";
		
		String c[] = s.split(",");
		for(String x : c) {
			System.out.print(x + "\t");
		}

	}

}
