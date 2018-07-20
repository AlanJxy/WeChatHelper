package mty.websocket.MsgData;

public class MsgData_updateRoomStatus_Client extends Message {

	public String result="1";
	
	public MsgData_updateRoomStatus_Client() {
		this.setMsgType("updateRoomStatus");
	}
}
