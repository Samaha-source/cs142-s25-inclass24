package bandinabox;

public class Note {
    private char pitch;
    private int octave;

    public Note(char pitch, int octave) {
        this.pitch = pitch;
        this.octave = octave;
    }

    public String toString() {
        return "" + pitch + octave;   // the "" at the front forces everything into a string
    }

    public char getPitch() {
        return pitch;
    }

    public int getOctave() {
        return octave;
    }
}
