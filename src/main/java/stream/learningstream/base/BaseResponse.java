package stream.learningstream.base;

import lombok.Data;
import lombok.NoArgsConstructor;
import stream.learningstream.commonEnum.responseEnum.EResponseMessage;

import java.io.Serializable;

@Data
@NoArgsConstructor
public class BaseResponse<T> implements Serializable {
	private static final long serialVersionUID = -6233145663410668178L;

	private Integer code = 999;
	private String message = EResponseMessage.ERROR;
	private T data;

	//overloading
	public BaseResponse(String message,Integer code , T data) {
		this.code = code;
		this.message = message;
		this.data = data;
	}

	public BaseResponse(String message) {
		this.code = 400;
		this.message = message;
		this.data = null;
	}
}
