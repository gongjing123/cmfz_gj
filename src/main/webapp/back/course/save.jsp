<%@page pageEncoding="UTF-8" %>

<div style="text-align: center;">
    <form id="savecourseInputForm" class="easyui-form" method="post" enctype="multipart/form-data">
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