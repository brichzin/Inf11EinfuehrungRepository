
/**
 * Beschreiben Sie hier die Klasse ROTERPANDA.
 * 
 * @author (Ihr Name) 
 * @version (eine Versionsnummer oder ein Datum)
 */
public class ROTERPANDA implements Audio
{
    int alter;
    int gewicht;
    public ROTERPANDA(int alterNeu, int gewichtNeu)
    {
        alter = alterNeu;
        gewicht = gewichtNeu;
    }
    public String lautGeben()
    {
        return "silence";
    }

    public int alterGeben()
    {
        return alter;
    }
    public int gewichtGeben()
    {
        return gewicht;
    }
}
