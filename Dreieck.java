public class Dreieck extends geometrischeFiguren implements Wuerfel{
  private int grundseite;
  private int h�he;
  public Dreieck(int a, int b, String farbe){   
    super(farbe);
    grundseite = a;
    h�he = b; 
    }
  
  public int fl�cheBerechnen(){
    return((int)(0.5*grundseite*h�he));  
  }
  
  public void wuerfeln(){
    System.out.println("Ich bin ein D4 hahahahh!1!!!11");
  }
  }
