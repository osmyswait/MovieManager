package ru.netology;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class MovieManagerTest {
    @Test
    public void addMovieTest() {
        MovieManager manager = new MovieManager();

        manager.addMovie("Film I");
        manager.addMovie("Film II");
        manager.addMovie("Film III");

        String[] actual = manager.findAll();
        String[] expected = { "Film I", "Film II", "Film III" };

        Assertions.assertArrayEquals(expected, actual);
            
        }

    @Test
    public void findLastTest() {
        MovieManager manager = new MovieManager();

        manager.addMovie("Film I");
        manager.addMovie("Film II");
        manager.addMovie("Film III");

        String[] actual = manager.findLast();
        String[] expected = { "Film III", "Film II", "Film I" };

        Assertions.assertArrayEquals(expected, actual);

    }
    @Test
    public void shouldShowLimitFilmsFromEndMax(){
        MovieManager manager = new MovieManager();

        manager.addMovie("Film I");
        manager.addMovie("Film II");
        manager.addMovie("Film III");
        manager.addMovie("Film IV");
        manager.addMovie("Film V");
        manager.addMovie("Film VI");
        manager.addMovie("Film VII");
        manager.addMovie("Film VIII");
        manager.addMovie("Film IX");
        manager.addMovie("Film X");

        String[] actual = manager.findLast();
        String[] expected = {"Film X", "Film IX", "Film VIII","Film VII", "Film VI", "Film V","Film IV", "Film III", "Film II", "Film I"};

        Assertions.assertArrayEquals(expected, actual);
    }
    @Test
    public void shouldShowLimitFilmsFromEndUpperBorder(){
        MovieManager manager = new MovieManager();

        manager.addMovie("Film I");
        manager.addMovie("Film II");
        manager.addMovie("Film III");
        manager.addMovie("Film IV");
        manager.addMovie("Film V");
        manager.addMovie("Film VI");
        manager.addMovie("Film VII");
        manager.addMovie("Film VIII");
        manager.addMovie("Film IX");
        manager.addMovie("Film X");
        manager.addMovie("Film XI");


        String[] actual = manager.findLast();
        String[] expected = { "Film XI", "Film X", "Film IX", "Film VIII","Film VII", "Film VI", "Film V","Film IV", "Film III", "Film II"};

        Assertions.assertArrayEquals(expected, actual);
    }
    @Test
    public void shouldShowLimitFilmsFromEndBelowBorder(){
        MovieManager manager = new MovieManager();

        manager.addMovie("Film I");
        manager.addMovie("Film II");
        manager.addMovie("Film III");
        manager.addMovie("Film IV");
        manager.addMovie("Film V");
        manager.addMovie("Film VI");
        manager.addMovie("Film VII");
        manager.addMovie("Film VIII");
        manager.addMovie("Film IX");

        String[] actual = manager.findLast();
        String[] expected = {"Film IX", "Film VIII","Film VII", "Film VI", "Film V","Film IV", "Film III", "Film II", "Film I"};

        Assertions.assertArrayEquals(expected, actual);
    }



}


