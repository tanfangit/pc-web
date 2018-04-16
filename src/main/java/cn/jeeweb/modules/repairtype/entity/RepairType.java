package cn.jeeweb.modules.repairtype.entity;

import cn.jeeweb.core.common.entity.AbstractEntity;
import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.annotations.TableName;
import com.baomidou.mybatisplus.enums.IdType;

import java.util.Date;

/**   
 * @Title: 维修类别
 * @Description: 维修类别
 * @author zhangqiao
 * @date 2018-04-16 20:36:15
 * @version V1.0   
 *
 */
@TableName("tb_repair_type")
@SuppressWarnings("serial")
public class RepairType extends AbstractEntity<String> {

    /**维修类别id*/
    @TableId(value = "id", type = IdType.UUID)
	private String Id;
    /**维修类别编号*/
    @TableField(value = "repair_type_no")
	private String repairTypeNo;
    /**维修类别名称*/
    @TableField(value = "repair_type_name")
	private String repairTypeName;
    /**备注*/
    @TableField(value = "remark")
	private String remark;
    /**状态  0：禁用   1：正常  2：删除*/
    @TableField(value = "status")
	private Short status;
    /**创建时间*/
    @TableField(value = "create_time")
	private Date createTime;
    /**创建人*/
    @TableField(value = "create_user")
	private String createUser;
    /**更新时间*/
    @TableField(value = "update_time")
	private Date updateTime;
    /**更新人*/
    @TableField(value = "update_user")
	private String updateUser;

	@Override
	public String getId() {
		return Id;
	}

	@Override
	public void setId(String id) {
		Id = id;
	}

	/**
	 * 获取  repairTypeNo
	 *@return: String  维修类别编号
	 */
	public String getRepairTypeNo(){
		return this.repairTypeNo;
	}

	/**
	 * 设置  repairTypeNo
	 *@param: repairTypeNo  维修类别编号
	 */
	public void setRepairTypeNo(String repairTypeNo){
		this.repairTypeNo = repairTypeNo;
	}
	/**
	 * 获取  repairTypeName
	 *@return: String  维修类别名称
	 */
	public String getRepairTypeName(){
		return this.repairTypeName;
	}

	/**
	 * 设置  repairTypeName
	 *@param: repairTypeName  维修类别名称
	 */
	public void setRepairTypeName(String repairTypeName){
		this.repairTypeName = repairTypeName;
	}
	/**
	 * 获取  remark
	 *@return: String  备注
	 */
	public String getRemark(){
		return this.remark;
	}

	/**
	 * 设置  remark
	 *@param: remark  备注
	 */
	public void setRemark(String remark){
		this.remark = remark;
	}
	/**
	 * 获取  status
	 *@return: Short  状态  0：禁用   1：正常  2：删除
	 */
	public Short getStatus(){
		return this.status;
	}

	/**
	 * 设置  status
	 *@param: status  状态  0：禁用   1：正常  2：删除
	 */
	public void setStatus(Short status){
		this.status = status;
	}
	/**
	 * 获取  createTime
	 *@return: Date  创建时间
	 */
	public Date getCreateTime(){
		return this.createTime;
	}

	/**
	 * 设置  createTime
	 *@param: createTime  创建时间
	 */
	public void setCreateTime(Date createTime){
		this.createTime = createTime;
	}
	/**
	 * 获取  createUser
	 *@return: String  创建人
	 */
	public String getCreateUser(){
		return this.createUser;
	}

	/**
	 * 设置  createUser
	 *@param: createUser  创建人
	 */
	public void setCreateUser(String createUser){
		this.createUser = createUser;
	}
	/**
	 * 获取  updateTime
	 *@return: Date  更新时间
	 */
	public Date getUpdateTime(){
		return this.updateTime;
	}

	/**
	 * 设置  updateTime
	 *@param: updateTime  更新时间
	 */
	public void setUpdateTime(Date updateTime){
		this.updateTime = updateTime;
	}
	/**
	 * 获取  updateUser
	 *@return: String  更新人
	 */
	public String getUpdateUser(){
		return this.updateUser;
	}

	/**
	 * 设置  updateUser
	 *@param: updateUser  更新人
	 */
	public void setUpdateUser(String updateUser){
		this.updateUser = updateUser;
	}
	
}
