public class bounsCat<animalName> extends bounsAnimal implements Animals{
    private String name;

    public Cat(String name){
        super(4);
        this.name=name;
    }
    public Cat(){
        this("Mizzi");
    }
    @Override
    public String getName(){
        return name;
    }
    @Override
    public void suitsPlay(){
        System.out.println(animalName()+"Playing");
    }
}

