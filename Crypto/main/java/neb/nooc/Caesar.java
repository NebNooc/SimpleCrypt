package neb.nooc;

public class Caesar {

    public char shifter(Integer key, char c) {
        Integer keyInvert = key - 26;
        if     (('a' <= c && c <= 'z') && ('a' <= c + key && c + key <= 'z'))
            c += key;
        else if(('A' <= c && c <= 'Z') && ('A' <= c + key && c + key <= 'Z'))
            c += key;
        else if(('a' <= c && c <= 'z') && !('a' <= c + key && c + key <= 'z'))
            c += keyInvert;
        else if(('A' <= c && c <= 'Z') && !('A' <= c + key && c + key <= 'Z'))
            c += keyInvert;
        return c;
    }

    public String encrypt(Integer key, String cipher) throws UnsupportedOperationException {

        StringBuilder s = new StringBuilder();

        for(int i = 0; i < cipher.length(); i++) {
            char c = shifter(key, cipher.charAt(i));
            s.append(c);
        }
        return s.toString();
    }

    public String decrypt(Integer key, String cipher) throws UnsupportedOperationException {
        return encrypt(26 - key, cipher);
    }
}
