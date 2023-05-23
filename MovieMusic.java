/*
 * Write a program, to implement the following hierarchy. Displays information of each class the rectangle represents the classes. The classes Movie and MusicVideo inherits all the members of the class VideoTape.

 */

import java.lang.constant.DirectMethodHandleDesc;

class VideoTape {
    String title;
    int lengthMin;
    boolean isAvailable;

    void add(String title, int lengthMin, boolean isAvailable) {
        this.title = title;
        this.lengthMin = lengthMin;
        this.isAvailable = isAvailable;
    }

    void show() {
        System.out.println("Title : " + title);
        System.out.println("Length (In Min) : " + lengthMin);
        System.out.println("Available : " + isAvailable);
    }
}

class Movie extends VideoTape {
    int directorRating;

    void add(String title, int lengthMin, boolean isAvailable, int directorRating) {
        super.add(title, lengthMin, isAvailable);
        this.directorRating = directorRating;
    }

    void show() {
        System.out.println("############################");
        System.out.println("         MOVIE");
        System.out.println("############################");

        super.show();
        System.out.println("Director's Rating  : " + directorRating);

    }
}

class MusicVideo extends VideoTape {
    String artistCat;

    void add(String title, int lengthMin, boolean isAvailable, String artistCat) {
        super.add(title, lengthMin, isAvailable);
        this.artistCat = artistCat;
    }

    void show() {
        System.out.println("############################");
        System.out.println("         MUSIC VIDEO");
        System.out.println("############################");

        super.show();
        System.out.println("Artist's Category  : " + artistCat);

    }
}

public class MovieMusic {
    public static void main(String[] args) {
        Movie inception = new Movie();
        inception.add("Inception", 213, true, 9);
        inception.show();

        MusicVideo withoutme = new MusicVideo();
        withoutme.add("Without me", 4, true, "hiphop");
        withoutme.show();
    }
}
