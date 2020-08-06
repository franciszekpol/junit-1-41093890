package pl.javastart.exercise.streams;

import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.hamcrest.CoreMatchers.hasItem;
import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

public class FilteringMachineTest {

    private FilteringMachine machine = new FilteringMachine();

    @Test public void shouldFilterOutNotEvenNumbers() {

        // given
        List<Integer> numberList = new ArrayList<>();
        numberList.add(1);
        numberList.add(123);
        numberList.add(11);
        numberList.add(124);
        numberList.add(12);
        numberList.add(13);
        numberList.add(21);
        numberList.add(71);

        // when
        List<Integer> filteredList = machine.filterOutNotEvenNumbers(numberList);

        // then
        assertThat(filteredList.size(), is(2));
        assertThat(filteredList, hasItem(12));
        assertThat(filteredList, hasItem(124));
    }

    @Test public void shouldFilterOutNumberLowerThan20() {

        // given
        List<Integer> numberList = new ArrayList<>();
        numberList.add(1);
        numberList.add(123);
        numberList.add(11);
        numberList.add(124);
        numberList.add(12);
        numberList.add(13);
        numberList.add(21);
        numberList.add(71);

        // when
        List<Integer> filteredList = machine.filterOutLowerNumbersThan20(numberList);

        // then
        assertThat(filteredList.size(), is(4));
        assertThat(filteredList, hasItem(123));
        assertThat(filteredList, hasItem(124));
        assertThat(filteredList, hasItem(21));
        assertThat(filteredList, hasItem(71));
    }

    @Test
    public void shouldConvertTitlesToBooks() {
        // given
        List<String> titles = new ArrayList<>();
        titles.add("Gra o tron");
        titles.add("Dzieci z Bullerbyn");
        titles.add("Robinson Cruzoe");
        titles.add("Cyfrowa twierdza");
        titles.add("Gra o życie");

        // when
        List<Book> books = machine.convertToBooks(titles);

        // then
        assertThat(books.size(), is(5));
        assertThat(books, hasItem(new Book("Gra o tron")));
        assertThat(books, hasItem(new Book("Dzieci z Bullerbyn")));
        assertThat(books, hasItem(new Book("Robinson Cruzoe")));
        assertThat(books, hasItem(new Book("Cyfrowa twierdza")));
        assertThat(books, hasItem(new Book("Gra o życie")));
    }

    @Test
    public void shouldConvertTitlesToBooksAndFilterOutStartingWithGra() {
        // given
        List<String> titles = new ArrayList<>();
        titles.add("Gra o tron");
        titles.add("Dzieci z Bullerbyn");
        titles.add("Robinson Cruzoe");
        titles.add("Cyfrowa twierdza");
        titles.add("Gra o życie");

        // when
        List<Book> books = machine.convertToBooksAndReturnOnlyStartingWithGra(titles);

        // then
        assertThat(books.size(), is(2));
        assertThat(books, hasItem(new Book("Gra o tron")));
        assertThat(books, hasItem(new Book("Gra o życie")));
    }


}
