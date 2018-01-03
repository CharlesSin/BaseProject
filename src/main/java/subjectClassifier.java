
public class subjectClassifier {
  /**
   * Normalize user interested subject as fields of studies.
   * @param subject User interested subject.
   * @return Suggested field of study.
   */
  public static iSubject sort(String subject) {
    if(subject.equalsIgnoreCase("A")||subject.equalsIgnoreCase("B")||subject.equalsIgnoreCase("Q")) {
      return iSubject.literature;
    }
    if(subject.equalsIgnoreCase("C")) {
      return iSubject.math;
    }
    if(subject.equalsIgnoreCase("E")||subject.equalsIgnoreCase("D")||subject.equalsIgnoreCase("G")||subject.equalsIgnoreCase("N")) {
      return iSubject.sociology;
    }
    if(subject.equalsIgnoreCase("F")||subject.equalsIgnoreCase("K")||subject.equalsIgnoreCase("R")) {
      return iSubject.artistic;
    }
    if(subject.equalsIgnoreCase("H")||subject.equalsIgnoreCase("I")||subject.equalsIgnoreCase("J")) {
      return iSubject.science;
    }
    if(subject.equalsIgnoreCase("O")||subject.equalsIgnoreCase("P")) {
      return iSubject.business;
    }
    if(subject.equalsIgnoreCase("L")) {
      return iSubject.IT;
    }
    if(subject.equalsIgnoreCase("M")) {
      return iSubject.athletic;
    }
    return iSubject.other;
  }
}
