
/**
 * Beschreiben Sie hier die Klasse Nilpferd.
 * 
 * @author (Ihr Name) 
 * @version (eine Versionsnummer oder ein Datum)
 */
public class Nilpferd implements Audio
{
    // Instanzvariablen - ersetzen Sie das folgende Beispiel mit Ihren Variablen
    int Füße;
    String Sattelmaterial;

    /**
     * Konstruktor für Objekte der Klasse Nilpferd
     */
    public Nilpferd(int Füßeanzahl, String Sattelmaterial)
    {
        Füße= Füßeanzahl;
        Sattelmaterial= Sattelmaterial;
        
    }
    public Nilpferd()
    {
        Füße = 4;
        Sattelmaterial= "Leder";
    }
    public String lautGeben()
    {
        return "Muh";
        
    }
}
