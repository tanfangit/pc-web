<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@include file="/WEB-INF/webpage/common/taglibs.jspf"%>
<!DOCTYPE html>
<html>
<head>
	<title>维修类别</title>
	<meta name="decorator" content="form"/>
	<html:css name="bootstrap-fileinput" />
	<html:css name="simditor" />
</head>

<body class="white-bg"  formid="repairTypeForm">
<form:form id="repairTypeForm" modelAttribute="data" method="post" class="form-horizontal">
	<form:hidden path="id"/>
	<table  class="table table-bordered  table-condensed dataTables-example dataTable no-footer">
		<tbody>
		<tr>
			<td  class="width-15 active text-right">
				<label><font color="red">*</font>维修类别编号:</label>
			</td>
			<td class="width-35">
				<form:input path="repairTypeNo" htmlEscape="false" class="form-control"  datatype="*"  nullmsg="维修类别编号不能为空"  />
				<label class="Validform_checktip"></label>
			</td>
			<td  class="width-15 active text-right">
				<label><font color="red">*</font>维修类别名称:</label>
			</td>
			<td class="width-35">
				<form:input path="repairTypeName" htmlEscape="false" class="form-control"  datatype="*"  nullmsg="维修类别名称不能为空"  />
				<label class="Validform_checktip"></label>
			</td>
		</tr>
		<tr>
			<td  class="width-15 active text-right">
				<label><font color="red">*</font>备注:</label>
			</td>
			<td class="width-35">
				<form:input path="remark" htmlEscape="false" class="form-control"  datatype="*"  nullmsg="备注信息不能为空"  />
				<label class="Validform_checktip"></label>
			</td>
			<td class="width-15 active text-right"></td>
			<td class="width-35" ></td>
		</tr>

		</tbody>
	</table>
</form:form>
<html:js name="bootstrap-fileinput" />
<html:js name="simditor" />
</body>
</html>