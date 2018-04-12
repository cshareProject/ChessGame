package com.sh.game.system.union.msg;

import com.sh.net.kryo.KryoInput;
import com.sh.net.kryo.KryoOutput;
import com.sh.game.server.AbstractMessage;



/**
 * <p>请求获取申请入会列表信息</p>
 * <p>Created by MessageUtil</p>
 * @author : lanyue group
 */
public class ReqGetApplyListInfoMessage extends AbstractMessage {

	@Override
	public void doAction() {
		
	}
	
	public ReqGetApplyListInfoMessage() {
		this.queueId = 2;
	}
	
	@Override
	public int getId() {
		return 23011;
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
