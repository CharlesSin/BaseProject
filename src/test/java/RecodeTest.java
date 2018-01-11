import org.junit.Assert;
    import org.junit.Test;

import old.Recode;

import static org.junit.Assert.*;

public class RecodeTest {
    Recode recode0 = new Recode(0) ;
    Recode recode1 = new Recode(1) ;

    @Test
    public void code_0() {
        char a = recode0.code_0('a');
        Assert.assertEquals(a,'!');
    }

    @Test
    public void getWordRecode0() {
        char b = recode0.code_0('a');
        Assert.assertEquals(b,'!');
    }

    public void code_1() {
        char a = recode1.code_1('a');
        Assert.assertEquals(a,'!');
    }

    @Test
    public void getWordRecode1() {
        char b = recode1.code_1('a');
        Assert.assertEquals(b,'?');
    }
}
