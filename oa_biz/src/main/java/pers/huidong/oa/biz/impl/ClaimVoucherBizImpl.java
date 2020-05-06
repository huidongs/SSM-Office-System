package pers.huidong.oa.biz.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pers.huidong.oa.biz.ClaimVoucherBiz;
import pers.huidong.oa.dao.ClaimVoucherDao;
import pers.huidong.oa.dao.ClaimVoucherItemDao;
import pers.huidong.oa.dao.DealRecordDao;
import pers.huidong.oa.entity.ClaimVoucher;
import pers.huidong.oa.entity.ClaimVoucherItem;
import pers.huidong.oa.entity.DealRecord;
import pers.huidong.oa.global.Contant;

import java.util.Date;
import java.util.List;

/**
 * @program: oa
 * @auther: HuiDong
 * @date: 2020/5/6 9:58
 * @description:
 */
@Service("claimVoucherBiz")
public class ClaimVoucherBizImpl implements ClaimVoucherBiz {

    @Autowired
    private ClaimVoucherDao claimVoucherDao;
    @Autowired
    private ClaimVoucherItemDao claimVoucherItemDao;
    @Autowired
    private DealRecordDao dealRecordDao;

    public void save(ClaimVoucher claimVoucher, List<ClaimVoucherItem> items) {
        claimVoucher.setCreateTime(new Date());
        claimVoucher.setNextDealSn(claimVoucher.getCreateSn());
        claimVoucher.setStatus(Contant.CLAIMVOUCHER_CREATED);
        claimVoucherDao.insert(claimVoucher);

        for (ClaimVoucherItem item:items) {item.setClaimVoucherId(claimVoucher.getId());
             claimVoucherItemDao.insert(item);
        }
    }

    public ClaimVoucher get(int id) {
        return claimVoucherDao.select(id);
    }

    public List<ClaimVoucherItem> getItems(int cvid) {
        return claimVoucherItemDao.selectByClaimVoucher(cvid);
    }

    public List<DealRecord> getRecords(int cvid) {
        return dealRecordDao.selectByClaimVoucher(cvid);
    }
}
