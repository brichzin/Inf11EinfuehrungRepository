
/**
  
 * @author (Maxi, Yannick) 
 * @version (5.5.2020)
 */
public  class DACHS implements Audio
{
    // Instanzvariablen - ersetzen Sie das folgende Beispiel mit Ihren Variablen
    int alter;
    int gewicht;
    
   /**
     * Konstruktor für Objekte der Klasse AAL
     */
    public DACHS(int alterNeu, int gewichtNeu)
    {
       alter = alterNeu;
       gewicht = gewichtNeu;
        
    }
   public String lautGeben()
   {
       return "Knurrrr";
       
    }
    
}
