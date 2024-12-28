package lr3;

public class Example8 {
    public static void main(String[] args) {

        char[] letters = new char[10];

        char currentLetter = 'A';

        for (int i = 0; i < letters.length; i++) {

            while (    currentLetter == 'A'
                    || currentLetter == 'E'
                    || currentLetter == 'I'
                    || currentLetter == 'O'
                    || currentLetter == 'U') {
                currentLetter++;
            }

            letters[i] = currentLetter;
            currentLetter++;
        }

        for (char letter : letters) {
            System.out.println(letter);
        }
    }
}
