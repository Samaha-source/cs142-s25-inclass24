package bandinabox;

import java.util.ArrayList;

public class Guitar extends Instrument {

    public Guitar() {
        setName("Guitar");
    }

    public int getInstrumentNumber() {
        return 25;
    }

    @Override
    public ArrayList<Note> play(ArrayList<Note> song) {
        return song;
    }
}