
/**
 * This is the 'PrintItems' file for the Dinosaur Dilemma game.
 * This file prints all the ASCII art/storyFiles required in the game.
 *
 * Made by Karm Desai (@karmdesai)
 * Version 1.0 (April 12th, 2019)
 */

// Import the required packages/dependencies
// These are only required for the 'printFile' method
import java.io.FileReader;
import java.io.BufferedReader;
import java.io.IOException;

public class PrintItems
{
    static void printFile (String filePath) // This method requires a filePath as an argument
    {
        // This method is used to print the story line-by-line from a .txt file

        // Everything must be inside a 'try-catch' statement otherwise there will be an IOExecption Error that asks for one
        try
        {
            // Buffers the input from the specified file (more efficient)
            BufferedReader lineReader;
            lineReader = new BufferedReader (new FileReader(filePath));

            // Reads the first line in the .txt file
            String currentLine = lineReader.readLine ();

            // Ensures that the currentLine is not empty (if it is then exit the loop)
            while (currentLine != null)
            {
                // Print out the current line
                System.out.print (currentLine);

                // Ask for input (used to print a new line ONLY after the user presses 'enter')
                String nextLine = IBIO.inputString ("");

                // Move on the next line (read, but don't print)
                currentLine = lineReader.readLine ();           
            }
            // Once the loop has been exited (i.e. an empty line has been reached), close the file
            lineReader.close ();

            // Spacing
            System.out.println ("");
            System.out.println ("");
        }

        // Catch is required to prevent an IOException
        catch (IOException certainException)
        {
            // Helps trace the exception
            certainException.printStackTrace ();
        }

    }

    static void printIntro ()
    {
        // This prints out the game introduction ASCII art ('dinosaur dilemma')
        System.out.println ("");
        System.out.println ("");
        System.out.println (" _____     __     __   __     ______     ______     ______     __  __     ______                                  ");
        System.out.println ("/\\  __-.  /\\ \\   /\\ \"-.\\ \\   /\\  __ \\   /\\  ___\\   /\\  __ \\   /\\ \\/\\ \\   /\\  == \\               ");
        System.out.println ("\\ \\ \\/\\ \\ \\ \\ \\  \\ \\ \\-.  \\  \\ \\ \\/\\ \\  \\ \\___  \\  \\ \\  __ \\  \\ \\ \\_\\ \\  \\ \\  __<   ");
        System.out.println (" \\ \\____-  \\ \\_\\  \\ \\_\\\\\"\\_\\  \\ \\_____\\  \\/\\_____\\  \\ \\_\\ \\_\\  \\ \\_____\\  \\ \\_\\ \\_\\ ");
        System.out.println ("  \\/____/   \\/_/   \\/_/ \\/_/   \\/_____/   \\/_____/   \\/_/\\/_/   \\/_____/   \\/_/ /_/                     ");
        System.out.println ("                                                                                                                  ");
        System.out.println (" _____     __     __         ______     __    __     __    __     ______                                          ");
        System.out.println ("/\\  __-.  /\\ \\   /\\ \\       /\\  ___\\   /\\ \"-./  \\   /\\ \"-./  \\   /\\  __ \\                            ");
        System.out.println ("\\ \\ \\/\\ \\ \\ \\ \\  \\ \\ \\____  \\ \\  __\\   \\ \\ \\-./\\ \\  \\ \\ \\-./\\ \\  \\ \\  __ \\             ");
        System.out.println (" \\ \\____-  \\ \\_\\  \\ \\_____\\  \\ \\_____\\  \\ \\_\\ \\ \\_\\  \\ \\_\\ \\ \\_\\  \\ \\_\\ \\_\\           ");
        System.out.println ("  \\/____/   \\/_/   \\/_____/   \\/_____/   \\/_/  \\/_/   \\/_/  \\/_/   \\/_/\\/_/                             ");                                                                                  
        System.out.println ("");
        System.out.println ("");     
    }

