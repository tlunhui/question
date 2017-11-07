/**
 * Created by Stay on 2016/9/15.
 */
$(document).ready(function () {
    $.ajax({
        type: "GET",
        url: ctx + "/problem/newProblems.htm?page=1",
        dataType: "json",
        success: function (data) {
            if (data.code == 0) {
                getProblems(data, "newProblem");
                pagination(data.data, "newProblems", "newProblem", "GET");
            } else {
                showModel(data.msg);
            }
        }
    });
    $("#newProblemId").click(function () {
        $.ajax({
            type: "GET",
            url: ctx + "/problem/newProblems.htm?page=1",
            dataType: "json",
            success: function (data) {
                if (data.code == 0) {
                    getProblems(data, "newProblem");
                    pagination(data.data, "newProblems", "newProblem", "GET");
                } else {
                    showModel(data.msg);
                }
            }
        });
    });
    $("#hotProblemId").click(function () {
        $.ajax({
            type: "GET",
            url: ctx + "/problem/hotProblems.htm?page=1",
            dataType: "json",
            success: function (data) {
                if (data.code == 0) {
                    getProblems(data, "hotProblem");
                    pagination(data.data, "hotProblems", "hotProblem", "GET");
                } else {
                    showModel(data.msg);
                }
            }
        });
    });
    $("#noAnswerProblemId").click(function () {
        $.ajax({
            type: "GET",
            url: ctx + "/problem/noAnswerProblems.htm?page=1",
            dataType: "json",
            success: function (data) {
                if (data.code == 0) {
                    getProblems(data, "noAnswerProblem");
                    pagination(data.data, "noAnswerProblems", "noAnswerProblem", "GET");
                } else {
                    showModel(data.msg);
                }
            }
        });

    });
    $("#myProblemId").click(function () {
        $.ajax({
            type: "POST",
            url: ctx + "/problem/myProblems.htm?page=1",
            dataType: "json",
            success: function (data) {
                if (data.code == 0) {
                    getProblems(data, "myProblem");
                    pagination(data.data, "myProblems", "myProblem", "POST");
                } else {
                    showModelBack(data.msg);
                }
            }
        });
    });
});








