/**
 * @author DasAerus
 * Handler to prepare info and events of the {@link Hangman}-class for readable output
 *  to be sent to the user/player
 * Processes ALL user-Inputs to the console for other (not directly related) commands/inputs (e.g.: exiting / restarting / etc.)
 */
import java.nio.charset.Charset;

public class KonsolenAnzeige {

    public String konsolenFarbraum;
    public boolean konsoleTrueColor;
    public Charset konsoleCharset;
    public boolean konsoleIstTerminal;

    public KonsolenAnzeige(){
        //Fetch potentially Relevant (Console) Properties
        this.konsoleIstTerminal = System.console().isTerminal();
        this.konsolenFarbraum = System.getProperty("COLORTERM", "unknown");
        this.konsoleTrueColor = konsolenFarbraum.toLowerCase() == "truecolor";
        this.konsoleCharset = System.console().charset();
    }

    /* //ToDo reading Console input
     * //ToDo actual Output formatting and printing
     * //ToDo Display Layout of "Game" and
     * //idea maybe predefined ASCII-Art of Hangman states to print (Copy)
    */

    //#region debug
    /**
     * Print all System and Console properties accessible by Java to a bound Console Window
     * --> Only really meant for testing and seeing available Properties
     * @see System
     * @see System.out
     * @see System#console
     */
    @SuppressWarnings("unused")
    private static void getEigenschaften(){
        System.out.printf("isTerminal: %s\ncharset %s\n env HashMap: %s",
        System.console().isTerminal(), System.out.charset(), System.getenv() );
    }
    //#endregion

}