    static void printYoshi ()
    {
        // This prints out the main character ASCII art ('Yoshi')
        System.out.println ("YYYYYYY       YYYYYYY                               hhhhhhh              iiii   ");
        System.out.println ("Y:::::Y       Y:::::Y                               h:::::h             i::::i  ");
        System.out.println ("Y:::::Y       Y:::::Y                               h:::::h              iiii  ");
        System.out.println ("Y::::::Y     Y::::::Y                               h:::::h                    ");
        System.out.println ("YYY:::::Y   Y:::::YYYooooooooooo       ssssssssss   h::::h hhhhh       iiiiiii ");
        System.out.println ("   Y:::::Y Y:::::Y oo:::::::::::oo   ss::::::::::s  h::::hh:::::hhh    i:::::i ");
        System.out.println ("    Y:::::Y:::::Y o:::::::::::::::oss:::::::::::::s h::::::::::::::hh   i::::i ");
        System.out.println ("     Y:::::::::Y  o:::::ooooo:::::os::::::ssss:::::sh:::::::hhh::::::h  i::::i ");
        System.out.println ("      Y:::::::Y   o::::o     o::::o s:::::s  ssssss h::::::h   h::::::h i::::i ");
        System.out.println ("       Y:::::Y    o::::o     o::::o   s::::::s      h:::::h     h:::::h i::::i ");
        System.out.println ("       Y:::::Y    o::::o     o::::o      s::::::s   h:::::h     h:::::h i::::i ");
        System.out.println ("       Y:::::Y    o::::o     o::::ossssss   s:::::s h:::::h     h:::::h i::::i ");
        System.out.println ("       Y:::::Y    o:::::ooooo:::::os:::::ssss::::::sh:::::h     h:::::hi::::::i");
        System.out.println ("    YYYY:::::YYYY o:::::::::::::::os::::::::::::::s h:::::h     h:::::hi::::::i");
        System.out.println ("    Y:::::::::::Y  oo:::::::::::oo  s:::::::::::ss  h:::::h     h:::::hi::::::i");
        System.out.println ("    YYYYYYYYYYYYY    ooooooooooo     sssssssssss    hhhhhhh     hhhhhhhiiiiiiii");
        System.out.println ("");
        System.out.println ("");   
    }

