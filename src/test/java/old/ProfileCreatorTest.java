package old;

//import org.apache.commons.io.FileUtils;
//import org.junit.Assert;
import org.junit.Test;

//import java.io.File;
import java.io.IOException;
//import java.nio.file.Files;

import static org.junit.Assert.*;

public class ProfileCreatorTest {
  @Test
  public void testFile() throws IOException {
    int score = 87;
    int conduct = 78;
    hobbyType hobby = hobbyType.Movies;
    iSubject subject = iSubject.literature;

    String real = "All Pass";
    String ans = ProfileCreator.create(score, conduct, hobby, subject);
    // File expected = new File("TestProfile.txt");
    // File output = new File("Profile.txt");

    String strReal = String.valueOf(real);
    String strAns = String.valueOf(ans);
    assertEquals(strReal, strAns);

    // Assert.assertEquals(FileUtils.readLines(expected), Files.lines(output));
  }
}
