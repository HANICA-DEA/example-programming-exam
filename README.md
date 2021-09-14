# Introductie

Deze proeftoets is deel van de DEA Course aan de Hogeschool Arnhem/Nijmegen. In deze proeftoets worden verschillende bestaande workshops gecombineerd tot 1 representatieve toets waar normaal 1.5 uur voor staat. Als je de workshops gemaakt hebt zou je zonder daar op terug te vallen deze oefentoets in de gestelde tijd moeten kunnen maken. Zo niet, dan kom je kennis of handelingssnelheid tekort. Maak deze oefentoets uiterlijk eind van onderwijsweek 3 zodat er voldoende tijd is om eventuele gaten in kennis of ervaring te dichten. 

# Opdracht 1: Maven en unit-testen
1. Maak een nieuw Maven project aan met als groupId ```oose.dea.voornaamachternaam```, bijvoorbeeld ```oose.dea.rodymiddelkoop```. Zet de Java versie in dit project in de pom.xml op 12 en zorg dat het JUnit 5.4.0 gebruikt. 
2. Plaats de classes ```AdderExecutor, FizzBuzzExecutor en FizzBuzzRunner``` in het nieuwe project in een package ```oose.dea.voornaamachternaam```, bijvoorbeeld ```oose.dea.rodymiddelkoop```.
3. Schrijf unit-tests waarmee je 100% test coverage krijgt voor de ```execute``` methode van FizzBuzzExecutor en voor de ```execute``` methode van ```AdderExecutor```.
4. De huidige methode is niet bestand tegen negatieve input. Pas de execute methode aan zodat deze een eigen unchecked exception van het type NonPositiveFizzBuzzInputException gooit als de input kleiner of gelijk is dan 0. 
5. Schrijf een unit-test waarmee je de nieuwe exceptionele situatie kunt testen.
6. Run de tests in Maven op de command-line en laat zien dat alle tests uit de stappen 1.3 en 1.5 slagen door een screenshot van de Maven-output te maken of de output in een bestandje te bewaren genaamd stap1.6.log. 

# Opdracht 2: Refactoren
7. De class ```FizzBuzzExecutor``` bevat verschillende bad smells. Vervang de magic numbers door constanten.
8. De ```execute``` methoden van ```AdderExecutor``` en ```FizzBuzzExecutor``` lijken sterk op elkaar en bevatten duplicate code. Refactor de code door een nieuwe gedeelde superklasse te introduceren die de duplicate code verwijdert. Test het succes van deze refactoring door de unit tests van ```AdderExecutor``` en ```FizzBuzzExecutor``` te runnen, deze moeten dan groen zijn. 

# Opdracht 3: Stream API
9. Voeg de classes ```Product```, ```ProductCategory``` en ```Streams``` toe aan je project en zet ook de bestaande unit-test van Streams in je project. Om die unit-test te laten compileren heb je een extra dependency nodig, namelijk
met groupId org.hamcrest, artifactId hamcrest-library en versie 2.1, voeg deze dependency toe. 
10. Implementeer de 4 methoden van de ```Streams``` class met behulp van de Streams API, zo dat de vier geleverde unit tests slagen. 

# Opdracht 4: Threads en Lambda's
11. Voeg de class ```ProductIncreaser``` aan je project toe. 
12. Maak een nieuwe class ```ThreadedProductIncreaser``` met een eigen main methode. Maak in de main methode:
    * 1 instantie van Product aan: ```Product tv = new Product("TV", 1200);```
    * 2 Threads die de prijs van dit product ophogen door de ```ProductIncreaser``` aan te passen
    * 2 Threads die de prijs van dit product ophogen door gebruik van een lambda-expressie
    
    Start de vier threads en bescherm de ```Product``` class zodat niet meerdere threads tegelijk de prijs kunnen ophogen. 



