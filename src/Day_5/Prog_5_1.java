package Day_5;
interface Motor {
    int capacity = 10;

    void run();
    void consume();
}

class WashingMachine implements Motor {

    public void run() {
        System.out.println("Washing machine is running");
    }

    public void consume() {
        System.out.println("Washing machine consumes power");
    }
}

class Prog_5_1 {
    public static void main(String[] args) {

        WashingMachine wm = new WashingMachine();

        System.out.println("Capacity of the motor is " + wm.capacity);
    }
}
