<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@include file="/WEB-INF/webpage/common/taglibs.jspf"%>
<!DOCTYPE html>
<html>
<head>
    <title>Carbrand</title>
    <meta name="decorator" content="form"/>
    <html:css name="bootstrap-fileinput" />
    <html:css name="simditor" />
</head>

<body class="white-bg"  formid="carbrandForm">
    <form:form id="carbrandForm" modelAttribute="data" method="post" class="form-horizontal">
		<form:hidden path="id"/>
		<table  class="table table-bordered  table-condensed dataTables-example dataTable no-footer">
		   <tbody>
				<tr>
					
					<td  class="width-15 active text-right">	
		              <label><font color="red">*</font>品牌名称:</label>
		            </td>
					<td class="width-35">
						<form:input path="brandName" htmlEscape="false" class="form-control"  datatype="*"  nullmsg="请填写品牌名称"  />
						<label class="Validform_checktip"></label>
					</td>
					<td  class="width-15 active text-right">	
		              <label><font color="red">*</font>品牌编号:</label>
		            </td>
					<td class="width-35">
						<form:input path="brandNo" htmlEscape="false" class="form-control"  datatype="*"  nullmsg="请填写品牌编号"  />
						<label class="Validform_checktip"></label>
					</td>
				</tr>
				<tr>
					
					<td  class="width-15 active text-right">	
		              <label><font color="red">*</font>品牌logo:</label>
		            </td>
					<%-- <td class="width-35">
						<form:input path="brandLogo" htmlEscape="false" class="form-control"  datatype="*"  nullmsg="请选择品牌logo"  />
						<label class="Validform_checktip"></label>
					</td> --%>
					<td class="width-35">
						<form:fileinput showType="avatar" fileInputWidth="100px"  fileInputHeight="100px"  path="brandLogo" htmlEscape="false" class="form-control"      />
						<label class="Validform_checktip"></label>
					</td>
					<td  class="width-15 active text-right">	
		              <label>备注信息:</label>
		            </td>
					<td class="width-35">
						<form:input path="remarks" htmlEscape="false" class="form-control"      />
						<label class="Validform_checktip"></label>
					</td>
				</tr>
		      
		   </tbody>
		</table>   
	</form:form>
<html:js name="bootstrap-fileinput" />
<html:js name="simditor" />
</body>
</html>