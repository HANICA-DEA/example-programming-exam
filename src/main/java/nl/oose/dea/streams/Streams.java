package nl.oose.dea.streams;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Streams {

    List<String> filterStringsLongerThanThreeCharacters(List<String> input) {
        return input.stream().filter(c -> c.length() > 3).collect(Collectors.toList());
    }

    List<String> filterStringsThatContainOnlyText(List<String> input) {
        return input.stream().filter(s -> s.chars().allMatch(Character::isAlphabetic))
                .collect(Collectors.toList());
    }

    String findLongestString(List<String> input) {
        return input.stream().max(Comparator.comparingInt(String::length)).orElse(null);
    }

    int calculateAveragePriceOfAllProducts(List<Product> products) {
        return (int) products.stream().mapToInt(Product::getPrice).average().getAsDouble();
    }
}
