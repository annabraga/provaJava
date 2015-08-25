import javax.swing.*;
import java.awt.*;
import java.io.*;
import java.util.*;

		
class TabuleiroTestDrive implements Serializable //ActionListener
{
	public static void main (String [] args){
/*{		
	JFrame frame = new JFrame("Xadrez");

	{								
		GameOfLife gui = new GameOfLife();
		gui.go();					
	}											
	public void go(){			
	*/	
		Tabuleiro board = new Tabuleiro();
		Random rand = new Random();
		int value = rand.nextInt(50);
		
		ArrayList<Cavalo> cavalosAgora = new ArrayList<Cavalo>();
		Cavalo cavalo1 = new Cavalo();
		cavalo1.setXY(4,5);
		Cavalo cavalo2 = new Cavalo();
		cavalo2.setXY(5,6);
		Cavalo cavalo3 = new Cavalo();
		cavalo3.setXY(6,7);
		Cavalo cavalo4 = new Cavalo();
		cavalo4.setXY(7,8);		

		cavalosAgora.add(cavalo1);
		cavalosAgora.add(cavalo2);
		cavalosAgora.add(cavalo3);
		cavalosAgora.add(cavalo4);
		
		if(value == 0){
			board.setCasasNoX(10);
			board.setCasasNoY(10);

			int cavalosAleatorios = rand.nextInt(cavalosAgora.size() + 1);
			int i;

			for(i = 0; i < cavalosAleatorios; i++){
				board.addCavalo(cavalosAgora.get(i));
			}
			else{
				System.out.println("OI");
			}
		}			
	}
}
	