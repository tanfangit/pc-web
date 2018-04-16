<%@ page contentType="text/html;charset=UTF-8" language="java"%>
<%@include file="/WEB-INF/webpage/common/taglibs.jspf"%>
<!DOCTYPE html>
<html>
<head>
  <title>车系列表</title>
  <meta name="decorator" content="list"/>
</head>
<body title="车系">
<grid:grid id="carTrainGridId" url="${adminPath}/cartrain/ajaxList">
	<grid:column label="sys.common.key" hidden="true"   name="id" width="100"/>
	<grid:column label="sys.common.opt"  name="opt" formatter="button" width="100"/>
	<grid:button groupname="opt" function="delete" />
	<grid:button title="sys.common.query"  groupname="opt" function="openDetailDialog"  outclass="btn-warning" innerclass="fa-remove" url="${adminPath}/cartrain/{id}/detail" />
    <grid:button groupname="opt" onclick="test(row.id,row.trainNo)" outclass="btn-warning" title="打开子页面" />
    <grid:column label="备注信息"  name="remarks" />
    <grid:column label="车系名称"  name="trainName"  query="true"  queryMode="input"  condition="eq" />
    <grid:column label="车系编号"  name="trainNo" />
    <grid:column label="所属品牌"  name="carBrand.brandName" queryName="carBrand.id" query="true"  queryMode="select"  condition="eq"  dict="carbrand" selectSql="select brand_name label, id value from  car_brand" />
	<grid:toolbar function="create" winwidth="1000px" winheight="700px" />
	<grid:toolbar function="update" winwidth="1000px" winheight="700px"/>
	<grid:toolbar function="delete"/>
	
	<grid:toolbar function="search"/>
	<grid:toolbar function="reset"/>
</grid:grid>
<script type="text/javascript">
    function test(rowid,trainNo){
    	window.location.href="${adminPath}/cartrain/"+rowid+"/detail";
    	alert(rowid);
    }
</script>
</body>
</html>