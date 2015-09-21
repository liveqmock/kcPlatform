/**
 * @(#)com.casic27.platform.base.file.dao.IUploadFileMapper
 * 版权声明 航天光达科技有限公司, 版权所有 违者必究
 *
 *<br> Copyright: Copyright(c) 2012
 *<br> Company： 航天光达科技有限公司
 *<br> Date：
 *————————————————————————————————————
 *修改记录
 *    修改者：
 *    修改时间：
 *    修改原因：
 *—————————————————————————————————————
 */
 
package com.casic27.platform.base.file.dao;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Param;
import com.casic27.platform.base.file.entity.UploadFile;
import com.casic27.platform.core.mybatis.annotation.Pageable;
import org.springframework.stereotype.Repository;

@Repository
public interface IUploadFileMapper{
	/**
	 * 查询列表(不支持分页)
	 * @param queryMap
	 * @return
	 */
	List<UploadFile> findUploadFile(Map<String,Object> queryMap);
	
	/**
	 * 查询列表(支持分页)
	 * @param queryMap
	 * @return
	 */
	@Pageable
	List<UploadFile> findUploadFilePaging(Map<String,Object> queryMap);
	
	/**
	 * 根据Id进行查询
	 */
	UploadFile getUploadFileById(@Param("id")String id);
	
	
	List<UploadFile> getUploadFileListById(String[] ids);
	/**
	 * 新增
	 */
	void addUploadFile(UploadFile uploadFile);
	
	/**
	 * 修改
	 */
	void updateUploadFile(UploadFile uploadFile);
	
	/**
	 * 物理删除
	 */
	void deleteUploadFile(@Param("id")String id);
	
	/**
	 * 下载次数+1
	 * @param id
	 */
	void upDownloadNum(@Param("id")String id);
}