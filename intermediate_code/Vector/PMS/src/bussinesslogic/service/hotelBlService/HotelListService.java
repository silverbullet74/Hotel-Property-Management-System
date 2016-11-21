package service.service.hotelBlService;

import vo.HotelVo;

import java.util.List;

/**
 * @version 2016-11-13
 * @author ?????? 
 * @description ?????????????????????
 */
public interface HotelListService {
	/**
	 * @version 2016-11-13
     * @author ?????? 
	 * @return ???????��?
	 */
	public List<HotelVo> showHotelList();

	/**
	 * @version 2016-11-13
     * @author ?????? 
	 * @param isRise  ????????
	 * @return   ???��??????
	 */
	public void sortByName(boolean isRise);
	
	/**
	 * @version 2016-11-13
     * @author ?????? 
	 * @param isRise
	 * @return   ???��?????
	 */
	public void sortByStar(boolean isRise);
	
	/**
	 * @version 2016-11-13
     * @author ?????? 
	 * @param isRise
	 * @return   ???��??????
	 */
	public void sortByPoint(boolean isRise);
	
	/**
	 * @version 2016-11-13
     * @author ?????? 
	 * @param isRise
	 * @return   ???��????
	 */
	public void sortByPrice(boolean isRise);
	
	/**
	 * @version 2016-11-13
     * @author ?????? 
	 * @param key
	 * @description ???????????????
	 * @return
	 */
	public List<HotelVo> findHotel(String key);
	
	/**
	 * @version 2016-11-13
     * @author ?????? 
	 * @param least
	 * @param max
	 * @return  ??????????????????
	 */
	public List<HotelVo> findByPoint(double least,double max);
	
	/**
	 * @version 2016-11-13
     * @author ?????? 
	 * @param least
	 * @param max
	 * @return  ?????????????????
	 */
	public List<HotelVo> findByStars(int least,int max);
}