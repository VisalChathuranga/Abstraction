abstract class Human {
    abstract void eat();
    abstract void walk();
    void breathing(){
        System.out.println("Breating !");
    }
}
class Man extends Human{
    void eat(){
        System.out.println("Anything Eat !");
    }
    void walk(){
        System.out.println("Any Kind of Walking !");
    }
    void breathing(){
        System.out.println("Lab Dab !!!!!");
    }
}
class Visal extends Man{
    void breathing(){
        super.breathing();
        System.out.println("Visal is Breathing!");
    }
    void eat(){
        super.eat();
        System.out.println("Eating Foods");
    }
    void walk(){
        super.walk();
        System.out.println("Running");
    }
}
class Running{
    public static void main(String[] args) {
        Human h = new Man();
        Human h1 = new Visal();
        Man m = new Visal();
        h.breathing();
        h.eat();
        h.walk();
        h1.breathing();
        h1.eat();
        h1.walk();
        m.breathing();
        m.eat();
        m.walk();
    }
}