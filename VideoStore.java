import java.util.ArrayList;

public class VideoStore {
    ArrayList<Video> store = new ArrayList<>();

    public boolean addVideo(String title) {
        for (Video video : store) {
            if (video.getTitle().equals(title)) {
                System.out.println(title + " is already in stock.");
                return false;
            }
        }
        store.add(new Video(title));
        return true;
    }

    public Video getVideo(String title) {
        for (Video video : store) {
            if (video.getTitle().equals(title)) {
                return video;
            }
        }
        System.out.println("Sorry, cannot find the requested video in the catalogue");
        return null;
    }

    public boolean checkOutVideo(String title) {
        if (getVideo(title) == null) {
            return false;
        }
        Video video = getVideo(title);
        if (!video.checked) {
                video.checked = true;
                return true;
        }
        System.out.println(video.toString() + " is already checked out.");
        return false;
    }

    public boolean returnVideo(Video video) {
        for(Video v: store) {
            if (v == video) return video.returnToStore();
        }
        System.out.println("Sorry, this video did not come from this store");
        return false;
    }

    public void rateVideo(Video video, int rating) {
        video.addRating(rating);
    }

    public double getAverageRatingForVideo(Video video) {
        return video.getAverageRating();
    }

    public Video[] getCheckedOut() {
        ArrayList<Video> videoChecked = new ArrayList<>();
        for(Video video: store) {
            if (video.checked) videoChecked.add(video);
        }
        return videoChecked.toArray(new Video[0]);
    }

    public Video mostPopular() {
        if (store.size() == 0) return null;
        double highest = 0;
        Video popular = null;
        for (Video video: store) {
            double curr = video.getAverageRating();
            if (curr > highest) {
                highest = curr;
                popular = video;
            }
        }
        return popular;
    }

    public static void main(String[] args) {
        VideoStore videoStore = new VideoStore();
        Video unknownVideo = new Video("unknown");
        unknownVideo.checkOut();
        System.out.println(videoStore.returnVideo(unknownVideo));
    }
}
