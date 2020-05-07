
/**
 * Beschreiben Sie hier die Klasse LUCHS.
 * 
 * @author (Ihr Name) 
 * @version (eine Versionsnummer oder ein Datum)
 */
public class LUCHS implements Audio
{
    // Instanzvariablen - ersetzen Sie das folgende Beispiel mit Ihren Variablen
    int gewicht;
    int länge;

    /**
     * Konstruktor für Objekte der Klasse LUCHS
     */
    public LUCHS(int gewichtNeu, int längeNeu)
    {
        // Instanzvariable initialisieren
        gewicht = gewichtNeu;
        länge = längeNeu;
    }

    /**
     * Ein Beispiel einer Methode - ersetzen Sie diesen Kommentar mit Ihrem eigenen
     * 
     * @param  y    ein Beispielparameter für eine Methode
     * @return        die Summe aus x und y
     */
    public int gewichtgeben(int gewicht)
    {
         
        return gewicht;
    }
    
    public String lautGeben() {
        return "au";
    }
    
    public void längeSetzen(int längeNeu)
    {
        
        länge = längeNeu;
    }
    
    public void alterSetzen(int gewichtNeu)
    {
        gewicht = gewichtNeu;
    }
    
    
}
