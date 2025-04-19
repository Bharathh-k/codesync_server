    package com.example.colabed.service;

    import com.example.colabed.api.model.*;

    import org.springframework.stereotype.Service;

    import java.util.HashMap;
    import java.util.Map;

    @Service
    public class RoomService {

        public Map<String, Object> createRoom(CreateR request) {
            // placeholder response
            Map<String, Object> response = new HashMap<>();
            response.put("roomCode", "ABC123");
            response.put("roomName", request.roomName);
            response.put("defaultLanguage", request.defaultLanguage);
            return response;
        }

        public Map<String, Object> joinRoom(JoinR request) {
            Map<String, Object> response = new HashMap<>();
            response.put("roomName", "Demo Room");
            response.put("defaultLanguage", "javascript");
            response.put("data", new HashMap<String, String>());
            response.put("activeUsers", new Object[0]);
            return response;
        }

        public Map<String, Object> changeLanguage(CodeUpd request) {
            Map<String, Object> response = new HashMap<>();
            response.put("code", "// sample code");
            response.put("activeUsers", new Object[0]);
            return response;
        }

        public Object getDetails(VerToken token) {
            return new Object[]{}; // placeholder list of rooms
        }
    }
