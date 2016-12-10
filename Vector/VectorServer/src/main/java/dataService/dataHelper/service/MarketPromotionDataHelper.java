package dataService.dataHelper.service;

import java.util.List;

import common.ResultMessage;
import po.ActivityPromotionPo;
import po.LevelPo;
/**
 * @version 2016-12-10
 * @author 金灵益
 */
public interface MarketPromotionDataHelper {
	/**
	 * 更新网站的活动策略列表
	 * @param po
	 * @return
	 */
	public ResultMessage updateActivity(ActivityPromotionPo po);
	
	/**
	 * 删除一条活动策略
	 * @param po
	 * @return
	 */
	public ResultMessage deleteActivity(ActivityPromotionPo po);
	
	/**
	 * @return 得到网站的活动策略列表
	 */
	public List<String> getActivity();
	
	/**
	 * 网站营销人员更新等级促销策略
	 * @param list
	 * @return
	 */
	public ResultMessage updateLevelRule(List<LevelPo> list);
	
	/**
	 * 得到客户等级促销策略列表
	 * @return
	 */
	public List<LevelPo> getLevelList();
}
