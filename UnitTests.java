/*-------------------------------------------------------------------------
TODO: Document

author: TODO
-------------------------------------------------------------------------*/
public class UnitTests {

    public static void main(String[] args) {
        System.out.print("addToBack Test  ");
        if(addToBackTest())
            System.out.println("PASSED");
        else
            System.out.println("FAILED");
        
        System.out.print("addToBack Test 1 ");
        if(addToBackTest1())
            System.out.println("PASSED");
        else
            System.out.println("FAILED");
        
        System.out.print("addToBack Test 2 ");
        if(addToBackTest2())
            System.out.println("PASSED");
        else
            System.out.println("FAILED");
        
        System.out.print("addToBack Test 3 ");
        if(addToBackTest3())
            System.out.println("PASSED");
        else
            System.out.println("FAILED");
        
        System.out.print("addToFront Test  ");
        if(addToFrontTest())
            System.out.println("PASSED");
        else
            System.out.println("FAILED");
        
        System.out.print("addToFront Test 1 ");
        if(addToFrontTest1())
            System.out.println("PASSED");
        else
            System.out.println("FAILED");
        
        System.out.print("addToFront Test 2 ");
        if(addToFrontTest2())
            System.out.println("PASSED");
        else
            System.out.println("FAILED");
        
        System.out.print("removeShow Test  ");
        if(removeShowTest())
            System.out.println("PASSED");
        else
            System.out.println("FAILED");
        
        System.out.print("removeShow Test 1 ");
        if(removeShowTest1())
            System.out.println("PASSED");
        else
            System.out.println("FAILED");
        
        System.out.print("removeShow Test 2 ");
        if(removeShowTest2())
            System.out.println("PASSED");
        else
            System.out.println("FAILED");
        
        System.out.print("clear Test ");
        if(clearTest())
            System.out.println("PASSED");
        else
            System.out.println("FAILED");

        
        System.out.print("isEmpty Test ");
        if(isEmptyTest())
            System.out.println("PASSED");
        else
            System.out.println("FAILED");
        
        System.out.print("getCurrentShow Test  ");
        if(getCurrentShowTest())
            System.out.println("PASSED");
        else
            System.out.println("FAILED");
        
        System.out.print("getCurrentShow Test 1 ");
        if(getCurrentShowTest1())
            System.out.println("PASSED");
        else
            System.out.println("FAILED");
        
        System.out.print("stepForward Test ");
        if(stepForwardTest())
            System.out.println("PASSED");
        else
            System.out.println("FAILED");
        
        System.out.print("stepForward Test 1 ");
        if(stepForwardTest1())
            System.out.println("PASSED");
        else
            System.out.println("FAILED");
        
        System.out.print("stepBackward Test ");
        if(stepBackwardTest())
            System.out.println("PASSED");
        else
            System.out.println("FAILED");
        
        System.out.print("stepBackward Test 1 ");
        if(stepBackwardTest1())
            System.out.println("PASSED");
        else
            System.out.println("FAILED");
        
    }
    //tests for null item being added to the list
    public static boolean addToBackTest() {
        Catelog test = new Catelog();

        String shows = null;
        
        if(!test.addToBack(shows))
            return true;
        return false;
    }
    //tests for show being added to empty list
    public static boolean addToBackTest1() {
        Catelog test = new Catelog();

        String shows = "Monsters Inc";
        
        if(test.addToBack(shows)) {
            return true;
        }
        return false;
    }
    
    //tests for full list
    public static boolean addToBackTest2() {
        Catelog test = new Catelog();
        String[] shows = ShowFactory.getShows();
        
        for(int i = 0;  i < shows.length; i++)
            test.addToBack(shows[i]);
        
        String newShows = "Family Guy";

        if(test.addToBack(newShows)) {
            return true;
        }
        return false;
    }
     //
     public static boolean addToBackTest3() {
        Catelog test = new Catelog();
        String[] shows = ShowFactory.getShows();
        
        for(int i = 0;  i < shows.length; i++)
            test.addToBack(shows[i]);
        
        String newShow = "The Office";

        if(!test.addToBack(newShow)) {
            return true;
        }
        return false;
    }
    //tests for a null in the list
    public static boolean addToFrontTest() {
        Catelog test = new Catelog();

        String shows = null;
        
        if(!test.addToFront(shows))
            return true;
        return false;
    }
    
