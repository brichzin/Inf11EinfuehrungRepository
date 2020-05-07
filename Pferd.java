
/**
 * Beschreiben Sie hier die Klasse Pferd.
 * 
 * @author (Ben und Baran) 
 * @version (eine Versionsnummer oder ein Datum)
 */
public class Pferd implements Audio
{
    // Instanzvariablen - ersetzen Sie das folgende Beispiel mit Ihren Variablen
    private int alter;
    private String Name;

    /**
     * Konstruktor für Objekte der Klasse Pferd
     */
    public Pferd(int neuesAlter,String neuerName)
    {
        alter= neuesAlter;
        Name= neuerName;
    }
    
    public Pferd()
    {
        alter = 0;
        Name = "Hahaha";
    }
    
    public int GetAlter()
    {
        return alter;
    }
    
    public String GetName()
    {
        return Name;
    }
    
    public String lautGeben()
    {
        return "Welchen Laut geben Pferde?";
    }
    
    public void AlterSetzen(int neuesAlter)
    {
        alter = neuesAlter;
    }
    
    public void NameSetzen(String neuerName)
    {
        Name = neuerName;
    }

    
}
