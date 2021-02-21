import java.util.ArrayList;
import java.util.LinkedList;

public class Album
{
    private String albumName;
    private ArrayList<Song> songList = new ArrayList<Song>();

    public Album(String albumName, String trackName, double durationOfSong)
    {
        this.albumName = albumName;
        addSong(trackName, durationOfSong);
    }
    public String getAlbumName()
    {
        return albumName;
    }
    public ArrayList<Song> getSongList()
    {
        return this.songList;
    }
    public boolean addSong(String trackName, double durationOfSong)
    {
        if(findSong(trackName) == null)
        {
            songList.add(new Song(trackName, durationOfSong));
            return true;
        }
        System.out.println("Song already exists.");
        return false;
    }
    private Song findSong(String trackName)
    {
        for(int i = 0; i < songList.size(); i++)
        {
            Song currentSong = songList.get(i);
            if(currentSong.getTrackName().equals(trackName))
                return currentSong;
        }
        return null;
    }
    public boolean addSongToPlaylist(int trackNumber, LinkedList<Song> playList)
    {
        int index = trackNumber - 1;
        if((index >= 0) && (index < songList.size()))
        {
            playList.add(songList.get(index));
            return true;
        }
        System.out.println("Track " + trackNumber + " not present in the album " + getAlbumName());
        return false;
    }
    public boolean addSongToPlaylist(String trackName, LinkedList<Song> playList)
    {
        Song checkedSong = findSong(trackName);
        if(checkedSong != null)
        {
            playList.add(checkedSong);
            return true;
        }
        System.out.println("Track " + trackName + " not present in the album " + getAlbumName());
        return false;
    }
}