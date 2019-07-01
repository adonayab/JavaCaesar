public class CaesarEncrypt {

    private String aString;
    private int rotate;

    public CaesarEncrypt(String aString, int rotate) {
        this.aString = aString;
        this.rotate = rotate;
    }

    private int alphaPos(char aCharacter) {
        String alphabet = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ";
        int pos = -1;
        for (char ch : alphabet.toCharArray()) {
            if (ch == aCharacter) {
                pos = alphabet.indexOf(ch);
                if (pos > 25) {
                    pos = pos % 26;
                }
            }
        }

        return pos;
    }

    private char rotateChar(char c, int rot) {
        String alphabet = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ";
        char replacementChar = '0';
        int replacementPos;
        if (Character.isAlphabetic(c)) {
            int charPos = alphaPos(c);
            for (char ch : alphabet.toCharArray()) {
                if (c == ch) {
                    replacementPos = charPos + rot;
                    replacementChar = alphabet.charAt(replacementPos);
                    if (replacementPos > 25) {
                        replacementPos = replacementPos % 26;
                        replacementChar = alphabet.charAt(replacementPos);
                    }
                }
            }
        } else {
            replacementChar = c;
        }

        if (Character.isUpperCase(c)) {
            replacementChar = Character.toUpperCase(replacementChar);
        }
        return replacementChar;
    }

    String encrypt() {
        String text = aString;
        int rot = rotate;
        String encrypted = "";

        for (char ch: text.toCharArray()) {
            encrypted = encrypted + rotateChar(ch, rot);
        }

        return encrypted;
    }

    public String getaString() {
        return aString;
    }

    public void setaString(String aString) {
        this.aString = aString;
    }

    public int getRotate() {
        return rotate;
    }

    public void setRot(int rotate) {
        this.rotate = rotate;
    }
}
