/*
 Ситуация "Совершение покупки авторизованным пользователем"
Система проводит ряд последовательных проверок на
 - пустые строчки логина и пароля
- существование пользователя с данным логином и паролем
- наличие нужной суммы для покупки

Изменяя входные параметры можно смоделировать все ситуации.
 */
package chainsample;

import chainsample.User;
import chainsample.middleware.*;
import java.util.ArrayList;
import java.util.List;
/**
 *
 * @author Администратор
 */
public class ChainSample {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        List<User> users = new ArrayList<User>();
        users.add(new User("admin", "08vfgg7llDFn", 8947.90));
        users.add(new User("andrew_98", "bassKetBall-98", 45.04));
        Server server = new Server();
        Middleware middleware = new AuthenticationMiddleware();
        middleware.linkWith(new UserExistsMiddleware(users)).
           linkWith(new BuyingsMiddleware());
        server.setMiddleware(middleware);
        boolean success;
        String username = "admin";
        String password = "08vfgg7llDFn";
        for (User user : users) {
            success = server.logIn(username, password, 75.00);
        }
    }
    
}
