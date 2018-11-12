<%@page pageEncoding="UTF-8" %>

<div style="text-align: center;">
    <form id="saveGuruInputForm" class="easyui-form" method="post" enctype="multipart/form-data">
        <div style="margin-top: 70px;">
            姓名: <input type="text" name="name" class="easyui-textbox" data-options="required:true,">
        </div>
        <div style="margin-top: 20px;">
            性别: <input type="text" name="gender"  class="easyui-textbox">
        </div>
        <div style="margin-top: 20px;">
            图片: <input type="text" name="file"  class="easyui-filebox" data-options="required:true,buttonAlign:'left'">
        </div>

    </form>
</div>