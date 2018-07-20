package itchat4j;


import itchat4j.controller.LoginController;
import itchat4j.core.MsgCenter;
import itchat4j.face.IMsgHandlerFace;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Wechat {
	private static final Logger LOG = LoggerFactory.getLogger(Wechat.class);
	private IMsgHandlerFace msgHandler;

	private LoginController login;
	public void updateQunList() {
		login.updateQunList();
	}
	
	public Wechat(IMsgHandlerFace msgHandler, String qrPath) {
		System.setProperty("jsse.enableSNIExtension", "false"); // 防止SSL错误
		this.msgHandler = msgHandler;
		msgHandler.setManager(this);
		// 登陆
		login = new LoginController();
		login.login(qrPath);
	}
	
	public IMsgHandlerFace getHandler() {
		return msgHandler;
	}
	
	public void start() {
		LOG.info("+++++++++++++++++++开始消息处理+++++++++++++++++++++");
		new Thread(new Runnable() {
			@Override
			public void run() {
				MsgCenter.handleMsg(msgHandler);
			}
		}).start();
	}

}
