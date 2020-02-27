package store.biyesheji.bysjstore.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * 项目实体类
 * 
 * @author Jingdong
 *
 */
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

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getSubtitle() {
		return subtitle;
	}

	public void setSubtitle(String subtitle) {
		this.subtitle = subtitle;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getImageUrl() {
		return imageUrl;
	}

	public void setImageUrl(String imageUrl) {
		this.imageUrl = imageUrl;
	}

	@Override
	public String toString() {
		return "Project [id=" + id + ", title=" + title + ", subtitle=" + subtitle + ", description=" + description
				+ ", imageUrl=" + imageUrl + "]";
	}
}
