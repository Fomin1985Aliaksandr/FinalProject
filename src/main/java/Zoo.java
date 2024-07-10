
import java.util.*;

public class Zoo {

    public static void main (String[]arg){

        Animal animal = Animal.BIRD;
        for (Animal element: Animal.values()){System.out.println(element);}

//
//       System.out.println(animal.getName());
//       System.out.println(animal.getIdAnimal());






        List<String> bird = new ArrayList<>();
        bird.add("eagle");
        bird.add("crow");
        bird.add("sova");

        System.out.println("In our zoo you can see " + bird  );

        Set<String> fish = new HashSet<>();
        fish.add("salmon");
        fish.add("som");
        fish.add("shark");

        System.out.println(fish);

        Map<String,String> beast = new LinkedHashMap<>();
        beast.put("bear2","grizly");
        beast.put("bear2","russian");
        beast.put("wolf1","grey");
        beast.put("wolf2","arctic");

        System.out.println(beast);



        animal.inforationFish();
        animal.inforationBird();
        animal.inforationBeast();


    }

}



