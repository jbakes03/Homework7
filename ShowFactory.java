/*-------------------------------------------------------------------------
This class generates a set of shows that can be added to a catelog

author: James Taylor
-------------------------------------------------------------------------*/

public class ShowFactory {

    // Simple factory method that builds an array of strings that can be 
    // used as data in the ShowCat program
    public static String[] getShows() {
        String[] shows = new String[10];

        shows[0] = new String("Bojack Horseman");
        shows[1] = new String("That 70's Show");
        shows[2] = new String("Orange is the New Black");
        shows[3] = new String("LetterKenny");
        shows[4] = new String("Lucifer");
        shows[5] = new String("The Office");
        shows[6] = new String("Futurama");
        shows[7] = new String("Rick and Morty");
        shows[8] = new String("Friends");
        shows[9] = new String("Seinfeld");

        return shows;
    }
}

