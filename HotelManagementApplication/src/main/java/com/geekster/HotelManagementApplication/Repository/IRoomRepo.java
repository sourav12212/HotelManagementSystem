package com.geekster.HotelManagementApplication.Repository;

import com.geekster.HotelManagementApplication.Model.Room;
import com.geekster.HotelManagementApplication.Model.RoomType;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface IRoomRepo extends CrudRepository<Room,Long> {
    List<Room> findByRoomType(RoomType roomType);

    List<Room> findByRoomTypeAndRoomAvailableStatus(RoomType roomType, boolean b);
}
