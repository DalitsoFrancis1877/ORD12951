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
	System.out.print("�C");
	System.out.print("=");
	System.out.print(f);
	System.out.println("�F");
	System.out.print(temp);
	System.out.print("�F");
	System.out.print("=");
	System.out.print(c);
	System.out.print("�C");
    }
}
