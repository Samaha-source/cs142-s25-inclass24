package oop1;

import javax.swing.*;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.lang.reflect.InvocationTargetException;
import java.net.MalformedURLException;
import java.net.URL;

public class SimpleCanvas {
    private JFrame frame;
    private Graphics2D onscreenGraphics;
    private BufferedImage onscreenImage;
    //private Color penColor;
    private int height, width;

    public SimpleCanvas(int width, int height)
    {
        this(width, height, "SimpleCanvas");
    }

    public SimpleCanvas(int width, int height, String title)
    {
        this.height = height;
        this.width = width;
        //penColor = Color.BLACK;

        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                frame = new JFrame(title);
                frame.setVisible(false);
                onscreenImage = new BufferedImage(2*width, 2*height, BufferedImage.TYPE_INT_ARGB);
                onscreenGraphics = onscreenImage.createGraphics();
                onscreenGraphics.scale(2, 2);
                onscreenGraphics.setColor(Color.WHITE);
                onscreenGraphics.fillRect(0, 0, width, height);

                onscreenGraphics.setColor(Color.BLACK);

                // add antialiasing
                RenderingHints hints = new RenderingHints(RenderingHints.KEY_ANTIALIASING,
                        RenderingHints.VALUE_ANTIALIAS_ON);
                hints.put(RenderingHints.KEY_RENDERING, RenderingHints.VALUE_RENDER_QUALITY);
                onscreenGraphics.addRenderingHints(hints);

                // frame stuff
                RetinaImageIcon icon = new RetinaImageIcon(onscreenImage);
                JLabel draw = new JLabel(icon);
                frame.setContentPane(draw);
                frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                frame.setResizable(false);
                frame.pack();
            }
        });

    }

    public void drawCircle(int centerX, int centerY, int radius)
    {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                onscreenGraphics.drawOval(centerX - radius, centerY - radius, radius * 2, radius * 2);
                //frame.repaint();
            }
        });
    }

    public void drawOval(int centerX, int centerY, int radiusX, int radiusY)
    {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                onscreenGraphics.drawOval(centerX - radiusX, centerY - radiusY, radiusX * 2, radiusY * 2);
                //frame.repaint();
            }
        });
    }

    public void drawRectangle(int topLeftX, int topLeftY, int width, int height)
    {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                onscreenGraphics.drawRect(topLeftX, topLeftY, width, height);
                //frame.repaint();
            }
        });
    }

    public void drawFilledCircle(int centerX, int centerY, int radius)
    {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                onscreenGraphics.fillOval(centerX - radius, centerY - radius, radius * 2, radius * 2);
                //onscreenImage.
                //frame.repaint();
            }
        });
    }

    public void drawFilledOval(int centerX, int centerY, int radiusX, int radiusY)
    {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                onscreenGraphics.fillOval(centerX - radiusX, centerY - radiusY, radiusX * 2, radiusY * 2);
                //onscreenImage.
                //frame.repaint();
            }
        });
    }

    public void drawFilledRectangle(int topLeftX, int topLeftY, int width, int height)
    {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                onscreenGraphics.fillRect(topLeftX, topLeftY, width, height);
                //onscreenImage.
                //frame.repaint();
            }
        });
    }

    public void drawLine(int x1, int y1, int x2, int y2)
    {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                onscreenGraphics.drawLine(x1, y1, x2, y2);
            }
        });
    }

    public void drawString(int x, int y, String text)
    {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                onscreenGraphics.drawString(text, x, y);
            }
        });
    }

    public void setLineThickness(int size)
    {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                onscreenGraphics.setStroke(new BasicStroke(size));
            }
        });
    }

    public void drawImage(int x, int y, String filename)
    {
        Image image = getImage(filename);
        // int ws = image.getWidth();    // can call only if image is a BufferedImage
        // int hs = image.getHeight();
        int ws = image.getWidth(null);
        int hs = image.getHeight(null);
        int xs = x * 2;
        int ys = y * 2;
        if (ws < 0 || hs < 0) throw new IllegalArgumentException("image " + filename + " is corrupt");

        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                //onscreenGraphics.drawImage(image, (int) Math.round(xs - ws/2.0), (int) Math.round(ys - hs/2.0), null);
                onscreenGraphics.drawImage(image, x, y, null);
                //frame.repaint();
            }
        });
    }

    public void setPenColor(Color c)
    {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                onscreenGraphics.setColor(c);
            }
        });
    }

    public Color getPixelColor(int x, int y)
    {
        final Color[] answer = new Color[1];
        try {
            SwingUtilities.invokeAndWait(new Runnable() {
                @Override
                public void run() {
                    answer[0] = new Color(onscreenImage.getRGB(2*x, 2*y), true);
                }
            });
        } catch (InterruptedException e) {
            e.printStackTrace();
        } catch (InvocationTargetException e) {
            e.printStackTrace();
        }
        return answer[0];
    }

    public void setPixelColor(int x, int y, Color c)
    {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                onscreenImage.setRGB(2 * x, 2 * y, c.getRGB());
                //frame.repaint();
            }
        });
    }

    public void show()
    {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                update();
                frame.setVisible(true);
            }
        });
    }

    public void hide()
    {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                frame.setVisible(false);
            }
        });
    }

    public int getHeight()
    {
        return height;
    }

    public int getWidth()
    {
        return width;
    }

    public void update()
    {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                frame.repaint();
            }
        });

    }

    private static class RetinaImageIcon extends ImageIcon {

        public RetinaImageIcon(Image image) {
            super(image);
        }

        public int getIconWidth() {
            return super.getIconWidth() / 2;
        }

        /**
         * Gets the height of the icon.
         *
         * @return the height in pixels of this icon
         */
        public int getIconHeight() {
            return super.getIconHeight() / 2;
        }

        public synchronized void paintIcon(Component c, Graphics g, int x, int y) {
            Graphics2D g2 = (Graphics2D) g.create();
            g2.setRenderingHint(RenderingHints.KEY_INTERPOLATION,RenderingHints.VALUE_INTERPOLATION_BICUBIC);
            g2.setRenderingHint(RenderingHints.KEY_RENDERING,RenderingHints.VALUE_RENDER_QUALITY);
            g2.setRenderingHint(RenderingHints.KEY_ANTIALIASING,RenderingHints.VALUE_ANTIALIAS_ON);
            g2.scale(0.5, 0.5);
            super.paintIcon(c, g2, x * 2, y * 2);
            g2.dispose();
        }
    }

    private static Image getImage(String filename) {
        if (filename == null) throw new IllegalArgumentException();

        // to read from file
        ImageIcon icon = new ImageIcon(filename);

        // try to read from URL
        if ((icon == null) || (icon.getImageLoadStatus() != MediaTracker.COMPLETE)) {
            try {
                URL url = new URL(filename);
                icon = new ImageIcon(url);
            }
            catch (MalformedURLException e) {
                /* not a url */
            }
        }

        // in case file is inside a .jar (classpath relative to StdDraw)
        if ((icon == null) || (icon.getImageLoadStatus() != MediaTracker.COMPLETE)) {
            URL url = SimpleCanvas.class.getResource(filename);
            if (url != null)
                icon = new ImageIcon(url);
        }

        // in case file is inside a .jar (classpath relative to root of jar)
        if ((icon == null) || (icon.getImageLoadStatus() != MediaTracker.COMPLETE)) {
            URL url = SimpleCanvas.class.getResource("/" + filename);
            if (url == null) throw new IllegalArgumentException("image " + filename + " not found");
            icon = new ImageIcon(url);
        }

        return icon.getImage();
    }


}
