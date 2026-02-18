package Day_6.General;
interface Greeting {
    void sayHello();
}

public class AnonymousGreeting {
    public static void main(String[] args) {

       Greeting g = new Greeting() {
            @Override
            public void sayHello() {
                System.out.println("Hello! Welcome to Java Anonymous Inner Classes");
            }
        };

       g.sayHello();
    }
}
