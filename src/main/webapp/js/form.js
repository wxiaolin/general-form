function delForm(id) {
    var params = {"id": id};
    console.log(id);
    $.ajax({
        url: "/form",
        type: "DELETE",
        traditional: true,
        data: params,
        success: function (d) {
            alert(d.msg);
            window.location.reload();
        }
    });
}