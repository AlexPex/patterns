/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chainsample;

import chainsample.middleware.Middleware;

/**
 *
 * @author Администратор
 */
public class Server {
    private Middleware middleware;
    /**
     * Клиент подаёт готовую цепочку в сервер. Это увеличивает гибкость и
     * упрощает тестирование класса сервера.
     */
    public void setMiddleware(Middleware middleware) {
        this.middleware = middleware;
    }
    /**
     * Сервер получает email и пароль от клиента и запускает проверку
     * авторизации у цепочки.
     */
    public boolean logIn(String username, String password,Double buying) {
        if (middleware.check(username, password, null, buying)) {
            System.out.println("Authorization have been successful!");
            System.out.println("You have enough money to buy it! Make transfer...");
            // Здесь должен быть какой-то полезный код, работающий для
            // авторизированных пользователей.

            return true;
        }
        return false;
    }
}
