/**
 * Wenn du keine AirPods hast hast du keine AirPods
 * 
 * @author Cornelius (mit Katja) 
 * @version 1.1
 */

public class AirPods  implements Audio
{
    String version;
    int lautstärke;
    int akku;
        
    AirPods (String versionNeu, int lautstärkeNeu, int akkuNeu)
    {
        version = versionNeu;
        lautstärke = lautstärkeNeu;
        akku = akkuNeu;
    }
    
    public String lautGeben() {
        return "lelele";
    }
}