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
        alterinMonaten = 6;
        aufregungsstufe = 2;
         if(aufregungsstufe>=3)
        {
            weinen();
        }
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
    
    public int AlterGeben()
    {
    return alterinMonaten;
    }
    
    public int AufregungGeben()
    {
    return aufregungsstufe;
    }
}
