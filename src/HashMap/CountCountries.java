package HashMap;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

public class CountCountries {
    public static void main(String[] args) throws IOException {
        Map<String,Integer> map = new HashMap<>();
        String archivo = "C:\\Users\\adri_\\IdeaProjects\\repoProgramacion\\src\\HashMap\\ArchivosCSV\\Colfuturo-Seleccionados.csv";
        BufferedReader reader = new BufferedReader(new FileReader(archivo));
        String line;
        String[] splittedLine;

        line = reader.readLine();
        while ((line = reader.readLine())!=null) {
            splittedLine = line.split(",");
            Integer freq = map.get(splittedLine[6]);
            map.put(splittedLine[6],freq==null ? 1: freq+1);
        }
        reader.close();
        for (String s: map.keySet()) {
            System.out.println(s + " : " + map.get(s));
        }
    }
}
