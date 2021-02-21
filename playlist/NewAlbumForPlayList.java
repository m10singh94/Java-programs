// recreating album class with inner class keeping the main and song class unchanged.
import java.util.ArrayList;
import java.util.LinkedList;

public class NewAlbumForPlayList
{
    public String albumName;
    private SongList songs;
    public NewAlbumForPlayList(String albumName)
    {
        this.albumName = albumName;
        this.songs = new SongList();
    }
    public String getAlbumName()
    {
        return albumName;
    }
    public ArrayList<Song> getList()
    {
        return songs.getSongList();
    }
    public void addSong(String trackName, double durationOfSong)
    {
        songs.add(trackName, durationOfSong);
    }
    public boolean addSongToPlaylist(int trackNumber, LinkedList<Song> playList)
    {
        Song checkedSong = this.songs.findSong(trackNumber);
        if(checkedSong != null)
        {
            playList.add(checkedSong);
            return true;
        }
        System.out.println("Track " + trackNumber + " not present in the album " + getAlbumName());
        return false;
    }
    public boolean addSongToPlaylist(String trackName, LinkedList<Song> playList)
    {
        Song checkedSong = this.songs.findSong(trackName);
        if(checkedSong != null)
        {
            playList.add(checkedSong);
            return true;
        }
        System.out.println("Track " + trackName + " not present in the album " + getAlbumName());
        return false;
    }
    private class SongList
    {
        private ArrayList<Song> songList;
        public SongList()
        {
            this.songList = new ArrayList<Song>();
        }
        public ArrayList<Song> getSongList()
        {
            return this.songList;
        }
        public boolean add(String trackName, double durationOfSong)
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
        private Song findSong(int trackNumber)
        {
            int index = trackNumber - 1;
            if(index >= 0 && index < songList.size())
                return songList.get(index);
            else return null;
        }
    }
}