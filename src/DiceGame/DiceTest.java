package DiceGame;

public class DiceTest {
    static void main() {
        Dice dice1 = new Dice();

        for (int i = 1; i <= 5; i++){
            dice1.Throw();
            System.out.println("Rolled " + i + ": " + dice1);

            if (dice1.bedCount == 3) {
                System.out.println("The Dice Man got too lazy and stayed in bed forever...");
                break;
            }
        }
    }
}
