package old;

import org.junit.Assert;
import org.junit.Test;

public class hobbyClassifierTest {
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
}
