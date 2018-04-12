package com.sh.game.system.email.msg;

import com.sh.net.kryo.KryoInput;
import com.sh.net.kryo.KryoOutput;
import com.sh.game.server.AbstractMessage;



/**
 * <p>请求删除邮件</p>
 * <p>Created by MessageUtil</p>
 * @author : lanyue group
 */
public class ReqDeleteEmailMessage extends AbstractMessage {

	@Override
	public void doAction() {
		
	}
	
	public ReqDeleteEmailMessage() {
		this.queueId = 2;
	}
	
	@Override
	public int getId() {
		return 36006;
	}
	
	/**
	 * 要删除的邮件id
	 */
	private long emailId;


	public long getEmailId() {
		return emailId;
	}

	public void setEmailId(long emailId) {
		this.emailId = emailId;
	}

	

	@Override
	public boolean read(KryoInput buf) {
		this.emailId = readLong(buf);

		return true;
	}

	@Override
	public boolean write(KryoOutput buf) {
		this.writeLong(buf, emailId);

		return true;
	}
}
