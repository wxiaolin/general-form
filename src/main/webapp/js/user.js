function editPw(username) {
    var newPw = $("#newPw").val();
    var checkPw = $("#checkPw").val();
    if (newPw != checkPw) {
        alert("请确认密码一致");
        return;
    }
    var json = {
        "username": username,
        "password": checkPw
    }
    $.ajax({
        url: "/user",
        type: "PUT",
        contentType: "application/json",
        traditional:true,
        data: JSON.stringify(json),
        success:function (d) {
            alert(d.meg);
        }
    })
}