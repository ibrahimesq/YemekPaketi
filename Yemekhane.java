import java.util.Scanner;

public class Yemekhane {
	int fiyat = 0;
	String yemekListesi = "1) Salçalý Makarna = 10\n2) Mercimek Çorbasý = 8\n3) Tarhana Çorbasý = 8\n4) Elma = 3\n5) Su = 2";

	public Yemekhane(Uyeler uye) {
		ilk: while (true) {
			System.out.print("1) Yemek Listesi\n2) Bakiye Yükle\n3) Bakiye Sorgula\n> ");
			Scanner scan = new Scanner(System.in);
			int secim = scan.nextInt();

			if (secim == 1) {
				System.out.println(yemekListesi);
				dongu: while (true) {
					System.out.print("Satýn alým iþlemini tamamlamak için 9, iptal etmek için 0 giriniz.\n> ");
					Scanner scan1 = new Scanner(System.in);
					int secim1 = scan.nextInt();
					switch (secim1) {
					case 1: {
						fiyat += 10;
						System.out.println("Yemek Eklendi!");
						break;
					}
					case 2: {
						fiyat += 8;
						System.out.println("Yemek Eklendi!");
						break;
					}
					case 3: {
						fiyat += 8;
						System.out.println("Yemek Eklendi!");
						break;
					}
					case 4: {
						fiyat += 3;
						System.out.println("Yemek Eklendi!");
						break;
					}
					case 5: {
						fiyat += 2;
						System.out.println("Yemek Eklendi!");
						break;
					}
					case 9: {
						if (fiyat <= uye.bakiye) {
							uye.bakiye -= fiyat;
							System.out.println("Satýn Alma Baþarýlý!\nGüncel Bakiye = " + uye.bakiye);
						} else {
							System.out.println("Bakiye Yetersiz!");
						}
						break ilk;
					}
					case 0: {
						System.out.println("iptal edildi!");
						fiyat = 0;
						break ilk;
					}

					default:
						System.out.println("Seçenekler Dýþýnda Seçim Yapamazsýnýz!");
					}
				}

			} else if (secim == 2) {
				System.out.print("Yüklemek Ýstediðiniz Miktar: ");
				Scanner scan2 = new Scanner(System.in);
				int sonuc = scan2.nextInt();
				if (!scan2.hasNextInt()) {
					System.out.println("Sadece integer bir sayý girebilirsiniz!");
				} else if (sonuc > 0) {
					uye.bakiyeEkle(sonuc);
				} else {
					System.out.println("Hata var!");
				}

			} else if (secim == 3) {
				System.out.println(String.format("Güncel Bakiye: ", uye.bakiye));

			} else if (!scan.hasNextInt()) {
				System.out.println("Sadece integer bir sayý girebilirsiniz!");
			} else {
				System.out.println("Seçenekler dýþýnda seçim yapamazsýnýz!");
			}
		}
	}

}
