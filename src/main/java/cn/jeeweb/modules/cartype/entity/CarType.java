package cn.jeeweb.modules.cartype.entity;

import cn.jeeweb.core.common.entity.AbstractEntity;
import cn.jeeweb.modules.cartrain.entity.CarTrain;
import cn.jeeweb.modules.sys.entity.User;
import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.annotations.TableName;
import com.baomidou.mybatisplus.enums.FieldFill;
import com.baomidou.mybatisplus.enums.IdType;

import java.util.Date;

/**   
 * @Title: CarType
 * @Description: 车型
 * @author tanfan
 * @date 2018-04-16 11:07:20
 * @version V1.0   
 *
 */
@TableName("car_type")
@SuppressWarnings("serial")
public class CarType extends AbstractEntity<String> {

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
    /**车型名称*/
    @TableField(value = "type_name")
	private String typeName;
    /**车型编号*/
    @TableField(value = "type_no")
	private String typeNo;
    /**所属车系id*/
    @TableField(value = "train_id",el="carTrain.id")
	private CarTrain carTrain;
    /**备注信息*/
    @TableField(value = "remarks")
	private String remarks;
    /**车型图片*/
    @TableField(value = "img")
	private String img;
	
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
	 * 获取  typeName
	 *@return: String  车型名称
	 */
	public String getTypeName(){
		return this.typeName;
	}

	/**
	 * 设置  typeName
	 *@param: typeName  车型名称
	 */
	public void setTypeName(String typeName){
		this.typeName = typeName;
	}
	/**
	 * 获取  typeNo
	 *@return: String  车型编号
	 */
	public String getTypeNo(){
		return this.typeNo;
	}

	/**
	 * 设置  typeNo
	 *@param: typeNo  车型编号
	 */
	public void setTypeNo(String typeNo){
		this.typeNo = typeNo;
	}
	/**
	 * 获取  carTrain
	 *@return: CarTrain  所属车系id
	 */
	public CarTrain getCarTrain(){
		return this.carTrain;
	}

	/**
	 * 设置  carTrain
	 *@param: carTrain  所属车系id
	 */
	public void setCarTrain(CarTrain carTrain){
		this.carTrain = carTrain;
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
	 * 获取  img
	 *@return: String  车型图片
	 */
	public String getImg(){
		return this.img;
	}

	/**
	 * 设置  img
	 *@param: img  车型图片
	 */
	public void setImg(String img){
		this.img = img;
	}
	
}
