package Datatypes;

public class TypeCastingExample {

	public static void main(String[] args) {
		byte num1=78;
		short snum2=123;
		int inum3=132435;
		long lnum4=5876878;
		
		float fnum5=798.78f;
		double dnum6=7678678.89;
		
		char ch='a';
			
		//Conversion
		
		num1=(byte)snum2;
		lnum4=(long)fnum5;
		
		inum3=ch;//ascii vlaue a-97  implicit conversion
		
		System.out.println(inum3);
		
		ch=(char)inum3;//explicit conversion
		
	}

}
