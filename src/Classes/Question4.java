package Classes;

public class Question4 {

    /*Make some cats! Create a Cat() class that can meow(), scratch(),
    purr(), and bite() (they will print “[Cat’s name here] meows”, “[Cat’s
    name here] scratches”, “[Cat’s name here] purrs”, and “[Cat’s name
    here] bites” to the console). Make sure the class has a constructor
    that takes the name of the cat. Demonstrate the usage of all of
    these methods in a different class.*/
}

class Cat {
    String name;

    public Cat(String name) {
        this.name = name;
    }

    public String meow() {
        return name + " meows.";
    }

    public String bite() {
        return name + " bites.";
    }

    public String scratch() {
        return name + " scratches.";
    }

    public String purr() {
        return name + " purrs.";
    }
}

class CatDemo {
    public static void main(String[] args) {
        Cat cat = new Cat("Sammy");
        System.out.println(cat.purr());
        System.out.println(cat.meow());
        System.out.println(cat.scratch());
        System.out.println(cat.bite());
    }
}
