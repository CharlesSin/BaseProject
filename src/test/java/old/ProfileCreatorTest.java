package old;

import org.apache.commons.io.FileUtils;
import org.junit.Assert;
import org.junit.Test;

import java.io.File;
import java.io.IOException;

import static org.junit.Assert.*;

public class ProfileCreatorTest {
    @Test
    public void testFile() throws IOException {
        int score = 87;
        int conduct = 78;
        hobbyType hobby = hobbyType.Movies;
        iSubject subject = iSubject.literature;
        ProfileCreator.create(score, conduct, hobby, subject);
        final File expected = new File("TestProfile.txt");
        final File output = new File("Profile.txt");

        Assert.assertEquals(FileUtils.readLines(expected),FileUtils.readLines(output));
    }
}
