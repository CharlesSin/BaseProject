package someonecreatepackageplz;

import java.io.IOException;

import someonecreatepackageplz.Main.MainAction;

public class Secret {
    
    public void action(int com) {
        
        if(!Main.getInstance().Gather.hasData) {
            Main.getInstance().addPost("Please do part 1 '" + MainAction.A.str + "' first!");
            Main.getInstance().eventNow = 0;
            return;
        }
        
        String src = "Data.txt", Encode_dst = "Encode.txt", Decode_dst = "Decode.txt";
        
        Main.getInstance().Gather.output();
        
        Recode re = new Recode(0);
        try {
            re.recode(src, Encode_dst);
        } catch (IOException e) {
            e.printStackTrace();
        }
        
        Decode de = new Decode(0);
        try {
            de.decode(src, Decode_dst);
        } catch (IOException e) {
            e.printStackTrace();
        }
        
        Main.getInstance().addPost("Done! You can check your file now.");
        Main.getInstance().eventNow = 0;
    }

}
