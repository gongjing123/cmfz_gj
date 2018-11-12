<%@page pageEncoding="UTF-8" isELIgnored="false" %>
<script>
    $(function () {
        console.log("${param.id}");
        $("#editGuruInputForm").form('load','${pageContext.request.contextPath}/guru/findOne?id=${param.id}');
    })
</script>
<div style="text-align: center;">
    <form id="editGuruInputForm" class="easyui-form" method="post">

        <input type="hidden" name="id" class="easyui-textbox" data-options="required:true,">

        <div style="margin-top: 70px;">
            姓名: <input type="text" name="name" class="easyui-textbox" data-options="required:true,">
        </div>
        <div style="margin-top: 20px;">
            性别: <input type="text" name="gender"  class="easyui-textbox">
        </div>



    </form>
</div>