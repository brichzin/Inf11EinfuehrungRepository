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