


public enum Animal {

    BIRD(1,"bird"),FISH(2,"fish"),BEAST(3,"beast");

    private int idAnimal;

    private String name;


    Animal(int idAnimal, String name) {
        this.idAnimal = idAnimal;
        this.name = name;


    }

    public int getIdAnimal() {
        return idAnimal;
    }

    public String getName() {
        return name;
    }

    public void inforationFish (){System.out.println("Hallo we are " + Animal.FISH.getName() + " our pavilion = " + Animal.FISH.getIdAnimal());}
    public void inforationBird (){System.out.println("Hallo we are " + Animal.BIRD.getName() + " our pavilion = " + Animal.BIRD.getIdAnimal());}
    public void inforationBeast (){System.out.println("Hallo we are " + Animal.BEAST.getName() + " our pavilion = " + Animal.BEAST.getIdAnimal());}

}
