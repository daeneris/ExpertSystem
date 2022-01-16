package ru.margarita.ExpertSystem.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;
import ru.margarita.ExpertSystem.dao.TopicDAO;
import ru.margarita.ExpertSystem.domain.Topic;

import java.util.List;

@Controller
public class TopicRestController {

    private final TopicDAO topicDAO;

    @Autowired
    public TopicRestController(TopicDAO topicDAO) {
        this.topicDAO = topicDAO;
    }

    public List<Topic> showTopicList() {
        return topicDAO.showTopicList();
    }

    public void showTopic (int id) {
        topicDAO.showTopic(id);
    }

    public Topic create(String name, String description, String division) {
        Topic topic = new Topic(name, description, division);
        return topic;
        }

    public void update(int id, Topic topic) {
        topicDAO.update(id, topic);
    }

    public void delete(String name) {
        topicDAO.delete(name);
    }
}
