package old;

public class MainForDataAndFileRW {

  public static void main(String[] args) throws Exception {

    FileRW filesIO = new FileRW();
    Data aData = new Data();

    double total = filesIO.readfile("Xcore");

    aData.setTotalScore(total);

    double result = aData.getTotalScore();

    String strResult = aData.analysisData(result);

    String complete = filesIO.writeFile(result, strResult);

    System.out.println(complete);

  }

}
