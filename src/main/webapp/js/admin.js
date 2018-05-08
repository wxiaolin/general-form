function changeState(id, state) {
    var json = {
        "id": id,
        "astatus": state
    };
    $.ajax({
        url: '/admin/user',
        type: 'PUT',
        traditional: true,
        contentType: 'application/json',
        data: JSON.stringify(json),
        success: function (d) {
            alert(d.msg);
            window.location.reload();
        }
    });
}

function resetPw(id) {
    var json = {
        "id": id
    };
    $.ajax({
        url: '/admin/user?resetpw',
        type: 'PUT',
        traditional: true,
        contentType: 'application/json',
        data: JSON.stringify(json),
        success: function (d) {
            alert(d.msg);
        }
    });
}

function addRole(id, role) {
    var json = {
        "userId": id,
        "roleId": role
    };
    $.ajax({
        url: '/admin/user/role',
        type: 'POST',
        traditional: true,
        contentType: 'application/json',
        data: JSON.stringify(json),
        success: function (d) {
            alert(d.msg);
            window.location.reload();
        }
    });
}

function delRole(id, role) {
    var json = {
        "userId": id,
        "roleId": role
    };
    $.ajax({
        url: '/admin/user/role',
        type: 'DELETE',
        traditional: true,
        contentType: 'application/json',
        data: JSON.stringify(json),
        success: function (d) {
            alert(d.msg);
            window.location.reload();
        }
    });
}

function searchUsers() {
    var str = $("#queryUsername").val();
    window.location.href='?str='+str;
}

function searchUsersWithAuthc() {
    var str = $("#queryUsername").val();
    window.location.href='?authc=true';
}
