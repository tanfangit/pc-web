package cn.jeeweb.modules.repairtype.service.impl;

import cn.jeeweb.core.common.service.impl.CommonServiceImpl;
import cn.jeeweb.modules.repairtype.mapper.RepairTypeMapper;
import cn.jeeweb.modules.repairtype.entity.RepairType;
import cn.jeeweb.modules.repairtype.service.IRepairTypeService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**   
 * @Title: 维修类别
 * @Description: 维修类别
 * @author zhangqiao
 * @date 2018-04-16 20:36:15
 * @version V1.0   
 *
 */
@Transactional
@Service("repairTypeService")
public class RepairTypeServiceImpl  extends CommonServiceImpl<RepairTypeMapper,RepairType> implements  IRepairTypeService {

}
