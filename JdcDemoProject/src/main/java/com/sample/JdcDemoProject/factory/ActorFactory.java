package com.sample.JdcDemoProject.factory;

import java.sql.Date;
import java.util.List;

import com.sample.JdcDemoProject.model.Actor;
import com.sample.JdcDemoProject.persistence.ActorDb;

public class ActorFactory {
	public static Actor[] retrieveAll() {
		List<Actor> list = ActorDb.retrieveAll();
//		int len = list.size();
//		Actor[] actors = new Actor[len];
//		actors = list.toArray(actors);
		Actor[] actors = list.toArray(new Actor[list.size()]);
		return actors;
	}
	
	public static Actor findById(int id) {
		Actor actor = ActorDb.findById(id);
		return actor;
	}
	
	public static int addNewActor(String fName, String lName, String ph, double fees, Date dob, String gender) {
		int res = ActorDb.insertIntoDb(fName, lName, ph, fees, dob, gender);
		return res;
	}
}
