package stream.learningstream.model;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.io.Serializable;
import java.util.Date;

@Getter
@Setter
@Entity
@Table(name = "belajar")
public class Belajar implements Serializable {

	private static final long serialVersionUID = -2060226661410268506L;
	@Id
	@Column(name = "id")
	private Long id ;

	@Column(name = "item_code")
	private String itemCode;

	@Column(name = "description")
	private String description;

	@Column(name = "item_name")
	private String itemName;

	@Column(name = "category")
	private String category;

	@Column(name = "create_at")
	private Date createAt;

	@Column(name = "update_at")
	private Date updateAt;


}
