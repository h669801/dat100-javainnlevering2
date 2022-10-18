package no.hvl.dat100.lab5.tabeller;

public class Tabeller {

	// a)
	public static void skrivUt(int[] tabell) {

		// TODO
		// throw new UnsupportedOperationException("skrivUt ikke implementert");
//		int[] a = {1,2,3};
//		int[] b = {3,5};
//		int sum = summer(a);
//		System.out.println(sum);
		
		
		System.out.print(" [ ");

		for (int tall : tabell) {
			System.out.print(tall + " ");
		}
		System.out.println("] ");
	}

	// b)
	public static String tilStreng(int[] tabell) {

		// TODO
		// throw new UnsupportedOperationException("tilStreng ikke implementert");
		String r = "[" + tabell[0];

		for (int tall = 1; tall < tabell.length; tall++) {
			r += " , " + tabell[tall];
		}
		String res = r + "]";
		return res;
	}

	// c)
	public static int summer(int[] tabell) {

		// TODO
		// throw new UnsupportedOperationException("summer ikke implementert");
		int resultat = 0;
		
		
		for (int i = 0; i < tabell.length; i++) {
			int tall = tabell[i];
			resultat += tall;
			
		}
		
		int j = 0;
		do {
			
			int tall = tabell[j];
			resultat += tall;
			j++;
			//System.out.println(-11 + resultat);
			

		} while (j < tabell.length);
		
		for (int p : tabell) {
			int tall = p;
			resultat += tall;
			//System.out.println(-22 + resultat);
			
		}
		return resultat;
	}

	// d)
	public static boolean finnesTall(int[] tabell, int tall) {

		// TODO
		// throw new UnsupportedOperationException("finnesTall ikke implementert");
		boolean funnet = false;
		int pos = 0;

		while (!funnet && pos < tabell.length) {
			if (tall == tabell[pos]) {
				funnet = true;
			}
			pos++;
		}
		return funnet;
	}

	// e)
	public static int posisjonTall(int[] tabell, int tall) {

		// TODO
		// throw new UnsupportedOperationException("posisjonTall ikke implementert");
		boolean funnet = false;
		int pos = 0;

		while (!funnet && pos < tabell.length) {
			if (tall == tabell[pos]) {
				funnet = true;
				return pos;
			} else {
				pos++;
			}
		}
		return -1;

	}

	// f)
	public static int[] reverser(int[] tabell) {

		// TODO
		// throw new UnsupportedOperationException("reverser ikke implementert");
		int[] reversertTabell = new int[tabell.length];

		for (int pos = 0; pos < tabell.length; pos++) {
			reversertTabell[pos] = tabell[tabell.length - 1 - pos];
		}
		return reversertTabell;
	}

	// g)
	public static boolean erSortert(int[] tabell) {

		// TODO
		// throw new UnsupportedOperationException("erSortert ikke implementert");
		for (int pos = 0; pos < tabell.length - 1; pos++) {
			if (tabell[pos] > tabell[pos + 1]) {
				return false;
			}
		}
		return true;
	}

	// h)
	public static int[] settSammen(int[] tabell1, int[] tabell2) {

		// TODO
		//throw new UnsupportedOperationException("settSammen ikke implementert");
		int lengdAvTabell = tabell1.length + tabell2.length;
		int[] nyTabell = new int[lengdAvTabell];
		int posisjon = 0;
		
		for (int verdi: tabell1) {
			nyTabell[posisjon] = verdi;
			posisjon++;
		}
		for (int verdi: tabell2) {
			nyTabell[posisjon] = verdi;
			posisjon++;
		}return nyTabell;
	}
}
