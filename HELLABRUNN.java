
/**
 * Beschreiben Sie hier die Klasse HELLABRUNN.
 * 
 * @author (Ihr Name) 
 * @version (eine Versionsnummer oder ein Datum)
 */
public class HELLABRUNN
{
    Audio tiere [];
    DACHS d1;
    AirPods ap1;
    LOEWE le1;
    Pferd p1;
    Baby b1;
    KATZE k1;
    Hund h1;
    Wildes_Monster_richy wmr1;
    ELEFANT e1;
    ROTERPANDA rp1;
    LUCHS lu1;
    /**
     * Konstruktor für Objekte der Klasse HELLABRUNN
     */
    public HELLABRUNN()
    {
        tiere = new Audio[11];
        d1=new DACHS (1,1);
        ap1=new AirPods ("hallo",1,1);
        le1=new LOEWE (1,1);
        p1=new Pferd (1,"1");
        b1=new Baby (1,1);
        k1=new KATZE (1,1);
        h1=new Hund (1,1);
        wmr1=new Wildes_Monster_richy ();
        e1=new ELEFANT (1,1);
        rp1=new ROTERPANDA(1,1);
        lu1=new LUCHS(1,1);
        
        tiere[0]=d1;
        tiere[2]=ap1;
        tiere[3]=le1;
        tiere[4]=p1;
        tiere[5]=b1;
        tiere[6]=k1;
        tiere[7]=h1;
        tiere[8]=wmr1;
        tiere[9]=e1;
        tiere[10]=rp1;
        tiere[1]=lu1;
        
    }

    public void Führung()
    {
       System.out.println("Willkommen im Tierpark Hellabrunn. Heute gibt es einen Rundgang durch alle unsere Gehege:");
       for(int i=1;i<tiere.length-1;i++)
       {
           System.out.println("nächstes Gehege");
           System.out.println(tiere[i].lautGeben());
        }
        System.out.println("Und da ist die FÜhrung auch schon wieder vorbei. Bis zum nächsten Mal!");
    }
}
