
layui.use(['func'], function () {

    //声明变量
    var func = layui.func
        , $ = layui.$;

    if (A == 'index') {
        //【TABLE列数组】
        var cols = [
            {type: 'checkbox', fixed: 'left'}
            , {field: 'id', width: 60, title: 'ID', align: 'center', sort: true, fixed: 'left'}
            , {field: 'name', width: 100, title: '产品名称', align: 'center'}
            , {field: 'price', width: 60, title: '价格', align: 'center'}
            , {field: 'inventory', width: 60, title: '库存', align: 'center'}
            , {field: 'sold', width: 60, title: '已出售', align: 'center'}
            , {field: 'country', width: 100, title: '所属国家/地区', align: 'center'}
            , {field: 'status', width: 80, title: '状态', align: 'center', templet: '#statusTpl'}
            , {field: 'createUserName', width: 100, title: '添加人', align: 'center'}
            , {field: 'createTime', width: 180, title: '创建时间', align: 'center'}
            , {field: 'updateUserName', width: 100, title: '更新人', align: 'center'}
            , {field: 'updateTime', width: 180, title: '更新时间', align: 'center'}
            , {fixed: 'right', width: 150, title: '功能操作', align: 'center', toolbar: '#toolBar'}
        ];

        //【渲染TABLE】
        func.tableIns(cols, "tableList");



        //【设置弹框】
        func.setWin("产品");

        //【设置状态】
        func.formSwitch('status', null, function (data, res) {
            console.log("开关回调成功");
        });
    }
});
