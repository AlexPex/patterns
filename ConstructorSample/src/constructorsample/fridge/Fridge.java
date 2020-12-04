/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package constructorsample.fridge;

/**
 *
 * @author Администратор
 */
public class Fridge {
    private final FridgeType fridgeType;
    private final TradeMark tradeMark;
    private final String color;
    private final float height;
    private final float width;
    
    public Fridge(FridgeType fridgeType, TradeMark tradeMark, 
            String color, float height, float width){
        this.fridgeType = fridgeType;
        this.tradeMark = tradeMark;
        this.color = color;
        this.height = height;
        this.width = width;
    }
    
    public String getDescription(){
        return "Your fridge compection: \n" +
                "Type:" + fridgeType +
                "\n TradeMark: " + tradeMark +
                "\n Color: " + color +
                "\n Height: " + height +
                "\n Width: " + width;
    }
}
