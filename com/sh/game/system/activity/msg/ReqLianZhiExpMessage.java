package com.sh.game.system.activity.msg;

import com.sh.net.kryo.KryoInput;
import com.sh.net.kryo.KryoOutput;
import com.sh.game.server.AbstractMessage;



/**
 * <p>请求经验炼制</p>
 * <p>Created by MessageUtil</p>
 * @author : lanyue group
 */
public class ReqLianZhiExpMessage extends AbstractMessage {

	@Override
	public void doAction() {
		
	}
	
	public ReqLianZhiExpMessage() {
		this.queueId = 2;
	}
	
	@Override
	public int getId() {
		return 4011;
	}
	
	/**
	 * 1玩家 2英雄
	 */
	private int type;


	public int getType() {
		return type;
	}

	public void setType(int type) {
		this.type = type;
	}

	

	@Override
	public boolean read(KryoInput buf) {
		this.type = readInt(buf, false);

		return true;
	}

	@Override
	public boolean write(KryoOutput buf) {
		this.writeInt(buf, type, false);

		return true;
	}
}
