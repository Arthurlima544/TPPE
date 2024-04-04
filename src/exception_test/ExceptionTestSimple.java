package exception_test;

import static org.junit.Assert.assertEquals;

import org.junit.Test;



public class ExceptionTestSimple {
    @Test
    public void testConnectionWithServerUnAuthorizedUser() {
        Server server = new Server();

        try {
            server.establishConnection(false);
        } catch (Exception e) {
            assertEquals(e, new UserDeniedException("User is not authorized"));
        }

        
    }
}
