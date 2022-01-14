package worstSongs;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

public class WorstSongs {
    public static void main(String[] args) throws IOException {
        worstYearInMusic("100worst.csv");

    }

    public static int worstYearInMusic(String filename) throws IOException {
        Path path = Paths.get("src/worstSongs/"+filename);
        List<String> worstSongs = Files.readAllLines(path);

        System.out.println(worstSongs);

        return 0;
    }
}
