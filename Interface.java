
/**
 * Abstract class Display - write a description of the class here
 * 
 * @author (your name here)
 * @version (version number or date here)
 */
public interface Interface		//should be an interface --> nothing to implement here (and i need to extend JPanel in GUI.java), I think thats the way to go
{
        
    public abstract void printBoard(Board b);
    
    public abstract Move requestMove(Player player);
}
