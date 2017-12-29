import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class DecodeTest {
    Decode decode0 = new Decode(0) ;
    Decode decode1 = new Decode(1) ;
    @Test
    public void code_0() {
        char a = decode0.code_0('a');
        Assert.assertEquals('a',a+32);
    }

    @Test
    public void code_1() {

    }

    @Test
    public void getWordDecode0() {
       char a = decode0.code_0('a');
        Assert.assertEquals('a',a+32);
    }
    public void getWordDecode1() {

    }

}
