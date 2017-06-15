package com.teambuilding.moolo

import org.springframework.data.mongodb.repository.MongoRepository


interface CommentRepository : MongoRepository<Comment, String> {

    fun findByName(name: String): List<Comment>

    fun save(comment: Comment): Unit

}