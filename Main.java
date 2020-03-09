public class main
{
    
    public static void main(String[] args){
    
     //ab hier schreibt ihr euren Quelltext
    
    int x = 1;
    int zaehler=0;

        while( x<1000000 ){
            x = x*2;      // x wird hier verdoppelt
            zaehler = zaehler + 1;
            
        }
    System.out.println("x muss so oft verdoppelt werden: " + zaehler);
    }    
}
