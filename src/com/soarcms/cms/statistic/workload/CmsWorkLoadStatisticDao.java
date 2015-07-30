package com.soarcms.cms.statistic.workload;

import java.util.Date;

import com.soarcms.cms.statistic.workload.CmsWorkLoadStatistic.CmsWorkLoadStatisticDateKind;

public interface CmsWorkLoadStatisticDao {
	public Long  statistic(Integer channelId,
			Integer reviewerId, Integer authorId, Date beginDate, Date endDate,CmsWorkLoadStatisticDateKind dateKind);
}
