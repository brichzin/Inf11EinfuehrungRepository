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