public class Kreis extends geometrischeFiguren implements Rolle{
  private int radius;
  public Kreis(int a, String farbe){
    super(farbe);
    radius = a;
  }
  
  public int fl�cheBerechnen(){
    return((int)(3.14*radius*radius));  
  }
  
  public void rollen(){
    System.out.println("Ich rolle im Kreis heruuumm dideldum!!!");
  }
}
