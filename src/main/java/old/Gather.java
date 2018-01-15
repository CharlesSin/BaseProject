package old;
import java.io.*;
import java.util.Scanner;

/**
 * Basic Questionnaire that collects user data,normalizing to standard input and store in txt as Personal Profile.
 * @author Edwin
 *
 */
public class Gather {
  public static void main(String[] args) {
    System.out.println("By entering 1,you are agreeing to the system to collect your personal information,exit now if you refuse so.");
    Scanner scan = new Scanner(System.in);
    if(scan.nextInt()==1) {
      System.out.println("HI");
    } else {
      scan.close();
      return;
    }
    System.out.println("What is your average academic score?");
    System.out.println("List for alphabetical conversion:");
    System.out.println("A+:95 A:90 A-:85 B+:80 B:75 B-:70 C+:65 C:60 C- or below:55");
    System.out.println("Input:");
    int score = scan.nextInt();
    System.out.println("What is your average conduct score?");
    System.out.println("List for alphabetical conversion:");
    System.out.println("A+:95 A:90 A-:85 B+:80 B:75 B-:70 C+:65 C:60 C- or below:55");
    System.out.println("Input:");
    int conduct = scan.nextInt();
    System.out.println("What is your hobby?");
    System.out.println("Pleas enter one of the following english letter.");
    System.out.println("A:Sports B:Art C:Music D:Video Games E:GYM F:Photography G:Movies H:Reading I:Cooking J:Computers K:Puzzles");
    System.out.println("Input:");
    String hobby = scan.next();
    System.out.print("What subject do you have the most interest in?");
    System.out.println("Pleas enter one of the following english letter.");
    System.out.println("A:Chinese Literature B:English Literature C:Mathematics D:History E:Geography F:Music G:Liberal or Social Studies H:Physics");
    System.out.println("I:Chemistry J:Biology K:Music L:Information Technology/Computer Studies M:Athletic Studies N:Law O:Finance P:Economy Q:Foriegn Language R:Art");
    String subject = scan.next();
    iSubject InterestS = subjectClassifier.sort(subject);
    hobbyType hobbyT = hobbyClassifier.sort(hobby);
    scan.close();
    ProfileCreator.create(score,conduct,hobbyT,InterestS);
  }
}
