package Object_orianted;



import java.util.Arrays;

public class Color {
    //rgb array with 3 ints is used to hold r,g,b values
    private int[] rgb = new int[3];

    /**
     * Available colors - ready with rgb code
     */

    public final static int[] WHITE     = new int[]{255, 255, 255};
    public final static int[] LIGHT_GRAY = new int[]{192, 192, 192};
    public final static int[] GRAY      = new int[]{128, 128, 128};
    public final static int[] DARK_GRAY  = new int[]{64, 64, 64};
    public final static int[] BLACK     = new int[]{0, 0, 0};
    public final static int[] RED       = new int[]{255, 0, 0};
    public final static int[] PINK      = new int[]{255, 175, 175};
    public final static int[] ORANGE    = new int[]{255, 200, 0};
    public final static int[] YELLOW    = new int[]{255, 255, 0};
    public final static int[] GREEN     = new int[]{0, 255, 0};
    public final static int[] MAGENTA   = new int[]{255, 0, 255};
    public final static int[] CYAN      = new int[]{0, 255, 255};
    public final static int[] BLUE      = new int[]{0, 0, 255};

    /**
     * Public constructor accepts 3 ints that represent color code.
     * assign 3 int parameters to rgb array indexes(0,1,2)
     * @param r
     * @param g
     * @param b
     */
 //   String color;
    public Color(int r, int g, int b) {
        //TODO
        this.rgb[0] = r;
        this.rgb[1] = g;
        this.rgb[2] = b;
        int[] rgb = {r, g, b};


    }




    public Color() {
            //TODO
            System.out.println("white");
        }


        @Override
        public String toString () {

            if (Arrays.equals(rgb, WHITE)) {
                System.out.println("white");
                return "white";
            } else if (Arrays.equals(rgb, RED)) {
                return "RED";
            }  else if (Arrays.equals(rgb, DARK_GRAY)) {
                return"dark gray";
            } else if (Arrays.equals(rgb, PINK)) {
                return "pink";

                } else if (Arrays.equals(rgb, LIGHT_GRAY)) {
                return"light gray";
                } else if (Arrays.equals(rgb, GRAY)) {
                return"gray";

            } else if (Arrays.equals(rgb, BLACK)) {
                return "black";

            } else if (Arrays.equals(rgb, MAGENTA)) {
                return "meganta";
            } else if (Arrays.equals(rgb, BLUE)) {
                return "Blue";
            } else if (Arrays.equals(rgb, CYAN)) {
                return "cyan";
            } else if (Arrays.equals(rgb, GREEN)) {
                return "green";
            } else if (Arrays.equals(rgb, YELLOW)) {
                return "yellow";
            } else if (Arrays.equals(rgb, ORANGE)) {
                return "orange";
            } else {
                return ("n/a");

            }
        }
    }






