public class Hund implements Audio
{
    int alter;
    int gewicht;
    
    Hund(int alterNeu, int gewichtNeu)
    {
        gewicht = gewichtNeu;
        alter = alterNeu;
    }
    public int GewichtGeben()
    {
        return gewicht;
    }
    public void GewichtSetzen(int gewichtNeu)
    {
          gewicht = gewichtNeu;
    }
    public int AlterGeben()
    {
        return alter;
    }
    public void AlterSetzen(int alterNeu)
    {
       alter = alterNeu; 
    }
    
    public String lautGeben() {
        return "Wuff";
    }
}
