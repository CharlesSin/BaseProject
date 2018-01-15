package old;

public class hobbyClassifier {
  /**
   * Normalize input hobby.
   * 
   * @param hobby
   *          Hobby of user
   * @return Enum for users hobby.
   */
  public static hobbyType sort(String hobby) {
    if (hobby.equalsIgnoreCase("A"))
      return hobbyType.Sports;
    if (hobby.equalsIgnoreCase("B"))
      return hobbyType.Art;
    if (hobby.equalsIgnoreCase("C"))
      return hobbyType.Music;
    if (hobby.equalsIgnoreCase("D"))
      return hobbyType.VideoGames;
    if (hobby.equalsIgnoreCase("E"))
      return hobbyType.GYM;
    if (hobby.equalsIgnoreCase("F"))
      return hobbyType.Photography;
    if (hobby.equalsIgnoreCase("G"))
      return hobbyType.Movies;
    if (hobby.equalsIgnoreCase("H"))
      return hobbyType.Reading;
    if (hobby.equalsIgnoreCase("I"))
      return hobbyType.Cooking;
    if (hobby.equalsIgnoreCase("J"))
      return hobbyType.Computers;
    if (hobby.equalsIgnoreCase("K"))
      return hobbyType.Puzzles;
    return hobbyType.Others;
  }
}
