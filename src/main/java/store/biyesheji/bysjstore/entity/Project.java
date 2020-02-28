package store.biyesheji.bysjstore.entity;

import java.io.Serializable;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Transient;

import lombok.Data;


/**
 * 项目实体类
 * 
 * @author Jingdong
 *
 */
@Data
@Entity
@Table(name = "t_project")
public class Project implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Id
	private Integer id;

	@Column(name = "title")
	private String title;

	@Column(name = "subtitle")
	private String subtitle;

	@Column(name = "description")
	private String description;

	@Column(name = "image_url")
	private String imageUrl;

	@Column(name = "tags")
	private String tags;
	
	@Transient
	private List<ProjectImage> projectImages;
	
}
