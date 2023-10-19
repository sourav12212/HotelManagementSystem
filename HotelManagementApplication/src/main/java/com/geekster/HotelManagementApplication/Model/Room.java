package com.geekster.HotelManagementApplication.Model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Entity
public class Room {

    @Id
    private  Long roomId;
    @Column(unique = true)
    private Integer roomNo;
    @Enumerated(EnumType.STRING)
    private RoomType roomType;
    private Double roomPrice;

    private Boolean roomAvailableStatus;


}
