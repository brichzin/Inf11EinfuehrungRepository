
/**
 * Beschreiben Sie hier die Klasse Elefant.
 * 
 * @author (Ihr Name) 
 * @version (eine Versionsnummer oder ein Datum)
 */
public class ELEFANT implements Audio
{
    // Instanzvariablen - ersetzen Sie das folgende Beispiel mit Ihren Variablen
     int alter;
     int gewicht;
     
    /**
     * Konstruktor f黵 Objekte der Klasse Elefant
     */
    public ELEFANT (int alterNeu, int gewichtNeu )
    {
       alter= 200;
       gewicht= 100;
       alter = alterNeu;
       gewicht = gewichtNeu;
    } 
    public String lautGeben()
    {
        return "T諶RRRRRRRRRRRRR种种种种种种种HHHHHHHHHH";
    }
    int alterGeben()
    {
        return alter;
        
}  int gewichtGeben()
{
    return gewicht;
}
 }


