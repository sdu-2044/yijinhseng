package util;

import com.eastrobot.ask.sdk.*;
import com.eastrobot.ask.utils.Constant;
import domain.Message;

/**
 * Created by yijinsheng on 2016.5.18.
 */
public class MessageUtil {

    private static MessageUtil instance;
    private String appKey = "AVPJ6rRromk2";
    private String appSecret = "7dXMSr4aQdiCQRzgnEVB";
    private String exampleFile = "d:\\Kalimba.mp3";

    private MessageUtil()
    {

    }
    public  static  MessageUtil getInstance()
    {
        if(instance==null)
        {
            instance = new MessageUtil();
        }
        return  instance;
    }
    public  String ask(String question) {
        AskRequest askRequest = new AskRequest(appKey, appSecret, question, "1", (String) null, Constant.WEIXIN_PLATFORM);
        AskService askService = CloudServiceFactory.getInstance().createAskService();
        askService.init((CloudConfiguration) null);
        AskResponse askResponse = null;
        String answer="server error";

        try {
            askResponse = askService.ask(askRequest);

        } catch (CloudNotInitializedException var19) {
           return answer;
        }
        return  askResponse.getContent();

    }


}
