import java.util.*;
/**
 * Write a description of class NetworkPlayer here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class NetworkPlayer extends Player
{

    public Move requestMove(Interface i, Board board) {
        return null;
    }
    
    public Move requestMove(Board board, LinkedList<Player> pl, Player p) {
        return Move.nullMove;
    }
}
