package school.mjc.stage0.loops.task2;

public class WordsBuilder {
    public void buildPhrase(char... chars) {
        StringBuilder phrase = new StringBuilder();
        for (char c : chars) {
            phrase.append(c);
        }
        System.out.println(phrase.toString());
    }

    public static void main(String[] args) {
        WordsBuilder builder = new WordsBuilder();
        builder.buildPhrase('H', 'e', 'l', 'l', 'o', ' ', 'W', 'o', 'r', 'l', 'd', '!');
    }
}
//test for commit