/**
 * Wenn du keine AirPods hast hast du keine AirPods
 * 
 * welcher hund hat an den airpods rumgebastelt?
 * 
 * @author Cornelius (mit Katja) 
 * @version 1.1
 */

public class AirPods  implements Audio
{
    String version;
    int lautstaerkeNeu;
    int akku;
        
    AirPods (String versionNeu, int lautstaerkeNeu, int akkuNeu)
    {
        version = versionNeu;
        this.lautstaerkeNeu = lautstaerkeNeu;
        akku = akkuNeu;
    }
    
    public int lautstaerkeGeben()
    {
        return lautstaerkeNeu;
    } 
    
    public int akkuGeben()
    {
        return akku;
    }   

    public boolean AKKUALARM() {
        return akku <= 10;
    }

    public void AUFDREHEN() {
        lautstaerkeNeu = 100;
    }

    public void ENERGIE_GEBEN() {
        akku = 100;
    }

    public String lautGeben() {
        return "lelele";
    }
}