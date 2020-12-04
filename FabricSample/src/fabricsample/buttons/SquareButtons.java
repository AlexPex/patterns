/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fabricsample.buttons;

/**
 *
 * @author Администратор
 */
public class SquareButtons  implements Buttons {
    public void render(String textButton) {
        System.out.println("This is modal dialogue");
        System.out.println("<button>" + textButton + "</button>");
        onClick();
    }

    public void onClick() {
        System.out.println("Hello, I am the square button");
    }
}
