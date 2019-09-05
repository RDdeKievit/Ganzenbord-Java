
import java.util.Random;
class Ganzenbord {
	
	//globale variabelen; worden gebruikt door meerdere functies
	private static int worp;
	private static int positie1;
	

	//binnenkomst functie main; roept functies applicatie op volgorde aan
	public static void main (String[] args) {
		setWorp();
		setPositie();
		winCheck();
	}

	//functie setWorp; veranderd status globale variable worp (dobbelsteen) en print worp
	public static void setWorp() {
		int[] dobbelsteen = {1, 2, 3, 4, 5, 6};
		
		worp = getWorp(dobbelsteen);
		System.out.println(worp);
	}
	
	// functie getRandom; haalt random getal uit meegkregen array en returnt het gekozen getal
	public static int getWorp(int[] array) {
   		int rnd = new Random().nextInt(array.length);
		return array[rnd];
	}
	
	//functie setPositie; veranderd status van globale variable positie1 en print positie1
	public static void setPositie() {
		positie1 = getPositie();
		System.out.println(positie1);
	}

	//functie getPositie; retunt nieuwe positie speler op basis van huidige positie en worp
	public static int getPositie(){
		int positieNew;
		if ((positie1 + worp) > 50) {
			positieNew = 35;
			return positieNew;
		} else {
			positieNew = positie1 + worp;
			return positieNew;
		}
	}

	//functie winCheck; checkt of er een speler op positie 50 staat en print felicitatie wanneer;
	//dat het geval is. In ander geval is de volgende speler aan de beurt
	public static void winCheck() {
		if (positie1 == 50) {
			System.out.println("Gefeliciteerd Speler1, je hebt gewonnen!");
		}else {
			main(new String[0]);
		}
	}
}
