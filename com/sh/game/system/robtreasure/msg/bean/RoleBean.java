package com.sh.game.system.robtreasure.msg.bean;

import com.sh.net.kryo.KryoBean;
import com.sh.net.kryo.KryoInput;
import com.sh.net.kryo.KryoOutput;


/**
 * <p></p>
 * <p>Created by MessageUtil</p>
 *
 * @author : admin
 */

public class RoleBean extends KryoBean {

	/**
	 * 玩家id
	 */
	private long roleId;
	/**
	 * 是否是假人 假人1不是假人0
	 */
	private int isFake;
	/**
	 * 玩家姓名
	 */
	private String name;
	/**
	 * 性别 1.男 2.女
	 */
	private int sex;
	/**
	 * 职业 0.通用 1.战 2.法 3.道
	 */
	private int career;
	/**
	 * 玩家等级
	 */
	private int level;
	/**
	 * 转生
	 */
	private int rein;
	/**
	 * 战力
	 */
	private int fightPower;

	public long getRoleId() {
		return roleId;
	}

	public void setRoleId(long roleId) {
		this.roleId = roleId;
	}

		public int getIsFake() {
		return isFake;
	}

	public void setIsFake(int isFake) {
		this.isFake = isFake;
	}

		public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

		public int getSex() {
		return sex;
	}

	public void setSex(int sex) {
		this.sex = sex;
	}

		public int getCareer() {
		return career;
	}

	public void setCareer(int career) {
		this.career = career;
	}

		public int getLevel() {
		return level;
	}

	public void setLevel(int level) {
		this.level = level;
	}

		public int getRein() {
		return rein;
	}

	public void setRein(int rein) {
		this.rein = rein;
	}

		public int getFightPower() {
		return fightPower;
	}

	public void setFightPower(int fightPower) {
		this.fightPower = fightPower;
	}

	
	@Override
	public boolean read(KryoInput buf) {

		this.roleId = readLong(buf);
		this.isFake = readInt(buf, false);
		this.name = readString(buf);
		this.sex = readInt(buf, false);
		this.career = readInt(buf, false);
		this.level = readInt(buf, false);
		this.rein = readInt(buf, false);
		this.fightPower = readInt(buf, false);
		return true;
	}
	
	@Override
	public boolean write(KryoOutput buf) {

		this.writeLong(buf, roleId);
		this.writeInt(buf, isFake, false);
		this.writeString(buf, name);
		this.writeInt(buf, sex, false);
		this.writeInt(buf, career, false);
		this.writeInt(buf, level, false);
		this.writeInt(buf, rein, false);
		this.writeInt(buf, fightPower, false);
		return true;
	}
}
