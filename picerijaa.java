package gitUzdPD;

import javax.swing.JOptionPane;

public class picerijaa {

	static pasutijums izveidotSutijumu() {
		
		
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
