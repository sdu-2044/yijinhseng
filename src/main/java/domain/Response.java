package domain;

/**
 * Created by yijinsheng on 2016.5.12.
 */
public class Response<T extends Object> {
    private int code;
    private T message;


    public Response(int code, T message) {
        this.code = code;
        this.message = message;
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }


    public T getMessage() {
        return message;
    }

    public void setMessage(T message) {
        this.message = message;
    }
}
