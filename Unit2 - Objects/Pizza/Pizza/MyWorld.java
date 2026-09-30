import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class MyWorld here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class MyWorld extends World
{

    /**
     * Constructor for objects of class MyWorld.
     * 
     */
    public MyWorld()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(600, 400, 1); 
        prepare();
    }
    
    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    private void prepare()
    {
        Pizza pizza = new Pizza();
        addObject(pizza,311,174);
        pizza.setLocation(286,177);
        pizza.setLocation(250,209);
        pizza.setLocation(260,153);
        pizza.setLocation(276,177);
        pizza.setLocation(326,193);
        pizza.setLocation(264,200);
        pizza.setLocation(263,189);
        pizza.setLocation(243,124);
        pizza.setLocation(238,133);
        pizza.setLocation(237,132);
        pizza.setLocation(237,131);
        Pizza pizza2 = new Pizza();
        addObject(pizza2,292,251);
        pizza2.setLocation(367,241);
        pizza2.setLocation(357,236);
        Topping topping = new Topping("Pineapple");
        addObject(topping,357,236);
        pizza2.setLocation(381,246);
        pizza2.setLocation(284,167);
        topping.setLocation(313,190);
        pizza.setLocation(238,119);
        Topping topping2 = new Topping("Pizza");
        addObject(topping2,238,119);
        pizza.setLocation(258,133);
        topping.setLocation(298,153);
        topping.setLocation(326,157);
        removeObject(topping);
        removeObject(topping2);
    }
}
