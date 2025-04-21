package bandinabox;

import java.util.ArrayList;

public class Bass extends Instrument {

    public int getInstrumentNumber() {
        return 33;
    }

    public int getVolume() {
        return 127;
    }

    @Override
    public ArrayList<Note> play(ArrayList<Note> song) {
        ArrayList<Note> bassNotes = new ArrayList<Note>();

        for (int i = 0; i < song.size(); i++) {
            if (i % 4 == 0) {
                Note note = song.get(i);
                Note bassNote = new Note(note.getPitch(), note.getOctave() - 1);
                bassNotes.add(bassNote);
            }
            else {
                bassNotes.add(null);
            }

        }
        return bassNotes;
    }
}