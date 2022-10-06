package seminars1_intro;

public class Uzdevums2 {
	public static void main (String[] args) {
//  izveidot int tipa mainīgo ar vērtību 5 un to izprintēt konsolē
int myInt = 5;
System.out.println(myInt);

	
//	izveidot float tipa mainīgo ar vērtību 9.99 un to izprintēt konsolē
float myFloat = 9.99f;
System.out.println(myFloat);

//	izveidot boolean tipa mainīgo ar vērtību true un to izprintēt konsolē
boolean myBoolean = true;
System.out.println(myBoolean);
	
//	izveidot char tipa mainīgo ar vērtību A un to izprintēt konsolē
char myChar = 'A';
System.out.println(myChar);
	
//	izveidot byte tipa mainīgo ar vērtību 127 un to izprintēt konsolē
byte myByte = 127;
System.out.println(myByte);
	
//	izveidot byte tipa mainīgo ar vērtību 129 un to izprintēt konsolē
// - cannot print, over the range for byte skaitlis1 = 129; - nav iespējams
// byte -128 +127
short skaitlis2 = 129;
byte skaitlis3 = (byte) skaitlis2;
System.out.println(skaitlis3);


	
//	izveidot char tipa mainīgo ar vērtību 65 un to izprintēt konsolē
char myChar2 = 65;
System.out.println(myChar2);
	
//	izveidot short tipa mainīgo ar vērtību 300 un piešķirt to byte tipa mainīgajam. Izprintēt byte tipa mainīgā vērtību konsolē
short myShort = 300;
byte shortByte = (byte) myShort;
System.out.println(shortByte);

//	izveidot long tipa mainīgo ar maksimāļo long tipa vērtību. Izpritēt long tipa mainīga vērtību konsolē
long maxLong = Long.MAX_VALUE;
System.out.println(maxLong);
	}
}
