package com.example.assignment1.data.repository

import com.example.assignment1.data.UserDao
import com.example.assignment1.model.UserEntity
import kotlinx.coroutines.flow.Flow

class UserRepository(private val userDao: UserDao) {

    fun getAllFlow(): Flow<List<UserEntity>> = userDao.getAllFlow()

    suspend fun insert(user: UserEntity) = userDao.insert(user)

    suspend fun update(user: UserEntity) = userDao.update(user)

    suspend fun delete(user: UserEntity) = userDao.delete(user)

}