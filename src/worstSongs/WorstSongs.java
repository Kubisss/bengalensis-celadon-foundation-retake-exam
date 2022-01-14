package worstSongs;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.*;

public class WorstSongs {
    public static void main(String[] args) throws Exception {
        System.out.println(worstYearInMusic("100worst.csv"));

    }

    public static int worstYearInMusic(String filename) throws Exception {
//        Path path = Paths.get("src/worstSongs/" + filename);
        List<String> worstSongs = readFile(filename);
        List<String> yearsOfSongs = new ArrayList<>();
        for (String year : worstSongs) {
            String[] regex = year.split(";");
            yearsOfSongs.add(regex[3]);
        }

        HashMap<String, Integer> map = new HashMap<>();
        for (String year : yearsOfSongs) {
            int count = map.getOrDefault(year, 0);
            map.put(year, count + 1);
        }

        String key = Collections.max(map.entrySet(), Map.Entry.comparingByValue()).getKey();

        return Integer.parseInt(key);
    }

    private static List<String> readFile(String filename) throws Exception {
        Path path = Paths.get("src/worstSongs/" + filename);

        try {
            return Files.readAllLines(path);
        } catch (IOException e) {
            throw new Exception("File does not exist!");
        }
    }
}
