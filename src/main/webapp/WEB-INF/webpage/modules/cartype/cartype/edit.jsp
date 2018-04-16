<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@include file="/WEB-INF/webpage/common/taglibs.jspf"%>
<!DOCTYPE html>
<html>
<head>
    <title>CarType</title>
    <meta name="decorator" content="form"/>
    <html:css name="bootstrap-fileinput" />
    <html:css name="simditor" />
</head>

<body class="white-bg"  formid="carTypeForm">
    <form:form id="carTypeForm" modelAttribute="data" method="post" class="form-horizontal">
		<form:hidden path="id"/>
		<table  class="table table-bordered  table-condensed dataTables-example dataTable no-footer">
		   <tbody>
				<tr>
					<td  class="width-15 active text-right">	
		              <label><font color="red">*</font>车型名称:</label>
		            </td>
					<td class="width-35">
						<form:input path="typeName" htmlEscape="false" class="form-control"  datatype="*"  nullmsg="车型名称不能为空"  />
						<label class="Validform_checktip"></label>
					</td>
					<td  class="width-15 active text-right">	
		              <label><font color="red">*</font>车型编号:</label>
		            </td>
					<td class="width-35">
						<form:input path="typeNo" htmlEscape="false" class="form-control"  datatype="*"  nullmsg="车型编号不能为空"  />
						<label class="Validform_checktip"></label>
					</td>
				</tr>
				<tr>
					<td  class="width-15 active text-right">	
		              <label><font color="red">*</font>所属车系id:</label>
		            </td>
					<td class="width-35">
						<form:select path="carTrain.id" htmlEscape="false" class="form-control"  selectSql="select train_names label, id value from  car_train"    datatype="*"  nullmsg="所属车系不能为空"  />
						<label class="Validform_checktip"></label>
					</td>
					<td  class="width-15 active text-right">	
		              <label><font color="red">*</font>备注信息:</label>
		            </td>
					<td class="width-35">
						<form:input path="remarks" htmlEscape="false" class="form-control"      />
						<label class="Validform_checktip"></label>
					</td>
				</tr>
				<tr>
					<td  class="width-15 active text-right">	
		              <label><font color="red">*</font>车型图片:</label>
		            </td>
					<td class="width-35">
						<form:fileinput showType="avatar" fileInputWidth="100px"  fileInputHeight="100px"  path="img" htmlEscape="false" class="form-control"  datatype="*"  nullmsg="图片不能为空"  />
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