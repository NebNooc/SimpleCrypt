package neb.nooc;


public class ROT13  {

    ROT13(Character cs, Character cf) {
    }

    ROT13() {
        this('a', 'm');
    }


    public String crypt(String text) throws UnsupportedOperationException {
        StringBuilder s = new StringBuilder();

        for(int i = 0; i < text.length(); i++) {
            char c = text.charAt(i);
            if     ('a' <= c && c <= 'm')   c += 13;
            else if('A' <= c && c <= 'M')   c += 13;
            else if('n' <= c && c <= 'z')   c -= 13;
            else if('N' <= c && c <= 'Z')   c -= 13;
            s.append(c);
        }
        return s.toString();
    }

    public String encrypt(String text) {
        return crypt(text);
    }

    public String decrypt(String text) {
        return crypt(text);
    }

    public static String rotate(String s, Character c) {
        Integer rotatepoint = s.indexOf(c);
        return s.substring(rotatepoint) + s.substring(0, rotatepoint);
    }

}
