
import java.util.Random;
class Ganzenbord {
	
	static int worp;
	
	public static void main (String args[]) {
		
		int[] dobbelsteen = {1, 2, 3, 4, 5, 6};
		
		worp = getRandom(dobbelsteen);
		System.out.println(worp);
	}
	
	public static int getRandom(int[] array) {
   		int rnd = new Random().nextInt(array.length);
		return array[rnd];
	}
}
