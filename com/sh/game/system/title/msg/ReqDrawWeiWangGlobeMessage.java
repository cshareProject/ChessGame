package com.sh.game.system.title.msg;

import com.sh.net.kryo.KryoInput;
import com.sh.net.kryo.KryoOutput;
import com.sh.game.server.AbstractMessage;


/**
 * <p>请求领取威望球值</p>
 * <p>Created by MessageUtil</p>
 *
 * @author : admin
 */

public class ReqDrawWeiWangGlobeMessage extends AbstractMessage {

	@Override
	public void doAction() {
		
	}
	
	public ReqDrawWeiWangGlobeMessage() {
		this.queueId = 2;
	}
	
	@Override
	public int getId() {
		return 33010;
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