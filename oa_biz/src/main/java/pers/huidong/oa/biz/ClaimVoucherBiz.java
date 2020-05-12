package pers.huidong.oa.biz;

import com.mysql.cj.x.protobuf.Mysqlx;
import pers.huidong.oa.entity.ClaimVoucher;
import pers.huidong.oa.entity.ClaimVoucherItem;
import pers.huidong.oa.entity.DealRecord;

import java.util.List;

/**
 * @auther huidong
 * @date 2020/5/6 9:54
 */
public interface ClaimVoucherBiz {

    void save(ClaimVoucher claimVoucher, List<ClaimVoucherItem> items);

    ClaimVoucher get(int id);
    List<ClaimVoucherItem> getItems(int cvid);
    List<DealRecord> getRecords(int cvid);

    List<ClaimVoucher> getForSelf(String sn);
    List<ClaimVoucher> getForDeal(String sn);

    void update(ClaimVoucher claimVoucher,List<ClaimVoucherItem> items);
    void submit(int id);
    void deal(DealRecord dealRecord);

}
