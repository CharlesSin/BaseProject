package old;

import java.awt.Desktop;
import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;

/**
 * Start Here.
 * 
 * @author Charles Sin starting.
 *
 */
@SuppressWarnings({ "unused" })
public class Sharing {

  public String decode;

  public String sharing(String code) {

    decode = code;
    String errorMessage = null;

    String[] list = null;

    if (list == null) {
      errorMessage = "You didn't have any data, please try again!";
      System.out.println("You didn't have any data, please try again!");
    } else {

      if (Desktop.isDesktopSupported()) {
        try {
          Desktop.getDesktop().browse(new URI("http://www.example.com"));
        } catch (IOException e) {
          errorMessage = "Can't open web browser! Please check your computer setting.";
          System.out.println("Can't open web browser! Please check your computer setting.");
          e.printStackTrace();
        } catch (URISyntaxException e) {
          errorMessage = "Have wrong url! Please contact the developer!";
          System.out.println("Have wrong url! Please contact the developer!");
          e.printStackTrace();
        }
      }

      System.out.println("You can now share your result to everywhere!");
      System.out.println("Just copy the messages below and post to any place you want! =)");
      System.out.println("============================================================");
      for (String line : list) {
        System.out.println(line);
      }
      System.out.println("============================================================");
    }
    return errorMessage;
  }

}
