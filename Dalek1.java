public class Dalek1 {
    private double batteryCharge = 5.0; // instance variable

    public void batteryReCharge(double c) {
        batteryCharge += c;
        System.out.println("Battery charge is: " + batteryCharge);
    }
    public void move(int distance) {
        //try use for loop
        int moved = 0;
        for (int i = 0; i < distance; i++) {
            if (batteryCharge >= 0.5) {
                moved += 1;
                batteryCharge -= 0.5;
                System.out.print("[" + moved + "] ");
            }
            else {
                System.out.print("Out of power!");
                break;
            }
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Dalek1 d = new Dalek1(); // start off with a well-charged battery
        d.move(11);              // move around and use up the charge
        d.batteryReCharge(2.5);  // get a new charge
        d.batteryReCharge(0.5);  // add a bit more
        d.move(5);               // move some more
    }
}