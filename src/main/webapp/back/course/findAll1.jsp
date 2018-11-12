<%@page isELIgnored="false" pageEncoding="UTF-8" %>

    <script>
        $(function () {

            //通过js创建datagrid
            $("#coursedg1").datagrid({
                url:'${pageContext.request.contextPath}/course/findAll1',//用来请求远程数据
                pagination:true,//显示分页工具栏
                width:1300,
                height:700,
                fit:true,
                pageNumber:1,//当前页
                pageSize:5,//每页显示记录数
                pageList:[2,5,10,15,30,500],
                striped:true,//是否显示斑马线效果。
                rownumbers:true,//如果为true，则显示一个行号列。
                singleSelect:false,//如果为true，则只允许选择一行
                ctrlSelect:true,//在启用多行选择的时候允许使用Ctrl键+鼠标点击的方式进行多选操作。
                //checkOnSelect:false, 如果为true，当用户点击行的时候该复选框就会被选中或取消选中。如果为false，当用户仅在点击该复选框的时候才会呗选中或取消。

                //selectOnCheck:false, 如果为true，单击复选框将永远选择行。如果为false，选择行将不选中复选框。

                queryParams:{//在请求远程数据的时候发送额外的参数。
                    name:"xiaohei",
                },
                remoteSort:false,//定义从服务器对数据进行排序。
                multiSort:true,//定义是否允许多列排序。（该属性自1.3.4版开始可用）
                columns:[[

                    {title:'id',field:'id',width:120,},
                    {title:'title',field:'title',width:120,},

                    {title:'createTime',field:'createTime',width:120,sortable:true,

                    },


                ]],




            });

        });




    </script>

<%--datagrid数据表格--%>
<table id="coursedg1"></table>

