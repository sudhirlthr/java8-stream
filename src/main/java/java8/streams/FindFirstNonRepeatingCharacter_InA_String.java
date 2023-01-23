package java8.streams;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class FindFirstNonRepeatingCharacter_InA_String {
    public static void main(String[] args) {
        String str = "Hello World";
        Character nonRepeatingCharacter = str.chars()
                .mapToObj(value -> Character.valueOf((char) value))
                        .collect(Collectors.groupingBy(Function.identity(), LinkedHashMap::new, Collectors.counting()))
                                .entrySet().stream().filter(characterLongEntry -> characterLongEntry.getValue()==1)
                        .map(Map.Entry::getKey)
                                .findFirst().get();
        System.out.println("first non-repeating character: "+nonRepeatingCharacter);

    }
}
