package pl.javastart.exercise.streams;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Predicate;

public class FilteringMachineTwo {

    // metoda powinna zwrócić imiona wszystkich niedorosłych osób (mniej niż 18 lat)
    public List<String> findKidNames(List<Person> ppl) {
        List<String> names = new ArrayList<>();
        ppl.stream()
                .filter(new Predicate<Person>() {
                    @Override
                    public boolean test(Person person) {
                        return (person.getAge() < 18);

                    }
                })
                .forEach(new Consumer<Person>() {
                    @Override
                    public void accept(Person person) {
                        names.add(person.getName());
                    }
                });

        return names;
    }

    public List<User> convertPeopleToUsers(List<Person> people) {
        List<User> users = new ArrayList<>();
        people.stream()
                .filter(new Predicate<Person>() {
                    @Override
                    public boolean test(Person person) {
                        return true;
                    }
                })
                .forEach(new Consumer<Person>() {
                    @Override
                    public void accept(Person person) {
                        users.add(new User(person.getName(), person.getAge(), person.getName() + "_" + person.getAge()));
                    }
                });

        return users;
    }
}
