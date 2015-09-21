package com.casic27.platform.bpm.service.paticipant;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.casic27.platform.bpm.entity.BpmNodeParticipant;
import com.casic27.platform.bpm.entity.TaskExecutor;
import com.casic27.platform.bpm.entity.TaskOpinion;
import com.casic27.platform.bpm.service.TaskOpinionService;
import com.casic27.platform.common.user.entity.User;
import com.casic27.platform.common.user.service.UserService;
import com.casic27.platform.util.StringUtils;
@Component
public class BpmNodeParticipantCalculationSameNode implements IBpmNodeParticipantCalculation {
	@Autowired
	private UserService userService;
	
	@Autowired
	private TaskOpinionService taskOpinionService;
	
	@Override
	public List<User> getExecutor(BpmNodeParticipant bpmNodeParticipant, CalcVars vars) {
		String actInstId = vars.getActInstId();
		List<User> list = new ArrayList<User>();
		if(StringUtils.isEmpty(bpmNodeParticipant.getParticipan())){
			return list;
		}
		TaskOpinion taskOpinion = taskOpinionService.getLatestTaskOpinion(actInstId, bpmNodeParticipant.getParticipan());
		if (taskOpinion != null) {
			list.add(userService.getUserById(taskOpinion.getExeUserId()));
	    }
		return list;
	}

	@Override
	public Set<TaskExecutor> getTaskExecutor(BpmNodeParticipant bpmNodeParticipant, CalcVars paramCalcVars) {
		List<User> userList = getExecutor(bpmNodeParticipant, paramCalcVars);
		return TaskExecutor.getExcutorsByUsers(userList);
	}

	@Override
	public String getTitle() {
		return "已执行节点相同执行人";
	}

	@Override
	public String getKey() {
		return "5";
	}

}
