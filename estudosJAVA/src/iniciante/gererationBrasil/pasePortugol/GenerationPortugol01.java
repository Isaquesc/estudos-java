package iniciante.gererationBrasil.pasePortugol;

import javax.swing.*;
import java.util.*;

public class GenerationPortugol01 {

	  public static void main(String[] args) {

	        //EXERC�CIO 01 
		  
		  	Scanner leia = new Scanner(System.in);
		  
	        
		  	
		  	String name = JOptionPane.showInputDialog("Qual � o seu nome?");
		  	name = leia.nextLine();
		  	
		  	System.out.println(name);
		  	
		  	
		  
		  	int anos, meses, dias, bi, total;
	        
	        
	        System.out.println("Informe a sua idade em anos, meses e dias");
	        System.out.print("Anos: ");
	        anos = leia.nextInt();
	        
	        System.out.print("Meses: ");
	        meses = leia.nextInt();
	        
	        System.out.print("Dias: ");
	        dias = leia.nextInt();
	        
	        bi = (anos/4);
	        total = bi + (anos * 365 ) + (meses * 30) + dias;
	        System.out.println("Sua idade em dias �: " + total);
	        
	        leia.close();
	    }
}
