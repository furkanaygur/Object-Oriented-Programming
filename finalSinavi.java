package Algo2Sinav;
import java.util.Scanner;
  
class Arac{
	public int index=0;
	public int tekerlekSayisi=4;
	public static int aracSayisi;
	public int aracID;
	
	Arac() {
			this.aracSayisi++;
			aracID=this.aracSayisi;
	}
	
	 void hizlanma() {
		 System.out.println("arac hizlaniyor.");
	 }
	 void frenleme() {
		 System.out.println("arac yavaþlýyor.");
	 }
}
class Otomobil extends Arac{
 
	 
	public Otomobil(){
		this.tekerlekSayisi=4;
		 
	}
}
class Kamyon extends Arac{
	public Kamyon( ) {
		this.tekerlekSayisi=4;
	}
}
class Bisiklet extends Arac{
	 
	public Bisiklet() {
		this.tekerlekSayisi=2;
	}
}
class Garaj{
	 
	public int sifre =(int)(1000+Math.random()*8999);
 	public int sayi;
	boolean parkDurumu=false; 
	void parkEt(Arac a1) {
		if (parkDurumu==false) {
			
			System.out.println(a1.aracID +" No'lu arac Parkedildi");
			System.out.println("Aracýnýzý geri almak için Gerekn þifre: "+sifre);
			System.out.println("Garajdaki Bulunan aracýn tekerlek sayisi ="+a1.tekerlekSayisi);
			parkDurumu=true;
		}
		else {
		System.out.println("Garajda Arac bulunmakta ");
		System.out.println("Garajdaki Bulunan aracýn tekerlek sayisi ="+a1.tekerlekSayisi);
		
		}
	}
	void parktanAl(Arac a1)
	{
		Scanner sifreAl = new Scanner(System.in);
		System.out.print("Sifrenizi Giriniz = ");
		sayi=sifreAl.nextInt();
		if(sayi==sifre)
		{
			System.out.println("Aracýnýz garajdan çýkarýlmýþtýr.");
			sifre =(int)(1000+Math.random()*8999);
		}
		else {
			System.out.println("Sifre hatalý lütfen þifrenizi kontrol ediniz.");
			sifre =(int)(1000+Math.random()*8999);
			System.out.print("Sifrenizi Giriniz = ");
			sayi=sifreAl.nextInt();
		}
	}
}
public class finalSinavi {
	public static void main(String[] args)
	{
		Garaj g = new Garaj();
		Otomobil o1 = new Otomobil();
		Bisiklet b1 = new Bisiklet();
		g.parkEt(o1);
		g.parktanAl(o1);
		g.parkEt(b1);
		g.parkEt(o1);
	}
}
