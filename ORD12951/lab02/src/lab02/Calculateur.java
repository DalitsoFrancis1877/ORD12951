package lab02;

public class Calculateur
{
	public static void main(String[] args) 
	{
		//premier point
		//variable a print
		//number1
		//number2
		
		
		float number1 = (float) Math.random() * 100;
		float number2 = (float) Math.random() * 100;
		
		
		
		///TheMaths
		
		//addition
		float Add = number1 + number2;
		
		//Sous
		float Sous = number1 - number2;
		
		//multiplication
		float Mult = number1 * number2;
		
		//Division
		float Div = number1 / number2;
		
		//Modulo
		float Mod = number1 % number2;
		
		//rounds
		number1 =  (float) Math.round(number1 * 10000.0) / 10000;
		number2 =  (float) Math.round(number2 * 10000.0) / 10000;
		Add =  (float) Math.round(Add * 10000.0) / 10000;
		Sous =  (float) Math.round(Sous * 10000.0) / 10000;
		Mult =  (float) Math.round(Mult * 10000.0) / 10000;
		Div =  (float) Math.round(Div * 10000.0) / 10000;
		Mod =  (float) Math.round(Mod * 10000.0) / 10000;
		
		
		//printing
		
		//Line 1
		System.out.print("Première opérande générée: ");
		System.out.println(number1);
		
		//Line 2
		System.out.print("Seconde opérade générée  : ");
		System.out.println(number2);
		
		//Line 3 (ADD)
		System.out.print(number1);
		System.out.print(" + ");
		System.out.print(number2);
		System.out.print(" = ");
		System.out.println(Add);
		
		
		
		//Line 4 (SOUS)
		System.out.print(number1);
		System.out.print(" - ");
		System.out.print(number2);
		System.out.print(" = ");
		System.out.println(Sous);
		
		//Line 5 (MULT)
		System.out.print(number1);
		System.out.print(" x ");
		System.out.print(number2);
		System.out.print(" = ");
		System.out.println(Mult);
		
		//Line 6 (DIV)
		System.out.print(number1);
		System.out.print(" / ");
		System.out.print(number2);
		System.out.print(" = ");
		System.out.println(Div);
		
		//Line 7 (MOD)
		System.out.print(number1);
		System.out.print(" % ");
		System.out.print(number2);
		System.out.print(" = ");
		System.out.println(Mod);
	}
}
