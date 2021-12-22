import Prog1Tools.IOTools;

public class Folge {

	public static void main(String[] args) {
		
		int zahl;
		
		zahl = IOTools.readInteger("Geben Sie Ihre Zahl ein: ");
		
		System.out.print(zahl + " ");

		while (zahl != 1) {
			
			if (zahl % 2 == 0) {
				
				zahl = zahl / 2;
				System.out.print(zahl + " ");
				
			} else {
				
				zahl = zahl * 3 + 1;
				System.out.print(zahl + " ");
				
			}
			
		}

	}

}
