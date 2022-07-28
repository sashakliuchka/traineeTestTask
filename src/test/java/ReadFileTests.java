import org.junit.jupiter.api.Test;


import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.*;

public class ReadFileTests {

    @Test
    public void secondLineShouldHabAlloha() throws IOException {
        Path file = Paths.get("src/test/resources/ReadFileTests.txt");
        List<String> lines = Files.readAllLines(file);
        System.out.println(lines.contains("аллоха"));

    }
}