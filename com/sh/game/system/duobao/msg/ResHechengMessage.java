package com.sh.game.system.duobao.msg;

import com.sh.net.kryo.KryoInput;
import com.sh.net.kryo.KryoOutput;
import com.sh.game.server.AbstractMessage;



/**
 * <p>返回合成结果</p>
 * <p>Created by MessageUtil</p>
 * @author : lanyue group
 */
public class ResHechengMessage extends AbstractMessage {

	@Override
	public void doAction() {
		
	}
	
	public ResHechengMessage() {
		this.queueId = 2;
	}
	
	@Override
	public int getId() {
		return 48013;
	}
	
	/**
	 * 合成的宝物id
	 */
	private int itemId;


	public int getItemId() {
		return itemId;
	}

	public void setItemId(int itemId) {
		this.itemId = itemId;
	}

	

	@Override
	public boolean read(KryoInput buf) {
		this.itemId = readInt(buf, false);

		return true;
	}

	@Override
	public boolean write(KryoOutput buf) {
		this.writeInt(buf, itemId, false);

		return true;
	}
}
