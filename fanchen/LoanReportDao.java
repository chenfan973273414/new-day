package com.thinkgem.jeesite.modules.statement.dao;

import java.util.List;

import com.thinkgem.jeesite.common.persistence.CrudDao;
import com.thinkgem.jeesite.common.persistence.annotation.MyBatisDao;
import com.thinkgem.jeesite.modules.dealer.entity.DealerBvc;
import com.thinkgem.jeesite.modules.statement.entity.LoanReport;


@MyBatisDao
public interface LoanReportDao extends CrudDao<DealerBvc> {

	public List<LoanReport> getAllInfo(LoanReport dealerReport);
	
}
