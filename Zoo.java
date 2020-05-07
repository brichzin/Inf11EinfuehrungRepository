
/**
 * Beschreiben Sie hier die Klasse Zoo.
 * 
 * @author (Ihr Name) 
 * @version (eine Versionsnummer oder ein Datum)
 */
public class Zoo
{
    Audio[] tiere;
    AirPods airpods;
    Baby baby;
    LUCHS luchs;
    LOEWE loewe;
    Hund hund;
    KATZE katze;
    Wildes_Monster_richy monster;
    
    /**
     * Konstruktor für Objekte der Klasse Zoo
     */
    public Zoo()
    {
      airpods=new AirPods("eins",1,1);
        baby= new Baby(1,1);
        luchs= new LUCHS(1,1);
        loewe= new LOEWE(1,1);
        hund= new Hund(1,1);
        katze= new KATZE(1,1,1);
        monster= new Wildes_Monster_richy();
        
        tiere =new Audio[7];
      tiere[0]=airpods;
      tiere[1]=baby;
      tiere[2]=luchs;
      tiere[3]=loewe;
      tiere[4]=hund;
      tiere[5]=katze;
      tiere[6]=monster;
    }

    /**
     * Ein Beispiel einer Methode - ersetzen Sie diesen Kommentar mit Ihrem eigenen
     * 
     * @param  y    ein Beispielparameter für eine Methode
     * @return        die Summe aus x und y
     */
    public void lauteGeben()
    {
       for(int i=0;i<tiere.length;i+=1)
       {
           System.out.println( tiere[i].lautGeben());
        }
       
    }
}
