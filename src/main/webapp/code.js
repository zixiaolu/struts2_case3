function getCookie(c_name)
{
    let c_start;
    let c_end;
    if (document.cookie.length > 0) {
        c_start = document.cookie.indexOf(c_name + "=")
        if (c_start != -1) {
            c_start = c_start + c_name.length + 1
            c_end = document.cookie.indexOf(";", c_start)
            if (c_end == -1) c_end = document.cookie.length
            return unescape(document.cookie.substring(c_start, c_end))
        }
    }
    return ""
}
function randomNum(minNum,maxNum){
    switch(arguments.length){
        case 1:
            return parseInt(Math.random()*minNum+1,10);
            break;
        case 2:
            return parseInt(Math.random()*(maxNum-minNum+1)+minNum,10);
            break;
        default:
            return 0;
            break;
    }
}

function createCode(){
    var cookie_name="vaild";
    var num=parseInt(getCookie(cookie_name));
    var vaildCodeA;
    var vaildCodeB;
    vaildCodeA=randomNum(1,num);
    vaildCodeB=num-vaildCodeA;
    alert(vaildCodeA+" "+vaildCodeB);
}
