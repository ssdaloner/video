package com.zhiyou100.dao;

import static org.junit.Assert.*;

import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.zhiyou100.model.AllIds;
import com.zhiyou100.model.Selector;
import com.zhiyou100.model.Speaker;
import com.zhiyou100.model.Video;
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:spring/spring-dao.xml")
public class VideoDaoTest {
@Autowired
private VideoDao dao;
	@Test
	public void testAddVideo() {
		fail("Not yet implemented");
	}

	@Test
	public void testDeleteVideo() {
		fail("Not yet implemented");
	}

	@Test
	public void testListVideo() {
		fail("Not yet implemented");
	}

	@Test
	public void testGetCount() {
		fail("Not yet implemented");
	}

	@Test
	public void testListVideoby() {

	Selector selector=new Selector();
	
	Speaker speaker=new Speaker();
	
	speaker.setName("赵桂丹");
	
	selector.setSpeaker(speaker);
	
	
	
	System.out.println(dao.listVideoby(selector));
	
	
	
	
	}
	
	@Test
	public void testSearchbyid() {
		AllIds allIds = new AllIds();
		allIds.setSpeakerId(4L);
		List<Video> list =  dao.searchbyid(allIds);
		
		System.out.println(list.size());
		
		for (Video video : list) {
			System.out.println(video);
		}
	}

}
