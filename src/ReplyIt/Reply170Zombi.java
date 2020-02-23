package ReplyIt;

import java.util.Arrays;

public class Reply170Zombi {
    public static void main(String[] args) {
        int[] extinct = {0, 0, 0, 0, 0, 0, 0, 0};
        int[] temp = new int[8];
  int [] inhabitants={     3, 6, 0, 4, 3, 2, 7, 0};
        int day = 0;
        do {
            for (int i = 0; i < inhabitants.length; i++) {
                temp[i] = inhabitants[i];
            }
            System.out.println("Day " + day + " " + Arrays.toString(inhabitants));
            for (int i = 0; i <= 7; i++) {
                if (temp[i] == 0) {
                    if (i >= 1)
                        inhabitants[i - 1] = temp[i - 1] / 2;
                    if (i <= 6)
                        inhabitants[i + 1] = temp[i + 1] / 2;
                }
            }
            day++;
        } while (!Arrays.equals(extinct, inhabitants));
        System.out.println("Day " + day + " " + Arrays.toString(inhabitants));
        System.out.println("---- EXTINCT ----");
    }
}
