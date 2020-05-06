package pers.huidong.oa.dto;

import pers.huidong.oa.entity.ClaimVoucher;
import pers.huidong.oa.entity.ClaimVoucherItem;

import java.util.List;

/**
 * @program: oa
 * @auther: HuiDong
 * @date: 2020/5/6 10:13
 * @description: 获取ClaimVoucher信息
 */
public class ClaimVoucherInfo {

    private ClaimVoucher claimVoucher;
    private List<ClaimVoucherItem> items;

    public ClaimVoucher getClaimVoucher() {
        return claimVoucher;
    }

    public void setClaimVoucher(ClaimVoucher claimVoucher) {
        this.claimVoucher = claimVoucher;
    }

    public List<ClaimVoucherItem> getItems() {
        return items;
    }

    public void setItems(List<ClaimVoucherItem> items) {
        this.items = items;
    }
}
