/**
 * Created by Stay on 2016/9/17.
 */
function formatTime(time){
    var date = new Date(time);
    var dateNow = new Date();
    var diffTime = (dateNow.getTime() - date.getTime()) / 1000;
    if (diffTime < 60) {
        return "刚刚";
    }
    else if (diffTime > 60 && diffTime < 3600) {
        return Math.ceil(diffTime / 60) + "分钟前";
    }
    else if (diffTime > 3600 && diffTime < 86400) {
        return Math.ceil(diffTime / 60 / 60) + "小时前";
    } else if (diffTime > 86400 && diffTime < 259000) {
        return Math.ceil(diffTime / 60 / 60 / 24) + "天前";
    } else {
        return (date.getMonth() + 1) + "月" + date.getDate() + "日" + "前";
    }
}
/**
 * 大于1000的显示1.xk
 * 例如:1232    返回  1.2k
 * @param num
 * @returns {*}
 */
function numFormat(num) {
    if (num > 1000) {
        return (num / 1000).toFixed(1) + "k";
    } else {
        return num;
    }
}