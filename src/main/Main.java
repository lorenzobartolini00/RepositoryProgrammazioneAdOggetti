package main;

import motori.*;
import automobili.*;
import java.util.*;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Motore m1 = new MotoreDiesel(4, 1600);
		Motore m2 = new MotoreBenzina(3, 1000);
		
		Automobile f1 = new Fuoristrada("GZ120FS", "Ford", "Everest", m1, 2860);
		Automobile c1 = new Coupè("FC003SK", "Fiat", "500", m2, 10, "Pelle");
		
		automobili.Optional optional1 = new automobili.Optional("Privacy_001", "Vetri oscurati", 200);
		automobili.Optional optional2 = new automobili.Optional("Comfort_001", "Sedili riscaldati", 200);
		automobili.Optional optional3 = new automobili.Optional("Sicurezza_001", "Frenata di emergenza", 200);
		automobili.Optional optional4 = new automobili.Optional("Sicurezza_002", "Lane assist", 200);
		
		f1.addOptional(optional1, optional2);
		c1.addOptional(optional3, optional4);
		
		System.out.println("Targa | Marca | Modello || Cilindri | Cilindrata | E' a diesel | Potenza");
		System.out.println(f1);
		System.out.println(c1);
		
	}

}
