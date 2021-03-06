package com.grailsinaction

class Post {

	String content
	Date dateCreated
	
    static constraints = {
		content(blank: false)
    }
		
	static mapping = {
		sort dateCreated:"desc"
	}
	
	static belongsTo = [user: User]
	static hasMany = [tags : Tag]
}
