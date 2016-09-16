
package animalcrew;


public class AnimalCrew
{

    public static void main(String[] args) 
    {
       Cat myCat = new Cat();//create new object
       myCat.killTheMouse();//call from class an attribute
       myCat.scratch();//call from class an attribute 
       myCat.followHuman();
       myCat.makeNoise();
       
       Dog myDog = new Dog();
       myDog.fetch();
       myDog.lickTheOwner();
       myDog.followHuman();
       myDog.makeNoise();
       
       Snake mySnake = new Snake();
       mySnake.eatRabbit();
       mySnake.StrangleHuman();
       mySnake.followHuman();
       mySnake.makeNoise();
    }
    
}
