package pro.sky.java.course5;

import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.stream.Collectors;

public class Main {

    public static void main(String[] args) {
// Дан массив строк, необходимо удалить из него все дубли,
// оставшиеся строки объединить в одну в порядке следования в массиве.

        String[] strings = {"I", "wanna", "be", "loved", "by", "you", "just", "you", "And", "nobody", "else", "but",
                "you", "I", "wanna", "be", "loved", "by", "you", "alone!"};

        System.out.println(Arrays.toString(strings));

        //Первое решение
        Set<String> set = new LinkedHashSet<>(Arrays.asList(strings));
        String[] result = set.toArray(new String[0]);
        System.out.println(Arrays.toString(result));

        //Второе решение
        String result2 = Arrays.stream(strings).distinct().collect(Collectors.joining(" "));
        System.out.println(result2);





    }
}
