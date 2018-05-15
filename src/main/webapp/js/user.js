function editPw() {
    var oldPw = $("#oldPw").val();
    var newPw = $("#newPw").val();
    var checkPw = $("#checkPw").val();
    if (8 > newPw.length){
        alert("新密码长度不足8位字符，请重新输入");
    }
    if (newPw != checkPw) {
        alert("请确认密码一致");
        return;
    }
    var json = {
        "oldPw": oldPw,
        "newPw": checkPw
    }
    $.ajax({
        url: "/user",
        type: "PUT",
        contentType: "application/json",
        traditional:true,
        data: JSON.stringify(json),
        success:function (d) {
            alert(d.msg);
        }
    })
}