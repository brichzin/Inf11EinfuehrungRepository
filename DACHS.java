
/**
 * Beschreiben Sie hier die Klasse AAL.
 * 
 * @author (Ihr Name) 
 * @version (eine Versionsnummer oder ein Datum)
 */
public  class DACHS implements  Audio
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
