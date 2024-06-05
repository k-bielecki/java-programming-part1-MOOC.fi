
public class Song {

    private String artist;
    private String name;
    private int durationInSeconds;

    public Song(String artist, String name, int durationInSeconds) {
        this.artist = artist;
        this.name = name;
        this.durationInSeconds = durationInSeconds;
    }

    public boolean equals (Object similar) {

        if (this == similar) {
            return true;
        }

        if (!(similar instanceof Song)) {
            return false;
        }

        Song similarSong = (Song) similar;

        if (this.artist.equals(similarSong.artist) &&
            this.name.equals(similarSong.name) &&
            this.durationInSeconds == similarSong.durationInSeconds) {

            return true;
        }

        return false;
    }

    @Override
    public String toString() {
        return this.artist + ": " + this.name + " (" + this.durationInSeconds + " s)";
    }


}
