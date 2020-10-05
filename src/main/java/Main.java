import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        String speech = "Water pollution in Russia’s Kamchatka peninsula that caused sea creatures to wash up dead on beaches has prompted fears that rocket fuel stored in the region’s military testing grounds may have leaked.\n" +
                "\n" +
                "The pollution came to light late last month after surfers reported stinging eyes and said the water had changed colour and developed an odour. Officials later confirmed the surfers had sustained mild burns to their corneas.\n" +
                "\n" +
                "Then locals reported seeing large numbers of dead marine species including seals, octopuses and sea urchins washed up on a black-sand beach popular with tourists.";
        List<String> dict = getDictionary(speech);
        System.out.println(dict);
    }

    private static List<String> getDictionary(String speech) {
        return Arrays.stream(speech.replaceAll("\\.", "")
                .split("\\s"))
                .filter(it -> !it.isBlank())
                .map(it -> it.toLowerCase())
                .distinct()
                .sorted()
                .collect(Collectors.toList());
    }
}
