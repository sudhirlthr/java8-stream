package java8.streams;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class CountWordsInFile_FileStream {
    public static void main(String[] args) throws IOException {
        System.out.println(countOccuranceOf_a_WordInFile("xJava Essay.pdf", "a"));
    }
    static long countOccuranceOf_a_WordInFile(String filepath, String word) throws IOException {
        return Files.lines(Paths.get(filepath)).filter(s -> s.toLowerCase().contains(word.toLowerCase())).count();
    }
}
