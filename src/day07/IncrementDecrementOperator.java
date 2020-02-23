package day07;

public class IncrementDecrementOperator {
    public static void main(String[] args) {
      /*  pre-Incremente post incremente
      post increment      post increment*/
      int apple=8;
      apple++;

        System.out.println(apple);
        System.out.println(++apple);
        System.out.println(apple++);
        System.out.println(apple);
        System.out.println(apple++);

        int score=50;
        System.out.println(++score);//51
        System.out.println(score++);//51
        System.out.println(score);//52
        System.out.println(--score);//51
        System.out.println(score--);//51
        System.out.println(score);//50
        System.out.println(score++);
        System.out.println(score++);
        System.out.println(score++);

    }
}
