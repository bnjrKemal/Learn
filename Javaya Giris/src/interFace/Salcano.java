package interFace;

class Salcano implements Bisiklet {
	
	int hiz = 0;
	
	public void hizlan(int art) {
		hiz = hiz + art;
	}
	
	public void yavasla(int azalt) {
		hiz = hiz - azalt;
	}
	
	void gosterge() {
		System.out.println("Hýz: " + hiz);
	}
}
