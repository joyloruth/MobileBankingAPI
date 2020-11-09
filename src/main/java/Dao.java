public interface Dao {





    public void createUser(User guest);

    public void readUser(int guestId);



    public void updateuser(int UserId) throws UserUpdateException;

    public void deleteGuest(User guest);

        class UserUpdateException extends Exception {
        }
    }
