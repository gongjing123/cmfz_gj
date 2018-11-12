<%@page pageEncoding="UTF-8" isELIgnored="false" %>
<script>
    $(function () {
        console.log("${param.id}");
        $("#editActicleInputForm").form('load','${pageContext.request.contextPath}/article/findOne?id=${param.id}');
    })
</script>
<div style="text-align: center;">
    <form id="editActicleInputForm" class="easyui-form" method="post">

           <input type="hidden" name="id" class="easyui-textbox" data-options="required:true,">

        <div style="margin-top: 70px;">
            标题: <input type="text" name="title" class="easyui-textbox" data-options="required:true,">
        </div>
        <div style="margin-top: 20px;">
            内容: <input type="text" name="content"  class="easyui-textbox">
        </div>


        <div style="margin-top: 20px;">
            创建时间: <input  name="publishDate"  class="easyui-datebox">
        </div>

        <div style="margin-top: 20px;">
            作者: <input type="text" name="guru_name"  class="easyui-textbox">
        </div>
    </form>
</div>