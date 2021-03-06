package old;

import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.util.Scanner;

/**
 * Start Here.
 * 
 * @author Charles Sin starting.
 *
 */
public class FileRW {

  public double readfile(String filename) {

    java.io.File file = new java.io.File(filename);

    Scanner input = null;
    try {
      input = new Scanner(file);
    } catch (FileNotFoundException e) {
    }

    double ans = 0;

    while (input.hasNextDouble()) {
      double favoriteValue = input.nextDouble();
      double hobbyValue = input.nextDouble();
      double scoreValue = input.nextDouble();
      double conductValue = input.nextDouble();

      ans = favoriteValue + hobbyValue + scoreValue + conductValue;
    }

    input.close();
    return ans;
  }

  public String writeFile(double totalScore, String analysisans) throws Exception {

    String filename = "Answer.txt";
    String str = "Your Analysis Result is :";
    String finish = "All Fully Write Out";
    FileWriter fw = new FileWriter(filename);

    String strTotalScore = String.valueOf(totalScore);

    fw.write(analysisans, 0, analysisans.length());
    fw.write(' ');
    fw.write("\n");

    fw.write(str, 0, str.length());
    fw.write(' ');
    fw.write("\n");

    fw.write(strTotalScore, 0, strTotalScore.length());
    fw.write('\n');

    fw.close();
    return finish;

  }

}
