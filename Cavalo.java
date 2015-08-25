import java.io.*;

class Cavalo implements Serializable{
	
	int posicaoX;
	int posicaoY;
	
	void setX(int x){
		posicaoX = x;
	}
	void setY(int y){
		posicaoY = y;
	}

	int getX(){
		return this.posicaoX;
	}

	int getY(){
		return this.posicaoY;
	}
}
