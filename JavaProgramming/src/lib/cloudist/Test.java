package lib.cloudist;

import java.util.Scanner;

public class Test {
	
	/*
	 * TODO : Learning class ının bir objesini oluşturup 
	 * Test class ı içinde main fonksiyonda print() metodunu çağırarak ekrana "Hello World" yazdırın. 
	 * 
	 * */
	

	public static void main(String[] args) {
		//Learning class obje oluştur
		//print() metodunu çağırınız.
		
		Learning obje = new Learning();
		obje.Print();
		
		int secim,ilkindex,sonindex;
		String cumle;
		String kelime,yeni,eski;
				
		System.out.println("Cümlenizi giriniz:");
		Scanner input = new Scanner(System.in);
		cumle=input.nextLine();
		
		secim=menu();
		switch (secim) {
		case 1:
			System.out.println("Cümledeki kelime sayısı = "+obje.kelimeSayisi(cumle));
			
			break;
		case 2:
			System.out.println("Cümledeki sesli harf sayısı = " +obje.cumleAnaliz(cumle));
			
			break;
		case 3:
			System.out.println("Cümledeki sessiz harf sayısı = " +obje.cumleAnaliz2(cumle));
			break;

		case 4:
			System.out.println("Cümledeki noktalama işareti sayısı = "+obje.cumleAnaliz3(cumle));
			break;

		case 5:
			System.out.println("Cümlede hangi kelimeyi aramak istiyorsunuz? ");
			kelime=input.nextLine();
			obje.bul(cumle,kelime); 
			break;

		case 6:
			System.out.println("Cümlede değiştirmek istediğiniz kelimeyi girin:");
			eski=input.nextLine();
			System.out.println("Yeni kelimeyi giriniz:");
			yeni=input.nextLine();
			obje.degistir(cumle, eski, yeni);
			break;

		case 7:
			System.out.println("Cümleyi giriniz:");
			obje.terstenyazdir(cumle);
	
			break;

		case 8:
			System.out.println("kaçınıcı indisli kelimeyi yer değiştimek istiyorsunuz?");
			ilkindex=input.nextInt();
			System.out.println("kaçınıcı indisli kelimeyi yer değiştimek istiyorsunuz?");
			sonindex=input.nextInt();
			System.out.println(obje.yerdegistir(cumle, ilkindex, sonindex));
			break;

		

		case 9:
			
			System.out.println(obje.harfleriBuyut(cumle));
			System.out.println(obje.harfleriKucult(cumle));
			break;
		case 10:
		
			System.out.println("Silmek istediğiniz kelimeyi giriniz:");
			kelime=input.nextLine();
			System.out.println(obje.KelimeSil(cumle, kelime));
			
			break;	
			
		case 11:
			
			System.out.println("Eklemek istediğiniz kelimeyi giriniz:");
			kelime=input.nextLine();
			System.out.println(obje.KelimeEkle(cumle, kelime));
			
			break;	
			
		default:System.err.println("Yanlis secim...");
			break;
		}
		
	}
		public static int menu(){
			int secim;
			Scanner input = new Scanner(System.in);
			System.out.println("1-Kaç kelime var\n" +
					"2-Kelimelerin içinde kaç sesli harf var" +
					"3 kaç tane sessiz harf var\n" +
					"4-Cümledeki noktalama işaretleri sayısı \n" +
					"5-Cümlede kelime arama\n" +
					"6-Cümle kelimelerin yerini değiştirme\n" +
					"7-Cümleyi tersten yazdırma\n" +
					"8-Cümle içinde kelimelere indis vererek yer değiştirme\n" +
					"9-Cümle içindeki tüm harflerin hepsini küçük-büyük yap\n" +
					"10-Cümle içindeki kelimeyi sil\n"+
					"11-Cümleye kelime ekle");
			System.out.print("Seçiminiz : ");
			secim = input.nextInt();

			return secim;
		
		}
		
		
		
		
	

}
