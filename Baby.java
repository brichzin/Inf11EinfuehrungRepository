/**
 * Abstrakte Klasse Baby - beschreiben Sie hier die Klasse
 * 
 * @author (Katerina Musienko & Cornelius Stadler)
 * @version (30.4.20)
 */
public abstract class Baby implements Audio
{
    
    int alterinMonaten;
    int aufregungsstufe;

    Baby(int alterNeu, int aufregungNeu)
    {
        alterinMonaten = alterNeu;
        aufregungsstufe = aufregungNeu;
    }
    public String weinen() 
    {
         return "Waaaahhhhh";
    }
}
