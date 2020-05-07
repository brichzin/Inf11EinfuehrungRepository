
/**
 * Beschreiben Sie hier die Klasse LUCHS.
 * 
 * @author (Ihr Name) 
 * @version (eine Versionsnummer oder ein Datum)
 */
public class LUCHS implements Audio
{
    // Instanzvariablen - ersetzen Sie das folgende Beispiel mit Ihren Variablen
    int alter;
    int länge;

    /**
     * Konstruktor für Objekte der Klasse LUCHS
     */
    public LUCHS(int längeNeu, int alterNeu)
    {
        // Instanzvariable initialisieren
        alter = alterNeu;
        länge = längeNeu;
        alter = 30;
        
    }

    /**
     * Ein Beispiel einer Methode - ersetzen Sie diesen Kommentar mit Ihrem eigenen
     * 
     * @param  y    ein Beispielparameter für eine Methode
     * @return        die Summe aus x und y
     */
    public int gewichtgeben(int gewicht)
    {
        // tragen Sie hier den Code ein
        return gewicht;
    }
    
    public String lautGeben() {
        return "au";
    }
    
    public void längeSetzen(int längeNeu)
    {
        // tragen Sie hier den Code ein
        länge = längeNeu;
    }
    
    
    
}
