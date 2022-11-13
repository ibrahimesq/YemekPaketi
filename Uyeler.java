
public class Uyeler {
	boolean ogrenciMi, ilkYukleme = true;
	int kartNo, bakiye = 100;
	String isim, soyisim;

	public Uyeler(boolean ogrenciMi, int kartNo, String isim, String Soyisim) {
		this.ogrenciMi = ogrenciMi;
		this.kartNo = kartNo;
		this.isim = isim;
		this.soyisim = soyisim;
	}

	void bilgiler() {
		if (ogrenciMi) {
			System.out.println(isim + "\n" + soyisim + "\n" + bakiye + "\n" + "Öðrenci");
		} else {
			System.out.println(isim + "\n" + soyisim + "\n" + bakiye + "\n" + "Öðrenci Deðil");
		}
	}

	void bakiyeEkle(int miktar) {
		if (ilkYukleme) {
			bakiye = miktar;
			ilkYukleme = false;
		} else {
			bakiye += miktar;
		}
	}
}
