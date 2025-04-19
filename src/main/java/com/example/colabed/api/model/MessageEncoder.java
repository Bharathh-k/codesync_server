package com.example.colabed.api.model;


import com.google.gson.Gson;
import jakarta.websocket.EndpointConfig;
import jakarta.websocket.Encoder;
import jakarta.websocket.EncodeException;

public class MessageEncoder implements Encoder.Text<Message> {
    private static Gson gson= new Gson();

    @Override
    public String encode(Message message)throws EncodeException{
        return gson.toJson(message);
    }
    @Override
    public void init (EndpointConfig endpointConfig){

    }
    @Override
    public void destroy()
    {

    }
}
