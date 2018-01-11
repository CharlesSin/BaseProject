package old;
import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class Secret {

	public static void main(String[] args) throws IOException {
		Scanner in = new Scanner(System.in);

		System.out.println("Encode the .txt, input the 0 ?");
		System.out.println("Dncode the .txt, input the 1 ?");
		System.out.println("Do noting, input the 2 ?\n");
		int check = -1;
		int code = 0;
		do {
			System.out.println("input 0 or 1 or 2 ");
			check = in.nextInt();
		} while (check != 0 && check != 1 && check != 2);

		String src = "", Encode_dst = "Encode.txt", Decode_dst = "Decode.txt";


		switch (check) {
		case 0: {

			System.out.println("Input the src");
			src = in.next();

            System.out.println("Inout you code 1 or 0 ");
            code = in.nextInt();
			System.out.println("Your code:" + code);

			Recode re = new Recode(code);
			re.recode(src, Encode_dst);

			File file = new File(src);
			file.delete();

			System.out.println("Result in Encode.txt");
			break;
		}
		case 1: {
			System.out.println("Input the src");
			src = in.next();

			System.out.println("input Your code:");
			code = in.nextInt();
			Decode de = new Decode(code);
			de.decode(src, Decode_dst);
			File file = new File(src);
			file.delete();

			System.out.println("Result in Decode.txt");
			break;
		}
		case 2: {
			System.out.println("Pass All");
			break;

		}

		}


	}

}
