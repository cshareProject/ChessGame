package com.sh.game.system.count.msg;

import com.sh.net.kryo.KryoInput;
import com.sh.net.kryo.KryoOutput;
import com.sh.game.server.AbstractMessage;



/**
 * <p>返回数量变化的消息</p>
 * <p>Created by MessageUtil</p>
 * @author : lanyue group
 */
public class ResCountChangeMessage extends AbstractMessage {

	@Override
	public void doAction() {
		
	}
	
	public ResCountChangeMessage() {
		this.queueId = 2;
	}
	
	@Override
	public int getId() {
		return 21002;
	}
	
	/**
	 * 计数类型
	 */
	private int countType;

	/**
	 * 数量
	 */
	private int countNum;

	/**
	 * 组的id(如果是副本.则是instance表的groupId)
	 */
	private int groupId;


	public int getCountType() {
		return countType;
	}

	public void setCountType(int countType) {
		this.countType = countType;
	}

	
	public int getCountNum() {
		return countNum;
	}

	public void setCountNum(int countNum) {
		this.countNum = countNum;
	}

	
	public int getGroupId() {
		return groupId;
	}

	public void setGroupId(int groupId) {
		this.groupId = groupId;
	}

	

	@Override
	public boolean read(KryoInput buf) {
		this.countType = readInt(buf, false);
		this.countNum = readInt(buf, false);
		this.groupId = readInt(buf, false);

		return true;
	}

	@Override
	public boolean write(KryoOutput buf) {
		this.writeInt(buf, countType, false);
		this.writeInt(buf, countNum, false);
		this.writeInt(buf, groupId, false);

		return true;
	}
}
