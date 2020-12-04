/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package constructorsample.builders;

import constructorsample.fridge.FridgeType;
import constructorsample.fridge.TradeMark;
import constructorsample.fridge.Fridge;

/**
 *
 * @author Администратор
 */
public class FridgeBuilder implements Builders {
    private FridgeType fridgeType;
    private TradeMark tradeMark;
    private String color;
    private float height;
    private float width;
    
    @Override
    public void setFridgeType(FridgeType fridgeType){
        this.fridgeType = fridgeType;
    }
    
    @Override
    public void setColor(String color){
        this.color = color;
    }
    
    @Override
    public void setTradeMark(TradeMark trademark){
        this.tradeMark = trademark;
    }
    
    @Override
    public void setHeight(float height){
        this.height = height;
    }
    
    @Override
    public void setWidth(float width){
        this.width = width;
    }
    
    public Fridge getResult(){
        return new Fridge(fridgeType, tradeMark, color, height, width);
    }
}
