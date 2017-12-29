import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class DecodeTest {
    Decode decode0 = new Decode(0) ;
    Decode decode1 = new Decode(1) ;
    @Test
    public void code_0() {
        char a = decode0.code_0('a');
        Assert.assertEquals(a,'A');
    }

    @Test
    public void code_1() {
        char a = decode0.code_1('a');
        Assert.assertEquals(a,'_');
    }

    @Test
    public void getWordDecode0() {
       char a = decode0.getWordDecode(decode0.code,'A');
        Assert.assertEquals(a,'!');
    }
    public void getWordDecode1() {
        char a = decode0.getWordDecode(decode1.code,'a');
        Assert.assertEquals(a,'7');
    }

}
