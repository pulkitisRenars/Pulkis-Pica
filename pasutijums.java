package gitUzdPD;

import javax.swing.JOptionPane;

public class pasutijums{
		public String sVards;
		public String pizza;
		public int pSkaits;
		public String adrese;
		public int cena;
		
		public pasutijums(String name, String Pica, int sk, String adress, int price){
			this.sVards=name;
			this.pizza=Pica;
			this.pSkaits=sk;
			this.adrese=adress;
			this.cena=price;
	}
	
public void izvade() {
	JOptionPane.showMessageDialog(null, "|   *Tavs s�tijums*   |\n"
									  + "|   Tavs v�rds: "+sVards+"   |\n"
									  + "|   Pica: "+pizza+"   |\n"
									  + "|   Skaits: "+pSkaits+"   |\n"
									  + "|   Cena: !!"+cena+"!!   |\n"
									  + "|   Tava adrese: "+adrese+"   |");
}
		
	}
	
	
	
	
