package com.muc;

import java.io.IOException;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class ServerMain {
    public static void main(String[] args){
        int port = 8818;
        try{
        ServerSocket serverSocket = new ServerSocket(port);
        while(true) {
            System.out.println("About to accept client connection...");
            Socket clientSocket = serverSocket.accept();
            System.out.println("Accepted connetion from"+ clientSocket);
            OutputStream outputStream = clientSocket.getOutputStream();
            outputStream.write("Christian Galvan is here.\n".getBytes());
            clientSocket.close();
        }
        } catch ( IOException e){
            e.printStackTrace();
        }


    }
}
