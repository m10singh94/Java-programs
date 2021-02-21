// using Album class
import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;
import java.util.LinkedList;
import java.util.Scanner;

public class PlayListNewAlbumMain
{
    private static ArrayList<Album> albums = new ArrayList<Album>();
    public static void main(String[] args) 
    {
        Album album = new Album("Hi", "How are you", 4.52);
        album.addSong("Costa Rica", 3.56);
        album.addSong("India", 5.42);
        albums.add(album);
        Album album_2 = new Album("Delhi", "bakwaas", 4.5);
        album_2.addSong("polluted", 2.45);
        album_2.addSong("bye bye", 3.25);
        albums.add(album_2);
        LinkedList<Song> playList = new LinkedList<>();
        albums.get(0).addSongToPlaylist("How are you", playList);
        albums.get(0).addSongToPlaylist("Costa Rica", playList);
        albums.get(1).addSongToPlaylist("bakwaas", playList);
        albums.get(1).addSongToPlaylist("say hello", playList);
        albums.get(1).addSongToPlaylist(3, playList);
        albums.get(0).addSongToPlaylist(24, playList);
        play(playList);
    }
    private static void play(LinkedList<Song> playList)
    {
        Scanner scanner = new Scanner(System.in);
        boolean quit = false;
        boolean goingForward = true;
        ListIterator<Song> listIterator = playList.listIterator();
        if(playList.size() == 0)
        {
            System.out.println("No songs in the playlist.");
        }
        else
            System.out.println("Now playing => " + listIterator.next().toString());
        printMenu();
        while(!quit)
        {      
            System.out.print("Enter your choice -> ");
            int choice = scanner.nextInt();
            scanner.nextLine();
            switch(choice)
            {
                case 0 : System.out.println("PlayList completed.");
                        quit = true;
                        break;
                case 1 : if(!goingForward)
                        {
                            if(listIterator.hasNext())
                                listIterator.next();
                            goingForward = true;
                        }
                        if(listIterator.hasNext())
                            System.out.println(listIterator.next().toString());
                        else
                        {
                            System.out.println("Reached the end of the PlayList.");
                            goingForward = false;
                        }
                        break;
                case 2 : if(goingForward)
                        {
                            if(listIterator.hasPrevious())
                                listIterator.previous();
                            goingForward = false;
                        }
                        if(listIterator.hasPrevious())
                        {
                            System.out.println(listIterator.previous().toString());
                        }
                        else
                        {
                            System.out.println("beginning of the PlayList.");
                            goingForward = true;
                        }
                        break;
                case 3 : if(goingForward)
                        {
                            System.out.println(listIterator.previous().toString());
                            goingForward = false;
                        }
                        else
                        {
                            System.out.println(listIterator.next().toString());
                            goingForward = true;
                        }
                        break;
                case 4 : printList(playList);
                        break;
                case 5 : if(playList.size() > 0)
                            listIterator.remove();
                        if(listIterator.hasNext())
                            System.out.println("Now playing " + listIterator.next().toString());
                        else if(listIterator.hasPrevious())
                            System.out.println("Now playing " + listIterator.previous().toString());
                case 6 : printMenu();
                         break;
            }
        }
        scanner.close();
    }
    public static void printMenu()
    {
        System.out.println("0 -> Quit");
        System.out.println("1 -> Skip to the next song");
        System.out.println("2 -> Skip to the previous song");
        System.out.println("3 -> Replay the song");
        System.out.println("4 -> Show the list of songs in the PlayList.");
        System.out.println("5 -> delete the current playing song.");
        System.out.println("6 -> Print Menu");
    }
    public static void printList(LinkedList<Song> playList)
    {
        Iterator<Song> i = playList.iterator();
        int index = 1;
        if(playList.size() == 0)
            System.out.println("No songs in the playlist.");
        else
        {
            while(i.hasNext())
            {
                System.out.println(index++ + ": " + i.next().toString());
            }
        }
    }
}
