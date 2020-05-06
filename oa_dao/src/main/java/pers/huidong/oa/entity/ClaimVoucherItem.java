package pers.huidong.oa.entity;

/**
 * @program: oa
 * @auther: HuiDong
 * @date: 2020/5/6 8:45
 * @description:
 */
public class ClaimVoucherItem {
    private Integer id;
    private Integer claimVoucherId;
    private String item;
    private Double amount;
    private String content;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getClaimVoucherId() {
        return claimVoucherId;
    }

    public void setClaimVoucherId(Integer claimVoucherId) {
        this.claimVoucherId = claimVoucherId;
    }

    public String getItem() {
        return item;
    }

    public void setItem(String item) {
        this.item = item;
    }

    public Double getAmount() {
        return amount;
    }

    public void setAmount(Double amount) {
        this.amount = amount;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }
}
