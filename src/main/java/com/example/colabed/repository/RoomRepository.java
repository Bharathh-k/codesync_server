package com.example.colabed.repository;

import com.example.colabed.api.model.Room;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;
import org.springframework.stereotype.Repository;

@Repository

public interface RoomRepository extends MongoRepository<Room,String> {
//    @Query("{'roomCode': ?0}")
//    Room findRoomByRoomCode(String roomCode);

    @Query("{'roomName': ?0}")
    Room findRoomByRoomName(String roomName);


}

