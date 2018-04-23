package com.sh.game.system.skill.msg;

import com.sh.net.kryo.KryoInput;
import com.sh.net.kryo.KryoOutput;
import com.sh.game.server.AbstractMessage;


/**
 * <p>请求角色技能数据</p>
 * <p>Created by MessageUtil</p>
 *
 * @author : admin
 */

public class ReqSkillBasicInfoMessage extends AbstractMessage {

	@Override
	public void doAction() {
		
	}
	
	public ReqSkillBasicInfoMessage() {
		this.queueId = 2;
	}
	
	@Override
	public int getId() {
		return 9001;
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
