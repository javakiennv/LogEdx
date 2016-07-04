package io.edx;

public class Recode {
	private String username;
	private String ip;
	private String referer;
	private String time;

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getIp() {
		return ip;
	}

	public void setIp(String ip) {
		this.ip = ip;
	}

	public String getContext() {
		return referer;
	}

	public void setContext(String context) {
		this.referer = context;
	}

	public String getTime() {
		return time;
	}

	public void setTime(String time) {
		this.time = time;
	}

	public Recode(String username, String ip, String time, String referer) {
		super();
		this.username = username;
		this.ip = ip;
		this.referer = referer;
		this.time = time;

	}

	public Recode() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return username + "," + ip + "," + time + "," + referer + "\n";
	}

}