    static void printOrb ()
    {
        // This prints out an image of the magic orb using ASCII characters
        System.out.println ("                                     `  ``                                       ");
        System.out.println ("                          ``                                                     ");
        System.out.println ("                            `-/+sydmNNNNNNNNmdhyo/:.                             ");
        System.out.println ("                  `    `-+ymNMMMMMMMMMMMMMMMMMMMMMMNmho:`    `                   ");
        System.out.println ("                    `/ymMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMNdo-    `                ");
        System.out.println ("             `   `/hNMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMNdo.                  ");
        System.out.println ("               .omMMMMMMMMMMMMMMMMNmhso++++oyhmMMMMMMMMMMMMMMMNh:   `            ");
        System.out.println ("          `  .sNMMMMMMMMMMMMMMMNy/.`          `.+hNMMMMMMMMMMMMMNh:   `          ");
        System.out.println ("        `  `oNMMMMMMMMMMMMMMMm+.     -+syyso:`    .sNMMMMMMMMMMMMMNy.            ");
        System.out.println ("       `  -dMMMMMMMMMMMMMMMMs.     `yNNs+/ohNd:     .hMMMMMMMMMMMMMMN+   `       ");
        System.out.println ("     `   /NMMMMMMMMMMMMMMMM+       +MM-    `sMN.     `sMMMMMMMMMMMMMMMy`  `      ");
        System.out.println ("        oNMMMMMMMMMMMMMMMMs        /MM:     sMN.      `hMMMMMMMMMMMMMMMd`  `     ");
        System.out.println ("       oMMMMMMMMMMMMMMMMMN`         /mNho+odNd:        -MMMMMMMMMMMMMMMMd`  `    ");
        System.out.println ("   `  /MMMMMMMMMMMMMMMMMMh        :hmdysshmMy-          NMMMMMMMMMMMMMMMMy   `   ");
        System.out.println ("  `  .NMMMMMMMMMMMMMMMMMMh       :NMo`    `oMm:         NMMMMMMMMMMMMMMMMM+  `   ");
        System.out.println ("  `  yMMMMMMMMMMMMMMMMMMMN`      yMm`      `mMh        .MMMMMMMMMMMMMMMMMMN`  `  ");
        System.out.println (" `  .NMMMMMMMMMMMMMMMMMMMMo      /MM/      :NM+        yMMMMMMMMMMMMMMMMMMMo  `  ");
        System.out.println (" `  +MMMMMMMMMMMMMMMMMMMMMN/      +mNh+::+yNmo`       oMMMMMMMMMMMMMMMMMMMMd  `  ");
        System.out.println (" `  hMMMMMMMMMMMMMMMMMMMMMMNo`     `:oyhhhs/.       .yMMMMMMMMMMMMMMMMMMMMMN.  ` ");
        System.out.println (" `  dMMMMMMMMMMMMMMMMMMMMMMMMd/`                  .omMMMMMMMMMMMMMMMMMMMMMMM-  ` ");
        System.out.println (" `  dMMMMMMMMMMMMMMMMMMMMMMMMMMms:.`          `./ymMMMMMMMMMMMMMMMMMMMMMMMMM-  ` ");
        System.out.println (" `  hMMMMMMMMMMMMMMMMMMMMMMMMMMMMMmdyo+/::/+oydNMMMMMMMMMMMMMMMMMMMMMMMMMMMM.  ` ");
        System.out.println (" `  oMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMm` `  ");
        System.out.println (" `  -MMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMs  `  ");
        System.out.println ("  `  hMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMN.  `  ");
        System.out.println ("  `  -NMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMs  `   ");
        System.out.println ("   `  oMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMd`  `   ");
        System.out.println ("   `  `yMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMm.  `    ");
        System.out.println ("    `  `yMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMm-  `     ");
        System.out.println ("     `  `sMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMd.  `      ");
        System.out.println ("      `   /mMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMNs`  `       ");
        System.out.println ("        `  .yNMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMd:   `        ");
        System.out.println ("         `   :hMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMm+`  `          ");
        System.out.println ("               :hNMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMm+`   `           ");
        System.out.println ("             `   -omMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMNy:`   `             ");
        System.out.println ("               `    :smNMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMNy/`                    ");
        System.out.println ("                       ./sdNMMMMMMMMMMMMMMMMMMMMMMMMNmho-`   ``                  ");
        System.out.println ("                           `-/oydmNNMMMMMMMMMNmdhs+:.     `                      ");
        System.out.println ("                                   `..-----.`                                    ");                                                                            
        System.out.println ("");
        System.out.println ("");
    }

    static void printMario ()
    {
        // This prints out an image of Mario using ASCII characters
        System.out.println ("──────────────███████──███████   ");
        System.out.println ("──────────████▓▓▓▓▓▓████░░░░░██  ");
        System.out.println ("────────██▓▓▓▓▓▓▓▓▓▓▓▓██░░░░░░██ ");
        System.out.println ("──────██▓▓▓▓▓▓████████████░░░░██ ");
        System.out.println ("────██▓▓▓▓▓▓████████████████░██  ");
        System.out.println ("────██▓▓████░░░░░░░░░░░░██████   ");
        System.out.println ("──████████░░░░░░██░░██░░██▓▓▓▓██ ");
        System.out.println ("──██░░████░░░░░░██░░██░░██▓▓▓▓██ ");
        System.out.println ("██░░░░██████░░░░░░░░░░░░░░██▓▓██ ");
        System.out.println ("██░░░░░░██░░░░██░░░░░░░░░░██▓▓██ ");
        System.out.println ("──██░░░░░░░░░███████░░░░██████   ");
        System.out.println ("────████░░░░░░░███████████▓▓██   ");
        System.out.println ("──────██████░░░░░░░░░░██▓▓▓▓██   ");
        System.out.println ("────██▓▓▓▓██████████████▓▓██     ");
        System.out.println ("──██▓▓▓▓▓▓▓▓████░░░░░░████       ");
        System.out.println ("████▓▓▓▓▓▓▓▓██░░░░░░░░░░██       ");
        System.out.println ("████▓▓▓▓▓▓▓▓██░░░░░░░░░░██       ");
        System.out.println ("██████▓▓▓▓▓▓▓▓██░░░░░░████████   ");
        System.out.println ("──██████▓▓▓▓▓▓████████████████   ");
        System.out.println ("────██████████████████████▓▓▓▓██ ");
        System.out.println ("──██▓▓▓▓████████████████▓▓▓▓▓▓██ ");
        System.out.println ("████▓▓██████████████████▓▓▓▓▓▓██ ");
        System.out.println ("██▓▓▓▓██████████████████▓▓▓▓▓▓██ ");
        System.out.println ("██▓▓▓▓██████████──────██▓▓▓▓████ ");
        System.out.println ("██▓▓▓▓████──────────────██████   ");
        System.out.println ("──████                           ");
        System.out.println ("");
        System.out.println ("");
    }

