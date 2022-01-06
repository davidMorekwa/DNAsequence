package DNAseq;
/*
 * program to determine if DNA contains protein.
 * Qualities of a protein: 
 * 1.It begins with a “start codon”: ATG.
 * 2.It ends with a “stop codon”: TGA.
 * 3.In between, each additional codon is a sequence of three nucleotides, i.e divisible by 3.
 * */
public class newclass {
	public static void main(String[] args) {
		String dna1 = "ATGCGATACGCTTGA";
		String dna2 = "ATGCGATACGTGA";
		String dna3 = "ATTAATATGTACTGA";
		
		proteinFinder(dna1);
		proteinFinder(dna2);
		proteinFinder(dna3);
	}
	static void proteinFinder(String dna) {
		
		int startCondon = dna.indexOf("ATG");
		int endCondon = dna.indexOf("TGA");
		System.out.println(startCondon);
		/*
		if(dna.substring(startCondon, (startCondon + 3)).equals("ATG") && dna.substring(endCondon, (endCondon + 3)).equals("TGA") && dna.length()%3==0 ) {
			System.out.println( dna + " Contians proteins");
		} else {
			System.out.println(dna + " Doesnt contain proteins");
		}
		*/
	}
	
	
	}

