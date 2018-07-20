package mty.websocket.MsgData;

public class MsgData_updateRoomStatus_Server extends Message{

	public String mFangJianHao="";
	public String mQueJiRen="";
	
	public String mPlayer1="";
	public String mPlayer2="";
	public String mPlayer3="";
	public String mPlayer4="";
	
	public MsgData_updateRoomStatus_Server() {
		this.setMsgType("updateRoomStatus");
	}
}
