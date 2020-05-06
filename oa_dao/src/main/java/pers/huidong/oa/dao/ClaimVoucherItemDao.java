package pers.huidong.oa.dao;

import org.springframework.stereotype.Repository;
import pers.huidong.oa.entity.ClaimVoucherItem;

import java.util.List;

/**
 * @auther huidong
 * @date 2020/5/6 8:53
 */
@Repository("claimVoucherItemDao")
public interface ClaimVoucherItemDao {

    void insert(ClaimVoucherItem claimVoucherItem);
    void update(ClaimVoucherItem claimVoucherItem);
    void delete(int id);
    List<ClaimVoucherItem> selectByClaimVoucher(int cvid);
}
