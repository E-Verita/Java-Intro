package seminars1_intro;

public class Uzdevums3 {
	
	public static void main (String [] args) {
		
	
    // izveidot divus int tipa mainīgos ar vērtībām 9 un 5
	int main1 = 9;
	int main2 = 5;
	
    //izveidot mainīgo, kuram piešķirt abu skaitļu summas vērtību. Iegūto rezultātu izvadīt konsolē
	int summa = main1 + main2;
	System.out.println(summa);	
	
    //izveidot mainīgo, kuram piešķirt abu skaitļu starpības vērtību. Iegūto rezultātu izvadīt konsolē
	int starpiba = main1-main2;
	System.out.println(starpiba);	
	
    //izveidot mainīgo, kuram piešķirt abu skaitļu reizinājuma vērtību. Iegūto rezultātu izvadīt konsolē
	int reizinajums = main1*main2;
	System.out.println(reizinajums);	

	//izveidot mainīgo, kuram piešķirt abu skaitļu dalījuma vērtību. Iegūto rezultātu izvadīt konsolē
	int dalijums = main1/main2;
	System.out.println(dalijums);	

    //izveidot mainīgo, kuram piešķirt abu skaitļu vidējo vērtību. Iegūto rezultātu izvadīt konsolē
	int videjais = summa/2;
	System.out.println(videjais);
	
    //izveidot mainīgo, kuram piešķirt abu skaitļu modulo(jeb atlikumu pēc dalījuma)vērtību. Iegūto rezultātu izvadīt konsolē
	int modulo = 9%5;
	System.out.println(modulo);
}
}