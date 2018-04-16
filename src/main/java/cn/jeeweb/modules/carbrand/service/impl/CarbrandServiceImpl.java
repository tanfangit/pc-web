package cn.jeeweb.modules.carbrand.service.impl;

import cn.jeeweb.core.common.service.impl.CommonServiceImpl;
import cn.jeeweb.modules.carbrand.mapper.CarbrandMapper;
import cn.jeeweb.modules.carbrand.entity.Carbrand;
import cn.jeeweb.modules.carbrand.service.ICarbrandService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**   
 * @Title: Carbrand
 * @Description: 车辆品牌管理
 * @author tanfan
 * @date 2018-04-14 20:58:19
 * @version V1.0   
 *
 */
@Transactional
@Service("carbrandService")
public class CarbrandServiceImpl  extends CommonServiceImpl<CarbrandMapper,Carbrand> implements  ICarbrandService {

}
