package com.sh.game.system.email.msg;

import com.sh.net.kryo.KryoInput;
import com.sh.net.kryo.KryoOutput;
import com.sh.game.server.AbstractMessage;



/**
 * <p>请求获取邮件列表</p>
 * <p>Created by MessageUtil</p>
 * @author : lanyue group
 */
public class ReqGetEmailListMessage extends AbstractMessage {

	@Override
	public void doAction() {
		
	}
	
	public ReqGetEmailListMessage() {
		this.queueId = 2;
	}
	
	@Override
	public int getId() {
		return 36001;
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
