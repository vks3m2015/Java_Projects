package io.vik.springbootstarter.topic;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TopicServiceDB {
	
	@Autowired
	private TopicRepository topicrepository;
	
	public List<Topic> getAllTopics()
	{
		List<Topic> topics = new ArrayList<>();
		topicrepository.findAll().forEach(topics :: add);
		return topics;
	}

	public Topic getTopic(String id)
	{
		return topicrepository.findOne(id);
		
	}

	public void addTopic(Topic topic) {
		topicrepository.save(topic);
		
	}
	
	public void updateTopic(String id, Topic topic)
	{
		topicrepository.save(topic); 
	}

	public void deleteTopic(String id) {
		topicrepository.delete(id);
		
	}

}
