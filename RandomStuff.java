
//Import line for using new Random
import java.util.Random;

public class RandomStuff {

    public static void main (String[] args)
    {
    	//Math.random version
    	int x = (int)(Math.random()*50 + 1);

    	System.out.println(x);

    	//new Random version
    	Random rand = new Random();
    	int y = rand.nextInt(50) + 1;

    	System.out.println(y);

		//range -3 to 8
		int a = (int)(Math.random()*12 - 3);
		System.out.println(a);

		Random rand2 = new Random();
		int b = rand.nextInt(12)-3;
		System.out.println(b);

		//range 13 to 27
		int c = (int)(Math.random()*15 + 13);
		System.out.println(c);

		Random rand3 = new Random();
		int d = rand.nextInt(15) + 13;
		System.out.println(d);
    }


}