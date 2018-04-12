package com.sh.game.system.tip.msg;

import com.sh.net.kryo.KryoInput;
import com.sh.net.kryo.KryoOutput;
import com.sh.game.server.AbstractMessage;



/**
 * <p>错误</p>
 * <p>Created by MessageUtil</p>
 * @author : lanyue group
 */
public class ResErrorMessage extends AbstractMessage {

	@Override
	public void doAction() {
		
	}
	
	public ResErrorMessage() {
		this.queueId = 2;
	}
	
	@Override
	public int getId() {
		return 7003;
	}
	
	/**
	 * 信息
	 */
	private String error;


	public String getError() {
		return error;
	}

	public void setError(String error) {
		this.error = error;
	}

	

	@Override
	public boolean read(KryoInput buf) {
		this.error = readString(buf);

		return true;
	}

	@Override
	public boolean write(KryoOutput buf) {
		this.writeString(buf, error);

		return true;
	}
}
