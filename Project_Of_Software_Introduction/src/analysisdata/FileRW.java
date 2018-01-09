package analysisdata;

import java.io.FileWriter;
import java.util.Scanner;

public class FileRW {

  public double readfile(String filename) throws Exception {

    java.io.File file = new java.io.File(filename);

    Scanner input = new Scanner(file);

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
