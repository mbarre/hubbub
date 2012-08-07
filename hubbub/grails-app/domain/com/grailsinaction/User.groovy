package com.grailsinaction

class User {

	String userId
	String password

	Date dateCreated
	Profile profile
	
    static constraints = {
    	userId(size: 3..20, unique: true)
		password(size: 6..8, 
			validator:{passwd, user -> return passwd != user.userId})
		dateCreated()
		profile(nullable: true)
	}
	
	static mapping = {
		profile lazy: false
		posts sort: 'dateCreated'
	}
	
	static hasMany = [posts : Post, tags : Tag, followings : User]
	
}
