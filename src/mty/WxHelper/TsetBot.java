package mty.WxHelper;

import io.github.biezhi.wechat.WeChatBot;
import io.github.biezhi.wechat.api.annotation.Bind;
import io.github.biezhi.wechat.api.constant.Config;
import io.github.biezhi.wechat.api.enums.MsgType;
import io.github.biezhi.wechat.api.model.WeChatMessage;

public class TsetBot extends WeChatBot {
    public TsetBot(Config builder) {
        super(builder);
    }
    @Bind(msgType = MsgType.TEXT)
    public void handleText(WeChatMessage message) {
            /*log.info("接收到 [{}] 的消息: {}", message.getName(), message.getText());*/
            this.sendMsg(message.getFromUserName(), "自动回复: " + message.getText());
    }

    public static void main(String[] args) {
        new TsetBot(Config.me().autoLogin(true).showTerminal(true)).start();
    }
}
