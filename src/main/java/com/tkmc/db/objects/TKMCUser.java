package com.tkmc.db.objects;

public class TKMCUser {

	private String userid;
	private String password;
	private String fName;
	private String lName;

	public static final String USERID = "userid";
	public static final String PASSWORD = "password";
	public static final String FNAME = "fName";
	public static final String LNAME = "lName";

	private TKMCUser(TKMCBuilder builder) {
		this.fName = builder.fName;
		this.lName = builder.lName;
		this.userid = builder.userid;
		this.password = builder.password;
	}

	public String getUserid() {
		return userid;
	}

	public void setUserid(String userid) {
		this.userid = userid;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getfName() {
		return fName;
	}

	public void setfName(String fName) {
		this.fName = fName;
	}

	public String getlName() {
		return lName;
	}

	public void setlName(String lName) {
		this.lName = lName;
	}

	public static class TKMCBuilder {
		private String userid;
		private String password;
		private String fName;
		private String lName;

		public TKMCBuilder userid(String userid) {
			this.userid = userid;
			return this;
		}

		public TKMCBuilder fName(String fName) {
			this.fName = fName;
			return this;
		}

		public TKMCBuilder password(String password) {
			this.password = password;
			return this;
		}

		public TKMCBuilder lName(String lName) {
			this.lName = lName;
			return this;
		}

		public TKMCUser build() {
			return new TKMCUser(this);
		}
	}

}
