
class bird_inheritance {
    void fly(){
        System.out.println("I am flying");
    }
}
class sparrow extends bird_inheritance{
    public static void main(String[] args) {
        sparrow sp = new sparrow();
        sp.fly();
    }
} 
