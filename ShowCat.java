/*-------------------------------------------------------------------------
This class encapsulates show data for a show catelog.

author: James Levy, James Taylor
-------------------------------------------------------------------------*/

public class ShowCat {

    //runs the example as well as launches the extension.
    public static void main(String[] args){

        exampleRun();
        extensionInterface();
    }

    /**
     * provides a non interactive example of what it should look like when your list is operating as a Netflix scroller
     */
    private static void exampleRun(){

        String[] shows = ShowFactory.getShows();

        Catelog cat = new Catelog();

        cat.addToFront(shows[0]); // Bojack Horseman
        //System.out.println(cat);
        cat.addToBack(shows[1]);  // That 70's Show
        //System.out.println(cat);
        cat.addToFront(shows[2]); // Orange is the New Black
        //System.out.println(cat);
        cat.addToBack(shows[3]);  // LetterKenny
        //System.out.println(cat);
        report(cat); // should not be empty, current should be Bojack

        cat.stepForward();
        report(cat); // should not be empty, current should be That 70's show

        cat.removeShow(shows[3]);  // LetterKenny
        cat.addToBack(shows[4]);   // Lucifer
        report(cat); // should not be empty, current should be That 70's Show

        cat.stepBackward();
        report(cat); // should be non-empty, current should be Bojack

        cat.clear();
        report(cat); // should be empty

    }

    // This method allows you to demo the extension.  To run the program
    // with a specific sort implementation, uncomment the sort you want
    // to run, recompile, and run.
    private static void extensionInterface(){
        String[] shows = ShowFactory.getShows();

        Catelog cat = new Catelog();
        for(int i = 0; i < shows.length; i++) {
            cat.addToFront(shows[i]);
        }
        
        //cat.sort(Catelog.SortType.SELECTION);
        //cat.sort(Catelog.SortType.BUBBLE);
        //cat.sort(Catelog.SortType.INSERTION);
        //cat.sort(Catelog.SortType.QUICK);
        //cat.sort(Catelog.SortType.MERGE);

        report(cat);
    }
    
    private static void report(Catelog cat) {
        boolean value;
        // print the catelog contents
        System.out.println(cat);

        // print out whether the catelog is empty
        value = cat.isEmpty();
        if(value) {
            System.out.println("Catelog is empty");
        } else {
            System.out.println("Catelog is not empty"); 
        } 

        // integrity check
        value = cat.checkIntegrity();
        if(value) {
            System.out.println("Catelog passed integrity check");
        } else {
            System.out.println("Catelog failed integrity check"); 
        }
        System.out.println(); 
    }
}
