package store.biyesheji.bysjstore.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

/**
 * @author Jingdong
 * @date 创建时间：2020年2月28日 下午7:41:25
 * 
 */
@Data
@Entity
@Table(name = "t_image")
public class ProjectImage {

	@Id
	private Integer id;

	@Column(name = "project_id")
	private Integer projectId;

	@Column(name = "image_url")
	private String imageUrl;

	public Integer getId() {
		return id;
	}
}
