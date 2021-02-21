public class Song
{
    private String trackName;
    private double durationOfSong;

    public Song(String trackName, double durationOfSong)
    {
        this.trackName = trackName;
        this.durationOfSong = durationOfSong;
    }
    public String getTrackName()
    {
        return trackName;
    }
    public double getDurationOfSong()
    {
        return durationOfSong;
    }
    @Override
    public String toString()
    {
        return this.trackName + " : " + this.durationOfSong;
    }
}