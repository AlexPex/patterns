/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package constructorsample;

import constructorsample.builders.Builders;
import constructorsample.builders.FridgeBuilder;
import constructorsample.director.Director;
import constructorsample.fridge.Fridge;

/**
 *
 * @author Администратор
 */
public class ConstructorSample {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Director director = new Director();
        FridgeBuilder builder = new FridgeBuilder();
        director.ConstructFridgeClassA_plus(builder);
        Fridge fridge = builder.getResult();
        System.out.println(fridge.getDescription());
        
        FridgeBuilder builder2 = new FridgeBuilder();
        director.ConstructFridgeSidebySide(builder2);
        Fridge fridge2 = builder2.getResult();
        System.out.println(fridge2.getDescription());
        
    }
    
}
