package gitUzdPD;

import javax.swing.JOptionPane;

public class picerijaa {

	static pasutijums picca = null;
	static piedevas piccaP = null;
	
	static boolean status = false;
	
	static pasutijums izveidotSutijumu() {
		String name=null,  pName=null, adresse= null;
		int x=1, pricee=0;
		
		name=JOptionPane.showInputDialog("Kads ir J�su v�rds?");
		
	pName=JOptionPane.showInputDialog("K�du picu v�lies? \n"
			+ "Margarita \n"
			+ "Hawajie�u \n"
			+ "Barbekju \n"
			+ "Studentu");
	
		x=Integer.parseInt(JOptionPane.showInputDialog("Cik t�das picas v�l�sies"));
		
		adresse=JOptionPane.showInputDialog("Ievadiet savu adresi?");
		
		switch(pName.toLowerCase()) {
		case "margarita": pricee= 5*x;
		break;
		case "hawajie�u": pricee = 6*x;
			break;
		case "barbekju": pricee= 10*x;
		break;
		case "studentu": pricee= 4*x;
		default: JOptionPane.showInputDialog("Nav izv�l�ta pica, nevar apr��in�t cenu, m�gini v�lreiz?");
		
		}
		status=true;
			picca = new pasutijums(name, pName, x, adresse, pricee);
	return picca;
	
	}
	
	
	
	static piedevas izveidotSutijumuP() {
		String name=null,  pName=null, adresse= null, extraPied=null;
		int x=0, pricee=2;
		
		name=JOptionPane.showInputDialog("Kads ir J�su v�rds?");
		
	pName=JOptionPane.showInputDialog("K�du picu v�lies? \n"
			+ "Margarita \n"
			+ "Hawajie�u \n"
			+ "Barbekju \n"
			+ "Studentu");
	
	extraPied=JOptionPane.showInputDialog("K�du picas piedevas v�l�sies? \n"
			+ "Cepti s�poli \n"
			+ "Extra siers \n"
			+ "Extra peperoni \n"
			+ "Anan�si");
	
		x=Integer.parseInt(JOptionPane.showInputDialog("Cik t�das picas v�l�sies"));
		
		adresse=JOptionPane.showInputDialog("Ievadiet savu adresi?");
		
		switch(pName.toLowerCase()) {
		case "margarita": pricee= 5*x;
		break;
		case "hawajie�u": pricee = 6*x;
			break;
		case "barbekju": pricee= 10*x;
		break;
		case "studentu": pricee= 4*x;
		default: JOptionPane.showInputDialog("Nav izv�l�ta pica, nevar apr��in�t cenu, m�gini v�lreiz?");
		
		}
		status=true;
		piccaP= new piedevas(extraPied, name, pName, x, adresse, pricee);
		return piccaP;
	}
	
	
	
	
	public static void main(String[] args) {
String izvele;
boolean top=false;
do {
	izvele = JOptionPane.showInputDialog("1-izveidot pasutijumu  | 2- Savs pas�tijums | x - beigt sutijumu");
	switch(izvele) {
	case "1": 
		top =Boolean.parseBoolean(JOptionPane.showInputDialog("Vai picai b�s piedevas? true/false"));
		if(top==true) {
			izveidotSutijumuP();
		}else if (top ==false) {
			izveidotSutijumu();
		}
		break;
	
	case "2":
		if(status==true) {
if(top==true) {
	piccaP.izvadeP();
}else {
	picca.izvade();
}
		}
		break;
		
	case "x": JOptionPane.showMessageDialog(null, "programma beidzas");
	}
}while(!izvele.equals("x"));
	}

}
