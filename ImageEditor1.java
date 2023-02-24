import java.awt.*;
public class ImageEditor1 {
    public static double luminance(Color color) {
        double luminance;
        luminance = 0.299 * color.getRed() + 0.587 * color.getGreen() + 0.114 * color.getBlue();
        return luminance;
    }

    public static Color toGrey(Color color) {
        int val = (int) Math.round(luminance(color));
        return (new Color(val, val, val));
    }

    public static Picture makeGreyscale(Picture pic) {
        int w = pic.width();
        int h = pic.height();
        Picture newP = new Picture(w,h);
        for (int i = 0; i < w; i++) {
            for (int j = 0; j < h; j++) {
                newP.set(i, j, toGrey(pic.get(i, j)));
            }
        }
        return newP;
    }

    public static void main(String[] args) {
        Picture p = new Picture("spider.jpg"); // or use any other colour image
        Picture greyscale = makeGreyscale(p);
        greyscale.show();
    }
}
