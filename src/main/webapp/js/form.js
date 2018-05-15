function delForm(id) {
    var params = {"id": id};
    console.log(id);
    $.ajax({
        url: "/form",
        type: "DELETE",
        traditional: true,
        contentType: "application/json",
        data: JSON.stringify(params),
        success: function (d) {
            if (d.success==true) {
                window.location.reload();
            }
        }
    });
}