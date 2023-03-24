import java.util.ArrayList;

public class Video {
    String title;
    boolean checked;
    ArrayList<Integer> ratings = new ArrayList<>();

    public Video(String title) {
        this.title = title;
    }

    public String getTitle() {
        return title;
    }

    public boolean addRating(int rating) {
        if (1 <= rating && rating <= 5) {
            ratings.add(rating);
            return true;
        }
        else {
            System.out.println(rating + " should be between 1 and 5.");
            return false;
        }
    }

    public double getAverageRating() {
        if (ratings.size() == 0) return 0;
        int sum = 0;
        for (Integer rating : ratings) sum += rating;
        return (double) sum / ratings.size();
    }

    public boolean checkOut() {
        if (checked) {
            System.out.println(toString() + " is already checked out.");
            return false;
        }
        else {
            checked = true;
            return true;
        }
    }

    public boolean returnToStore() {
        if (!checked) {
            System.out.println(toString() + " is not checked out.");
            return false;
        }
        else {
            checked = false;
            return true;
        }
    }

    public boolean isCheckedOut() {
        return checked;
    }

    public String toString() {
        String s = "Video[title=\"" + title + "\", checkedOut=" + checked + "]";
        return s;
    }
}
