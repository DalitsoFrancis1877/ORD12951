package lab02;
import javax.swing.JOptionPane;

public class Convertisseur 
{

    public static void main(String[] args) 
    {
	double temp = Double.parseDouble(JOptionPane.showInputDialog("Enter temperature"));
	
	
	double f = 9/5*temp + 32;
	double c = 5/9*(temp - 32);
	
	System.out.print(temp);
	System.out.print("ºC");
	System.out.print("=");
	System.out.print(f);
	System.out.println("ºF");
	System.out.print(temp);
	System.out.print("ºF");
	System.out.print("=");
	System.out.print(c);
	System.out.print("ºC");
    }
}
