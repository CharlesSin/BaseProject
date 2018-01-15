package old;

import org.junit.Test;
import java.io.IOException;
import static org.junit.Assert.*;

/**
 * Start Here.
 * 
 * @author Charles Sin starting.
 *
 */
public class ProfileCreatorTest {
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
}
