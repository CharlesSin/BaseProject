package old;
import java.awt.Desktop;
import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;

//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.chrome.ChromeDriver;
//
//import com.restfb.DefaultFacebookClient;
//import com.restfb.FacebookClient;
//import com.restfb.types.User;

@SuppressWarnings({"unused"})
public class Sharing {
    
    public String decode;
    
    public void sharing(String code) {
        
        decode = code;
        
        String[] list = null;
        
        if(list == null) {
            System.out.println("You didn't have any data, please try again!");
        }else {
            
            if (Desktop.isDesktopSupported()) {
                try {
                    Desktop.getDesktop().browse(new URI("http://www.example.com"));
                } catch (IOException e) {
                    System.out.println("Can't open web browser! Please check your computer setting.");
                    e.printStackTrace();
                    return;
                } catch (URISyntaxException e) {
                    System.out.println("Have wrong url! Please contact the developer!");
                    e.printStackTrace();
                    return;
                }
            }
            
            System.out.println("You can now share your result to everywhere!");
            System.out.println("Just copy the messages below and post to any place you want! =)");
            System.out.println("============================================================");
            for(String line : list) {
                System.out.println(line);
            }
            System.out.println("============================================================");
        }
    }
    
//    public void sharingOnFacebook(String code) {
//        
//        String domain = "http://www.fcu.edu.tw/";
//        String appId = "318433902008431";
//        
//        String authUrl = "https://graph.facebook.com/oauth/authorize?type=user_agent&client_id=" + appId + "&redirect_uri=" + domain + "&scope=user_about_me";
//        
//        System.setProperty("webdirver.chrome.driver", "chromedriver.exe");
//        
//        WebDriver driver = new ChromeDriver();
//        driver.get(authUrl);
//        String accessToken = "";
//        while(true){
//            
//            if(driver == null || driver.getCurrentUrl() == null) {
//                System.out.println("ERROR! User close the webdirver, please retry.");
//                return;
//            }else if(!driver.getCurrentUrl().contains("facebook.com")){
//                String url = driver.getCurrentUrl();
//                accessToken = url.replaceAll(".*#access_token=(.+)&.*", "$1");
//                
//                driver.quit();
//                
//                FacebookClient fbClient = new DefaultFacebookClient(accessToken);
//                User user = fbClient.fetchObject("me",User.class);
//                System.out.println("Hello " + user.getName());
//                break;
//            }
//        }
//        
//        if(accessToken != "") {
//            
//        }
//    }

}
