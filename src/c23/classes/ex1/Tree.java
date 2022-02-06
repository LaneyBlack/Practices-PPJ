package c23.classes.ex1;

public class Tree {
    public Fruit getFruitFromTree(){
        int randomizer = (int) (Math.random()*2 + 1);
        if (randomizer==1){
            return new Apple();
        } else if (randomizer==2){
            return new Orange();
        }else{
            return new Pear();
        }
    }
}
