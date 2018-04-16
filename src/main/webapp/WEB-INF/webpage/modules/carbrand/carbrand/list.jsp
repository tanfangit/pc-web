<%@ page contentType="text/html;charset=UTF-8" language="java"%>
<%@include file="/WEB-INF/webpage/common/taglibs.jspf"%>
<!DOCTYPE html>
<html>
<head>
  <title>Carbrand列表</title>
  <meta name="decorator" content="list"/>
</head>
<body title="Carbrand">
<grid:grid id="carbrandGridId" url="${adminPath}/carbrand/carbrand/ajaxList">
	<grid:column label="sys.common.key" hidden="true"   name="id" width="100"/>
	<grid:column label="sys.common.opt"  name="opt" formatter="button" width="100"/>
	<grid:button groupname="opt" function="delete" />
    <grid:column label="备注信息"  name="remarks" />
    <grid:column label="品牌名称"  name="brandName"  query="true"  queryMode="input"  condition="eq" />
    <grid:column label="品牌编号"  name="brandNo" />
	<grid:toolbar function="create"/>
	<grid:toolbar function="update"/>
	<grid:toolbar function="delete"/>
	
	<grid:toolbar function="search"/>
	<grid:toolbar function="reset"/>
</grid:grid>
</body>
</html>