package com.sh.game.system.rank.msg.bean;

import com.sh.net.kryo.KryoInput;
import com.sh.net.kryo.KryoOutput;
import com.sh.net.kryo.KryoBean;



/**
 * <p></p>
 * <p>Created by MessageUtil</p>
 * @author : lanyue group
 */
public class ShenZhuangBean extends KryoBean {

	/**
	 * 位置
	 */
	private int index;

	/**
	 * 等级
	 */
	private int level;


	public int getIndex() {
		return index;
	}

	public void setIndex(int index) {
		this.index = index;
	}

	
	public int getLevel() {
		return level;
	}

	public void setLevel(int level) {
		this.level = level;
	}

	

	@Override
	public boolean read(KryoInput buf) {
		this.index = readInt(buf, false);
		this.level = readInt(buf, false);

		return true;
	}
	
	@Override
	public boolean write(KryoOutput buf) {
		this.writeInt(buf, index, false);
		this.writeInt(buf, level, false);

		return true;
	}
}
