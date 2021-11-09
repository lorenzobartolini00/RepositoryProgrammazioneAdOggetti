package main;

import motori.*;
import automobili.*;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Motore m1 = new MotoreDiesel(6, 2500);
		Motore m2 = new MotoreBenzina(4, 1200);
		
		Automobile f1 = new Fuoristrada("GZ120FS", "Ford", "Everest", m1, 2860);
		Automobile c1 = new Coupè("FC003SK", "Fiat", "500", m2, 10, "Pelle");
		
		automobili.Optional optional1 = new automobili.Optional("Privacy_001", "Vetri oscurati", 200);
		automobili.Optional optional2 = new automobili.Optional("Comfort_001", "Sedili riscaldati", 300);
		automobili.Optional optional3 = new automobili.Optional("Sicurezza_001", "Frenata di emergenza", 400);
		automobili.Optional optional4 = new automobili.Optional("Sicurezza_002", "Lane assist", 500);
		
		f1.addOptional(optional1, optional2);
		c1.addOptional(optional3, optional4);
		
		System.out.println(f1);
		System.out.println(c1);
		
	}

}
