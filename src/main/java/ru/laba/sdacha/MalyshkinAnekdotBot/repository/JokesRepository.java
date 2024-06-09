package ru.laba.sdacha.MalyshkinAnekdotBot.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import ru.laba.sdacha.MalyshkinAnekdotBot.model.Joke;

import java.util.Optional;

public interface JokesRepository extends JpaRepository<Joke, Long> {
    Optional<Joke> findByJoke(String joke);
    @Query("SELECT joke FROM jokes ORDER BY RAND() LIMIT 1")
    Optional<String> findRandomJoke();
}