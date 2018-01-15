package someonecreatepackageplz;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import someonecreatepackageplz.Main.MainAction;

/**
 * Start Here.
 * 
 * @author Charles Sin starting.
 *
 */
public class Secret {

  public void action(int com) {

    if (!Main.getInstance().Gather.hasData) {
      Main.getInstance().addPost("Please do part 1 '" + MainAction.A.str + "' first!");
      Main.getInstance().eventNow = 0;
      return;
    }

    String src = "Data.txt", Encode_dst = "Encode.txt", Decode_dst = "Decode.txt";

    Main.getInstance().Gather.output();

    try {
      recode(src, Encode_dst);
    } catch (IOException e) {
      e.printStackTrace();
    }

    try {
      decode(Encode_dst, Decode_dst);
    } catch (IOException e) {
      e.printStackTrace();
    }

    Main.getInstance().addPost("Done! You can check your file now.");
    Main.getInstance().eventNow = 0;
  }

  public void recode(String src, String encode_dst) throws IOException, FileNotFoundException {
    BufferedReader br = new BufferedReader(new InputStreamReader(new FileInputStream(new File(src)), "UTF-8"));
    BufferedWriter bw = new BufferedWriter(new FileWriter(encode_dst));

    int range[] = new int[32];
    int range1[] = new int[32];
    int range2[] = new int[32];
    for (int i = 32; i < 64; i++) {
      range[i - 32] = i;
    }
    for (int i = 64; i < 96; i++) {
      range1[i - 64] = i;
    }
    for (int i = 96; i < 128; i++) {
      range2[i - 96] = i;
    }

    String str;
    while ((str = br.readLine()) != null) {
      String temp = "";
      for (int j = 0; j < str.length(); j++) {
        char word = str.charAt(j);
        char tmp = word;

        if (word >= 32 && word < 64) {
          for (int i = 0; i < 32; i++) {
            if (range[i] == word)
              tmp = (char) range1[i];
          }
        } else if (word < 96) {
          for (int i = 0; i < 32; i++) {
            if (range1[i] == word)
              tmp = (char) range2[i];
          }
        } else if (word < 128) {
          for (int i = 0; i < 32; i++) {
            if (range2[i] == word)
              tmp = (char) range[i];
          }
        }

        temp += tmp;
      }
      bw.write(temp);
      bw.newLine();
    }
    br.close();
    bw.close();
  }

  public void decode(String encode_dst, String decode_dst) throws IOException, FileNotFoundException {
    BufferedReader br = new BufferedReader(new InputStreamReader(new FileInputStream(new File(encode_dst)), "UTF-8"));
    BufferedWriter bw = new BufferedWriter(new FileWriter(decode_dst));

    int range[] = new int[32];
    int range1[] = new int[32];
    int range2[] = new int[32];
    for (int i = 32; i < 64; i++) {
      range[i - 32] = i;
    }
    for (int i = 64; i < 96; i++) {
      range1[i - 64] = i;
    }
    for (int i = 96; i < 128; i++) {
      range2[i - 96] = i;
    }

    String str;
    while ((str = br.readLine()) != null) {
      String temp = "";
      for (int j = 0; j < str.length(); j++) {
        char word = str.charAt(j);
        char tmp = word;

        if (word >= 32 && word < 64) {
          for (int i = 0; i < 32; i++) {
            if (range[i] == word)
              tmp = (char) range2[i];
          }
        } else if (word < 96) {
          for (int i = 0; i < 32; i++) {
            if (range1[i] == word)
              tmp = (char) range[i];
          }
        } else if (word < 128) {
          for (int i = 0; i < 32; i++) {
            if (range2[i] == word)
              tmp = (char) range1[i];
          }
        }

        temp += tmp;
      }
      bw.write(temp);
      bw.newLine();
    }
    br.close();
    bw.close();
  }
}
