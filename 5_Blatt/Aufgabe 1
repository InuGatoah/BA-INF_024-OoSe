class Angestellter {
	
	private String vorname, nachname;
	private int alter, gehalt;


	public Angestellter(String vorname, String nachname, int alter, int gehalt) {
		
		this.vorname = vorname;
		this.nachname = nachname;
		this.alter = alter;
		this.gehalt = gehalt;
	}

	public void altern() {
		alter++;
	}

	public void erhoeheGehalt(int erhoehung) {
		gehalt += erhoehung;
	}
	
	public String getVorname() { return vorname; }
	public String getNachname() { return nachname; }
	public int getAlter() { return alter; }
	public int getGehalt() { return gehalt; }
}



class Praktikant extends Angestellter {

	public Praktikant(String vorname, String nachname, int alter, int gehalt) {
		super(vorname, nachname, alter, 400);
	}

	@Override
	public void erhoeheGehalt(int erhoehung) {
	}
}



public class U5A1 {

	public static void main(String[] args) {
	
		Angestellter a1 = new Angestellter("Vladimir", "Miletic", 20, 1000);
		a1.erhoeheGehalt(100);
		System.out.println(a1.getVorname());
		System.out.println(a1.getGehalt());
		Praktikant p1 = new Praktikant("Darko", "Markovic", 19, 510);
		System.out.println(p1.getAlter());
		System.out.println(p1.getGehalt());
		p1.erhoeheGehalt(100);
		System.out.println(p1.getGehalt());
	}
}
