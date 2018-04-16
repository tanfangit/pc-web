package cn.jeeweb.modules.cartrain.entity;

import cn.jeeweb.core.common.entity.AbstractEntity;
import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.annotations.TableName;
import com.baomidou.mybatisplus.enums.IdType;
import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.enums.FieldFill;
import cn.jeeweb.modules.sys.entity.User;
import java.util.Date;
import cn.jeeweb.modules.carbrand.entity.Carbrand;

/**   
 * @Title: 车系
 * @Description: 车系
 * @author tanfan
 * @date 2018-04-14 22:18:18
 * @version V1.0   
 *
 */
@TableName("car_train")
@SuppressWarnings("serial")
public class CarTrain extends AbstractEntity<String> {

    /**字段主键*/
    @TableId(value = "id", type = IdType.UUID)
	private String id;
    /**创建者*/
    @TableField(value = "create_by",el="createBy.id",fill = FieldFill.INSERT)
	private User createBy;
    /**创建时间*/
    @TableField(value = "create_date",fill = FieldFill.INSERT)
	private Date createDate;
    /**更新者*/
    @TableField(value = "update_by",el="updateBy.id",fill = FieldFill.UPDATE)
	private User updateBy;
    /**更新时间*/
    @TableField(value = "update_date",fill = FieldFill.UPDATE)
	private Date updateDate;
    /**删除标记（0：正常；1：删除）*/
    @TableField(value = "del_flag")
	private String delFlag;
    /**备注信息*/
    @TableField(value = "remarks")
	private String remarks;
    /**车系名称*/
    @TableField(value = "train_names")
	private String trainName;
    /**车系编号*/
    @TableField(value = "train_no")
	private String trainNo;
    /**所属品牌id*/
    @TableField(value = "brand_id",el="carBrand.id")
	private Carbrand carBrand;
    /**车系Logo*/
    @TableField(value = "train_logo")
	private String trainLogo;
    /**车系图片*/
    @TableField(value = "train_img")
	private String trainImg;
	
	/**
	 * 获取  id
	 *@return: String  字段主键
	 */
	public String getId(){
		return this.id;
	}

	/**
	 * 设置  id
	 *@param: id  字段主键
	 */
	public void setId(String id){
		this.id = id;
	}
	/**
	 * 获取  createBy
	 *@return: User  创建者
	 */
	public User getCreateBy(){
		return this.createBy;
	}

	/**
	 * 设置  createBy
	 *@param: createBy  创建者
	 */
	public void setCreateBy(User createBy){
		this.createBy = createBy;
	}
	/**
	 * 获取  createDate
	 *@return: Date  创建时间
	 */
	public Date getCreateDate(){
		return this.createDate;
	}

	/**
	 * 设置  createDate
	 *@param: createDate  创建时间
	 */
	public void setCreateDate(Date createDate){
		this.createDate = createDate;
	}
	/**
	 * 获取  updateBy
	 *@return: User  更新者
	 */
	public User getUpdateBy(){
		return this.updateBy;
	}

	/**
	 * 设置  updateBy
	 *@param: updateBy  更新者
	 */
	public void setUpdateBy(User updateBy){
		this.updateBy = updateBy;
	}
	/**
	 * 获取  updateDate
	 *@return: Date  更新时间
	 */
	public Date getUpdateDate(){
		return this.updateDate;
	}

	/**
	 * 设置  updateDate
	 *@param: updateDate  更新时间
	 */
	public void setUpdateDate(Date updateDate){
		this.updateDate = updateDate;
	}
	/**
	 * 获取  delFlag
	 *@return: String  删除标记（0：正常；1：删除）
	 */
	public String getDelFlag(){
		return this.delFlag;
	}

	/**
	 * 设置  delFlag
	 *@param: delFlag  删除标记（0：正常；1：删除）
	 */
	public void setDelFlag(String delFlag){
		this.delFlag = delFlag;
	}
	/**
	 * 获取  remarks
	 *@return: String  备注信息
	 */
	public String getRemarks(){
		return this.remarks;
	}

	/**
	 * 设置  remarks
	 *@param: remarks  备注信息
	 */
	public void setRemarks(String remarks){
		this.remarks = remarks;
	}
	/**
	 * 获取  trainName
	 *@return: String  车系名称
	 */
	public String getTrainName(){
		return this.trainName;
	}

	/**
	 * 设置  trainName
	 *@param: trainName  车系名称
	 */
	public void setTrainName(String trainName){
		this.trainName = trainName;
	}
	/**
	 * 获取  trainNo
	 *@return: String  车系编号
	 */
	public String getTrainNo(){
		return this.trainNo;
	}

	/**
	 * 设置  trainNo
	 *@param: trainNo  车系编号
	 */
	public void setTrainNo(String trainNo){
		this.trainNo = trainNo;
	}
	/**
	 * 获取  carBrand
	 *@return: Carbrand  所属品牌id
	 */
	public Carbrand getCarBrand(){
		return this.carBrand;
	}

	/**
	 * 设置  carBrand
	 *@param: carBrand  所属品牌id
	 */
	public void setCarBrand(Carbrand carBrand){
		this.carBrand = carBrand;
	}
	/**
	 * 获取  trainLogo
	 *@return: String  车系Logo
	 */
	public String getTrainLogo(){
		return this.trainLogo;
	}

	/**
	 * 设置  trainLogo
	 *@param: trainLogo  车系Logo
	 */
	public void setTrainLogo(String trainLogo){
		this.trainLogo = trainLogo;
	}
	/**
	 * 获取  trainImg
	 *@return: String  车系图片
	 */
	public String getTrainImg(){
		return this.trainImg;
	}

	/**
	 * 设置  trainImg
	 *@param: trainImg  车系图片
	 */
	public void setTrainImg(String trainImg){
		this.trainImg = trainImg;
	}
	
}
