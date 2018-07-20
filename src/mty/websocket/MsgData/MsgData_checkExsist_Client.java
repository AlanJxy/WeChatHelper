package mty.websocket.MsgData;

public class MsgData_checkExsist_Client extends Message {
	
	// 0 表示没有，1表示有
	public String result;
	
	public MsgData_checkExsist_Client() {
		this.setMsgType("checkExsist");
	}
}
