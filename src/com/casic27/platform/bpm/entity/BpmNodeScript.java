/**
 * @(#)com.casic27.platform.bpm.entity.NodeScript
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
 
package com.casic27.platform.bpm.entity;


public class BpmNodeScript{

	/**
	 * 脚本ID
	 */
	private String scriptId;

	/**
	 * 流程定义ID
	 */
	private String defId;

	/**
	 * ACTIVITI流程定义ID
	 */
	private String actDefId;

	/**
	 * 节点ID
	 */
	private String nodeId;

	/**
	 * 脚本类型(1.事件前置脚本 2.事件后置脚本 3.脚本节点)
	 */
	private String scriptType;

	/**
	 * 脚本
	 */
	private String script;

	/**
	 * 备注
	 */
	private String remark;


	public String getScriptId(){
		return this.scriptId;
	}
	
	public void setScriptId(String scriptId){
		this.scriptId = scriptId;
	}

	public String getDefId(){
		return this.defId;
	}
	
	public void setDefId(String defId){
		this.defId = defId;
	}

	public String getActDefId(){
		return this.actDefId;
	}
	
	public void setActDefId(String actDefId){
		this.actDefId = actDefId;
	}

	public String getNodeId(){
		return this.nodeId;
	}
	
	public void setNodeId(String nodeId){
		this.nodeId = nodeId;
	}

	public String getScriptType(){
		return this.scriptType;
	}
	
	public void setScriptType(String scriptType){
		this.scriptType = scriptType;
	}

	public String getScript(){
		return this.script;
	}
	
	public void setScript(String script){
		this.script = script;
	}

	public String getRemark(){
		return this.remark;
	}
	
	public void setRemark(String remark){
		this.remark = remark;
	}
}
