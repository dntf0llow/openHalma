import java.util.*;
import java.awt.Color;

/**
 * Abstract class Player - write a description of the class here
 * 
 * @author (your name here)
 * @version (version number or date here)
 */
public abstract class Player
{
    protected Color p_color;
    protected FIELD_VALUE fieldValue;
    public static Player emptyPlayer = new LocalPlayer(FIELD_VALUE.EMPTY,Color.white);
    protected String name;
    //protected LinkedList<Position> tokens;
    
    public Player() {
        this(FIELD_VALUE.PLAYER1, null, "");
    }
    
    public Player (FIELD_VALUE fieldValue) {
        this(fieldValue, null, "");
    }
    
    public Player(FIELD_VALUE fieldValue, Color color) {
        this(fieldValue, color, "");
    }
    
    public Player(FIELD_VALUE fieldValue, String s) {
        this(fieldValue, null, s);
    }
    
    public Player(FIELD_VALUE fieldValue, Color color, String s) {
        setFieldValue(fieldValue);
        this.p_color = (color == null) ? Color.black : color;
        this.name = (s.equals("")) ? "Player" + fieldValue.getVal() : s;
    }

    public Color getColor() {
        return p_color;
    }
    
    public FIELD_VALUE getFieldValue() {
        return fieldValue;
    }
    
    public String getName() {
        return name;
    }
    
    public void setName(String s) {
        this.name = s;
    }
    
    public void setFieldValue(FIELD_VALUE fv) {
        fv.setPlayer(this);
        this.fieldValue = fv;
    }
    
    public void setColor(Color c) {
        this.p_color = c;
    }
    
    //request the player to make a move
    public abstract Move requestMove(Interface iface, Board board);
    
    public boolean equals (Object p) {
        return ((Player)p).fieldValue == this.fieldValue;
    }
}
