package someonecreatepackageplz;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Container;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.List;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextArea;

/**
 * Start Here,GUI.
 * 
 * @author Charles Sin starting.
 *
 */
public class Main extends JFrame {
  /**
   * Main program.
   */
  private static final long serialVersionUID = 1L;
  private static Main instance;
  private static String launcherName = "1061-FCU-SE 软工组 High School Student Life Plan";

  public String pathJava;

  public static Main getInstance() {
    return instance;
  }

  public Gather Gather;
  public Analysis Analysis;
  public Secret Secret;
  public Sharing Sharing;

  public Main() {
    pathJava = System.getProperty("java.home");

    Gather = new Gather();
    Analysis = new Analysis();
    Secret = new Secret();
    Sharing = new Sharing();
  }

  public static void main(String[] args) {
    instance = new Main();
    instance.init();
  }

  /*
   * 
   */

  public static enum MainAction {
    A("填寫問卷"), B("資料分析"), C("資料導出與加密"), D("分享");

    public String str;

    MainAction(String str) {
      this.str = str;
    }
  }

  /*
   * 
   */

  public int eventNow;

  private BorderLayout layoutMain;
  private Container containerMain;
  private JTextArea taInfo, taPost;
  private JButton butM1, butM2, butM3, butM4;
  private JButton butR1, butR2, butR3, butR4, butR5, butR6;

  public void init() {
    eventNow = 0;

    setSize(800, 600);
    setTitle(launcherName);
    setResizable(false);
    setDefaultCloseOperation(DISPOSE_ON_CLOSE);
    layoutMain = new BorderLayout();
    setLayout(layoutMain);

    containerMain = getContentPane();
    containerMain.setLayout(null);

    taInfo = new JTextArea();
    taInfo.setEditable(false);
    taInfo.setBackground(new Color(51, 51, 51));
    taInfo.setColumns(20);
    taInfo.setFont(new Font("新細明體", Font.BOLD, 14));
    taInfo.setForeground(new Color(255, 255, 255));
    taInfo.setLineWrap(true);
    taInfo.setRows(1);
    taInfo.setBorder(null);
    taInfo.setBounds(25, 450, 200, 80);
    containerMain.add(taInfo);

    taPost = new JTextArea();
    taPost.setEditable(false);
    taPost.setBackground(new Color(255, 255, 255));
    taPost.setColumns(20);
    taPost.setFont(new Font("新細明體", Font.CENTER_BASELINE, 14));
    taPost.setForeground(new Color(0, 0, 0));
    taPost.setLineWrap(true);
    taPost.setRows(1);
    taPost.setBorder(null);
    taPost.setBounds(250, 50, 480, 400);
    containerMain.add(taPost);

    /*
     * 
     */

    addInfo("可能會有許多例外發生", "為了您的使用體驗", "以及我們的分數", "請按照說明書使用");
    addPost("歡迎使用 High School Student Life Plan！", "請從左側選擇您要執行的動作，", "或嘗試轉三圈讓自己暈眩想吐。");

    int w = 150;
    int h = 40;
    setupButton(butM1, MainAction.A.str, new butActionM(), 50, 75, w, h);
    setupButton(butM2, MainAction.B.str, new butActionM(), 50, 125, w, h);
    setupButton(butM3, MainAction.C.str, new butActionM(), 50, 175, w, h);
    setupButton(butM4, MainAction.D.str, new butActionM(), 50, 225, w, h);

    w = 160;
    h = 40;
    setupButton(butR1, "A", new butActionR(), taPost.getX(), taPost.getY() + taPost.getHeight(), w, h);
    setupButton(butR2, "B", new butActionR(), taPost.getX() + w, taPost.getY() + taPost.getHeight(), w, h);
    setupButton(butR3, "C", new butActionR(), taPost.getX() + w + w, taPost.getY() + taPost.getHeight(), w, h);
    setupButton(butR4, "D", new butActionR(), taPost.getX(), taPost.getY() + taPost.getHeight() + h, w, h);
    setupButton(butR5, "E", new butActionR(), taPost.getX() + w, taPost.getY() + taPost.getHeight() + h, w, h);
    setupButton(butR6, "F", new butActionR(), taPost.getX() + w + w, taPost.getY() + taPost.getHeight() + h, w, h);

    setVisible(true);
  }

  /*
   * 
   */

  public void addInfo(String... msgs) {
    taInfo.setText("");
    for (String msg : msgs) {
      taInfo.append(msg + "\n");
    }
    taInfo.setCaretPosition(taInfo.getText().length());
  }

  public void addPost(List<String> msgs) {
    taPost.setText("");
    for (String msg : msgs) {
      taPost.append(msg + "\n");
    }
    taPost.setCaretPosition(taPost.getText().length());
  }

  public void addPost(String... msgs) {
    taPost.setText("");
    for (String msg : msgs) {
      taPost.append(msg + "\n");
    }
    taPost.setCaretPosition(taPost.getText().length());
  }

  public void setupButton(JButton but, String butName, ActionListener listener, int butX, int butY, int butW,
      int butH) {
    if (but == null) {
      but = new JButton();
    }
    but.setText(butName);
    but.setBounds(butX, butY, butW, butH);
    but.addActionListener(listener);
    containerMain.add(but);
  }

  /*
   * 
   */

  public class butActionM implements ActionListener {
    @Override
    public void actionPerformed(ActionEvent e) {
      if (eventNow != 0) {
        addInfo("請先完成當前動作");
      } else {
        if (e.getSource() instanceof JButton) {
          JButton but = (JButton) e.getSource();
          if (but.getText().equalsIgnoreCase(MainAction.A.str)) {
            eventNow = 1;
            Gather.action(0);
          } else if (but.getText().equalsIgnoreCase(MainAction.B.str)) {
            eventNow = 2;
            Analysis.action();
          } else if (but.getText().equalsIgnoreCase(MainAction.C.str)) {
            eventNow = 3;
            Secret.action(0);
          } else if (but.getText().equalsIgnoreCase(MainAction.D.str)) {
            eventNow = 4;
            Sharing.sharing(0);
            ;
          }
        }
      }
    }
  }

  public class butActionR implements ActionListener {
    @Override
    public void actionPerformed(ActionEvent e) {
      if (e.getSource() instanceof JButton) {
        JButton but = (JButton) e.getSource();
        int arg = 0;
        if (but.getText().contains("A")) {
          arg = 1;
        } else if (but.getText().contains("B")) {
          arg = 2;
        } else if (but.getText().contains("C")) {
          arg = 3;
        } else if (but.getText().contains("D")) {
          arg = 4;
        } else if (but.getText().contains("E")) {
          arg = 5;
        } else if (but.getText().contains("F")) {
          arg = 6;
        }
        if (eventNow != 0) {
          if (eventNow == 1) {
            Gather.action(arg);
          } else if (eventNow == 4) {
            Sharing.sharing(arg);
            ;
          }
        }
      }
    }
  }
}
