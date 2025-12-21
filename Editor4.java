import java.awt.Color;

/**
 * Morphs an image into a grayscale version.
 * use java Editor4 thor.ppm 50
 */
public class Editor4 {

    public static void main(String[] args) {
        String fileName = args[0];
        int n = Integer.parseInt(args[1]);
        Color[][] source = Runigram.read(fileName);
        Color[][] target = Runigram.grayScaled(source);
        Runigram.setCanvas(source);
        Runigram.morph(source, target, n);
    }
}
