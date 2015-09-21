/**
 * @(#)com.casic27.platform.common.authorization.dao.IUserRoleMapper.java
 * 版权声明 航天光达科技有限公司, 版权所有 违者必究
 *
 *<br> Copyright:： Copyright (c) 2012
 *<br> Company： 航天光达科技有限公司
 *<br> Date：2012-4-25
 *————————————————————————————————————
 *修改记录
 *    修改者：
 *    修改时间：
 *    修改原因：
 *—————————————————————————————————————
 */
package com.casic27.platform.common.authorization.dao;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import com.casic27.platform.common.log.annotation.OperateLog;
import com.casic27.platform.common.log.annotation.OperateLogType;

/**
 * <pre>
 * 类描述：
 * </pre>
 * <pre>
 * </pre>
 * @author 林斌树(linbinshu@casic27.com)
 */
@Repository
public interface IUserRoleMapper {
	/**
	 * 根据用户查询角色树，若用户已有该角色，则返回的Map中ISCHECK值为1，否则为0
	 * @param userId
	 * @return
	 */
	List<Map<String,Object>> getAssignedRoleList(@Param("userId")String userId, @Param("jsjb")String jsjb);
	
	/**
	 * 删除某用户下的所有用户角色关系
	 * @param userId
	 */
	@OperateLog(isRecord=false)
	void deleteUserRoleByUserId(@Param("userId")String userId, @Param("jsjb")String jsjb);
	
	/**
	 * 为用户分配角色
	 * @param orgRole
	 */
	@OperateLog(isRecord=false)
	void insertUserRole(Map userRole);
	
	/**
	 * 查询分配了某角色的用户列表
	 * @param roleId
	 * @return
	 */
	List<Map> queryAssignedUserByRole(@Param("roleId")String roleId, @Param("orgId")String orgId);
	
	/**
	 * 删除某角色下的所有用户角色关系
	 * @param roleId
	 */
	@OperateLog(isRecord=false)
	void deleteUserRoleByRoleId(@Param("roleId")String roleId, @Param("orgId")String orgId);
}
