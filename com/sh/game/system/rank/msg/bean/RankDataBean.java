package com.sh.game.system.rank.msg.bean;

import com.sh.net.kryo.KryoBean;
import com.sh.net.kryo.KryoInput;
import com.sh.net.kryo.KryoOutput;


/**
 * <p></p>
 * <p>Created by MessageUtil</p>
 *
 * @author : admin
 */

public class RankDataBean extends KryoBean {

	/**
	 * 目标id
	 */
	private long uid;
	/**
	 * 名字
	 */
	private String name;
	/**
	 * vip等级
	 */
	private int vipLevel;
	/**
	 * 转生
	 */
	private int rein;
	/**
	 * 等级
	 */
	private int level;
	/**
	 * 战力
	 */
	private long fightPower;
	/**
	 * 英雄战力
	 */
	private long heroFightPower;
	/**
	 * 军衔等级
	 */
	private int junxian;
	/**
	 * 翅膀战斗力
	 */
	private long wingFightPower;
	/**
	 * 威名
	 */
	private long weiming;
	/**
	 * 关卡
	 */
	private int barrier;
	/**
	 * 探索pk值
	 */
	private int pk;
	/**
	 * 是否有月卡
	 */
	private boolean isMonthCard;

	public long getUid() {
		return uid;
	}

	public void setUid(long uid) {
		this.uid = uid;
	}

		public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

		public int getVipLevel() {
		return vipLevel;
	}

	public void setVipLevel(int vipLevel) {
		this.vipLevel = vipLevel;
	}

		public int getRein() {
		return rein;
	}

	public void setRein(int rein) {
		this.rein = rein;
	}

		public int getLevel() {
		return level;
	}

	public void setLevel(int level) {
		this.level = level;
	}

		public long getFightPower() {
		return fightPower;
	}

	public void setFightPower(long fightPower) {
		this.fightPower = fightPower;
	}

		public long getHeroFightPower() {
		return heroFightPower;
	}

	public void setHeroFightPower(long heroFightPower) {
		this.heroFightPower = heroFightPower;
	}

		public int getJunxian() {
		return junxian;
	}

	public void setJunxian(int junxian) {
		this.junxian = junxian;
	}

		public long getWingFightPower() {
		return wingFightPower;
	}

	public void setWingFightPower(long wingFightPower) {
		this.wingFightPower = wingFightPower;
	}

		public long getWeiming() {
		return weiming;
	}

	public void setWeiming(long weiming) {
		this.weiming = weiming;
	}

		public int getBarrier() {
		return barrier;
	}

	public void setBarrier(int barrier) {
		this.barrier = barrier;
	}

		public int getPk() {
		return pk;
	}

	public void setPk(int pk) {
		this.pk = pk;
	}

		public boolean getIsMonthCard() {
		return isMonthCard;
	}

	public void setIsMonthCard(boolean isMonthCard) {
		this.isMonthCard = isMonthCard;
	}

	
	@Override
	public boolean read(KryoInput buf) {

		this.uid = readLong(buf);
		this.name = readString(buf);
		this.vipLevel = readInt(buf, false);
		this.rein = readInt(buf, false);
		this.level = readInt(buf, false);
		this.fightPower = readLong(buf);
		this.heroFightPower = readLong(buf);
		this.junxian = readInt(buf, false);
		this.wingFightPower = readLong(buf);
		this.weiming = readLong(buf);
		this.barrier = readInt(buf, false);
		this.pk = readInt(buf, false);
		this.isMonthCard = readBoolean(buf);
		return true;
	}
	
	@Override
	public boolean write(KryoOutput buf) {

		this.writeLong(buf, uid);
		this.writeString(buf, name);
		this.writeInt(buf, vipLevel, false);
		this.writeInt(buf, rein, false);
		this.writeInt(buf, level, false);
		this.writeLong(buf, fightPower);
		this.writeLong(buf, heroFightPower);
		this.writeInt(buf, junxian, false);
		this.writeLong(buf, wingFightPower);
		this.writeLong(buf, weiming);
		this.writeInt(buf, barrier, false);
		this.writeInt(buf, pk, false);
		this.writeBoolean(buf, isMonthCard);
		return true;
	}
}
