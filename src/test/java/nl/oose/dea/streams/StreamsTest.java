package nl.oose.dea.streams;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.List;

import static java.util.Arrays.asList;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.contains;

class StreamsTest {
    private Streams sut;

    @BeforeEach
    void setup() {
        sut = new Streams();
    }

    @Test
    void testRemoveStringsWithLessThanThreeCharacters() {
        // Arrange
        List<String> input = asList("Welcome", "to", "Java", "12", "Streams");

        // Act
        List<String> filteredStrings = sut.filterStringsLongerThanThreeCharacters(input);

        // Assert
        assertThat(filteredStrings, contains("Welcome", "Java", "Streams"));
    }

    @Test
    void testRemoveNumeralStrings() {
        // Arrange
        List<String> input = asList("Welcome", "to", "Java", "12", "Streams");

        // Act
        List<String> filteredStrings = sut.filterStringsThatContainOnlyText(input);

        // Assert
        assertThat(filteredStrings, contains("Welcome","to","Java","Streams"));
    }

    @Test
    void testFindLongestString() {
        // Arrange
        List<String> input = asList("Welcome", "to", "Java", "12", "Streams");

        // Act
        String foundString = sut.findLongestString(input);

        // Assert
        Assertions.assertEquals("Welcome", foundString);
    }

    @Test
    void testCalculateAverageCostOfAllProducts() {
        // Arrange
        List<Product> input = initialiseTestProductSet();

        // Act
        var totalValue = sut.calculateAveragePriceOfAllProducts(input);

        // Assert
        Assertions.assertEquals(1458, totalValue);
    }

    private List<Product> initialiseTestProductSet() {
        Product tv = new Product("TV", 1200);
        Product laptop = new Product("Laptop", 2300);
        Product tablet = new Product("tablet", 149);
        Product phone = new Product("phone", 241);
        Product table = new Product("table", 3400, ProductCategory.FURNITURE);

        return asList(tv, laptop, tablet, phone, table);
    }
}
