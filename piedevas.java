package gitUzdPD;

import javax.swing.JOptionPane;

public class piedevas extends pasutijums{	
	public String extraPiedeva;
	
	public piedevas(String topings, String name, String Pica, int sk, String adress, int price) {
		super(name, Pica, sk, adress, price);
		this.extraPiedeva=topings;
	}
	
	public void izvadeP() {
		JOptionPane.showMessageDialog(null, "|   *Tavs sūtijums*   |\n"

				  + "|   Tavs vārds: "+sVards+"   |\n"
				  + "|   Pica: "+pizza+" ar"+extraPiedeva+" piedevu   |\n"
				  + "|   Skaits: "+pSkaits+"   |\n"
				  + "|   Cena: !!"+cena+"€!!   |\n"
				  + "|   Tava adrese: "+adrese+"   |");

										 

	}
	
	
	
	
	
}

