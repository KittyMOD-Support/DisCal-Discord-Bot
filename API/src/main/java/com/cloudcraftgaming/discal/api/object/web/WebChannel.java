package com.cloudcraftgaming.discal.api.object.web;

import com.cloudcraftgaming.discal.api.object.GuildSettings;
import sx.blah.discord.handle.obj.IChannel;

/**
 * Created by Nova Fox on 1/6/18.
 * Website: www.cloudcraftgaming.com
 * For Project: DisCal-Discord-Bot
 */
public class WebChannel {
	private long id;
	private String name;

	private boolean discalChannel;

	//Getters
	public long getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public boolean isDiscalChannel() {
		return discalChannel;
	}

	//Setters
	public void setId(long _id) {
		id = _id;
	}

	public void setName(String _name) {
		name = _name;
	}

	public void setDiscalChannel(boolean _dc) {
		discalChannel = _dc;
	}

	//Functions
	public WebChannel fromChannel(IChannel c, GuildSettings settings) {
		id = c.getLongID();
		name = c.getName();

		discalChannel = settings.getDiscalChannel().equalsIgnoreCase(String.valueOf(id));

		return this;
	}
}