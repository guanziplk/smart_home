<%--
  Created by IntelliJ IDEA.
  User: 54230
  Date: 2019/7/23 0023
  Time: 10:24
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
    家电名：${repairForm.setErrorApplianceName()}<br/>
    维修人：${repairForm.getRepairMan()}<br/>
    提交状态：${repairForm.getUploadFlag()}<br/>
    修理状态：${repairForm.getFinishFlag()}<br/>
    <br/>
</body>
</html>
