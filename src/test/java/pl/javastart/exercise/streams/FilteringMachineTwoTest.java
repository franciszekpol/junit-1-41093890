package pl.javastart.exercise.streams;

import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.hamcrest.CoreMatchers.hasItem;
import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

public class FilteringMachineTwoTest {

    private FilteringMachineTwo machine = new FilteringMachineTwo();
    private List<Person> people;

    @Before
    public void init() {
        people = new ArrayList<>();
        people.add(new Person("Tomek", 2));
        people.add(new Person("Ania", 18));
        people.add(new Person("Konrad", 44));
        people.add(new Person("Janusz", 52));
        people.add(new Person("Sebastian", 16));
    }

    @Test
    public void shouldReturnKidNames() {
        // when
        List<String> kids = machine.findKidNames(people);

        // then
        assertThat(kids.size(), is(2));
        assertThat(kids, hasItem("Tomek"));
        assertThat(kids, hasItem("Sebastian"));
    }

    @Test
    public void shouldConvertPeopleToUser() {
        // when
        List<User> users = machine.convertPeopleToUsers(people);

        // then
        assertThat(users.size(), is(5));
        assertThat(users, hasItem(new User("Tomek", 2, "Tomek_2")));
        assertThat(users, hasItem(new User("Ania", 18, "Ania_18")));
        assertThat(users, hasItem(new User("Konrad", 44, "Konrad_44")));
        assertThat(users, hasItem(new User("Janusz", 52, "Janusz_52")));
        assertThat(users, hasItem(new User("Sebastian", 16, "Sebastian_16")));
    }


}
