package com.sh.game.system.mining.msg;

import com.sh.net.kryo.KryoInput;
import com.sh.net.kryo.KryoOutput;
import com.sh.game.server.AbstractMessage;

import com.sh.game.system.mining.msg.bean.MinerBean;

/**
 * <p>返回矿工购买结果</p>
 * <p>Created by MessageUtil</p>
 *
 * @author : admin
 */

public class ResBuyMinerMessage extends AbstractMessage {

	@Override
	public void doAction() {
		
	}
	
	public ResBuyMinerMessage() {
		this.queueId = 2;
	}
	
	@Override
	public int getId() {
		return 48005;
	}
	
	/**
	 * 矿工信息
	 */
	private MinerBean miner;

	public MinerBean getMiner() {
		return miner;
	}

	public void setMiner(MinerBean miner) {
		this.miner = miner;
	}

	
	@Override
	public boolean read(KryoInput buf) {

		if (readByte(buf) != 0) {
			MinerBean minerBean = new MinerBean();
			minerBean.read(buf);
			this.miner = minerBean;
		}
		return true;
	}

	@Override
	public boolean write(KryoOutput buf) {

		this.writeBean(buf, miner);
		return true;
	}
}