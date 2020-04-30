/**
 * Abstrakte Klasse Baby - beschreiben Sie hier die Klasse
 * 
 * @author (Katerina Musienko & Cornelius Stadler)
 * @version (30.4.20)
 */
public class Baby implements Audio
{
    
    int alterinMonaten;
    int aufregungsstufe;

    Baby(int alterNeu, int aufregungNeu)
    {
        alterinMonaten = alterNeu;
        aufregungsstufe = aufregungNeu;

    }

    public void setAufregungsstufe(int aufregungsstufe) {
        this.aufregungsstufe = aufregungsstufe;
    }

    public String weinen()
    {
         return "Waaaahhhhh";
    }

    public String essen() {
        return "Mampf";
    }

    public String schlafen() {
        return "Chrrrrrr";
    }

    @Override
    public String lautGeben() {
        if(aufregungsstufe == 1) {
            return schlafen();
        } else if(aufregungsstufe == 2) {
            return essen();
        } else {
            return weinen();
        }
    }
}
