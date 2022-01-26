package gitUzdPD;

import javax.swing.JOptionPane;

public class picerijaa {

	static pasutijums picca = null;
	static piedevas piccaP = null;
	
	static boolean status = false;
	
	static pasutijums izveidotSutijumu() {
		String name=null,  pName=null, adresse= null;
		int x=1, pricee=0;
		
		name=JOptionPane.showInputDialog("Kads ir Jûsu vârds?");
		
	pName=JOptionPane.showInputDialog("Kâdu picu vçlies? \n"
			+ "Margarita \n"
			+ "Hawajieðu \n"
			+ "Barbekju \n"
			+ "Studentu");
	
		x=Integer.parseInt(JOptionPane.showInputDialog("Cik tâdas picas vçlçsies"));
		
		adresse=JOptionPane.showInputDialog("Ievadiet savu adresi?");
		
		switch(pName.toLowerCase()) {
		case "margarita": pricee= 5*x;
		break;
		case "hawajieðu": pricee = 6*x;
			break;
		case "barbekju": pricee= 10*x;
		break;
		case "studentu": pricee= 4*x;
		default: JOptionPane.showInputDialog("Nav izvçlçta pica, nevar aprçíinât cenu, mçgini vçlreiz?");
		
		}
		status=true;
			picca = new pasutijums(name, pName, x, adresse, pricee);
	return picca;
	
	}
	
	
	
	static piedevas izveidotSutijumuP() {
		String name=null,  pName=null, adresse= null, extraPied=null;
		int x=0, pricee=2;
		
		name=JOptionPane.showInputDialog("Kads ir Jûsu vârds?");
		
	pName=JOptionPane.showInputDialog("Kâdu picu vçlies? \n"
			+ "Margarita \n"
			+ "Hawajieðu \n"
			+ "Barbekju \n"
			+ "Studentu");
	
	extraPied=JOptionPane.showInputDialog("Kâdu picas piedevas vçlçsies? \n"
			+ "Cepti sîpoli \n"
			+ "Extra siers \n"
			+ "Extra peperoni \n"
			+ "Ananâsi");
	
		x=Integer.parseInt(JOptionPane.showInputDialog("Cik tâdas picas vçlçsies"));
		
		adresse=JOptionPane.showInputDialog("Ievadiet savu adresi?");
		
		switch(pName.toLowerCase()) {
		case "margarita": pricee= 5*x;
		break;
		case "hawajieðu": pricee = 6*x;
			break;
		case "barbekju": pricee= 10*x;
		break;
		case "studentu": pricee= 4*x;
		default: JOptionPane.showInputDialog("Nav izvçlçta pica, nevar aprçíinât cenu, mçgini vçlreiz?");
		
		}
		status=true;
		piccaP= new piedevas(extraPied, name, pName, x, adresse, pricee);
		return piccaP;
	}
	
	
	
	
	public static void main(String[] args) {
String izvele;
boolean top=false;
do {
	izvele = JOptionPane.showInputDialog("1-izveidot pasutijumu  | 2- Savs pasûtijums | x - beigt sutijumu");
	switch(izvele) {
	case "1": 
		top =Boolean.parseBoolean(JOptionPane.showInputDialog("Vai picai bûs piedevas? true/false"));
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
