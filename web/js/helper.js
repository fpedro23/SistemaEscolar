/**
 * Created by mng687 on 2/19/15.
 */
function getToday() {
    var date = new Date();
    var year = date.getFullYear();
    var month = date.getMonth() + 1;
    var day   = date.getDate();

    if(month < 10)
        month = '0' + month;
    if(day < 10)
        day = '0' + day;
    return year + '-' + month + '-' + day;
}

function timeParse(time) {
    if(time)
        return Date.parse('01/01/2011 ' + time);
    else
        return Date.parse('01/01/2011 00:00:00');
}
