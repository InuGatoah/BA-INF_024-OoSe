import java.io.IOException;
import java.io.FileNotFoundException;

class Fastfood {

	void eat() throws IOException {
	}
}

class Hamburger extends Fastfood {
	//void eat() { } // dies funktioniert, da es die Exception der
	// Superklassenfunktion nicht
	// verändert

	// void eat() throws Exception { } // dies funktioniert nicht, da die Exception
	// der Superklassenfunktion restriktiver gewählt ist

	// void eat(int y) throws Exception { } // dies funktioniert, da die
	// ursprüngliche eat-Funktion überladen, nicht überschrieben wird (Unterschied
	// beachten!)

	// void eat() throws FileNotFoundException { } // dies funktioniert, da
	// FileNotFoundException eine Subklasse von IOException ist

	// void eat() throws RuntimeException { } // dies funktioniert, da
	// RuntimeException eine unchecked exception darstellt
}


public class U6A2 {
	public static void main(String[] args) throws IOException {
		Hamburger c = new Hamburger();
		c.eat();
	}
}

