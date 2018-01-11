package someonecreatepackageplz;

import java.awt.Desktop;
import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import someonecreatepackageplz.Main.MainAction;

@SuppressWarnings({"unused"})
public class Sharing {
    
    public String decode = "0";
    
    public void sharing(int com) {
        
        if(!Main.getInstance().Gather.hasData) {
            Main.getInstance().addPost("Please do part 1 '" + MainAction.A.str + "' first!");
            Main.getInstance().eventNow = 0;
            return;
        }
        
        if (Integer.parseInt(decode) == 0) {
            Main.getInstance().addPost("Where do you want to share your result?", "", "List :", "", "A: Facebook", "B: Instagram", "C: Twitter", "D: QQ", "E: VKontakte", "F:Google+");
            decode = String.valueOf(401);
        } else if (Integer.parseInt(decode) == 401) {
            if (Desktop.isDesktopSupported()) {
                try {
                    Desktop.getDesktop().browse(new URI(com == 1? "https://www.facebook.com/"
                            : com == 2? "https://www.instagram.com/"
                                    : com == 3? "https://twitter.com/"
                                            : com == 4? "http://qzone.qq.com/"
                                                    : com == 5? "https://vk.com/"
                                                            : "https://plus.google.com/"));
                } catch (IOException e) {
                    System.out.println("Can't open web browser! Please check your computer setting.");
                    e.printStackTrace();
                    Main.getInstance().eventNow = 0;
                    return;
                } catch (URISyntaxException e) {
                    System.out.println("Have wrong url! Please contact the developer!");
                    e.printStackTrace();
                    return;
                }
            }
            
            List<String> list = new ArrayList<String>();
            list.add("You can now share your result!");
            list.add("Just copy the messages below and post! =)");
            list.add("=========================================");
            list.add("I have done High School Student Life Plan!");
            list.add("These is my reult:");
            for(String str : Main.getInstance().Gather.getReult()) {
                list.add(str);
            }
            list.add("");
            list.add("My total score is " + Main.getInstance().Gather.getTotal());
            list.add("Analysis reult:");
            list.add(Main.getInstance().Gather.getTotal() < 200? "Please Go To Work, Because your study result is to bad." : "Please When To High School STUDY HARD!!!");
            list.add("=========================================");
            
            Main.getInstance().addPost(list);
            Main.getInstance().eventNow = 0;
        }
    }

}
