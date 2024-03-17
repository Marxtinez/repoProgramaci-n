package HashMap;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.*;

public class Anagramas {
    public static void main(String[] args) {

        String fileName = "C:\\Users\\adri_\\IdeaProjects\\repoProgramacion\\src\\HashMap\\ArchivosCSV\\spanish-dict.txt";

        int minGroupSize = 2;

        Map<String, List<String>> anagrams = new HashMap<>();

        try (BufferedReader br = new BufferedReader(new FileReader(fileName))) {
            String line;
            while ((line = br.readLine()) != null) {
                String word = line.trim().toLowerCase();
                String key = sortString(word);

                // Verificar si la clave ya existe en el mapa
                if (!anagrams.containsKey(key)) {
                    // Si no existe, crear una nueva lista para esa clave
                    anagrams.put(key, new ArrayList<>());
                }
                // Agregar la palabra a la lista correspondiente
                anagrams.get(key).add(word);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        // Imprimir los anagramas con un tamaño igual o mayor que minGroupSize
        for (List<String> anagramGroup : anagrams.values()) {
            if (anagramGroup.size() >= minGroupSize) {
                System.out.println(anagramGroup);
            }
        }
    }

    // Método para ordenar alfabéticamente las letras de una cadena
    private static String sortString(String s) {
        char[] charArray = s.toCharArray();
        Arrays.sort(charArray);
        return new String(charArray);
    }
}

