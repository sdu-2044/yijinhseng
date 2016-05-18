package domain;

import org.apache.commons.lang.builder.ToStringBuilder;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

/**
 * Created by danel on 2016/5/7.
 */
@XmlRootElement(name="xml")
public class Message
{
    /**
     * 开发者微信号
     */
    @XmlElement(name = "ToUserName")
    private String ToUserName;
    
    /**
     * 发送方帐号（一个OpenID）
     */
    @XmlElement(name = "FromUserName")
    private String FromUserName;
    
    /**
     * 消息创建时间 （整型）
     */
    @XmlElement(name = "CreateTime")
    private String CreateTime;

    /**
     * 消息类型 text ,image,voice,video,shortvideo,location,link
     */
    @XmlElement(name = "MsgType")
    private String MsgType;
    
    /**
     * 文本消息内容
     */
    @XmlElement(name = "Content")
    private String Content;
    
    /**
     * 消息id，64位整型
     */
    @XmlElement(name = "MsgId")
    private String MsgId;
    
    /**
     * 图片链接（由系统生成）
     */
    @XmlElement(name = "PicUrl")
    private String PicUrl;
    
    /**
     * 图片消息媒体id，可以调用多媒体文件下载接口拉取数据。
     */
    @XmlElement(name = "MediaId")
    private String MediaId;
    
    /**
     * 语音格式，如amr，speex等
     */
    @XmlElement(name = "Format")
    private String Format;
    
    /**
     * 语音识别结果，UTF8编码
     */
    @XmlElement(name = "Recognition")
    private String Recognition;
    
    public String getMediaId() {
		return MediaId;
	}

	public void setMediaId(String mediaId) {
		MediaId = mediaId;
	}

	public String getFormat() {
		return Format;
	}

	public void setFormat(String format) {
		Format = format;
	}

	public String getRecognition() {
		return Recognition;
	}

	public void setRecognition(String recognition) {
		Recognition = recognition;
	}

	public String getThumbMediaId() {
		return ThumbMediaId;
	}

	public void setThumbMediaId(String thumbMediaId) {
		ThumbMediaId = thumbMediaId;
	}

	/**
     * 视频消息缩略图的媒体id，可以调用多媒体文件下载接口拉取数据。
     */
    private String ThumbMediaId;
    
    public String getPicUrl()
    {
        return PicUrl;
    }
    
    public void setPicUrl(String picUrl)
    {
        PicUrl = picUrl;
    }
    
    public String getMsgId()
    {
        return MsgId;
    }
    
    public void setMsgId(String msgId)
    {
        MsgId = msgId;
    }
    
    public String getToUserName()
    {
        return ToUserName;
    }
    
    public void setToUserName(String toUserName)
    {
        ToUserName = toUserName;
    }
    
    public String getFromUserName()
    {
        return FromUserName;
    }
    
    public void setFromUserName(String fromUserName)
    {
        FromUserName = fromUserName;
    }
    
    public String getCreateTime()
    {
        return CreateTime;
    }
    
    public void setCreateTime(String createTime)
    {
        CreateTime = createTime;
    }
    
    public String getMsgType()
    {
        return MsgType;
    }
    
    public void setMsgType(String msgType)
    {
        MsgType = msgType;
    }
    
    public String getContent()
    {
        return Content;
    }
    
    public void setContent(String content)
    {
        Content = content;
    }

    @Override
    public String toString() {
        return ToStringBuilder.reflectionToString(this);
    }
}
