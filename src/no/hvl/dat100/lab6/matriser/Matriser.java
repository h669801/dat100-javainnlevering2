package no.hvl.dat100.lab6.matriser;

public class Matriser {

	// a)
	public static void skrivUtv1(int[][] matrise) {

		// TODO
		// throw new UnsupportedOperationException("skrivUt ikke implementert");
		System.out.print("{");
		
		for (int[] rad : matrise) {
			System.out.print("{ ");
			
			for (int x : rad) {
				System.out.print(x + " ");
			}
			System.out.print("}");
		}
		System.out.print("}");
	}

	// b)
	public static String tilStreng(int[][] matrise) {

		// TODO
		//throw new UnsupportedOperationException("tilStreng ikke implementert");
		String r = "";
		
		for (int rad = 0; rad < matrise.length; rad++) {

			for (int kolonne = 0; kolonne < matrise[0].length; kolonne++) {
				r = r + matrise[rad][kolonne]+ " ";
				
			}
			r = r + "\n";
			
		}
		return r;
	}

	// c)
	public static int[][] skaler(int tall, int[][] matrise) {
		
		// TODO
		//throw new UnsupportedOperationException("skaler ikke implementert");
	    int mat[][] = new int[matrise.length][];
	    
	    for (int i = 0; i < matrise.length; i++) {
	        mat[i] = new int[matrise[i].length];
	        
	        for (int j = 0; j < matrise[i].length; j++) {
	            mat[i][j] = matrise[i][j] * tall;
	        }
	    }
	    return mat;
	}

	// d)
	public static boolean erLik(int[][] a, int[][] b) {

		// TODO
		//throw new UnsupportedOperationException("erLik ikke implementert");
		int rad1, kol1, rad2, kol2;
		boolean lik = true;
		
		rad1 = a.length;
		kol1 = a[0].length;
		
		rad2 = b.length;
		kol2 = b[0].length;
		
		if (rad1 != rad2 || kol1 != kol2) {
			lik = false;
		}
		else {
			for (int i = 0; i < rad1; i++) {
				for (int j = 0; j < kol1; j++) {
					if(a[i][j] != b[i][j]) {
						lik = false;
						//
						break;
					}
				}
				
		}
		
	}return lik;	
	}
	
	// e)
	public static int[][] speile(int[][] matrise) {

		// TODO
		throw new UnsupportedOperationException("speile ikke implementert");
	
	}

	// f)
	public static int[][] multipliser(int[][] a, int[][] b) {

		// TODO
		throw new UnsupportedOperationException("multipliser ikke implementert");
	
	}
}
