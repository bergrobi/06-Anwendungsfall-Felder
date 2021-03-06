package control;

import model.CompactDisc;

/**
 * Created by Jean-Pierre on 21.10.2016.
 */
public class CDCollectionHandler {

    private CompactDisc[][] allCDs;

    /**
     * Die Anzahl an Platzgrößen gibt die Anzahl an CD-Ständern vor - hier 4.
     * Die CD-Ständer an sich sind so groß wie die jeweilige Platzgröße.
     * @param amounts - Platzgrößen der einzelnen CD-Ständer.
     */
    public CDCollectionHandler(int[] amounts){
        //TODO: 01 - Konstruktor fertigstellen.
        /*
        CompactDisc[][] allCDs = new CompactDisc[4][];
        allCDs[] = new CompactDisc[amounts[]]
         */
        allCDs = new CompactDisc[amounts.length][];
        for(int i = 0; i < allCDs.length; i++){
            allCDs[i] = new CompactDisc[amounts[i]];
        }

    }

    /**
     *
     * @param box - Array_Index vom Gewählten CD-Ständer
     * @param place - Array_Index vom Gewählte Platz
     * @param artist - Künstername/Bandname
     * @param title - Albumtitel
     * @return - true, falls ein Platz frei war und die CD hinzugefügt werden konnte, sonst false.
     */
    public boolean addNewCD(int box, int place, String artist, String title){
        //TODO: 02 - Hinzufügen einer CD
        if (allCDs[box][place] == null){
            allCDs[box][place] = new CompactDisc(artist, title);
            return true;
        }
        return false;
    }

    /**
     * Diese Methode dient dazu, die Daten einer bestimmten Position im zweidimensionalem Array auszugeben.
     * @param box - Gewählter CD-Ständer
     * @param place - Gewählter Platz
     * @return - Entweder ein String-Array mit "Künstler" - "Titel" oder mit "Empty" - "Empty".
     */
    public String[] getInfo(int box, int place) {
        String[] output = new String[2];
        //TODO: 03 - Informationen zu einer bestimmen CD
        if (allCDs[box][place] == null) {
            output[0] = "Empty";
            output[1] = "Empty";
        }else{
            output[0] = allCDs[box][place].getArtist();
            output[1] = allCDs[box][place].getTitle();
        }
        return output;
    }

    /**
     * Diese Methode dient dem Entfernen einer CD.
     * @param box - Gewählter CD-Ständer
     * @param place - Gewählter Platz
     * @return - true, falls eine vorhandene CD entfernt wurde, false, falls keine Cd zum entfernen vorhanden war.
     */
    public boolean releaseCD(int box, int place){
        //TODO: 04 - Entfernen einer bestimmten CD
        if (allCDs[box][place] != null){
            allCDs[box][place] = null;
            return true;
        }
        return false;
    }

    /**
     * Diese Methode dient dazu, die enthaltenen Daten aufzubereiten und als String-Array auszugeben.
     * @param index - CD-Ständer, um den es sich handelt.
     * @return Ein Array, das abwechselnd den jeweiligen Künstler und den jeweiligen Albumtitel enthält. Leere Plätze werden mit "Empty" gefüllt.
     */
    public String[] getAllCDsFrom(int index){
        //TODO: 05 - Vollständige Informationsausgabe aller CDs - Nach Fertigstellung im MainPanelHandler Zeile 165-167 entkommentieren
        String[] output = new String[allCDs[index].length*2];
        for (int i = 0; i < allCDs[index].length; i++){
            if (allCDs[index][i] == null){
                output[i*2] = "Empty";
                output[i*2+1] = "Empty";
            }else{
                output[i*2] = allCDs[index][i].getArtist();
                output[i*2+1] = allCDs[index][i].getTitle();
            }
        }
        return output;
    }

    /**
     * Diese Methode dient dazu, einen CD-Ständer zu komprimieren. Dabei rücken spätere CDs einfach auf. Die vorhandene Sortierung bleibt erhalten.
     * @param box - Gewählter CD-Ständer
     */
    public void pack(int box){
        //TODO: 06 - Komprimieren eines CD-Ständers, von unten nach oben
        for (int i= 0; i < allCDs[box].length; i++){
            if (allCDs[box][i] == null) {
                allCDs[box];
                allCDs[box];
            }
        }

    }

    /**
     * Diese Methode dient dazu, einen CD-Ständer zu sortieren nach Artist+Title. Gleichzeitig wird der CD-Ständer komprimiert.
     * @param box - Gewählter CD-Ständer
     */
    public void sort(int box){
        //TODO: 07 - Sortieren eines CD-Ständers
    }
}
