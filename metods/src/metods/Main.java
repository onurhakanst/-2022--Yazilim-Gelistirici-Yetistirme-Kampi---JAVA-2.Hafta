package metods;

public class Main {

	public static void main(String[] args) {
		sayiBulmaca();
	}
	//camel casing // metod isimleri 
	public static void sayiBulmaca() {
		int[] sayilar = new int[] { 1, 2, 5, 7, 9, 0 };
		int aranacak = 6;
		boolean varMi = false;

		for (int sayi : sayilar) {
			if (sayi == aranacak) {
				varMi = true;
				break;
			}

		}
		if (varMi) {
			mesajVer("sayi mevcuttur:" + aranacak);
		} else {
			mesajVer("sayi mevcuttur değildir :" + aranacak);
		}
	}
	public static void mesajVer (String mesaj) {
		System.out.println(mesaj);
	}

}
