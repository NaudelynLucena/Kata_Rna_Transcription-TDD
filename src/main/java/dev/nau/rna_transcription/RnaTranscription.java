package dev.nau.rna_transcription;

public class RnaTranscription {
    public static String toRNA(String dna) {
        StringBuilder rna = new StringBuilder();

        for (char nucleotide : dna.toCharArray()) {
            switch (nucleotide) {
                case 'C':
                    rna.append('G');
                    break;
                case 'G':
                    rna.append('C');
                    break;
                case 'T':
                    rna.append('A');
                    break;
                case 'A':
                    rna.append('U');
                    break;
                default:
                    throw new IllegalArgumentException("Invalid nucleotide in DNA sequence: " + nucleotide);
            }
        }

        return rna.toString();
    }
}
