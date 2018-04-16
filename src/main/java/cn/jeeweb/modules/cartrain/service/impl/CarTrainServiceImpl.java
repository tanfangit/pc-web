package cn.jeeweb.modules.cartrain.service.impl;

import cn.jeeweb.core.common.service.impl.CommonServiceImpl;
import cn.jeeweb.modules.cartrain.mapper.CarTrainMapper;
import cn.jeeweb.modules.cartrain.entity.CarTrain;
import cn.jeeweb.modules.cartrain.service.ICarTrainService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**   
 * @Title: 车系
 * @Description: 车系
 * @author tanfan
 * @date 2018-04-14 22:18:18
 * @version V1.0   
 *
 */
@Transactional
@Service("carTrainService")
public class CarTrainServiceImpl  extends CommonServiceImpl<CarTrainMapper,CarTrain> implements  ICarTrainService {

}
