package gitUzdPD;

import javax.swing.JOptionPane;

public class picerijaa {

	static pasutijums izveidotSutijumu() {
		boolean p = false;
		String name=null,  pName=null, adresse= null, extraPied;
		int x=0, pricee=0;
	
		if(p==false) {
			pasutijums picca = new pasutijums(name, pName, x, adresse, pricee);
	
	}else if(p == true) {
		piedevas picca = new piedevas(extraPied, name, pName, x, adresse, pricee);
	}
			 return picca;
	}
	
	
	public static void main(String[] args) {
String izvele;
do {
	izvele = JOptionPane.showInputDialog("1-izveidot pasutijumu  | 2- izvadit info par pasutijumu | x - beigt sutijumu");
	switch(izvele) {
	
	case "x": JOptionPane.showMessageDialog(null, "programma beidzas");
	}
}while(!izvele.equals("x"));
	}

}
