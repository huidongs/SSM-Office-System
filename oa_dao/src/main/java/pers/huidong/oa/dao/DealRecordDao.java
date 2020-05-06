package pers.huidong.oa.dao;

import org.springframework.stereotype.Repository;
import pers.huidong.oa.entity.DealRecord;

import java.util.List;

/**
 * @auther huidong
 * @date 2020/5/6 8:54
 */
@Repository("dealRecordDao")
public interface DealRecordDao {
    void insert(DealRecord dealRecord);
    List<DealRecord> selectByClaimVoucher(int cvid);
}
