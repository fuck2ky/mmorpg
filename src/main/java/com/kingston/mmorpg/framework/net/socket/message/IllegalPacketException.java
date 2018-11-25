package com.kingston.mmorpg.framework.net.socket.message;

public class IllegalPacketException extends RuntimeException{

	private static final long serialVersionUID = 1L;

	public IllegalPacketException() {
		super();
	}

	public IllegalPacketException(String message) {
		super(message);
	}
}
