package com.barbershop.business;

import com.barbershop.entities.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class SessionBUImpl implements SessionBU {

    @Autowired
    private UserBU userBU;

    @Override
    public User createSession(User user) throws Exception {
        User userFound = userBU.getUserbyEmail(user);

        if(userFound!=null){
            validatePassword(user,userFound);

            return userFound;
        }

        throw new Exception("Usuário ou Senha Incorretos");
    }

    private void validatePassword(User userReceived, User userFound) throws Exception {

        if(!userReceived.getPassword().equals(userFound.getPassword())){
            throw new Exception("Usuário ou Senha Incorretos");
        }
    }
}
