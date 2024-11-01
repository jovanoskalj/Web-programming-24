package mk.ukim.finki.aud.model.exceptions;

public class UserNotFoundException extends RuntimeException{
    public UserNotFoundException(String username) {

        super(String.format("User with username %d is not found",username));
    }
}
