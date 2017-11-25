package operacionSuma;

import javax.sound.midi.SysexMessage;

public class sumaEnteros {

	private int x;
	private int y;
	public sumaEnteros(int x , int y) {
		this.y=y;
		this.x=x;
		
	}
	public int getX() {
		return x;
	}
//	private void setX(int x) {
//		this.x = x;
//	}
//	public int getY() {
//		return y;
//	}
//	private void setY(int y) {
//		this.y = y;
//	}
	public int sumar () {
		int resultado;
		resultado = x+y;
//		try {
//			
//			resultado = x+y;
//			
//		} catch (Exception e) {
//		System.out.println (e);
//		}
//		
		return resultado;
	}

}
