package com.jihu.book.domain.member.entity;

public class MemberEntity {
	
	private int userno;
	private String userid;
	private String userpw;
	private String username;
	private String userrole;
	private int enabled;
	
	public MemberEntity() {
		super();
	}
	public MemberEntity(int userno, String userid, String userpw, String username, String userrole, int enabled) {
		super();
		this.userno = userno;
		this.userid = userid;
		this.userpw = userpw;
		this.username = username;
		this.userrole = userrole;
		this.enabled = enabled;
	}
	public int getUserno() {
		return userno;
	}
	public void setUserno(int userno) {
		this.userno = userno;
	}
	public String getUserid() {
		return userid;
	}
	public void setUserid(String userid) {
		this.userid = userid;
	}
	public String getUserpw() {
		return userpw;
	}
	public void setUserpw(String userpw) {
		this.userpw = userpw;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getUserrole() {
		return userrole;
	}
	public void setUserrole(String userrole) {
		this.userrole = userrole;
	}
	public int getEnabled() {
		return enabled;
	}
	public void setEnabled(int enabled) {
		this.enabled = enabled;
	}
	
	

}
