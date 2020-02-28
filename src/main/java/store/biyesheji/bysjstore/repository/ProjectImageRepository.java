package store.biyesheji.bysjstore.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import store.biyesheji.bysjstore.entity.ProjectImage;

/**
* @author Jingdong
* @date 创建时间：2020年2月28日 下午7:58:17
* 
*/
public interface ProjectImageRepository extends JpaRepository<ProjectImage, Integer>{

	List<ProjectImage> getProjectImagesByProjectId(Integer projectId);

}
