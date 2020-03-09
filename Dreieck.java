public class Dreieck extends geometrischeFiguren implements Wuerfel{
  private int grundseite;
  private int höhe;
  public Dreieck(int a, int b, String farbe){   
    super(farbe);
    grundseite = a;
    höhe = b; 
    }
  
  public int flächeBerechnen(){
    return((int)(0.5*grundseite*höhe));  
  }
  
  public void wuerfeln(){
    System.out.println("Ich bin ein D4 hahahahh!1!!!11");
  }
  }
