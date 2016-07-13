package com.main;

import com.http.HttpServer;

public class App {

	private static final int PORT = 8080;
	/**
	 * @param args
	 * @throws Exception 
	 */
	public static void main(String[] args) throws Exception {
		new HttpServer().start(PORT);
	}

}
