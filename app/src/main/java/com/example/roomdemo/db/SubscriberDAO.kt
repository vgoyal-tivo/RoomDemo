package com.example.roomdemo.db

import androidx.lifecycle.LiveData
import androidx.room.*

@Dao
interface SubscriberDAO {

    @Insert
    suspend fun insertSubscriber(subscriber : Subscriber) : Long

    @Update
    suspend fun updateSubscriber(subscriber : Subscriber) : Int

    @Delete
    suspend fun deleteSubscriber(subscriber : Subscriber) : Int

    @Query("DELETE FROM subscriber_table_name")
    suspend fun deleteAll() : Int

    @Query("SELECT * FROM subscriber_table_name")
    fun getAllSubscribers(): LiveData<List<Subscriber>>

//    @Insert
//    suspend fun insertSubscriber2(subscriber : Subscriber) : Long
//
//    @Insert
//    suspend fun insertSubscribers(subscriber1 : Subscriber, subscriber2 : Subscriber, subscriber3 : Subscriber) : List<Long>
//
//    @Insert
//    suspend fun insertSubscribers(subscribers : List<Subscriber>) : List<Long>
//
//    @Insert
//    suspend fun insertSubscribers(subscriber : Subscriber, subscribers : List<Subscriber>) : List<Long>
}