package exception_test;

import exception_test.UserDeniedException;

public class Server{
    public void establishConnection(Boolean isAuthorizedUser) throws UserDeniedException{
        if(!isAuthorizedUser){
            throw new UserDeniedException("User is not authorized");
        }
    }
}

