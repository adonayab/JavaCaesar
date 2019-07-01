import org.junit.Test;

import static org.junit.Assert.*;

public class CaesarEncryptTest {

    @Test
    public void encrypt() {

        CaesarEncrypt cat = new CaesarEncrypt("cat", 13);
        CaesarEncrypt unCat = new CaesarEncrypt("png", 13);
        CaesarEncrypt capCat = new CaesarEncrypt("Cat", 13);
        CaesarEncrypt charsCat = new CaesarEncrypt("!?ca./t", 13);
        CaesarEncrypt rot2Cat = new CaesarEncrypt("cat", 2);
        CaesarEncrypt rot3Cat = new CaesarEncrypt("!?ca./t", 3);
        CaesarEncrypt longCat = new CaesarEncrypt("cats are amazing", 5);


        String encrypted = cat.encrypt();
        String encrypted2 = unCat.encrypt();
        String encrypted3 = capCat.encrypt();
        String encrypted4 = charsCat.encrypt();
        String encrypted5 = rot2Cat.encrypt();
        String encrypted6 = rot3Cat.encrypt();
        String encrypted7 = longCat.encrypt();

        assertEquals("png",encrypted);
        assertEquals("cat",encrypted2);
        assertEquals("Png",encrypted3);
        assertEquals("!?pn./g",encrypted4);
        assertEquals("ecv",encrypted5);
        assertEquals("!?fd./w",encrypted6);
        assertEquals("hfyx fwj frfensl",encrypted7);


    }

}