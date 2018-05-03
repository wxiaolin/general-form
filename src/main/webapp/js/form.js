function editForm(id) {
    $.ajax({
        url: "/form/maker",
        type: "GET",
        data: "id="+id,
        traditional: true,
        success: function (d) {

        }
    })
}

function delForm() {

}