import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;
import java.util.ArrayList;
import java.util.List;

public class UserTest {
    private User user1;
    private User user2;
    private User user3;
    private User userNotAdd;
    private User userNotAdd1;
    private User userStringAdd;

    @Before
    public void setUp () {
        user1 = new User("Stepan", 21, Sex.MALE);
        user2 = new User("Lera", 19, Sex.FEMALE);
        user3 = new User("Alina", 12, Sex.FEMALE);
        userNotAdd = new User("", 0, null);
        userNotAdd1 = new User(null, 0, null);
    }

    @Test
    public void getAllUsers () {
        List <User> expected = User.getAllUsers();
        List <User> actual = new ArrayList <>();
        actual.add(user1);
        actual.add(user2);
        actual.add(user3);
        assertEquals(expected, actual);
    }

    @Test
    public void getAllUsersNoNULL () {
        List <User> expected = User.getAllUsers();
        assertNotNull(expected);
    }

    @Test
    public void getAllUsersMALE () {
        List <User> expected = User.getAllUsers(Sex.MALE);
        List <User> actual = new ArrayList <>();
        actual.add(user1);
        assertEquals(expected, actual);
    }

    @Test
    public void getAllUsersMALEnoNULL () {
        List <User> expected = User.getAllUsers(Sex.MALE);
        assertNotNull(expected);
    }

    @Test(expected = IndexOutOfBoundsException.class)
    public void testIndexOutOfBoundsException() {
        List <User> actual = new ArrayList <>();
        Object o = actual.get(0);
    }

    @Test
    public void getAllUsersFEMALE () {
        List <User> expected = User.getAllUsers(Sex.FEMALE);
        List <User> actual = new ArrayList <>();
        actual.add(user2);
        actual.add(user3);
        assertEquals(expected, actual);
    }

    @Test
    public void getAllUsersFEMALEnoNULL () {
        List <User> expected = User.getAllUsers(Sex.FEMALE);
        assertNotNull(expected);
    }

    @Test
    public void getHowManyUsers () {
        int expected = User.getHowManyUsers();
        int actual = 3;
        assertEquals(expected, actual);
    }

    @Test
    public void getHowManyUsersMALE () {
        int expected = User.getHowManyUsers(Sex.MALE);
        int actual = 1;
        assertEquals(expected, actual);
    }

    @Test
    public void getHowManyUsersFEMALE () {
        int expected = User.getHowManyUsers(Sex.FEMALE);
        int actual = 2;
        assertEquals(expected, actual);
    }

    @Test
    public void getAllAgeUsers () {
        int expected = User.getAllAgeUsers();
        int actual = 52;
        assertEquals(expected, actual);
    }

    @Test
    public void getAllAgeUsersMALE () {
        int expected = User.getAllAgeUsers(Sex.MALE);
        int actual = 21;
        assertEquals(expected, actual);
    }

    @Test
    public void getAllAgeUsersFEMALE () {
        int expected = User.getAllAgeUsers(Sex.FEMALE);
        int actual = 31;
        assertEquals(expected, actual);
    }

    @Test
    public void newUserEMPTYname () {
        for (User user : User.getAllUsers()) {
            if (user.getName() != null && user.getName().isEmpty()) {
                fail("You try to create user with empty name !");
            }
        }
    }
}
