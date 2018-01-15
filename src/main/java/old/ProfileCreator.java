package old;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class ProfileCreator {
  public static String create(int score, int conduct, hobbyType hobby, iSubject subject) {
    try {
      BufferedWriter out = new BufferedWriter(new FileWriter("Profile.txt"));
      out.write("Average Score:" + String.valueOf(score));
      out.newLine();
      out.write("Average Conduct:" + String.valueOf(conduct));
      out.newLine();
      out.write("Hobby:" + hobby.name());
      out.newLine();
      out.write("Interested field of studies:" + subject.name());
      out.close();
    } catch (IOException e) {
    }
    String done = "All Pass";
    return done;
  }
}
