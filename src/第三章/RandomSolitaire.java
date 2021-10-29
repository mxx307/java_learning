package 第三章;

//3.24
public class RandomSolitaire {
    public static void main(String[] args) {
        int a = (int) (Math.random() * 13) + 1;
        int b = (int) (Math.random() * 4) + 1;
        String[] size = {"Ace", "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "Jack", "Queen", "King"};
        String[] color = {"Clubs", "Diamons", "Hearts", "Spades"};
        System.out.println("The card you picked is " + size[a] + " of " + color[b]);
    }
}
