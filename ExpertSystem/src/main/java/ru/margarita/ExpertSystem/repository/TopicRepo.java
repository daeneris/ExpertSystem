package ru.margarita.ExpertSystem.repository;

import org.springframework.data.repository.CrudRepository;
import ru.margarita.ExpertSystem.domain.Topic;

public interface TopicRepo extends CrudRepository<Topic, Long> {
}
