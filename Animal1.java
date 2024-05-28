public class Animal1 {
    public void eat(){
        System.out.println("I am eating");
    }
    public void run(){
        System.out.println("I am running");
    }
    public void bark(){
        System.out.println("I am barking");
    }
    public static void main(String[] args) {
        System.out.println("1");
        Animal1 buzo = new Animal1();
        buzo.eat();
        buzo.run();
        buzo.bark();
    }

}
