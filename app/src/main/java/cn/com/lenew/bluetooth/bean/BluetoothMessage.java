package cn.com.lenew.bluetooth.bean;

import org.xutils.db.annotation.Column;
import org.xutils.db.annotation.Table;

import java.io.Serializable;

/**
 * Created by lenew on 2016/7/7 0007.
 */
@Table(name = "t_message")
public class BluetoothMessage implements Serializable{

    public static final String ACTION_RECEIVED_NEW_MSG = "bid.yangjing.action.received.new.msg";
    public static final String ACTION_SERVER_WAITING = "bid.yangjing.action.server_waiting";
    public static final String ACTION_CONNECTED_SERVER = "bid.yangjing.action.connected_server";
    public static final String ACTION_CONNECT_ERROR = "bid.yangjing.action.connect_error";
    public static final String ACTION_INIT_COMPLETE = "bid.yangjing.action.server_init";

    public interface MessageType{
        int TYPE_IMAGE = 1;
        int TYPE_SOUND = 2;
        int TYPE_TEXT = 3;
        int TYPE_FILE = 4;
    }

    @Column(name = "id",isId = true,autoGen = true)
    private int id;
    //发送者 以address标记
    @Column(name = "sender")
    private String sender;
    @Column(name = "senderNick")
    private String senderNick;
    @Column(name = "isMe")
    private int isMe;
    @Column(name = "content")
    private String content;
    @Column(name = "type")
    private int type = MessageType.TYPE_TEXT;
    @Column(name = "dateTime")
    private String dateTime;
    @Column(name = "receiver")
    private String receiver;

    public String getSender() {
        return sender;  //发件人

    }

    public void setSender(String sender) {
        this.sender = sender;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getType() {
        return type;
    }

    public void setType(int type) {
        this.type = type;
    }

    public String getDateTime() {
        return dateTime;
    }

    public void setDateTime(String dateTime) {
        this.dateTime = dateTime;
    }

    public String getSenderNick() {
        return senderNick;
    }

    public void setSenderNick(String senderNick) {
        this.senderNick = senderNick;
    }

    public int getIsMe() {
        return isMe;
    }

    public void setIsMe(int isMe) {
        this.isMe = isMe;
    }

    public String getReceiver() {
        return receiver;
    }

    public void setReceiver(String receiver) {
        this.receiver = receiver;
    }
}
