
/**
 * Beschreiben Sie hier die Klasse Nilpferd.
 * 
 * @author (Ihr Name) 
 * @version (eine Versionsnummer oder ein Datum)
 */
public class Nilpferd implements Audio
{
    // Instanzvariablen - ersetzen Sie das folgende Beispiel mit Ihren Variablen
    int F��e;
    String Sattelmaterial;

    /**
     * Konstruktor f�r Objekte der Klasse Nilpferd
     */
    public Nilpferd(int F��eanzahl, String Sattelmaterial)
    {
        F��e= F��eanzahl;
        Sattelmaterial= Sattelmaterial;
        
    }
    public Nilpferd()
    {
        F��e = 4;
        Sattelmaterial= "Leder";
    }
    public String lautGeben()
    {
        return "Muh";
        
    }
}
