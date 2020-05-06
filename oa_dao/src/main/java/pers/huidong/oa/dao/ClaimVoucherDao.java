package pers.huidong.oa.dao;

import org.springframework.stereotype.Repository;
import pers.huidong.oa.entity.ClaimVoucher;

import java.util.List;

/**
 * @auther huidong
 * @date 2020/5/6 8:53
 */
@Repository("claimVoucherDao")
public interface ClaimVoucherDao {

    void insert(ClaimVoucher claimVoucher);
    void update(ClaimVoucher claimVoucher);
    void delete(int id);
    ClaimVoucher select(int id);
    List<ClaimVoucher> selectByCreateSn(String  csn);
    List<ClaimVoucher> selectByNextDealSn(String ndsn);

}
