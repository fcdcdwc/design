package com.fcdcdwc.pattern.mediator;

/**
 * @version v1.0
 * @ClassName: MediatorStructure
 * @Description: 具体的中介者角色类
 * @Author: fcdcdwc
 */
public class MediatorStructure extends Mediator {

    //聚合房主和租房者对象
    private HouseOwner houseOwner;
    private Tenant tenant;

    private Liyandi liyandi;

    public HouseOwner getHouseOwner() {
        return houseOwner;
    }

    public void setHouseOwner(HouseOwner houseOwner) {
        this.houseOwner = houseOwner;
    }

    public Tenant getTenant() {
        return tenant;
    }

    public void setTenant(Tenant tenant) {
        this.tenant = tenant;
    }

    public void constact(String message, Person person) {
        if (person == houseOwner) {
            tenant.getMessage(message);
        } else if (person == liyandi) {
            liyandi.getMessage(message);
        } else {
            houseOwner.getMessage(message);

        }
    }
}
