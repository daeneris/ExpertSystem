package ru.margarita.ExpertSystem.dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;
import ru.margarita.ExpertSystem.config.HibernateUtil;
import ru.margarita.ExpertSystem.domain.Topic;

import java.util.List;

@Component
public class TopicDAO {

    private final SessionFactory sessionFactory;

    @Autowired
    public TopicDAO(SessionFactory sessionFactory)
    {
        this.sessionFactory = sessionFactory;
    }

    @Transactional(readOnly = true)
    public List<Topic> showTopicList() {
        Session session = sessionFactory.getCurrentSession();

        return session.createQuery("select t from topic t", Topic.class)
                .getResultList();
    }

    @Transactional
    public void save(Topic topic) {
        Session session = sessionFactory.getCurrentSession();
        session.save(topic);
    }

    @Transactional
    public void update(int id, Topic updatedTopic) {
        Session session = sessionFactory.getCurrentSession();
        Topic topicToUpdate = session.get(Topic.class, id);

        topicToUpdate.setName(updatedTopic.getName());
        topicToUpdate.setDescription(updatedTopic.getDescription());
        topicToUpdate.setDivision(updatedTopic.getDivision());
    }

    @Transactional
    public void delete(String name) {
        Session session = sessionFactory.getCurrentSession();
        session.remove(session.get(Topic.class, name));
    }

    public void showTopic(int id) {
    }
}
