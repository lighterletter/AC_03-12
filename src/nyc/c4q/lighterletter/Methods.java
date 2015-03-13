package nyc.c4q.lighterletter;

public class Methods {

    public static String getGreeting(){

        return "Ohayo";
    }

    //method
    public static void speak() {

        System.out.println("hello");
    }

    public static void shoutOut(String name) {

        System.out.println("Hey, " + name  );
}
    public static void main(String[] args) {
        String n = "Von Neuman";
        shoutOut(n);
        shoutOut("Grace Hopper");
        speak();
        shoutOut(n);
        shoutOut("Guy");
        shoutOut("mannnnn");
        speak();
        shoutOut("hieeeelloooooo");

        getGreeting();
        System.out.println(getGreeting());
    }
}
