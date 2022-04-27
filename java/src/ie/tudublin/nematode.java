package ie.tudublin;

import java.util.ArrayList;

import processing.data.TableRow;
import processing.core.PApplet;
import processing.data.Table;


public class NematodeVisualiser extends PApplet
{
     public String toString() {
        return "nematode [end=" + end + "]";
    }
    ArrayList<nematode> nematodes = new ArrayList<nematode>();


    public void settings()
    {
        size(300, 500);

        loadNematodes();
        printnematodes();
    }

    public void setup()
    {
        colorMode(HSB);
    }


    public void loadnematodes()
    {
        Table table = loadTable("nematodes.csv", "header");

        for(TableRow row:table.rows())
        {
            nematode nematode = new nematode(row);
            nematodes.add(nematode);
        }

    }

    public void printnematodes()
    {
        for(nematode r:nematodes)
        {
            println(r);
        }
    }

}