    public static boolean addToFrontTest1() {
        Catelog test = new Catelog();

        String shows = "WWE Wrestle Mania";
        
        if(test.addToFront(show)) {
            return true;
        }
        return false;
    }
    
    public static boolean addToFrontTest2() {
        Catelog test = new Catelog();
        String[] shows = ShowFactory.getShows();
        
        for(int x = 0;  x < shows.length; x++)
            test.addToFront(shows[x]);
        
        String newShow = "Avatar: The Last Airbender";

        if(test.addToFront(newShow)) {
            return true;
        }
        return false;
    }
    //checks for null being removed from the list
    public static boolean removeShowTest() {
        Catelog test = new Catelog();

        String shows = null;
        
        if(!test.removeShow(shows))
            return true;
        return false;
    }
    
    public static boolean removeShowTest1() {
        Catelog test = new Catelog();
        String[] shows = ShowFactory.getShows();
        
        for(int x = 0;  x < shows.length; x++)
            test.addToFront(shows[x]);

        String shows = "Avatar: The Last Airbender";
        
        if(!test.removeShow(shows))
            return true;
        return false;
    }
    
    public static boolean removeShowTest2() {
        Catelog test = new Catelog();
        String[] shows = ShowFactory.getShows();
        
        for(int x = 0;  x < shows.length; x++)
            test.addToFront(shows[x]);

        String shows = "Friends";
        
        if(test.removeShow(shows)) {
            return true;
        }
        return false;
    }
    
    public static boolean clearTest() {
        Catelog test = new Catelog();
        String[] show = ShowFactory.getShows();
        
        for(int x = 0;  x < show.length; x++)
            test.addToFront(show[x]);

        // clears list and adds single show
        test.clear();
        test.addToFront("RushHour");

        // tests if new list contains new show after being cleared
        if(test.toString().equals("[RushHour<=>], current:RushHour"))
            return true;
        return false;
    }
    
    public static boolean isEmptyTest() {
        Catelog test = new Catelog();

        if(test.isEmpty())
            return true;
        return false;
    }
    //tests for null return when list is empty
    public static boolean getCurrentShowTest() {
        Catelog test = new Catelog();

        test.addToFront("Seinfeld");

        if(test.getCurrentShow().equals("Seinfeld"))
            return true;
        return false;
    }
    //tests if node is moved correctly
    public static boolean getCurrentShowTest1() {
        Catelog test = new Catelog();

        if(test.getCurrentShow() == null)
            return true;
        return false;
    }
    //looks to see if current node is moved forward
    public static boolean stepForwardTest() {
        Catelog test = new Catelog();
        String[] show = ShowFactory.getShow();
        
        for(int i = 0;  i < shows.length; i++)
            test.addToBack(show[i]);

        String nextShows = test.stepForward();

        if(nextShows.equals("Chicken Little"))
            return true;
        return false;

    }
    //tests for correctly identified empty list
    public static boolean stepForwardTest1() {
        Catelog test = new Catelog();
        
        String nextShows = test.stepForward();

        if(nextShows == null)
            return true;
        return false;

    }
    //checks if node moves backwards correctly
    public static boolean stepBackwardTest() {
        Catelog test = new Catelog();
        String[] show = ShowFactory.getShow();
        
        for(int x = 0;  x < show.length; x++)
            test.addToBack(show[x]);

        String nextShows = test.stepBackward();

        if(nextShows.equals("Seinfeld"))
            return true;
        return false;

    }
    //checks if method identifies empty list
    public static boolean stepBackwardTest1() {
        Catelog test = new Catelog();
        
        String nextShows = test.stepBackward();

        if(nextShows == null)
            return true;
        return false;

    }
    
}
