package cn.jeeweb.modules.cartype.service.impl;

import cn.jeeweb.core.common.service.impl.CommonServiceImpl;
import cn.jeeweb.modules.cartype.mapper.CarTypeMapper;
import cn.jeeweb.modules.cartype.entity.CarType;
import cn.jeeweb.modules.cartype.service.ICarTypeService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**   
 * @Title: CarType
 * @Description: 车型
 * @author tanfan
 * @date 2018-04-16 11:07:20
 * @version V1.0   
 *
 */
@Transactional
@Service("carTypeService")
public class CarTypeServiceImpl  extends CommonServiceImpl<CarTypeMapper,CarType> implements  ICarTypeService {

}
