package pl.javastart.exercise.streams;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Predicate;

public class FilteringMachine {

    public List<Integer> filterOutNotEvenNumbers(List<Integer> numberList) {
       List<Integer> onlyEvenNumbersList = new ArrayList<>();
       numberList.stream()
               .filter(new Predicate<Integer>() {
                   @Override
                   public boolean test(Integer integer) {
                       return (integer % 2 == 0);
                   }
               })
               .forEach(new Consumer<Integer>() {
                   @Override
                   public void accept(Integer integer) {
                      onlyEvenNumbersList.add(integer);
                   }
               });
        System.out.println(onlyEvenNumbersList);
        return onlyEvenNumbersList;
    }

    public List<Integer> filterOutLowerNumbersThan20(List<Integer> numberList) {
        List<Integer> numbersBiggerThan20List = new ArrayList<>();
        numberList.stream()
                .filter(new Predicate<Integer>() {
                    @Override
                    public boolean test(Integer integer) {
                        return (integer > 20);
                    }
                })
                .forEach(new Consumer<Integer>() {
                    @Override
                    public void accept(Integer integer) {
                        numbersBiggerThan20List.add(integer);
                    }
                });

        System.out.println(numbersBiggerThan20List);
        return numbersBiggerThan20List;
    }

    public List<Book> convertToBooks(List<String> titles) {
        return null;
    }

    // Metoda powinna przekształcić tytuły na książki i zwrócić tylko te które rozpoczynają się od słowa "Gra"
    public List<Book> convertToBooksAndReturnOnlyStartingWithGra(List<String> titles) {
        List<Book> bookList = new ArrayList<>();
        titles.stream()
                .filter(new Predicate<String>() {
                    @Override
                    public boolean test(String s) {
                        return s.startsWith("Gra");
                    }
                })
                .forEach(new Consumer<String>() {
                    @Override
                    public void accept(String s) {
                        bookList.add(new Book(s));
                    }
                });

        return bookList;
    }
}
