package mty.websocket.MsgData;

// checkExsist
public class MsgData_checkExsist_Server extends Message {
	public String qunno;
	public String usernick;
	
	public MsgData_checkExsist_Server(String uin) {
		this.setMsgType("checkExsist");
		this.setUin(uin);
	}
}
