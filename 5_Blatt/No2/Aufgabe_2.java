import java.util.ArrayList;
import java.util.List;

abstract class Koerper {

	private double x, y, z;
	private String name;

	public Koerper(String name, double x, double y, double z) {
		this.x = x;
		this.y = y;
		this.z = z;
		this.name = name;
	}

	public void verschiebe(double a, double b, double c) {
		x += a;
		y += b;
		z += c;
	}

	public abstract void skaliere(double f);

	public abstract double getVolumen();

	public void ausgabe() {
		System.out.println(String.format("%s, Volumen: %f, Position: (%f, %f, %f)", name, getVolumen(), x, y, z));
	}
}


class Kugel extends Koerper {

	private int radius;

	public Kugel(int r, int x, int y, int z) {
		super("Kugel", x, y, z);
		radius = r;
	}

	@Override
	public void skaliere(double f) {
		radius *= f;
	}

	@Override
	public double getVolumen() {
		return 4 / 3 * Math.PI * Math.pow(radius, 3);
	}

}


class Quader extends Koerper {
	
	private int breite, hoehe, tiefe;

	public Quader(int b, int h, int t, int x, int y, int z) {
		super("Quader", x, y, z);
		breite = b;
		hoehe = h;
		tiefe = t;
	}

	@Override
	public void skaliere(double f) {
		breite *= f;
		hoehe *= f;
		tiefe *= f;
	}

	@Override
	public double getVolumen() {
		return breite * hoehe * tiefe;
	}

}


public class Main2 {

	public static void main(String[] args) {
		
		List<Koerper> koerper = new ArrayList<>();

		koerper.add(new Kugel(5, 1, 1, 1));
		koerper.add(new Quader(5, 5, 5, 0, 0, 0));

		for (Koerper k : koerper)
			k.ausgabe();
	}

}
