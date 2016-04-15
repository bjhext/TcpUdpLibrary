package com.cy.lib.udp;

import com.cy.lib.tcpip.MessagePool;

/**
 * 多播消息池
 */
class MulticastMessagePool extends MessagePool {
	private static MulticastMessagePool instance = null;

	private MulticastMessagePool() {
		super();
	}

	public static MulticastMessagePool getInstance() {
		if (instance == null) {
			synchronized (MulticastMessagePool.class) {
				if (instance == null) {
					instance = new MulticastMessagePool();
					return instance;
				}
			}
		}
		return instance;
	}
}
