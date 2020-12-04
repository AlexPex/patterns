/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fabricsample;

import fabricsample.Modal;
import fabricsample.ModalWithRoundBtns;
import fabricsample.ModalWithSquareBtns;
import java.util.StringTokenizer;

/**
 *
 * @author Администратор
 */
public class FabricSample {

    private static Modal modal;

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("Program is started....");
        configure();
        immitateClick();
    }

    static void configure() {
        byte bKbd[] = new byte[256];
        int i = 0;
        String option = "";
        StringTokenizer st;
        try {
            System.out.println("Choose buttons format: round or square");
            int iCnt = System.in.read(bKbd);
            option = new String(bKbd, 0, iCnt);

            st = new StringTokenizer(option, "\r\n");
            option = new String((String) st.nextElement());
            if (option.equals("square")) {
                modal = new ModalWithSquareBtns();
            } else {
                modal = new ModalWithRoundBtns();
            }
        } catch (Exception e) {
            System.err.println("Error");
        }

    }
    
     static void immitateClick() {
        modal.renderModal();
    }

}
