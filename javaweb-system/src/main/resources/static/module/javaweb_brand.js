/**
 * 岗位
 * @auth 鲲鹏
 * @date 2020-04-20
 */
layui.use(['func'], function () {

    //声明变量
    var func = layui.func
        , $ = layui.$;

    if (A == 'index') {
        //【TABLE列数组】
        var cols = [
            {type: 'checkbox', fixed: 'left'}
            , {field: 'id', width: 80, title: 'ID', align: 'center', sort: true, fixed: 'left'}
            , {field: 'logo', width: 80, title: '品牌logo', align: 'center', templet: function (d) {
                            var logoStr = "";
                            if (d.logo) {
                                logoStr = '<a href="' + d.logo + '" target="_blank"><img src="' + d.logo + '" height="26" /></a>';
                            }
                            return logoStr;
                          }
                        }
            , {field: 'name', width: 100, title: '品牌名称', align: 'center'}
            , {field: 'country', width: 100, title: '所属国家/地区', align: 'center'}
            , {field: 'status', width: 100, title: '状态', align: 'center', templet: '#statusTpl'}
            , {field: 'description', width: 100, title: '描述', align: 'center'}
            , {field: 'createTime', width: 180, title: '加入时间', align: 'center'}
            , {field: 'createUserName', width: 100, title: '添加人', align: 'center'}
            , {field: 'updateUserName', width: 100, title: '更新人', align: 'center'}
            , {field: 'updateTime', width: 180, title: '更新时间', align: 'center'}
            , {fixed: 'right', width: 150, title: '功能操作', align: 'center', toolbar: '#toolBar'}
        ];

        //【渲染TABLE】
        func.tableIns(cols, "tableList");

        //【设置弹框】
        func.setWin("品牌");

        //【设置状态】
        func.formSwitch('status', null, function (data, res) {
            console.log("开关回调成功");
        });
    }
});
