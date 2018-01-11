package old;

import java.io.*;

public class Decode {
	int code;

	int range[] = new int[32];
	int range1[] = new int[32];
	int range2[] = new int[32];

	public Decode(int code) {
		this.code = code;
		for (int i = 32; i < 64; i++) {
			range[i - 32] = i;
		}
		for (int i = 64; i < 96; i++) {
			range1[i - 64] = i;
		}
		for (int i = 96; i < 128; i++) {
			range2[i - 96] = i;
		}
	}

	public char code_0(char word) {
		char temp = word;
		if ((int) word >= 32 && (int) word < 64) {
			for (int i = 0; i < 32; i++) {
				if (range[i] == (int) word)
					temp = (char) range2[i];
			}
		} else if ((int) word < 96) {
			for (int i = 0; i < 32; i++) {
				if (range1[i] == (int) word)
					temp = (char) range[i];
			}
		} else if ((int) word < 128) {
			for (int i = 0; i < 32; i++) {
				if (range2[i] == (int) word)
					temp = (char) range1[i];
			}
		}
		return temp;
	}

	public char code_1(char word){
		char temp = word;
		if ((int) word >= 32 && (int) word < 64) {
			for (int i = 0; i < 32; i++) {
				if (range[i] == (int) word)
					temp = (char) range2[32-i];
			}
		} else if ((int) word < 96) {
			for (int i = 0; i < 32; i++) {
				if (range1[i] == (int) word)
					temp = (char) range[32-i];
			}
		} else if ((int) word < 128) {
			for (int i = 0; i < 32; i++) {
				if (range2[i] == (int) word)
					temp = (char) range1[32-i];
			}
		}
		return temp;
	}

	public char getWordDecode(int code,char word) {
		char temp = word;
		if (this.code == 1) {
			temp = code_1(word);
		}else{
			temp = code_0(word);
		}
		return temp;
	}

	void decode(String src, String dst) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(new FileInputStream(new File(src)), "UTF-8"));
		BufferedWriter bw = new BufferedWriter(new FileWriter(dst));
		String str;

		while ((str = br.readLine()) != null) {
			String temp = "";
			for (int i = 0; i < str.length(); i++) {
				temp += getWordDecode(code,str.charAt(i));
			}
			bw.write(temp);
			bw.newLine();
		}
		System.out.println("Decode Sul");
		br.close();
		bw.close();

	}
	
	public int getCode() {
	    return code;
	}
}
