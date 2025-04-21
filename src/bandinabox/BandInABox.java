package bandinabox;

import javax.sound.midi.MidiChannel;
import javax.sound.midi.MidiSystem;
import javax.sound.midi.MidiUnavailableException;
import javax.sound.midi.Synthesizer;
import java.util.ArrayList;

public class BandInABox {
    public static void main(String[] args) {
        ArrayList<Note> yankeeDoodle = createYankeeDoodle();
        ArrayList<Instrument> band = new ArrayList<Instrument>();

        Guitar guitar = new Guitar();
        band.add(guitar);

        // add a bass
        Bass b = new Bass();
        band.add(b);

        // add a violin
        Violin v = new Violin();
        band.add(v);

        playAll(band, yankeeDoodle);
        playAllWithSound(band, yankeeDoodle);
    }

    public static void playAll(ArrayList<Instrument> band, ArrayList<Note> song) {
        for (Instrument i : band) {
            System.out.println(i.getName());
            ArrayList<Note> notes =  i.play(song);
            for (Note n : notes) {
                if (n == null) System.out.print("   ");
                else System.out.print(n + " ");
            }
            System.out.println();
        }
    }

    public static ArrayList<Note> createYankeeDoodle() {
        ArrayList<Note> yd = new ArrayList<Note>();
        Note c4 = new Note('c', 4);
        Note d4 = new Note('d', 4);
        Note e4 = new Note('e', 4);
        Note f4 = new Note('f', 4);
        Note b3 = new Note('b', 3);
        Note a3 = new Note('a', 3);
        Note g3 = new Note('g', 3);

        // measure 1
        yd.add(c4);
        yd.add(c4);
        yd.add(d4);
        yd.add(e4);
        yd.add(c4);
        yd.add(e4);
        yd.add(d4);
        yd.add(g3);
        // measure 2
        yd.add(c4);
        yd.add(c4);
        yd.add(d4);
        yd.add(e4);
        yd.add(c4);
        yd.add(c4);
        yd.add(b3);
        yd.add(b3);
        // measure 3
        yd.add(c4);
        yd.add(c4);
        yd.add(d4);
        yd.add(e4);
        yd.add(f4);
        yd.add(e4);
        yd.add(d4);
        yd.add(c4);
        // measure 4
        yd.add(b3);
        yd.add(g3);
        yd.add(a3);
        yd.add(b3);
        yd.add(c4);
        yd.add(c4);
        yd.add(c4);
        yd.add(c4);

        return yd;
    }

    public static void playAllWithSound(ArrayList<Instrument> band, ArrayList<Note> song)
    {
        // make all parts together
        ArrayList<ArrayList<Note>> allParts = new ArrayList<>();
        for (Instrument i : band) {
            allParts.add(i.play(song));
        }
        try{
            /* Create a new Sythesizer and open it. Most of
             * the methods you will want to use to expand on this
             * example can be found in the Java documentation here:
             * https://docs.oracle.com/javase/7/docs/api/javax/sound/midi/Synthesizer.html
             */
            Synthesizer midiSynth = MidiSystem.getSynthesizer();
            midiSynth.open();

            //get and load default instrument and channel lists
            javax.sound.midi.Instrument[] instr = midiSynth.getDefaultSoundbank().getInstruments();
            //System.out.println(Arrays.toString(instr));
            MidiChannel[] mChannels = midiSynth.getChannels();
            //System.out.println(Arrays.toString(mChannels));

            midiSynth.loadInstrument(instr[100]);//load an instrument


            for (int i = 0; i < band.size(); i++) {

                mChannels[i].controlChange(7, band.get(i).getVolume());
                mChannels[i].programChange(band.get(i).getInstrumentNumber());

                /*if (band.get(i).getName().endsWith("uitar")) {
                    mChannels[i].programChange(25);
                }
                else if (band.get(i).getName().endsWith("ss")) {
                    //mChannels[i].controlChange(7, 0);
                    mChannels[i].programChange(33);
                }
                else if (band.get(i).getName().endsWith("lin")) {
                    mChannels[i].programChange(41);
                }*/
            }

            for (int numberOfNoteInSong = 0; numberOfNoteInSong < song.size(); numberOfNoteInSong++) {
                for (int i = 0; i < band.size(); i++) {
                    Note n = allParts.get(i).get(numberOfNoteInSong);
                    if (n != null) {
                        int noteNum = getMidiNumber(n);
                        mChannels[i].noteOn(noteNum, 100);
                    }
                }
                try { Thread.sleep(400); // wait time in milliseconds to control duration
                } catch( InterruptedException e ) {
                    e.printStackTrace();
                }
                for (int i = 0; i < band.size(); i++) {
                    Note n = allParts.get(i).get(numberOfNoteInSong);
                    if (n != null) {
                        int noteNum = getMidiNumber(n);
                        mChannels[i].noteOff(noteNum);
                    }
                }
            }

            //mChannels[0].programChange(0);
            //mChannels[0].noteOn(60, 100);//On channel 0, play note number 60 with velocity 100
            //mChannels[0].noteOn(72, 100);
            //try { Thread.sleep(1000); // wait time in milliseconds to control duration
            //} catch( InterruptedException e ) {
            //    e.printStackTrace();
            //}
            //mChannels[0].noteOff(60);//turn off the note
            //mChannels[0].noteOff(60);


        } catch (MidiUnavailableException e) {
            e.printStackTrace();
        }
    }

    private static int getMidiNumber(Note n)
    {
        int noteNum = 0;
        if (n.getPitch() == 'c') noteNum = 60;
        else if (n.getPitch() == 'd') noteNum = 62;
        else if (n.getPitch() == 'e') noteNum = 64;
        else if (n.getPitch() == 'f') noteNum = 65;
        else if (n.getPitch() == 'g') noteNum = 67;
        else if (n.getPitch() == 'a') noteNum = 69;
        else if (n.getPitch() == 'b') noteNum = 71;

        if (n.getOctave() == 4) return noteNum;
        else if (n.getOctave() == 3) return noteNum - 12;
        else if (n.getOctave() == 2) return noteNum - 24;
        else if (n.getOctave() == 5) return noteNum + 12;
        else if (n.getOctave() == 6) return noteNum + 24;

        return -1;
    }
}
