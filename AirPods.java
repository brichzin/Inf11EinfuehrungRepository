/**
 * Wenn du keine AirPods hast hast du keine AirPods
 * 
 * @author Cornelius (mit Katja) 
 * @version 1.1
 */

public class AirPods  implements Audio
{
    String version;
    int lautst�rke;
    int akku;
        
    AirPods (String versionNeu, int lautst�rkeNeu, int akkuNeu)
    {
        version = versionNeu;
        lautst�rke = lautst�rkeNeu;
        akku = akkuNeu;
    }
    
    public String lautGeben() {
        return "lelele";
    }
}