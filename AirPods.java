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