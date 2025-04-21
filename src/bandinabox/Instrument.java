package bandinabox;

import java.util.ArrayList;

public abstract class Instrument {
    private String instrumentName;

    public void setName(String iName) {
        instrumentName = iName;
    }

    public String getName() {
        return instrumentName;
    }

    public int getVolume() {
        return 64;   // values can be from 0 (silent) to 127 (as loud as possible)
    }

    public int getInstrumentNumber() {
        return 1;
    }

    public abstract ArrayList<Note> play(ArrayList<Note> song);
}
