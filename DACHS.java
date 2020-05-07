
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
   int alterGeben()
    {
         return alter;   
    }
   int gewichtGeben()
     {
         return gewicht;
     }
   public void alterSetzen(int alterNeu)
     {
     alter = alterNeu;  
     }
   public void gewichtSetzen(int gewichtNeu)
     {
        gewicht = gewichtNeu; 
     }
   public String lautGeben()
     {
       return "Knorrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrr";
       
     }
    
}
