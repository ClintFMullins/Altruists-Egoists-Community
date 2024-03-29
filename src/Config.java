import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;

/**
 * Static class which contains a number of constants (such as window sizes
 * and positions, colors, fonts, etc.) used by our program.
 *
 * They are placed here so they can be edited from this one file.
 */

public class Config {

    public final static Dimension MAIN_WINDOW_SIZE = new Dimension(1000,750);
    public final static Dimension HELP_WINDOW_SIZE = new Dimension(615, 750);
    public final static Dimension POP_CONFIG_PANEL_PREF_SIZE = new Dimension(200, 400);

    public final static Dimension POP_PANEL_PREF_SIZE = new Dimension(450, 420);
    public final static int[] POP_CIRCLE_DIMENSIONS = {0, 0, 400, 400};

    public final static Dimension SIDE_PANEL_PREF_SIZE = new Dimension(MAIN_WINDOW_SIZE.width /3 - 100, MAIN_WINDOW_SIZE.height);
	
    public final static Color ALTRUIST_COLOR = Color.BLUE;
    public final static Color EGOIST_COLOR = Color.RED;
	
    public final static Font LABEL_FONT = new Font("SansSerif", Font.BOLD, 17);

    public final static int DEF_POP_SIZE = 8;
    public final static double DEF_ALT_COST = 0.5;
    public final static int DEF_NUM_GEN = 4;
    public final static int DEF_ALT_NUM = 6;
    public final static int DEF_AVG_ALT_GROUP_SIZE = 3;
    public final static int DEF_SEARCH_SIZE = 1;

}