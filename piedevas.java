package gitUzdPD;

import javax.swing.JOptionPane;

public class piedevas extends pasutijums{	
	public String extraPiedeva;
	
	public piedevas(String topings, String name, String Pica, int sk, String adress, int price) {
		super(name, Pica, sk, adress, price);
		this.extraPiedeva=topings;
	}
	
	public void izvadeP() {
		JOptionPane.showMessageDialog(null, "|   *Tavs sûtijums*   |\n"
										  + "|   Tavs vârds: "+sVards+"   |\n"
										  + "|   Pica: "+pizza+"   |\n"
										  + "|   Skaits: "+pSkaits+" ar "+extraPiedeva+" piedevâm   |\n"
										  + "|   Cena: !!"+cena+"`€!!   |\n"
										  + "|   Tava adrese: "+adrese+"   |");
	}
	
	
	
	
	
}

