package com.cyl.wms.domain.vo;

import com.wxs.common.annotation.Excel;
import com.wxs.common.core.domain.BaseAudit;
import lombok.Data;
/**
 * 仓库 数据视图对象
 * 
 * @author zcc
 */
@Data
public class WarehouseVO extends BaseAudit {
   /** ID */
    private Long id;
   /** 仓库编号 */
    @Excel(name = "仓库编号")
    private String warehouseNo;
   /** 仓库名称 */
    @Excel(name = "仓库名称")
    private String warehouseName;
   /** 备注 */
    @Excel(name = "备注")
    private String remark;
}