    static void printBobOmb ()
    {
        // This prints out an image of a bob-omb using ASCII characters                                                                           
        System.out.println ("                         .:+.                                                   ");
        System.out.println ("                        .mNmd/                                                  ");
        System.out.println ("                         /y/..:`                                                ");
        System.out.println ("                           `  `:.                                               ");
        System.out.println ("                               `/.    ````                                      ");
        System.out.println ("                               `-/:+shdddd+                                     ");
        System.out.println ("                          ```` `.-/osyhdddh.                                    ");
        System.out.println ("                       -::.`   `-+shdmmmNNmmhyo/.                               ");
        System.out.println ("                      `s+/-:+shmmNNNNNNNNNNNNNNNNNh+.                           ");
        System.out.println ("                       /yhmNNmNNNNNNNNNNNNNNNNNNNNNNNd+`                        ");
        System.out.println ("                      .sNNNNmmmmmmmmmNNNNNNNd++sdNNMMMMh.--                     ");
        System.out.println ("                     +mNNmmmmmmmmmmmmmmNNNNN/ `.:omMMMMNy`/+.                   ");
        System.out.println ("                   .hNNmmmmddddhhhdddmmmmNNNh  .-:+dMMMMNy./o.                  ");
        System.out.println ("                  .mNNmmmddhhyyyyyyhhdmmmNNNN+ `.:/omMMMMMh-+o`                 ");
        System.out.println ("                 `dNNNmmddhyssoooosyhddmmmNNNN/ .-/+yMMMMMMh/o:                 ");
        System.out.println ("     `-:::/:`    yNNNmmmddhyso++++osyhdmmmNNNNNo.-/+sMMMMMMMms/                 ");
        System.out.println ("   .+ooooo//so. .NNNNmmmddhysoo+oosyhddmmmNNNNNNmyyymMMMMMMMNNN-                ");
        System.out.println ("  .oooooooo+:yy-+NNNNmmmmddhyyssyyhhddmmmNNNNNNNNNNMMMMMMMNNNNNs                ");
        System.out.println ("  +oosyy:/ooo/yhhNNNNNmmmmdddhhhhdddmmmmNNNNNNNNNNNNNMMMNNNNNNNh        `````   ");
        System.out.println ("  oooyyo  /oo+shmNNNNNNNmmmmmmmmmmmmmmNNNNNNNNNNNNNNNNNNNNNNNNNh     -:////+yy. ");
        System.out.println ("  +oo+yy. /ooo+ydNNNNNNNNNNmmmmmmmmNNNNNNNNNNNNNNNNNNNNNNNNNNNNs   `::::::/syy- ");
        System.out.println ("  .oo+/oo+ooo+++oNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNmmmmNN-   -::::-:oyys  ");
        System.out.println ("   -ooooooo+++ooodNNNNNNNNNNNNNNNNNNNNNNNNNNNMNNNNNNNNNmmddmmmy    :/::::+yyy-  ");
        System.out.println ("    `:+ooooooosssyNNNNNNNNNNNNNNNNNNNNNNNNNMMMNNNNNNNNmmddddmm+-`  ://///syy+   ");
        System.out.println ("       :ooossyyhhhdNNNNNNNNNNNNNNNNNNNNMMMMMMMNNNNNNNmmddddddhhhyo/:////syyo`   ");
        System.out.println ("       `oooossssoodmNNNNNNNNNNNNNNNMMMMMMMMMMMNNNNNNNmmdddmhoyhy/://///oyys`    ");
        System.out.println ("       -ooosssooooymd/mNNNNMNNMMMMMMMMMMMMMMMMNNNNNNNmmmmm+   `.-://+++yyy.     ");
        System.out.println ("       +oosys..oooodd:`+mNMMMMMMMMMMMMMMMMMMMMNNNNNNNNmms.        .oooshy-      ");
        System.out.println ("       +ooyhy  -ooohh+   /hNMMNMMMMMMMMMMMMMMNNNNNNNNd+`           `:ohs-       ");
        System.out.println ("       /oo+sy/`:oooyy/     `/o+sdNMMMMMMMMMMNNNNNmy+.                           ");
        System.out.println ("       `+oo++oooooss/`      -/oyhosyhdmmmmddys+:.                               ");
        System.out.println ("        `/oooooooshs.   ``../+yhs`                                              ");
        System.out.println ("          ./+sssso:`  .://+/+shy:..`                                            ");
        System.out.println ("                     `::::/+o+///+oss/`                                         ");
        System.out.println ("                     `/::::/:::::/+syhs`                                        ");
        System.out.println ("                      ::::::::-:/+osyhh/                                        ");
        System.out.println ("                      `://///::/+osyhhhs                                        ");
        System.out.println ("                        `-:://++osssso/.                                        ");
        System.out.println ("");
        System.out.println ("");
    }

