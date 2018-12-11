package com.springboot.modules.system.query;

import com.springboot.modules.system.entity.Order;
import com.springboot.utils.BaseQuery;

public class OrderQuery extends BaseQuery<Order> {

    /**
	 * 
	 */
	private static final long serialVersionUID = 2L;
	/**
     *检测编号标识，如"ATC180001"
     */
    private String reportNum;
    /**
     * 检测描述，UI界面显示使用
     */
    private String description;

    public String getReportNum() {
        return reportNum;
    }

    public void setReportNum(String reportNum) {
        this.reportNum = reportNum;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
