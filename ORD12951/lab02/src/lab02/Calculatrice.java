package lab02;
import javax.swing.JOptionPane;

public class Calculatrice 
{

    public static void main(String[] args) 
    {
	//the inputs
	double number1 = Double.parseDouble(JOptionPane.showInputDialog("Enter first number"));
	double number2 = Double.parseDouble(JOptionPane.showInputDialog("Enter second number"));
	
	///TheMaths
	//addition
	double Add = number1 + number2;
			
	//Soustraction
	double Sous = number1 - number2;
			
	//multiplication
	double Mult = number1 * number2;
			
	//Division
	double Div = number1 / number2;
			
	//Modulo
	double Mod = number1 % number2;
			
	//rounds
	number1 = Math.round(number1 * 10000.0) / 10000;
	number2 = Math.round(number2 * 10000.0) / 10000;
	Add = Math.round(Add * 10000.0) / 10000;
	Sous = Math.round(Sous * 10000.0) / 10000;
	Mult = Math.round(Mult * 10000.0) / 10000;
	Div = Math.round(Div * 10000.0) / 10000;
	Mod = Math.round(Mod * 10000.0) / 10000;
	
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
