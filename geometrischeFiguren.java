public abstract class geometrischeFiguren{
  private int flächeninhalt;
  private String farbe;
  public geometrischeFiguren(String f){
    this.farbe = f;
    }
  
  public abstract int flächeBerechnen();
}
