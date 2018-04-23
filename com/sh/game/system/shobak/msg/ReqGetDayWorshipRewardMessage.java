package com.sh.game.system.shobak.msg;

import com.sh.net.kryo.KryoInput;
import com.sh.net.kryo.KryoOutput;
import com.sh.game.server.AbstractMessage;


/**
 * <p>请求领取每日膜拜奖励</p>
 * <p>Created by MessageUtil</p>
 *
 * @author : admin
 */

public class ReqGetDayWorshipRewardMessage extends AbstractMessage {

	@Override
	public void doAction() {
		
	}
	
	public ReqGetDayWorshipRewardMessage() {
		this.queueId = 2;
	}
	
	@Override
	public int getId() {
		return 40005;
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
