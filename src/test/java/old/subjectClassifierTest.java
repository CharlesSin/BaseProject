package old;

import org.junit.Assert;
import org.junit.Test;

public class subjectClassifierTest {
  @Test
  public void testClassifierS() {
    iSubject output = subjectClassifier.sort("A");
    Assert.assertEquals(output, iSubject.literature);
    output = subjectClassifier.sort("B");
    Assert.assertEquals(output, iSubject.literature);
    output = subjectClassifier.sort("Q");
    Assert.assertEquals(output, iSubject.literature);
    output = subjectClassifier.sort("C");
    Assert.assertEquals(output, iSubject.math);
    output = subjectClassifier.sort("E");
    Assert.assertEquals(output, iSubject.sociology);
    output = subjectClassifier.sort("D");
    Assert.assertEquals(output, iSubject.sociology);
    output = subjectClassifier.sort("G");
    Assert.assertEquals(output, iSubject.sociology);
    output = subjectClassifier.sort("N");
    Assert.assertEquals(output, iSubject.sociology);
    output = subjectClassifier.sort("F");
    Assert.assertEquals(output, iSubject.artistic);
    output = subjectClassifier.sort("K");
    Assert.assertEquals(output, iSubject.artistic);
    output = subjectClassifier.sort("R");
    Assert.assertEquals(output, iSubject.artistic);
    output = subjectClassifier.sort("H");
    Assert.assertEquals(output, iSubject.science);
    output = subjectClassifier.sort("I");
    Assert.assertEquals(output, iSubject.science);
    output = subjectClassifier.sort("J");
    Assert.assertEquals(output, iSubject.science);
    output = subjectClassifier.sort("O");
    Assert.assertEquals(output, iSubject.business);
    output = subjectClassifier.sort("P");
    Assert.assertEquals(output, iSubject.business);
    output = subjectClassifier.sort("L");
    Assert.assertEquals(output, iSubject.IT);
    output = subjectClassifier.sort("M");
    Assert.assertEquals(output, iSubject.athletic);
    output = subjectClassifier.sort("asdin");
    Assert.assertEquals(output, iSubject.other);
  }
}
