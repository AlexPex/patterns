/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chainsample.middleware;

import chainsample.User;

/**
 *
 * @author Администратор
 */
public abstract class Middleware {

    private Middleware next;

    public Middleware linkWith(Middleware next) {
        this.next = next;
        return next;
    }

    /**
     * Подклассы реализуют в этом методе конкретные проверки.
     */
    public abstract boolean check(String username, String password,User user, Double buying);

    /**
     * Запускает проверку в следующем объекте или завершает проверку, если мы в
     * последнем элементе цепи.
     */
    protected boolean checkNext(String username, String password,User user, Double buying) {
        if (next == null) {
            return true;
        }
        return next.check(username, password, user, buying);
    }
}
