package stream.learningstream.commonEnum;

import lombok.ToString;

@ToString
public enum ECommonMessage {

	DESCRIPTION("description"),
	TAGS("tags"),
	INDICATION("indication"),
	PRODUCT("product");

	private String name;

	ECommonMessage(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}
}
