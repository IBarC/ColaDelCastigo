package mainapp;

import excepciones.ColaExceededSizeException;
import models.ColaDelCastigo;
import models.Comparador;

public class MainApp {

	public static void main(String[] args) throws ColaExceededSizeException {
		//Comparador comparador=new Comparador();
		
		ColaDelCastigo<Integer> cola1 = new ColaDelCastigo<Integer>((Integer o1, Integer o2) -> o1-o2);
		
		//cola1.add(null);
		cola1.add(1);
		cola1.add(12);
		cola1.add(3);
		cola1.add(33);
		cola1.add(5);
		cola1.add(194);
		cola1.add(30);
		cola1.add(55);
		cola1.add(28);
		cola1.add(10);
	}
}
