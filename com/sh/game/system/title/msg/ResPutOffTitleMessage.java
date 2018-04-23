package com.sh.game.system.title.msg;

import com.sh.net.kryo.KryoInput;
import com.sh.net.kryo.KryoOutput;
import com.sh.game.server.AbstractMessage;


/**
 * <p>返回脱下称号</p>
 * <p>Created by MessageUtil</p>
 *
 * @author : admin
 */

public class ResPutOffTitleMessage extends AbstractMessage {

	@Override
	public void doAction() {
		
	}
	
	public ResPutOffTitleMessage() {
		this.queueId = 2;
	}
	
	@Override
	public int getId() {
		return 33009;
	}
	
	/**
	 * 称号id
	 */
	private int titleId;

	public int getTitleId() {
		return titleId;
	}

	public void setTitleId(int titleId) {
		this.titleId = titleId;
	}

	
	@Override
	public boolean read(KryoInput buf) {

		this.titleId = readInt(buf, false);
		return true;
	}

	@Override
	public boolean write(KryoOutput buf) {

		this.writeInt(buf, titleId, false);
		return true;
	}
}
