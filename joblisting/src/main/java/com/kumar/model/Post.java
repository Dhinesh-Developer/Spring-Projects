package com.kumar.model;

import java.util.Arrays;

import org.springframework.data.mongodb.core.mapping.Document;
@Document(collection = "jobpost")
public class Post {
	private String profile;
	private String desc;
	private int exp;
	private String techs[];
	public String getProfile() {
		return profile;
	}public Post() {
	}
	@Override
	public String toString() {
		return "Post [profile=" + profile + ", desc=" + desc + ", exp=" + exp + ", techs=" + Arrays.toString(techs)
				+ "]";
	}
	public Post(String profile, String desc, int exp, String[] techs) {
		super();
		this.profile = profile;
		this.desc = desc;
		this.exp = exp;
		this.techs = techs;
	}
	public void setProfile(String profile) {
		this.profile = profile;
	}
	public String getDesc() {
		return desc;
	}
	public void setDesc(String desc) {
		this.desc = desc;
	}
	public int getExp() {
		return exp;
	}
	public void setExp(int exp) {
		this.exp = exp;
	}
	public String[] getTechs() {
		return techs;
	}
	public void setTechs(String[] techs) {
		this.techs = techs;
	}
}
