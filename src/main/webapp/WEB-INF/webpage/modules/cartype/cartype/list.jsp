<%@ page contentType="text/html;charset=UTF-8" language="java"%>
<%@include file="/WEB-INF/webpage/common/taglibs.jspf"%>
<!DOCTYPE html>
<html>
<head>
  <title>CarType列表</title>
  <meta name="decorator" content="list"/>
</head>
<body title="CarType">
<grid:grid id="carTypeGridId" url="${adminPath}/cartype/cartype/ajaxList">
	<grid:column label="sys.common.key" hidden="true"   name="id" width="100"/>
	<grid:column label="sys.common.opt"  name="opt" formatter="button" width="100"/>
	<grid:button groupname="opt" function="delete" />
    <grid:column label="车型名称"  name="typeName"  query="true"  queryMode="input"  condition="eq" />
    <grid:column label="车型编号"  name="typeNo" />
    <grid:column label="所属车系"  name="carTrain.trainName"  queryName="carTrain.id" query="true"  queryMode="select"  condition="eq" dict="carTrain" selectSql="select train_names label, id value from  car_train" />
    <grid:column label="备注信息"  name="remarks" />
	<grid:toolbar function="create"/>
	<grid:toolbar function="update"/>
	<grid:toolbar function="delete"/>
	
	<grid:toolbar function="search"/>
	<grid:toolbar function="reset"/>
</grid:grid>
</body>
</html>