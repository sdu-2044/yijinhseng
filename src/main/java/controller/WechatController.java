package controller;

import domain.Message;
//import org.apache.log4j.Logger;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;
import util.CheckUtil;
import util.MessageUtil;

/**
 * Created by yijinsheng on 2016.5.12.
 */
@Controller
@RequestMapping(value = "/message")
public class WechatController {
    Logger logger = LogManager.getLogger();
    @RequestMapping(value = "/getAccess.do", method = RequestMethod.GET)
    @ResponseBody
    public String getAccess(@RequestParam String signature, @RequestParam String timestamp, @RequestParam String nonce, @RequestParam String echostr) {
        if (CheckUtil.checkSignature(signature, timestamp, nonce)) {
            return echostr;
        } else return echostr;
    }

    @RequestMapping(value = "/getAccess.do", method = RequestMethod.POST)

    public ModelAndView doPost(@RequestBody Message message) {
        logger.debug("received message="+message);
        String question = message.getContent();
        String answer = MessageUtil.getInstance().ask(question);
        StringBuffer content = new StringBuffer("your message：").append("\n").
                append(question).append("\n").append("answer is:").append("\n").append(answer);



        ModelAndView mav = new ModelAndView("jaxb2MarshallingView");
        message.setContent(content.toString());
        mav.addObject(message);

        return mav;
    }

}
