public class Rechteck extends geometrischeFiguren implements Wuerfel{
  private int grundseite;
  private int h�he;
  public Rechteck(int a, int b, String farbe){
    super(farbe);
    grundseite = a;
    h�he = b;
  }
  
  public int fl�cheBerechnen(){
    return(grundseite*h�he);  
  }
  
  public void wuerfeln(){
    System.out.println("Ich bin ein D6 du heheh!");
  }
}
