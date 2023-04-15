package io.vik.springbootstarter.topic;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TopicController {
	
	/*
	@Autowired
	private TopicService topicService;
	*/
	
	@Autowired
	private TopicServiceDB topicServiceDb;
	
	@RequestMapping("/topics")
	public List<Topic> getAllTopics()
	{
		return topicServiceDb.getAllTopics();
	}
	
	@RequestMapping("/topics/{id}")
	public Topic getTopic(@PathVariable String id)
	{
		return topicServiceDb.getTopic(id);
	}
	
	@RequestMapping(method = RequestMethod.POST, value="/topics")
	public void addTopic(@RequestBody Topic topic)
	{
		topicServiceDb.addTopic(topic);
	}

	@RequestMapping(method = RequestMethod.PUT, value = "/topics/{id}")
    public void updateTopic(@RequestBody Topic topic, @PathVariable String id )
    {
		topicServiceDb.updateTopic(id, topic);
    }
	
	@RequestMapping(method = RequestMethod.DELETE, value = "/topics/{id}")
	public void deleteTopic(@PathVariable String id)
	{
		topicServiceDb.deleteTopic(id);
	}
}







