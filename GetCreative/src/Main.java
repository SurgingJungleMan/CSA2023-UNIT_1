/*

Tien D.
Get Creative! Problem

Create your own logo with system.out.println() statements...
Created logo using weird website and then printed it out using a table.

 */




public class Main {
    public void createMyLogo(){
        // resources used....
        String[] SantaClaraFont = { // https://www.w3schools.com/java/java_arrays.asp
                // http://patorjk.com/software/taag/#p=display&f=Santa%20Clara&t=Tien%20V%2B%20Doan

                " ______          _,   _       ___              ",
                "(  /o           ( |  /  /    ( / \\             ",
                "  /,  _  _ _      | /--/--    /  /__ __,  _ _ ",
                "_/ (_(/_/ / /_    |/  /     (/\\_/(_)(_/(_/ / /_",
                "                                               ",
        }; // this is so I don't have to write system.out.println() all the time

        int i = 0;
        while (i < SantaClaraFont.length) { // https://www.freecodecamp.org/news/how-to-loop-through-an-array-in-javascript-js-iterate-tutorial/
            System.out.println(SantaClaraFont[i]);
            i++;
        }
    }

    public static void main(String[] args) {
        new Main().createMyLogo();
    }
}

