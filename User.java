package com.practice.collection;

class User {
    private String userId;
    private String userName;
    private String email;

    public User(String userId, String userName, String email) {
        this.userId = userId;
        this.userName = userName;
        this.email=email;
    }

    public String getUserId() {
        return userId;
    }

    public String getUserName() {
        return userName;
    }
    public String getEmail() {
		return email;
	}
    @Override
    public String toString() {
    	
    	return userId+" "+userName+" "+email;
    }
}










