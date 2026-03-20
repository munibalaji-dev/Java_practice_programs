package Arrays;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class CountOccurencesOfEachWordUsingStreams {
    public static void main(String[] args){
        List<String> fruits = List.of(
                "apple", "apple", "apple",
                "banana", "banana",
                "mango"
                );
        Map<String, Long> result =
                fruits.stream()
                        .collect(Collectors.groupingBy( // groupingby return a map
                                s -> s,
                                Collectors.counting()
                        ));
        System.out.println(result);
    }
}
