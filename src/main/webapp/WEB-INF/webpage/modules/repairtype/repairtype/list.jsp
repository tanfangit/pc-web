<%@ page contentType="text/html;charset=UTF-8" language="java"%>
<%@include file="/WEB-INF/webpage/common/taglibs.jspf"%>
<!DOCTYPE html>
<html>
<head>
  <title>维修类别列表</title>
  <meta name="decorator" content="list"/>
</head>
<body title="维修类别">
<grid:grid id="repairTypeGridId" url="${adminPath}/repairtype/repairtype/ajaxList">
	<grid:column label="sys.common.key" hidden="true"   name="id" width="100"/>
	<grid:column label="sys.common.opt"  name="opt" formatter="button" width="100"/>
	<grid:button groupname="opt" function="delete" />
	<grid:button title="sys.common.query"  groupname="opt" function="openDetailDialog"  outclass="btn-warning" innerclass="fa-remove" url="${adminPath}/repairtype/repairtype/{id}/detail" />
    <grid:column label="维修类别编号"  name="repairTypeNo"  query="true"  queryMode="input"  condition="eq" />
    <grid:column label="维修类别名称"  name="repairTypeName"  query="true"  queryMode="input"  condition="like" />
    <grid:column label="备注"  name="remark" />
    <grid:column label="创建时间"  name="createTime" />
	<grid:toolbar function="create"/>
	<grid:toolbar function="update"/>
	<grid:toolbar function="delete"/>
	
	<grid:toolbar function="search"/>
	<grid:toolbar function="reset"/>
</grid:grid>
</body>
</html>