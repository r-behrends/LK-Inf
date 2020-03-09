public class Rechteck extends geometrischeFiguren implements Wuerfel{
  private int grundseite;
  private int höhe;
  public Rechteck(int a, int b, String farbe){
    super(farbe);
    grundseite = a;
    höhe = b;
  }
  
  public int flächeBerechnen(){
    return(grundseite*höhe);  
  }
  
  public void wuerfeln(){
    System.out.println("Ich bin ein D6 du heheh!");
  }
}
