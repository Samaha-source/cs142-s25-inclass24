package project2;

import java.awt.*;

/**
 * This class demonstrates animation by using the pause() method of SimpleCanvas.
 */
public class BouncingBall {
    public static void main(String[] args)
    {
        SimpleCanvas canvas = new SimpleCanvas(300, 200);
        int ballRadius = 25;
        // generate a random position within the confines of the canvas
        int ballXPos = (int)(Math.random() * (canvas.getWidth() - 2*ballRadius) + ballRadius);
        int ballYPos = (int)(Math.random() * (canvas.getHeight() - 2*ballRadius) + ballRadius);
        int ballXStep = 2;
        int ballYStep = 2;

        canvas.show();
        canvas.setPenColor(Color.BLUE);

        while (true)
        {
            canvas.clear();

            // move ball
            ballXPos += ballXStep;
            ballYPos += ballYStep;

            // check for walls
            if (ballXPos + ballRadius >= canvas.getWidth()) {
                ballXStep = -ballXStep;
            }
            if (ballXPos - ballRadius <= 0) {
                ballXStep = -ballXStep;
            }
            if (ballYPos + ballRadius >= canvas.getHeight()) {
                ballYStep = -ballYStep;
            }
            if (ballYPos - ballRadius <= 0) {
                ballYStep = -ballYStep;
            }

            // draw ball
            canvas.drawFilledCircle(ballXPos, ballYPos, ballRadius);
            canvas.update();
            canvas.pause(20);
        }
    }
}
