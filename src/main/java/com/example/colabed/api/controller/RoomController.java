package com.example.colabed.api.controller;

import com.example.colabed.api.model.*;
import com.example.colabed.service.RoomService; // assuming you have this service
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import com.example.colabed.service.RoomService;

@RestController
@RequestMapping("/room") // this matches the frontend path
public class RoomController {

    @Autowired
    private RoomService roomService;

    @PostMapping("/create")
    public ResponseEntity<?> createRoom(@RequestBody CreateR request) {
        return ResponseEntity.ok(roomService.createRoom(request));
    }

    @PostMapping("/join")
    public ResponseEntity<?> joinRoom(@RequestBody JoinR request) {
        return ResponseEntity.ok(roomService.joinRoom(request));
    }

    @PostMapping("/changeLanguage")
    public ResponseEntity<?> changeLanguage(@RequestBody CodeUpd request) {
        return ResponseEntity.ok(roomService.changeLanguage(request));
    }

    @PostMapping("/getDetails")
    public ResponseEntity<?> getRoomDetails(@RequestBody VerToken token) {
        return ResponseEntity.ok(roomService.getDetails(token));
    }
}
