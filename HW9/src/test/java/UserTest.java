import static org.junit.Assert.*;
import static Sex.*;
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
        user1 = new User("Stepan", 21, MALE);
        user2 = new User("Lera", 19, FEMALE);
        user3 = new User("Alina", 12, FEMALE);
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
    public void getAllUsersNotNull () {
        List <User> expected = User.getAllUsers();
        assertNotNull(expected);
    }

    @Test
    public void getAllUsersMale () {
        List <User> expected = User.getAllUsers(MALE);
        List <User> actual = new ArrayList <>();
        actual.add(user1);
        assertEquals(expected, actual);
    }

    @Test
    public void getAllUsersMaleNotNull  () {
        List <User> expected = User.getAllUsers(MALE);
        assertNotNull(expected);
    }

    @Test(expected = IndexOutOfBoundsException.class)
    public void testIndexOutOfBoundsException() {
        List <User> actual = new ArrayList <>();
        Object o = actual.get(0);
    }

    @Test
    public void getAllUsersFemale() {
        List <User> expected = User.getAllUsers(FEMALE);
        List <User> actual = new ArrayList <>();
        actual.add(user2);
        actual.add(user3);
        assertEquals(expected, actual);
    }

    @Test
    public void getAllUsersFemaleNotNull () {
        List <User> expected = User.getAllUsers(FEMALE);
        assertNotNull(expected);
    }

    @Test
    public void getHowManyUsers () {
        int expected = User.getHowManyUsers();
        int actual = 3;
        assertEquals(expected, actual);
    }

    @Test
    public void getHowManyUsersMale () {
        int expected = User.getHowManyUsers(MALE);
        int actual = 1;
        assertEquals(expected, actual);
    }

    @Test
    public void getHowManyUsersFemale () {
        int expected = User.getHowManyUsers(FEMALE);
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
    public void getAllAgeUsersMale () {
        int expected = User.getAllAgeUsers(MALE);
        int actual = 21;
        assertEquals(expected, actual);
    }

    @Test
    public void getAllAgeUsersFemale() {
        int expected = User.getAllAgeUsers(FEMALE);
        int actual = 31;
        assertEquals(expected, actual);
    }

    @Test
    public void newUserEmptyName () {
        for (User user : User.getAllUsers()) {
            if (user.getName() != null && user.getName().isEmpty()) {
                fail("You try to create user with empty name !");
            }
        }
    }
}
