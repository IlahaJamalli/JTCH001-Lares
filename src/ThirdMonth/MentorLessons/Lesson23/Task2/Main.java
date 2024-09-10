package ThirdMonth.MentorLessons.Lesson23.Task2;

public class Main {
    public static void main(String[] args) {
        Playlist<Music> playlist=new Playlist<>();

        playlist.addToList(new Pop("New Rules", "Dua Lipa", 3.45));
        playlist.addToList(new Punk("London Calling", "The Clash", 4.00));
        playlist.addToList(new Rock("Back In Black", "AC/DC", 4.35));
        playlist.addToList(new Rap("Faint", "Linkin Park", 3));

        playlist.printDetails();


    }
}
