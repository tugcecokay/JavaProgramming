package lib.cloudist;

import java.util.ArrayList;
import java.util.Arrays;

public class Learning {

	
	public void Print()
	{
		System.out.println("Merhaba Cloudist Java :)");
	}
	
	public int kelimeSayisi(String cumle){
		int k = 0;
		cumle.trim();
		for(int i=0; i<cumle.length(); i++){
			if(cumle.equalsIgnoreCase(" ")){
				k++;
			}
			
		}
		return k;
	}
	
	public int cumleAnaliz(String cumle){
	int sesliSay=0;
	String sesli= "aeoöuüıiAEOÖÜUIİ";
	for (int i = 0; i <cumle.length(); i++) {
		if(sesli.indexOf(cumle.charAt(i))!=-1)
			sesliSay++;
		
	}
	return sesliSay;
	}
	
	public int cumleAnaliz2(String cumle){
		return cumle.length()-cumleAnaliz(cumle);
		
	}
	
	public int cumleAnaliz3(String cumle){
		int isaretSay = 0;
		String noktalamaIsaret =".,?:;'" ;
		for(int i =0; i<cumle.length(); i++){
			if(noktalamaIsaret.indexOf(cumle.charAt(i))!=-1)
				isaretSay++;
		}
		return isaretSay;
	}
	
	public void bul(String cumle,String bul){
		System.out.println(cumle.contains(bul));
	}
	
	public void degistir(String cumle,String eski, String yeni){
		System.out.println(cumle.replaceAll(eski, yeni));
		
	}
	
	public void terstenyazdir(String cumle){
		
		for(int i=cumle.length()-1; i>=0; i--){
			System.out.print(cumle.charAt(i));
		}
	}
	public String yerdegistir(String cumle,int x,int y){
		String[] kelimeler = cumle.replaceAll("\\p{P}", "").split("\\s");
		StringBuilder builder = new StringBuilder();
		String temp;
		if( x<kelimeler.length && x>=0 && y<kelimeler.length && y>=0){
			
			temp = kelimeler[x];
			kelimeler[x] = kelimeler[y];
			kelimeler[y] = temp;
			for (int i = 0; i < kelimeler.length; i++) {
				builder.append( kelimeler[i] );
				builder.append(' ');
				  
				}
		}
		else {
			System.err.println("Yanlış giriş yapıldı");
			System.exit(-1);
		}

		return builder.toString();
	
	}
	public String harfleriBuyut(String cumle){
		
		return cumle.toUpperCase();
	}
	public String harfleriKucult(String cumle){
		return cumle.toLowerCase();
	}
	public String KelimeSil(String cumle, String kelime){
		ArrayList<String> kelimeler=new ArrayList<String>(Arrays.asList(cumle.replaceAll("\\p{P}", "").split("\\s")));
		StringBuilder builder = new StringBuilder();
		int location = kelimeler.indexOf(kelime);
		if (location<0) {
			System.err.println("Silmek istediğiniz kelime cümlede yok");
			
		}
		else {
			kelimeler.remove(location);			
			for (int i = 0; i < kelimeler.size(); i++) {
				builder.append(kelimeler.get(i));
				builder.append(' ');
				}
		}

		return builder.toString();		
	
		
	}
	public String KelimeEkle(String cumle, String kelime){
		ArrayList<String> kelimeler=new ArrayList<String>(Arrays.asList(cumle.replaceAll("\\p{P}", "").split("\\s")));
		StringBuilder builder = new StringBuilder();
		kelimeler.add(kelime);
		for (int i = 0; i < kelimeler.size(); i++) {
			builder.append(kelimeler.get(i));
			builder.append(' ');
			}
		return builder.toString();	
	
	}
	
	
	
}
	