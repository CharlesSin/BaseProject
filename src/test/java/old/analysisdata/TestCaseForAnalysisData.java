package old.analysisdata;

import static org.junit.Assert.*;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;

public class TestCaseForAnalysisData {

  public static Data analData1;
  public static Data analData2;
  public static Data analTotal;
  public static FileRW rfiles;
  public static FileRW wfiles;

  @BeforeClass
  public static void setUpBeforeClass() throws Exception {
    analData1 = new Data();
    analData2 = new Data();
    analTotal = new Data();
    rfiles = new FileRW();
    wfiles = new FileRW();
  }

  @AfterClass
  public static void tearDownAfterClass() throws Exception {
    analData1 = null;
    analData2 = null;
    analTotal = null;
    rfiles = null;
    wfiles = null;
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
    String ans = analData1.analysisData(200);

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
    String filename = "Xcore";
    double real = 100;
    double ans = 0;
    try {
      ans = rfiles.readfile(filename);
    } catch (Exception e) {
    }

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
}
