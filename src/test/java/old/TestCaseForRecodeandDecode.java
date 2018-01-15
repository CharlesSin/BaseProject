package old;

import static org.junit.Assert.*;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;

/**
 * Start Here.
 * 
 * @author Charles Sin starting.
 *
 */
public class TestCaseForRecodeandDecode {

  private static Recode recode0;
  private static Recode recode1;
  private static Recode getWordRec0;
  private static Recode getWordRec1;
  private static Recode testRec;

  private static Decode decode0;
  private static Decode decode1;
  private static Decode getWorddec0;
  private static Decode getWorddec1;
  private static Decode testdecode;
  private static Decode getTestCode0;
  private static Decode getTestCode1;

  @BeforeClass
  public static void setUpBeforeClass() {
    recode0 = new Recode(0);
    recode1 = new Recode(1);
    getWordRec0 = new Recode(0);
    getWordRec1 = new Recode(1);
    testRec = new Recode(0);

    decode0 = new Decode(0);
    decode1 = new Decode(1);
    getWorddec0 = new Decode(0);
    getWorddec1 = new Decode(1);
    testdecode = new Decode(0);
    getTestCode0 = new Decode(0);
    getTestCode1 = new Decode(1);
  }

  @AfterClass
  public static void tearDownAfterClass() {
    recode0 = null;
    recode1 = null;
    getWordRec0 = null;
    getWordRec1 = null;
    testRec = null;

    decode0 = null;
    decode1 = null;
    getWorddec0 = null;
    getWorddec1 = null;
    testdecode = null;
  }

  @Test
  public void edtest1() {
    char real = '#';
    char ans = recode0.code_0('c');

    String strreal = String.valueOf(real);
    String strans = String.valueOf(ans);
    assertEquals(strreal, strans);
  }

  @Test
  public void edtest2() {
    char real = '=';
    char ans = recode1.code_1('c');

    String strreal = String.valueOf(real);
    String strans = String.valueOf(ans);
    assertEquals(strreal, strans);
  }

  @Test
  public void edtest3() {
    char real = 'h';
    char ans = getWordRec0.getWordRecode('H');

    String strreal = String.valueOf(real);
    String strans = String.valueOf(ans);
    assertEquals(strreal, strans);
  }

  @Test
  public void edtest4() {
    char real = 'm';
    char ans = getWordRec1.getWordRecode('S');

    String strreal = String.valueOf(real);
    String strans = String.valueOf(ans);
    assertEquals(strreal, strans);
  }

  @Test
  public void edtest5() {
    String h = "Answer.txt";
    String w = "Encode.txt";
    String real = "Encode Done";
    String ans = testRec.recode(h, w);

    String strreal = String.valueOf(real);
    String strans = String.valueOf(ans);
    assertEquals(strreal, strans);
  }

  @Test
  public void edtest6() {
    char real = 'Y';
    char ans = decode0.code_0('y');

    String strreal = String.valueOf(real);
    String strans = String.valueOf(ans);
    assertEquals(strreal, strans);
  }

  @Test
  public void edtest7() {
    char real = 'F';
    char ans = decode1.code_1('z');

    String strreal = String.valueOf(real);
    String strans = String.valueOf(ans);
    assertEquals(strreal, strans);
  }

  @Test
  public void edtest8() {
    char real = 'R';
    char ans = getWorddec0.getWordDecode(0, 'r');

    String strreal = String.valueOf(real);
    String strans = String.valueOf(ans);
    assertEquals(strreal, strans);
  }

  @Test
  public void edtest9() {
    char real = '5';
    char ans = getWorddec1.getWordDecode(1, 'K');

    String strreal = String.valueOf(real);
    String strans = String.valueOf(ans);
    assertEquals(strreal, strans);
  }

  @Test
  public void edtest10() {
    String h = "Answer.txt";
    String w = "Decode.txt";
    String real = "Decode Done";
    String ans = testdecode.decode(h, w);

    String strreal = String.valueOf(real);
    String strans = String.valueOf(ans);
    assertEquals(strreal, strans);
  }

  @Test
  public void edtest11() {
    String h = "Answer.txt";
    String w = "Decode.txt";
    String real = "Decode Done";
    String ans = testdecode.decode(h, w);

    String strreal = String.valueOf(real);
    String strans = String.valueOf(ans);
    assertEquals(strreal, strans);
  }

  @Test
  public void edtest12() {
    int real = 0;
    int ans = getTestCode0.getCode();

    String strreal = String.valueOf(real);
    String strans = String.valueOf(ans);
    assertEquals(strreal, strans);
  }

  @Test
  public void edtest13() {
    int real = 1;
    int ans = getTestCode1.getCode();

    String strreal = String.valueOf(real);
    String strans = String.valueOf(ans);
    assertEquals(strreal, strans);
  }

}
