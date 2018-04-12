package com.sh.game.system.legacyEquip.msg;

import com.sh.net.kryo.KryoInput;
import com.sh.net.kryo.KryoOutput;
import com.sh.game.server.AbstractMessage;



/**
 * <p>请求激活/升级神装</p>
 * <p>Created by MessageUtil</p>
 * @author : lanyue group
 */
public class ReqLevelUpShenZhuangMessage extends AbstractMessage {

	@Override
	public void doAction() {
		
	}
	
	public ReqLevelUpShenZhuangMessage() {
		this.queueId = 2;
	}
	
	@Override
	public int getId() {
		return 19011;
	}
	
	/**
	 * 装备位置
	 */
	private int index;


	public int getIndex() {
		return index;
	}

	public void setIndex(int index) {
		this.index = index;
	}

	

	@Override
	public boolean read(KryoInput buf) {
		this.index = readInt(buf, false);

		return true;
	}

	@Override
	public boolean write(KryoOutput buf) {
		this.writeInt(buf, index, false);

		return true;
	}
}

