
/**
 * Beschreiben Sie hier die Klasse BAER.
 * 
 * @author (Matthias) 
 * @version (eine Versionsnummer oder ein Datum)
 */
public class BAER implements Audio
{
    // Instanzvariablen - ersetzen Sie das folgende Beispiel mit Ihren Variablen
    private int gewicht;
    private int hunger;
    /**
     * Konstruktor für Objekte der Klasse BAER
     */
    public BAER(int gewichtNeu, int hungerNeu)
    {
        gewicht = gewichtNeu;
    }

    /**
     * Ein Beispiel einer Methode - ersetzen Sie diesen Kommentar mit Ihrem eigenen
     * 
     * @param  y    ein Beispielparameter für eine Methode
     * @return        die Summe aus x und y
     */
    public String lautGeben()
    {
        return "Brüll";
    }

    public int gewichtGeben()
    {
        return gewicht;
    }

    public int hungerGeben()
    {
        return hunger;
    }
}
