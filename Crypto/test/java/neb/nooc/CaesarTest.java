package neb.nooc;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class CaesarTest {

    private Caesar caesar;
    private Integer key;
    private String cipher;

    @Before
    public void Caesar() {
        caesar = new Caesar();
    }

    @Test
    public void CaesarEncryptOne() {
        key = 5;
        cipher = "My cover may be blown.  Send reinforcements.";

        String actual  = caesar.encrypt(key, cipher);
        String expected = "Rd htajw rfd gj gqtbs.  Xjsi wjnsktwhjrjsyx.";

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void CaesarEncryptTwo() {
        key = 14;
        cipher = "The enemy is advancing on HQ.  Prepare defenses.";

        String actual  = caesar.encrypt(key, cipher);
        String expected = "Hvs sbsam wg orjobqwbu cb VE.  Dfsdofs rstsbgsg.";

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void CaesarDecryptOne() {
        key = 25;
        cipher = "Dmdlhdr gzud qdzbgdc sgd eqnms fzsdr.  Sghr hr mns z cqhkk!";

        String actual  = caesar.decrypt(key, cipher);
        String expected = "Enemies have reached the front gates.  This is not a drill!";

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void CaesarDecryptTwo() {
        key = 8;
        cipher = "Epib qa bisqvo aw twvo?  Em kiv'b tiab uckp twvomz!!";

        String actual  = caesar.decrypt(key, cipher);
        String expected = "What is taking so long?  We can't last much longer!!";

        Assert.assertEquals(expected, actual);
    }
}
