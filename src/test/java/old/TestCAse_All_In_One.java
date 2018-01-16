package old;

import static org.junit.Assert.*;
import java.io.IOException;
import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;

public class TestCAse_All_In_One {

  private static Data analData1;
  private static Data analData2;
  private static Data analTotal;
  private static FileRW rfiles;
  private static FileRW wfiles;

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

  private static Sharing test01;

  @BeforeClass
  public static void setUpBeforeClass() {
    analData1 = new Data();
    analData2 = new Data();
    analTotal = new Data();
    rfiles = new FileRW();
    wfiles = new FileRW();

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

    test01 = new Sharing();
  }

  @AfterClass
  public static void tearDownAfterClass() {
    analData1 = null;
    analData2 = null;
    analTotal = null;
    rfiles = null;
    wfiles = null;

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

    test01 = null;
  }

  @Test
  public void test1() {
    String real = "Please Go To Work, Because your study result is to bad.";
    String ans = analData1.analysisData(199);

    String strReal = String.valueOf(real);
    String strAns = String.valueOf(ans);
    assertEquals(strReal, strAns);
  }

  @Test
  public void test2() {
    String real = "Please When To High School STUDY HARD!!!";
    String ans = analData2.analysisData(201);

    String strReal = String.valueOf(real);
    String strAns = String.valueOf(ans);
    assertEquals(strReal, strAns);
  }

  @Test
  public void test3() {
    double real = 95;
    analTotal.setTotalScore(190);
    double ans = analTotal.getTotalScore();

    String strReal = String.valueOf(real);
    String strAns = String.valueOf(ans);
    assertEquals(strReal, strAns);
  }

  @Test
  public void test4() {
    String file = "Xcore.txt";
    double real = 100;
    double ans = 0;
    ans = rfiles.readfile(file);
    String strReal = String.valueOf(real);
    String strAns = String.valueOf(ans);
    assertEquals(strReal, strAns);
  }

  @Test
  public void test5() {
    String answer = "Xcore.txt";
    String real = "All Fully Write Out";
    String ans = "";
    try {
      ans = wfiles.writeFile(100, answer);
    } catch (Exception e) {
    }

    String strReal = String.valueOf(real);
    String strAns = String.valueOf(ans);
    assertEquals(strReal, strAns);
  }

  @Test
  public void testClassifierS() {
    iSubject output = subjectClassifier.sort("A");
    Assert.assertEquals(output, iSubject.literature);
    output = subjectClassifier.sort("B");
    Assert.assertEquals(output, iSubject.literature);
    output = subjectClassifier.sort("Q");
    Assert.assertEquals(output, iSubject.literature);
    output = subjectClassifier.sort("C");
    Assert.assertEquals(output, iSubject.math);
    output = subjectClassifier.sort("E");
    Assert.assertEquals(output, iSubject.sociology);
    output = subjectClassifier.sort("D");
    Assert.assertEquals(output, iSubject.sociology);
    output = subjectClassifier.sort("G");
    Assert.assertEquals(output, iSubject.sociology);
    output = subjectClassifier.sort("N");
    Assert.assertEquals(output, iSubject.sociology);
    output = subjectClassifier.sort("F");
    Assert.assertEquals(output, iSubject.artistic);
    output = subjectClassifier.sort("K");
    Assert.assertEquals(output, iSubject.artistic);
    output = subjectClassifier.sort("R");
    Assert.assertEquals(output, iSubject.artistic);
    output = subjectClassifier.sort("H");
    Assert.assertEquals(output, iSubject.science);
    output = subjectClassifier.sort("I");
    Assert.assertEquals(output, iSubject.science);
    output = subjectClassifier.sort("J");
    Assert.assertEquals(output, iSubject.science);
    output = subjectClassifier.sort("O");
    Assert.assertEquals(output, iSubject.business);
    output = subjectClassifier.sort("P");
    Assert.assertEquals(output, iSubject.business);
    output = subjectClassifier.sort("L");
    Assert.assertEquals(output, iSubject.IT);
    output = subjectClassifier.sort("M");
    Assert.assertEquals(output, iSubject.athletic);
    output = subjectClassifier.sort("asdin");
    Assert.assertEquals(output, iSubject.other);
  }

  @Test
  public void testFile() throws IOException {
    int score = 87;
    int conduct = 78;
    hobbyType hobby = hobbyType.Movies;
    iSubject subject = iSubject.literature;

    String real = "All Pass";
    String ans = ProfileCreator.create(score, conduct, hobby, subject);

    String strReal = String.valueOf(real);
    String strAns = String.valueOf(ans);
    assertEquals(strReal, strAns);
  }

  @Test
  public void testClassifierH() {
    hobbyType output = hobbyClassifier.sort("A");
    Assert.assertEquals(output, hobbyType.Sports);
    output = hobbyClassifier.sort("B");
    Assert.assertEquals(output, hobbyType.Art);
    output = hobbyClassifier.sort("C");
    Assert.assertEquals(output, hobbyType.Music);
    output = hobbyClassifier.sort("D");
    Assert.assertEquals(output, hobbyType.VideoGames);
    output = hobbyClassifier.sort("E");
    Assert.assertEquals(output, hobbyType.GYM);
    output = hobbyClassifier.sort("F");
    Assert.assertEquals(output, hobbyType.Photography);
    output = hobbyClassifier.sort("G");
    Assert.assertEquals(output, hobbyType.Movies);
    output = hobbyClassifier.sort("H");
    Assert.assertEquals(output, hobbyType.Reading);
    output = hobbyClassifier.sort("I");
    Assert.assertEquals(output, hobbyType.Cooking);
    output = hobbyClassifier.sort("J");
    Assert.assertEquals(output, hobbyType.Computers);
    output = hobbyClassifier.sort("K");
    Assert.assertEquals(output, hobbyType.Puzzles);
    output = hobbyClassifier.sort("ojnfsoad");
    Assert.assertEquals(output, hobbyType.Others);
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

  @Test
  public void testshare() {
    String cube = "hello";
    test01.sharing(cube);
  }

}
