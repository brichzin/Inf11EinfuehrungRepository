
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
    int l�nge;

    /**
     * Konstruktor f�r Objekte der Klasse LUCHS
     */
    public LUCHS(int l�ngeNeu, int alterNeu)
    {
        // Instanzvariable initialisieren
        alter = alterNeu;
        l�nge = l�ngeNeu;
        alter = 30;
        
    }

    /**
     * Ein Beispiel einer Methode - ersetzen Sie diesen Kommentar mit Ihrem eigenen
     * 
     * @param  y    ein Beispielparameter f�r eine Methode
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
    
    public void l�ngeSetzen(int l�ngeNeu)
    {
        // tragen Sie hier den Code ein
        l�nge = l�ngeNeu;
    }
    
    
    
}
