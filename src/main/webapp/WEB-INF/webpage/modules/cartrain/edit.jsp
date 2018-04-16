<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@include file="/WEB-INF/webpage/common/taglibs.jspf"%>
<!DOCTYPE html>
<html>
<head>
    <title>车系</title>
    <meta name="decorator" content="form"/>
    <html:css name="bootstrap-fileinput" />
    <html:css name="simditor" />
</head>

<body class="white-bg"  formid="carTrainForm">
    <form:form id="carTrainForm" modelAttribute="data" method="post" class="form-horizontal">
		<form:hidden path="id"/>
		<table  class="table table-bordered  table-condensed dataTables-example dataTable no-footer">
		   <tbody>
				<tr>
					<td  class="width-15 active text-right">	
		              <label>备注信息:</label>
		            </td>
					<td class="width-35">
						<form:input path="remarks" htmlEscape="false" class="form-control"      />
						<label class="Validform_checktip"></label>
					</td>
					<td  class="width-15 active text-right">	
		              <label><font color="red">*</font>车系名称:</label>
		            </td>
					<td class="width-35">
						<form:input path="trainName" htmlEscape="false" class="form-control"  datatype="*"  nullmsg="请填写车系名称"  />
						<label class="Validform_checktip"></label>
					</td>
				</tr>
				<tr>
					<td  class="width-15 active text-right">	
		              <label><font color="red">*</font>车系编号:</label>
		            </td>
					<td class="width-35">
						<form:input path="trainNo" htmlEscape="false" class="form-control"  datatype="*"  nullmsg="请填写车系编号"  />
						<label class="Validform_checktip"></label>
					</td>
					<td  class="width-15 active text-right">	
		              <label><font color="red">*</font>所属品牌id:</label>
		            </td>
					<td class="width-35">
						<form:select path="carBrand.id" htmlEscape="false" class="form-control" selectSql="select brand_name label, id value from  car_brand"  datatype="*"  nullmsg="请选择品牌" onchange="test(this)"  />
						<label class="Validform_checktip"></label>
					</td>
				</tr>
				<tr>
					<td  class="width-15 active text-right">	
		              <label><font color="red">*</font>车系Logo:</label>
		            </td>
					<td class="width-35">
						<form:fileinput showType="avatar" fileInputWidth="100px"  fileInputHeight="100px"  path="trainLogo" htmlEscape="false" class="form-control"  datatype="*"  nullmsg="请选择车系logo"  />
						<label class="Validform_checktip"></label>
					</td>
					<td  class="width-15 active text-right">	
		              <label><font color="red">*</font>车系图片:</label>
		            </td>
					<td class="width-35">
						<form:fileinput showType="avatar" fileInputWidth="100px"  fileInputHeight="100px"  path="trainImg" htmlEscape="false" class="form-control"  datatype="*"  nullmsg="请选择车系图片"  />
						<label class="Validform_checktip"></label>
					</td>
				</tr>
				<%-- <tr>
					<td  class="width-15 active text-right">	
		              <label><font color="red">*</font>车系Logo:</label>
		            </td>
					<td class="width-35">
						<form:select path="carBrand.id" htmlEscape="false" class="form-control"   datatype="*"  nullmsg="请选择品牌" onchange="test(this)"  />
						<label class="Validform_checktip"></label>
					</td>
					<td  class="width-15 active text-right">	
		              <label><font color="red">*</font>车系图片:</label>
		            </td>
					<td class="width-35">
						
						<label class="Validform_checktip"></label>
					</td>
				</tr> --%>
		      
		   </tbody>
		</table>   
	</form:form>
<html:js name="bootstrap-fileinput" />
<html:js name="simditor" />
<script type="text/javascript">
function test(obj){
	alert(obj.value);
}
</script>
</body>
</html>