
/**
 * Beschreiben Sie hier die Klasse Nilpferd.
 * 
 * @author (Ihr Name) 
 * @version (eine Versionsnummer oder ein Datum)
 */
public class Nilpferd

{
    int gewicht;
    int hunger;

    /**
     * Konstruktor f�r Objekte der Klasse Nilpferd
     */
    public Nilpferd(int gewichtNeu, int hungerNeu)
    {
        gewicht = gewichtNeu;
        hunger = hungerNeu;
    }

    /**
     * Ein Beispiel einer Methode - ersetzen Sie diesen Kommentar mit Ihrem eigenen
     * 
     * @param  y    ein Beispielparameter f�r eine Methode
     * @return        die Summe aus x und y
     */
    public String lautGeben()
    {
        return "br�ll";
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
