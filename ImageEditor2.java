import java.awt.*;

public class ImageEditor2 {
    public static Picture threshold(Picture p, int thresh) {
        int w = p.width();
        int h = p.height();
        Picture newP = new Picture(w, h);
        for (int i = 0; i < w; i++) {
            for (int j = 0; j < h; j++) {
                Color curr = p.get(i, j);
                if (ImageEditor1.luminance(curr) < thresh) newP.set(i, j, Color.BLACK);
                else newP.set(i, j, ImageEditor1.toGrey(p.get(i, j)));
            }
        }
        return newP;
    }

    public static void main(String[] args) {
        Picture p = new Picture("spider.jpg");
        Picture t = threshold(p, 120);
        t.show();
    }
}
