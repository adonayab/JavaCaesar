import org.junit.Test;

import static org.junit.Assert.*;

public class CaesarEncryptTest {

    @Test
    public void encrypt() {

        CaesarEncrypt cat = new CaesarEncrypt("cat", 13);
        CaesarEncrypt unCat = new CaesarEncrypt("png", 13);
        CaesarEncrypt capCat = new CaesarEncrypt("Cat", 13);
        CaesarEncrypt charsCat = new CaesarEncrypt("!?ca./t", 13);

        String encrypted = cat.encrypt();
        String encrypted2 = unCat.encrypt();
        String encrypted3 = capCat.encrypt();
        String encrypted4 = charsCat.encrypt();

        assertEquals("png",encrypted);
        assertEquals("cat",encrypted2);
        assertEquals("Png",encrypted3);
        assertEquals("!?pn./g",encrypted4);
    }

}