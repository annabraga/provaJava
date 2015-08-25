import java.util.*;
import java.awt.*;
import java.io.*;
import java.util.*;
import java.awt.*;


class Tabuleiro implements Serializable{
	int casasX;
	int casasY;
	int casasNoX;
	int casasNoY;
	
	ArrayList<Cavalo> cavalos = new ArrayList<Cavalo>();
	
	
	void setXY(int a, int b){
		casasX = a;
		casasY = b;
		
		if(a <= 0){
			throw new RuntimeException();
		} else{
			casasNoX = casasX;			
		}
		if (b<=0){
			throw new RuntimeException();
		} else{
			casasNoY = casasY;	
		}
	}
	int getX(){
		return this.casasNoX;
	}

	int getY(){
		return this.casasNoY;
	}
	
	/*int qntdCavalos() {
		return this.cavalos.size();
	}*/

void poeCavalo(Cavalo peca){
	
		int temCavalo = 0;
		for(Cavalo cavalo : cavalos){
			if((cavalo.getX() == peca.getX()) && (cavalo.getY() == peca.getY())){
				temCavalo = 1;
			}
		}
		if(temCavalo == 1){
			throw new RuntimeException();
		} else{
			cavalos.add(peca);
		}
	}
}
	