    static void printWarpPath ()
    {
        // This prints out an introduction to the Warp Path (using ASCII art)
        System.out.println ("  _       __                ");
        System.out.println (" | |     / /___ __________  ");
        System.out.println (" | | /| / / __ `/ ___/ __ \\ ");
        System.out.println (" | |/ |/ / /_/ / /  / /_/ / ");
        System.out.println (" |__/|__/\\__,_/_/  / .___/  ");
        System.out.println ("     ____        _/_/__     ");
        System.out.println ("    / __ \\____ _/ /_/ /_    ");
        System.out.println ("   / /_/ / __ `/ __/ __ \\   ");
        System.out.println ("  / ____/ /_/ / /_/ / / /   ");
        System.out.println (" /_/    \\__,_/\\__/_/ /_/    ");                        
        System.out.println ("");
        System.out.println ("");
    }

    static void printBowser ()
    {
        // This prints out an image of Bowser using ASCII characters
        System.out.println ("  	                     .o/                                                ");
        System.out.println ("                   `-/++oshhsm/                                            ");   
        System.out.println ("               ` :hdysooo++++md+.                                          ");   
        System.out.println ("            `shNmd+++++++++yososdh-                                        ");   
        System.out.println ("           `mo.dm+++++++++s+-:y++sddhd:                                    ");   
        System.out.println ("        .oosm--/myyyhmdhho:.--y++ooydN.                                    ");   
        System.out.println ("       .+NsyNoydy+osydmyh:-::+y+ooooshm:    `ydm/     `.                   ");   
        System.out.println ("   `ohyo+++ohhyhso/-/hyyhdyyhdyooooosydh   -d+-+m   :hhhh                  ");   
        System.out.println ("  :m+.../o-..:odmN` .syo/:--:+syysyyyssms /m:---N:/hs--+m                  ");   
        System.out.println (" .N:...:+--.----+d///-----------/h/.-+hhNmm:..-:hNd/--:yy.//`              ");   
        System.out.println (" /d.........--------------------::y.```hyd/..-:/syyhhysmds+N/              ");   
        System.out.println (" /m.......------------:----------:+/   :hyho//+shyyyhs+---om`              ");   
        System.out.println (" `ds----..---------:++ymy:-------:s:    :yhyyyyyyyh+----:/mm/::::--`       ");   
        System.out.println ("  `yd+:oo:-.---/++dmmyhdmms.-----+d-      `/oyyyyyh:.--::hhhmo++++oN-      ");   
        System.out.println ("    `/ods-/Nyym+`+mdysssys:--:++hsyhs++++/:`  -shyyho++ohhhhhh--:sh:       ");   
        System.out.println ("        +yyd `mohmyss+yh/---:dsohhso-yooooohs-  +hyyyyhhhhhhhhhyh:         ");   
        System.out.println ("            :yd/shsyo:y:---:hsyyoshdhyyooos`:d+ `dyyyyyhdhhdddNmo/-        ");   
        System.out.println ("           -N:------------/myo/-:sy++++syssosyy+ syyyyhh-...---:/sM:       ");   
        System.out.println ("           .N:--/---------y:o:ssyys++++++yyssssy :dyyyho------:odNo        ");   
        System.out.println ("           yy+s/+ho++++hysssyhyoooshs++o++dsyhy+ `dyhhhdo/:+shm:-/hm`      ");   
        System.out.println ("          oh-os/+hooh+sy+++++++ysy-yhossoody+-s`  -hhhhhdddddhmshhy:       ");   
        System.out.println ("          -ym`:ho+oos..hh++++++ohossyhhhsdyysh/``  `:oydddhhhdMs```        ");   
        System.out.println ("           :hh+:hsoyydy.:hs+++oohsyyhs+:++syysy+````````.:///:.hmdN        ");   
        System.out.println ("             /o:`   .N+oyy:yosshdoso/++/.-yso++oso/.```````....y/:M  -s/   ");   
        System.out.println ("                     .-:N/oysyy+/o+/:----os++++++++sso++///++so::/N :m+N`  ");   
        System.out.println ("                        ::`   -yy:--:++++sss+s+o+++++++++ohsooyooyNsm::ho  ");   
        System.out.println ("                             .oydyhho::::/msyss+++++++++yhsooo++++osyosyhm-");   
        System.out.println ("                           `yydyyho+osshysyh++++++++++++shoooooooo+++oyhhs`");   
        System.out.println ("                           +mh/s-.d+++oyyy++++++++++++++ohyyyyyyhhhhyo/.   ");   
        System.out.println ("                            ./+sssssNh/yoysyy++++++++ooooyM/::-..          ");   
        System.out.println ("                                   .dhmooh:-ssooosssyyhhdd/                ");   
        System.out.println ("                                      ..:oooo++++++//:-.`                  ");   
        System.out.println ("");
        System.out.println ("");
    }

