package web;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.ServerSocket;
import java.net.Socket;

import dataReader.DataReader;

public class PersonStoreServerSocket
{
	DataReader store;
	private ServerSocket serverSocket;


	public PersonStoreServerSocket(int port) throws IOException
	{
		serverSocket = new ServerSocket(port);
	}

	public static void start()
	{
		try
		{
			ServerSocket serverSocket = new ServerSocket(1234);
			System.out.println("Server started...");
			Socket server = serverSocket.accept();
			System.out.println("Client connected.");

			ObjectInputStream ois = new ObjectInputStream(server.getInputStream());
			ObjectOutputStream oos = new ObjectOutputStream(server.getOutputStream());

			while (true)
			{

				System.out.println("Server closed!!");
				ois.close();
				oos.close();
				server.close();
			}

		}
		catch (Exception e)
		{
			e.printStackTrace();
		}
	}

	public static void main(String[] args)
	{
		start();
	}
}
