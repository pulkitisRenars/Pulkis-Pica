package gitUzdPD;

import javax.swing.JOptionPane;

public class picerijaa {

	static pasutijums picca = null;
	static piedevas piccaP = null;
	
	static boolean status = false;
	
	static pasutijums izveidotSutijumu() {
		String name=null,  pName=null, adresse= null;
		int x=1, pricee=0;
		
		name=JOptionPane.showInputDialog("Kads ir Jūsu vārds?");
		
	pName=JOptionPane.showInputDialog("Kādu picu vēlies? \n"
			+ "Margarita \n"
			+ "Hawajiešu \n"
			+ "Barbekju \n"
			+ "Studentu");
	
		x=Integer.parseInt(JOptionPane.showInputDialog("Cik tādas picas vēlēsies"));
		
		adresse=JOptionPane.showInputDialog("Ievadiet savu adresi?");
		
		switch(pName.toLowerCase()) {
		case "margarita": pricee= 5*x;
		break;
		case "hawajiešu": pricee = 6*x;
			break;
		case "barbekju": pricee= 10*x;
		break;
		case "studentu": pricee= 4*x;
		default: JOptionPane.showInputDialog("Nav izvēlēta pica, nevar aprēķināt cenu, mēgini vēlreiz?");
		
		}
		status=true;
			picca = new pasutijums(name, pName, x, adresse, pricee);
	return picca;
	
	}
	
	
	
	static piedevas izveidotSutijumuP() {
		String name=null,  pName=null, adresse= null, extraPied=null;
		int x=0, pricee=2;
		
		name=JOptionPane.showInputDialog("Kads ir Jūsu vards?");
		
	pName=JOptionPane.showInputDialog("Kādu picu vēlies? \n"
			+ "Margarita \n"
			+ "Hawajiešu \n"
			+ "Barbekju \n"
			+ "Studentu");
	
	extraPied=JOptionPane.showInputDialog("Kādu picas piedevu vēlēsies? \n"
			+ "Cepti sīpoli \n"
			+ "Extra siers \n"
			+ "Extra peperoni \n"
			+ "Ananāsi");
	
		x=Integer.parseInt(JOptionPane.showInputDialog("Cik tādas picas vēlēsies"));
		
		adresse=JOptionPane.showInputDialog("Ievadiet savu adresi?");
		
		switch(pName.toLowerCase()) {
		case "margarita": pricee= 5*x;
		break;
		case "hawajiešu": pricee = 6*x;
			break;
		case "barbekju": pricee= 10*x;
		break;
		case "studentu": pricee= 4*x;
		default: JOptionPane.showInputDialog("Nav izvēlēta pica, nevar aprēķināt cenu, megini vēlreiz?");
		
		}
		status=true;
		piccaP= new piedevas(extraPied, name, pName, x, adresse, pricee);
		return piccaP;
	}
	
	
	public static void sutit(Boolean topp) {
		if(topp==true) {
			JOptionPane.showMessageDialog(null, "Tavs sūtijums tika pasūtīts: \n"+piccaP.pizza+" ar "+piccaP.extraPiedeva+" uz "+piccaP.adrese+".");
		}else {
		JOptionPane.showMessageDialog(null, "Tavs s�tijums tika pasūtīts: \n"+picca.pizza+" uz "+picca.adrese+".");
		}
	}
	
	public static void main(String[] args) {
String izvele;
boolean top=false;
do {
	izvele = JOptionPane.showInputDialog("1-izveidot pasūtijumu  | 2- Savs pasūtijums | 3- pasūtīt sūtijumu | 4 - | x - beigt s�tijumu");
	switch(izvele) {
	case "1": 
		top =Boolean.parseBoolean(JOptionPane.showInputDialog("Vai picai būs piedevas? +2EUR, true/false"));
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
	case "3": 
		if(status==true) {
		sutit(top);
		}else {
			JOptionPane.showMessageDialog(null, "Nav ievadīts sūtijums, nevar pasūtīt");
		}
		break;
		
	case "x": JOptionPane.showMessageDialog(null, "programma beidzas");
	}
}while(!izvele.equals("x"));
	}

}
