public class Wizard {
    protected String name;
    private int age;

    public Wizard() {
        name = "Harry Potter";
        age = 12;
    }

    public Wizard(String name, int age){
        this.name = name;
        this.age = age;
    }

    public String getName(){
        return super.getName() + this.house;
    }

    public String toString(){
        return name + " is " + age + " years old.";
    }

    public void expelliarmus(){
        System.out.println("EXPELLIARMUS!!!");
    }

}