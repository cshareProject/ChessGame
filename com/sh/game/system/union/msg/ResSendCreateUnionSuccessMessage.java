package com.sh.game.system.union.msg;

import com.sh.net.kryo.KryoInput;
import com.sh.net.kryo.KryoOutput;
import com.sh.game.server.AbstractMessage;



/**
 * <p>发送创建帮会成功信息</p>
 * <p>Created by MessageUtil</p>
 * @author : lanyue group
 */
public class ResSendCreateUnionSuccessMessage extends AbstractMessage {

	@Override
	public void doAction() {
		
	}
	
	public ResSendCreateUnionSuccessMessage() {
		this.queueId = 2;
	}
	
	@Override
	public int getId() {
		return 23013;
	}
	


	@Override
	public boolean read(KryoInput buf) {

		return true;
	}

	@Override
	public boolean write(KryoOutput buf) {

		return true;
	}
}
