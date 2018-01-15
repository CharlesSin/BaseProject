package someonecreatepackageplz;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Arrays;
import java.util.List;
import java.util.Random;

/**
 * Start Here.
 * 
 * @author Charles Sin starting.
 *
 */
public class Gather {

  public boolean hasData;
  private int process = 0;

  private int score;
  private int conduct;
  private String hobby;
  private String subject;

  public static enum Hobby {
    Sports, Arts, Games, Movies, Reading, Cooking;

    public String str;
    public int rank;

    Hobby() {
      this.str = this.toString();
      this.rank = new Random().nextInt(100);
    }
  }

  public static enum Subject {
    Chinese, English, Math, Biology, Chemistry, Computer;

    public String str;
    public int rank;

    Subject() {
      this.str = this.toString();
      this.rank = new Random().nextInt(100);
    }
  }

  public void action(int com) {
    if (process == 0) {
      Main.getInstance().addPost("What is your average academic score?", "", "List for alphabetical conversion:", "",
          "A:100", "B:90+", "C:80+", "D:70+", "E:60+", "F:below 60");
      process = 101;
    } else if (process == 101) {
      score = com == 1 ? 100 : com == 2 ? 90 : com == 3 ? 80 : com == 4 ? 70 : com == 5 ? 60 : 50;
      Main.getInstance().addPost("What is your average conduct score?", "", "List for alphabetical conversion:", "",
          "A:100", "B:90+", "C:80+", "D:70+", "E:60+", "F:below 60");
      process = 102;
    } else if (process == 102) {
      conduct = com == 1 ? 100 : com == 2 ? 90 : com == 3 ? 80 : com == 4 ? 70 : com == 5 ? 60 : 50;
      Main.getInstance().addPost("What is your hobby?", "", "Please enter one of the following english letter.", "",
          "A:" + Hobby.values()[0].str, "B:" + Hobby.values()[1].str, "C:" + Hobby.values()[2].str,
          "D:" + Hobby.values()[3].str, "E:" + Hobby.values()[4].str, "F:" + Hobby.values()[5].str);
      process = 103;
    } else if (process == 103) {
      hobby = Hobby.values()[com - 1].str;
      Main.getInstance().addPost("What subject do you have the most interest in?", "",
          "Please enter one of the following english letter.", "", "A:" + Subject.values()[0].str,
          "B:" + Subject.values()[1].str, "C:" + Subject.values()[2].str, "D:" + Subject.values()[3].str,
          "E:" + Subject.values()[4].str, "F:" + Subject.values()[5].str);
      process = 104;
    } else if (process == 104) {
      subject = Subject.values()[com - 1].str;
      Main.getInstance().addPost("Done! You can do other parts now!", "NOTICE:",
          "Restart part 1 will reset the old result!", "", "Average Score: " + score, "Average Conduct: " + conduct,
          "Hobby: " + hobby, "Interested field of studies: " + subject);
      process = 0;
      Main.getInstance().eventNow = 0;
      hasData = true;
    }
  }

  public void output() {
    try {
      BufferedWriter out = new BufferedWriter(new FileWriter("Data.txt"));
      out.write("Average Score: " + String.valueOf(score));
      out.newLine();
      out.write("Average Conduct: " + String.valueOf(conduct));
      out.newLine();
      out.write("Hobby: " + hobby);
      out.newLine();
      out.write("Interested field of studies: " + subject);
      out.close();
    } catch (IOException e) {

    }
  }

  public List<String> getReult() {
    return Arrays.asList("Average Score: " + score, "Average Conduct: " + conduct, "Hobby: " + hobby,
        "Interested field of studies: " + subject);
  }

  public int getTotal() {
    return score + conduct + Hobby.valueOf(hobby).rank + Subject.valueOf(subject).rank;
  }
}