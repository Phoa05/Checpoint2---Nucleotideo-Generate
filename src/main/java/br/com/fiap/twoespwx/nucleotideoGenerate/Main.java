/*
 * Grupo: Nexos
 * Autores:
 *      - Anna Yagyu     -   rm550360
 *      - Breno Silva     -   rm99275
 *      - Danilo Urze    -   rm99465
 *      - Pedro Henrique  -   rm550689
 */

package br.com.fiap.twoespwx.nucleotideoGenerate;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        int sequenceSize = 10;

        NucleotideoRandomGenerator generator = new RandomNucleotideGenerator();
        String sequence = generator.generate(sequenceSize);

        String outputFileName = "Checkpoint2 - Nucleotideo Generate\\output\\outputCP2.txt";

        File outputFile = new File(outputFileName);
        outputFile.getParentFile().mkdirs();

        try (FileWriter writer = new FileWriter(outputFile)) {
            writer.write(sequence);
            System.out.println("Sequência gerada com sucesso!");
        } catch (IOException e) {
            System.out.println("Erro ao escrever no arquivo: " + e.getMessage());
        }
    }
}