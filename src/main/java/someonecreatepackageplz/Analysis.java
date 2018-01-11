package someonecreatepackageplz;

import someonecreatepackageplz.Main.MainAction;

public class Analysis {

    public void action() {
        if(!Main.getInstance().Gather.hasData) {
            Main.getInstance().addPost("Please do part 1 '" + MainAction.A.str + "' first!");
            Main.getInstance().eventNow = 0;
        }else {
            int total = Main.getInstance().Gather.getTotal();
            Main.getInstance().addPost("Your total is " + total,
                    total < 200? "Please Go To Work, Because your study result is to bad." : "Please When To High School STUDY HARD!!!");
            Main.getInstance().eventNow = 0;
        }
    }
}