    static void printEnding ()
    {
        // This prints out the ending using ASCII characters
        System.out.println ("           .              __.....__           ");
        System.out.println ("         .'|          .-''         '.         ");
        System.out.println ("     .| <  |         /     .-''\"'-.  `.       ");
        System.out.println ("   .' |_ | |        /     /________\\   \\      ");
        System.out.println (" .'     || | .'''-. |                  |      ");
        System.out.println ("'--.  .-'| |/.'''. \\\\    .-------------'      ");
        System.out.println ("   |  |  |  /    | | \\    '-.____...---.      ");
        System.out.println ("   |  |  | |     | |  `.             .'       ");
        System.out.println ("   |  '.'| |     | |    `''-...... -'         ");
        System.out.println ("   |   / | '.    | '.                         ");
        System.out.println ("   `'-'  '---'   '---'          _______       ");
        System.out.println ("       __.....__        _..._   \\  ___ `'.    ");
        System.out.println ("   .-''         '.    .'     '.  ' |--.\\  \\   ");
        System.out.println ("  /     .-''\"'-.  `. .   .-.   . | |    \\  '  ");
        System.out.println (" /     /________\\   \\|  '   '  | | |     |  ' ");
        System.out.println (" |                  ||  |   |  | | |     |  | ");
        System.out.println (" \\    .-------------'|  |   |  | | |     ' .' ");
        System.out.println ("  \\    '-.____...---.|  |   |  | | |___.' /'  ");
        System.out.println ("   `.             .' |  |   |  |/_______.'/   ");
        System.out.println ("     `''-...... -'   |  |   |  |\\_______|/    ");
        System.out.println ("                     |  |   |  |              ");
        System.out.println ("                     '--'   '--'              ");        
        System.out.println ("");
        System.out.println ("");      
    }

}
