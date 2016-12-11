package presentation.controller.impl.marketer;

import presentation.common.SingletonItem;
import presentation.controller.service.marketer.MarketerProInfoViewControllerService;
import vo.ActivityPromotionVo;

import java.time.LocalDate;

/**
 * @author Molloh
 * @version 2016/12/11
 * @description
 */
public class MarketerProInfoViewControllerImpl implements MarketerProInfoViewControllerService {
    private ActivityPromotionVo vo;

    public MarketerProInfoViewControllerImpl() {
        vo = SingletonItem.getInstance().getActivityPromotionVo();
    }

    @Override
    public String getPromotionType() {
        return null;
    }

    @Override
    public String getPromotionName() {
        return null;
    }

    @Override
    public LocalDate getStartDate() {
        return null;
    }

    @Override
    public LocalDate getEndDate() {
        return null;
    }

    @Override
    public String getDiscount() {
        return null;
    }

    @Override
    public void setPromotionName(String name) {

    }

    @Override
    public void setStartDate(LocalDate date) {

    }

    @Override
    public void setEndDate(LocalDate date) {

    }

    @Override
    public void setDiscount(String dis) {

    }

    @Override
    public void delete() {

    }
}
