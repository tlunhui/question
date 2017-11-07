<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8" %>
<%@ include file="../commons/taglibs.jsp" %>
<div class="modal fade" id="myModal" tabindex="-1" role="dialog" aria-labelledby="myModalLabel" aria-hidden="true">
    <div class="modal-dialog">
        <div class="modal-content">
            <div class="modal-header">
                <button type="button" class="close" data-dismiss="modal" aria-hidden="true">
                </button>
                <h4 class="modal-title" id="myModalLabel1">
                    提示
                </h4>
            </div>
            <div class="modal-body">
                <div id="tipMessage">${msg}</div>
            </div>
            <div class="modal-footer">
                <button type="button" class="btn btn-primary" onclick="window.location.href = ctx + '/';">关闭</button>
            </div>
        </div>
    </div>
</div>
<div class="modal fade" id="ajaxModal" tabindex="-1" role="dialog" aria-labelledby="myModalLabel" aria-hidden="true">
    <div class="modal-dialog">
        <div class="modal-content">
            <div class="modal-header">
                <button type="button" class="close" data-dismiss="modal" aria-hidden="true">
                </button>
                <h4 class="modal-title" id="myModalLabel">
                    提示
                </h4>
            </div>
            <div class="modal-body">
                <div id="errorMessage"></div>
            </div>
            <div class="modal-footer">
                <a href="#" class="btn btn-success" data-dismiss="modal">关闭</a>
            </div>
        </div>
    </div>
</div>
<script type="text/javascript">
    function showModelNoBack(msg) {
        $("#errorMessage").html(msg);
        $("#ajaxModal").modal("show");
    }
    function showModelBack(msg) {
        $("#tipMessage").html(msg);
        $("#myModal").modal({backdrop: 'static', keyboard: false}).modal("show"); //禁用点击空白地方关闭modal框
    }
</script>