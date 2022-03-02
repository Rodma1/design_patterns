package com.chen.设计原则.demo5;

/**
 * @author: 那就叫小智吧
 * @date: 2022/3/2 11:07
 * @Description: 经纪人
 */
public class Agent {

    // 明星
    private Star star;

    // 公司
    private Company company;

    public Star getStar() {
        return star;
    }

    public void setStar(Star star) {
        this.star = star;
    }

    public Company getCompany() {
        return company;
    }

    public void setCompany(Company company) {
        this.company = company;
    }
    public void business() {
        System.out.println(company.getName() + "与明星" + star.getName() + "洽淡业务。");
    }

}

