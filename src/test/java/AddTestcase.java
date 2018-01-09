package analysisdata;

import static org.junit.Assert.*;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;

public class AddTestcase {

  public static Data analData1;
  public static Data analData2;
  public static Data analTotal;
  public static FileRW rfiles;
  public static FileRW wfiles;
  /*
   * public static main filesIO; public static Main aData;
   */

  @BeforeClass
  public static void setUpBeforeClass() throws Exception {
    analData1 = new Data();
    analData2 = new Data();
    analTotal = new Data();
    rfiles = new FileRW();
    wfiles = new FileRW();
    /*
     * filesIO = new Main(); aData = new Main();
     */
  }

  @AfterClass
  public static void tearDownAfterClass() throws Exception {
    analData1 = null;
    analData2 = null;
    analTotal = null;
    rfiles = null;
    wfiles = null;
    /*
     * filesIO = null; aData = null;
     */
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
    String filename = "Xcore.txt";
    double real = 100;
    double ans = 0;
    try {
      ans = rfiles.readfile(filename);
    } catch (Exception e) {
      e.printStackTrace();
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
      e.printStackTrace();
    }

    String strReal = String.valueOf(real);
    String strAns = String.valueOf(ans);
    assertEquals(strReal, strAns);
  }

  // @Test
  // public void test6() {/* Testing Main */
  // String filename = "Xcore.txt";
  // double real1 = 100;
  // double real2 = 50;
  // String real3 = "Please Go To Work, Because your study result is to bad.";
  // String real4 = "All Fully Write Out";
  // double ans1 = 0;
  // String ans4 = "";
  //
  // try {
  // ans1 = filesIO.readfile(filename);
  // } catch (Exception e) {
  // e.printStackTrace();
  // }
  //
  // aData.setTotalScore(ans1);
  // double ans2 = aData.getTotalScore();
  //
  // String ans3 = aData.analysisData(ans2);
  //
  // try {
  // ans4 = filesIO.writeFile(ans2, ans3);
  // } catch (Exception e) {
  // e.printStackTrace();
  // }
  //
  // String strReal1 = String.valueOf(real1);
  // String strAns1 = String.valueOf(ans1);
  // assertEquals(strReal1, strAns1);

  // String strReal2 = String.valueOf(real2);
  // String strAns2 = String.valueOf(ans2);
  // assertEquals(strReal2, strAns2);
  //
  // String strReal3 = String.valueOf(real3);
  // String strAns3 = String.valueOf(ans3);
  // assertEquals(strReal3, strAns3);
  //
  // String strReal4 = String.valueOf(real4);
  // String strAns4 = String.valueOf(ans4);
  // assertEquals(strReal4, strAns4);
  // }
}
