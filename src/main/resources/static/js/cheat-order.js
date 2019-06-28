$(function () {




    $('#btSearch').click(function () {
        var totalText = $('#totalText');
        totalText.text("查询中，请耐心等待");
        var maxScore = $('#maxScore').val();

        var minScore = $('#minScore').val();
        var subject = $('#subject').val();
        var checkObj = document.getElementsByName("batchBox");
        var check_val =[];
        var check_string = "";
        for (check in checkObj) {
            if (checkObj[check].checked) {
                check_val.push(checkObj[check].value);
            }
        }
        check_string = check_val.join(",");
        var province = $('#province').val();
        var city = $('#city').val();
        var schools = $('#schools').val();
        var majors = $('#majors').val();
        var groupArr = document.getElementsByName("group");
        var group = "false";
        for(var i=0; i < groupArr.length; i ++){
            if(groupArr[i].checked){
                group = groupArr[i].value;
            }
        }

        var minorityArr = document.getElementsByName("minority");
        var minority = "false";
        for(var i=0; i < minorityArr.length; i ++){
            if(minorityArr[i].checked){
                minority = minorityArr[i].value;
            }
        }


        var tbody = window.document.getElementById("tbody-result");
        $.ajax({
            type: "post",
            dataType: "json",

            url: "/gkwb/major/getMajorByCondition",
            data: {jsonString : "{\"maxScore\":\"" + maxScore
                + "\",\"minScore\":\"" + minScore
                + "\",\"subject\":\"" + subject
                + "\",\"batch\":\"" + check_string
                + "\",\"province\":\"" + province
                + "\",\"city\":\"" + city
                + "\",\"schools\":\"" + schools
                + "\",\"majors\":\"" + majors
                + "\",\"group\":\"" + group
                + "\"}",
                minority : minority
                },
            success: function (msg) {
                var total = msg.total;
                totalText.text("共查询出" + total + "条数据");
                    var str = "";
                    //var obj = jQuery.parseJSON(msg);
                    //var objArray = jQuery.parseJSON()

                    $.each(msg.majorLocationDTOList, function (i, data) {
                        var schooLcation = data.schoolLocation;
                        if (schooLcation == null){
                            str += "<tr>" +
                                "<td align='center'>" + data.subject + "</td>" +
                                "<td align='center'>" + data.batch + "</td>" +
                                "<td align='center'>" + data.schoolId + "</td>" +
                                "<td align='center'>" + data.schoolName + "</td>" +
                                "<td align='center'>" + data.majorId + "</td>" +
                                "<td align='center'>" + data.majorName + "</td>" +
                                "<td align='center'>" + data.amount + "</td>" +
                                "<td align='center'>" + data.oneOneScore + "</td>" +
                                "<td align='center'>" + data.tuitionFee + "</td>" +
                                "<td align='center'>" + data.location + "</td>" +
                                "<td align='center'>" + "未匹配到数据" + "</td>" +
                                "<td align='center'>" + "未匹配到数据" + "</td>" +
                                "<td align='center'>" + "未匹配到数据" + "</td>" +
                                "</tr>";
                        } else {
                            str += "<tr>" +
                                "<td align='center'>" + data.subject + "</td>" +
                                "<td align='center'>" + data.batch + "</td>" +
                                "<td align='center'>" + data.schoolId + "</td>" +
                                "<td align='center'>" + data.schoolName + "</td>" +
                                "<td align='center'>" + data.majorId + "</td>" +
                                "<td align='center'>" + data.majorName + "</td>" +
                                "<td align='center'>" + data.amount + "</td>" +
                                "<td align='center'>" + data.oneOneScore + "</td>" +
                                "<td align='center'>" + data.tuitionFee + "</td>" +
                                "<td align='center'>" + data.location + "</td>" +
                                "<td align='center'>" + schooLcation.department + "</td>" +
                                "<td align='center'>" + schooLcation.province + "</td>" +
                                "<td align='center'>" + schooLcation.city + "</td>" +
                                "</tr>";
                        }

                    })
                    tbody.innerHTML = str;


                // 使用outerHTML属性获取整个table元素的HTML代码（包括<table>标签），然后包装成一个完整的HTML文档，设置charset为urf-8以防止中文乱码
                var html = "<html><head><meta charset='utf-8' /></head><body>" + document.getElementsByTagName("table")[1].outerHTML  + "</body></html>";
                // 实例化一个Blob对象，其构造函数的第一个参数是包含文件内容的数组，第二个参数是包含文件类型属性的对象
                var blob = new Blob([html], { type: "application/vnd.ms-excel" });
                var exp = document.getElementById("export");
                // 利用URL.createObjectURL()方法为a元素生成blob URL
                exp.href = URL.createObjectURL(blob);
                // 设置文件名

            },
            error: function () {
                alert("查询失败")
            }
        });
    });

    $('#export').click(function () {
        var exp = document.getElementById("export");
        var checkObj = document.getElementsByName("batchBox");
        var check_val =[];
        var check_string = "";
        for (check in checkObj) {
            if (checkObj[check].checked) {
                check_val.push(checkObj[check].value);
            }
        }
        check_string = check_val.join(",");
        var downloadText = $('#subject').val();
        if (check_string != undefined) {
            downloadText += check_string;
        }
        if ($('#province').val() != undefined){
            downloadText += $('#province').val();
        }
        if ($('#city').val() != undefined){
            downloadText += $('#city').val();
        }
        if ($('#majors').val() != undefined){
            downloadText += $('#majors').val();
        }
        downloadText += ".xls";
        exp.download = downloadText;
    })
});