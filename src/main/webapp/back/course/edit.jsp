<%@page pageEncoding="UTF-8" isELIgnored="false" %>
<script>
    $(function () {
        console.log("${param.id}");
        $("#editCourseInputForm").form('load','${pageContext.request.contextPath}/course/findOne?id=${param.id}');
    })
</script>
<div style="text-align: center;">
    <form id="editCourseInputForm" class="easyui-form" method="post">

        <input type="hidden" name="id" class="easyui-textbox" data-options="required:true,">

        <div style="margin-top: 70px;">
            标题: <input type="text" name="title" class="easyui-textbox" data-options="required:true,">
        </div>
        <div style="margin-top: 20px;">
            属性: <input  name="marking"  class="easyui-textbox">
        </div>
        <div style="margin-top: 20px;">
            创建时间: <input  name="createTime"  class="easyui-datebox">
        </div>



    </form>
</div>