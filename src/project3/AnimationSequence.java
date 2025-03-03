package project3;
/**
 * An AnimationSequence is a collection of animations.  Each animation is either a translation or
 * rotation applied to a ComboPolygon.  Because each animation starts and ends at a specific moment
 * in time, we can use this class to begin and end animations whenever we want, running them simultaneously
 * or in a sequence.
 */
public class AnimationSequence {
    private TranslationAnimation[] translations;
    private RotationAnimation[] rotations;
    private int nextTransIndex, nextRotIndex;

    public AnimationSequence(int numTranslations, int numRotations) {
        translations = new TranslationAnimation[numTranslations];
        rotations = new RotationAnimation[numRotations];
        nextTransIndex = 0;
        nextRotIndex = 0;
    }

    /** Add a new TranslationAnimation to this sequence. */
    public void addTranslation(TranslationAnimation t)
    {
        // your code here
    }

    /** Add a new RotationAnimation to this sequence. */
    public void addRotation(RotationAnimation t)
    {
        // your code here
    }

    /** Retrieve the total time this AnimationSequence will last. */
    private int getMaxTime()
    {
        // Return the largest ending time of all the translations and rotations.
        return 0; // remove this when you
    }

    public void playOn(SimpleCanvas canvas)
    {
        // Display all the initial polygons, before they start moving.
        for (int i = 0; i < translations.length; i++) {
            translations[i].getPolygon().drawOn(canvas);
        }

        for (int i = 0; i < rotations.length; i++) {
            rotations[i].getPolygon().drawOn(canvas);
        }
        canvas.update();
        canvas.waitForClick();

        // Make a loop that advances through each frame of the animation draws it on the canvas.

        // Pseudocode for this loop:
        // Loop over a time variable that counts from time = 0 to time = total time of all the animations, counting by 20ms increments.
        //    Clear the canvas.
        //    Loop over each translation animation:
        //        If the current time >= the time the animation should start and < the time it should end:
        //            Advance the animation to the next frame
        //        Draw the animation's polygon on the canvas
        //
        //    Loop over each translation animation:
        //        If the current time >= the time the animation should start and < the time it should end:
        //            Advance the animation to the next frame
        //        Draw the animation's polygon on the canvas
        //
        //    Call canvas.update() (to actually show the polygons)
        //    Pause for 20ms.

    }

}

