package DiceGame;

import java.util.Random;

public class Dice {
    private Random rand;
    private String activity;
    int count;
    int bedCount;


    public Dice() {
        this.rand = new Random();
        this.activity = "Eat breakfast";
        this.count = 0;
        this.bedCount = 0;
    }

    void Throw(){
      int diceNum = rand.nextInt(6) + 1;

      switch (diceNum){
          case 1:
              activity = "Eat breakfast";
              count++;
              break;
          case 2:
              activity = "Study something boring";
              count++;
              break;
          case 3:
              activity = "Go swimming";
              count++;
              break;
          case 4:
              activity = "Go fishing";
              count++;
              break;
          case 5:
              activity = "Call his mom";
              count++;
              break;
          case 6:
              activity = "Go back to bed";
              count++;
              bedCount++;
      }
    }

    public String getActivity(){
        return activity;
    }

    public String toString(){
        return activity;
    }
}
