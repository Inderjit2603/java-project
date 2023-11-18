public class MiddleCharacter {
    public static void main(String[] args) {
        String str = "Hello World";
        displayMiddleCharacter(str);
    }

    public static void displayMiddleCharacter(String str) {
        int length = str.length();
        int middleIndex = length / 2;

        if (length % 2 == 0) {
            System.out.println("Middle characters: " + str.charAt(middleIndex - 1) + str.charAt(middleIndex));
        } else {
            System.out.println("Middle character: " + str.charAt(middleIndex));
        }
    }
}

