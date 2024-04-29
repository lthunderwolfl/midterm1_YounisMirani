package task4;

import java.util.List;
import java.io.FileWriter;
import java.io.IOException;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class WordStat {
    public static void main(String[] args) {
        List<String> fantasyFormatData = DreamGenerator.fantasy;

        Set<String> wordSet = new HashSet<>(fantasyFormatData);
        System.out.println("Set of all different words provided: " + wordSet);

        Map<Integer, Integer> wordLengthCount = new HashMap<>();
        for (String word : wordSet) {
            int length = word.length();
            wordLengthCount.put(length, wordLengthCount.getOrDefault(length, 0) + 1);
        }

        System.out.println("\nMap of word lengths and their counts:");
        for (Map.Entry<Integer, Integer> entry : wordLengthCount.entrySet()) {
            System.out.println(entry.getKey() + "-letter words: " + entry.getValue());
        }

        try (FileWriter fileWriter = new FileWriter("task4.txt", true)) {
            fileWriter.write("\n\n");
            fileWriter.write("Set of all different words provided: " + wordSet + "\n");
            fileWriter.write("Map of word lengths and their counts:\n");
            for (Map.Entry<Integer, Integer> entry : wordLengthCount.entrySet()) {
                fileWriter.write(entry.getKey() + "-letter words: " + entry.getValue() + "\n");
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
