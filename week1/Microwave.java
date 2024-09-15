package week1;
public class Microwave {
    int time = 0;  // start time at 0 a seconds
    int powerLevel = 1;  // start at power level at  1

    // this will  Increase time by 30 seconds
    public void addTime() {
        time += 30;
        System.out.println("Time: " + time + " seconds");
    }

    // to Switch power level between 1 and 2
    public void switchPower() {
        if (powerLevel == 1) {
            powerLevel = 2;
        } else {
            powerLevel = 1;
        }
        System.out.println("Power level: " + powerLevel);
    }

    // Start the microwave
    public void start() {
        System.out.println("Cooking for " + time + " seconds at level " + powerLevel);
    }

    // Reset the microwave
    public void reset() {
        time = 0;
        powerLevel = 1;
        System.out.println("Reset! Time: " + time + " seconds, Power level: " + powerLevel);
    }

    public static  void main(String[] args) {
        Microwave microwave = new Microwave();
        
        microwave.addTime();
        microwave.switchPower();
        microwave.start();
        microwave.reset();
        microwave.addTime();
        microwave.start();
    }
}
