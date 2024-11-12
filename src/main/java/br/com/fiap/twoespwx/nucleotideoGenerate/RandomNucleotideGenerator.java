package br.com.fiap.twoespwx.nucleotideoGenerate;

import java.util.Random;

public class RandomNucleotideGenerator implements NucleotideoRandomGenerator {
    private static final char[] NUCLEOTIDES = {'A', 'C', 'T', 'G'};
    private final Random random = new Random();

    @Override
    public String generate(int sequenceSize) {
        StringBuilder sequence = new StringBuilder(sequenceSize);
        for (int i = 0; i < sequenceSize; i++) {
            char nucleotide = NUCLEOTIDES[random.nextInt(NUCLEOTIDES.length)];
            sequence.append(nucleotide);
        }
        return sequence.toString();
    }
}
