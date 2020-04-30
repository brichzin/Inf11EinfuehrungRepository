
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
    public LUCHS(int gewichtNeu, int alterNeu)
    {
        // Instanzvariable initialisieren
        gewicht = gewichtNeu;
        länge = alterNeu;
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
}
