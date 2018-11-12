<%@page pageEncoding="UTF-8" isELIgnored="false" %>

<div style="text-align: center;">
    <form id="saveActicleInputForm" class="easyui-form" method="post" enctype="multipart/form-data">
        <div style="margin-top: 70px;">
            标题: <input type="text" name="title" class="easyui-textbox" data-options="required:true,">
        </div>
        <div style="margin-top: 20px;">
            内容: <input type="text" name="content"  class="easyui-textbox">
        </div>

        <div style="margin-top: 20px;">
            插图: <input type="text" name="file"  class="easyui-filebox" data-options="required:true,buttonAlign:'left'">
        </div>

        <div style="margin-top: 20px;">
            创建时间: <input  name="publishDate"  class="easyui-datebox">
        </div>

        <div style="margin-top: 20px;">
            作者: <input type="text" name="guru_name"  class="easyui-textbox">
        </div>

    </form>
</div>