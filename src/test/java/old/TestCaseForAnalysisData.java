package old;

import static org.junit.Assert.*;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;

public class TestCaseForAnalysisData {

  private static Data analData1;
  private static Data analData2;
  private static Data analTotal;
  private static FileRW rfiles;
  private static FileRW wfiles;

  @BeforeClass
  public static void setUpBeforeClass() {
    analData1 = new Data();
    analData2 = new Data();
    analTotal = new Data();
    rfiles = new FileRW();
    wfiles = new FileRW();
  }

  @AfterClass
  public static void tearDownAfterClass() {
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
    String ans = analData2.analysisData(200);

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
    String filename1 = "Xcore";
    String realexcep = null;
    String filename2 = "Xcore1";
    String errorans = "Xcore1 (The system cannot find the file specified)";
    double real = 100;
    double ans = 0;
    try {
      ans = rfiles.readfile(filename1);
    } catch (Exception e) {
    }
    try {
      ans = rfiles.readfile(filename2);
    } catch (Exception e) {
      realexcep = e.getMessage();
    }

    String strError = String.valueOf(realexcep);
    String strAnsError = String.valueOf(errorans);

    String strReal = String.valueOf(real);
    String strAns = String.valueOf(ans);
    assertEquals(strReal, strAns);
    assertEquals(strError, strAnsError);
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
