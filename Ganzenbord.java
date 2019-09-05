
import java.util.Random;
class Ganzenbord {
	
	//globale variabelen; worden gebruikt door meerdere functies
	private static int beurt;
	private static int worp;
	private static int positie1;
	private static int positie2;
	

	//binnenkomst functie main; roept functies applicatie op volgorde aan
	public static void main (String[] args) {
		setBeurt();
	}

	//functie setBeurt; veranderd status globale variabele beurt en print beurt
	public static void setBeurt() {
		beurt = getBeurt();

		setWorp();
	}

	//functie setWorp; veranderd status globale variable worp (dobbelsteen) en print worp
	public static void setWorp() {
		int[] dobbelsteen = {1, 2, 3, 4, 5, 6};
		
		worp = getWorp(dobbelsteen);

		setPositie();
	}
	
	//functie setPositie; veranderd status van globale variable positie1 en print positie1
	public static void setPositie() {
		if (beurt == 1) {
			positie1 = getPositie(positie1);
		}else {
			positie2 = getPositie(positie2);
		}
		
		print();
		winCheck();
	}

	//
	public static void print() {
		if (beurt == 1) {
			System.out.println("Speler1 dobbelt "+worp+" en staat nu op vakje "+positie1);
		}else {
			System.out.println("Speler2 dobbelt "+worp+" en staat nu op vakje "+positie2);
		}
	}

	//functie winCheck; checkt of er een speler op positie 50 staat en print felicitatie wanneer;
	//dat het geval is. In ander geval is de volgende speler aan de beurt
	public static void winCheck() {
		if (positie1 == 50 || positie2 == 50) {
			System.out.println("Gefeliciteerd Speler"+beurt+", je hebt gewonnen!");
		}else {
			main(new String[0]);
		}
	}
	
	//get functies hieronder

	//functie getBeurt; bepaalt welk van de twee spelers nu aan de beurt is en retunt beurtNew
	public static int getBeurt() {
		int beurtNew;
		if ((beurt + 1) > 2) {
			beurtNew = 1;
			return beurtNew;
		}else {
			beurtNew = beurt + 1;
			return beurtNew;
		}
	}

	// functie getRandom; haalt random getal uit meegkregen array en returnt het gekozen getal
	public static int getWorp(int[] array) {
   		int rnd = new Random().nextInt(array.length);
		return array[rnd];
	}

	//functie getPositie; retunt nieuwe positie speler op basis van huidige positie en worp
	public static int getPositie(int positie) {
		int positieNew;
		if ((positie + worp) > 50) {
			positieNew = 35;
			return positieNew;
		} else {
			positieNew = positie + worp;
			return positieNew;
		}
	}
}
