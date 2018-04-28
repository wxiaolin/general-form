var names = new Array();
$(".cells-wrapper").each(function () {
    var name = $(this).attr("name");
    if (typeof(name) == undefined || name == null) {
    } else {
        names.push(name);
    }
});
var json = {"names": names};
$.ajax({
    url: "/filler",
    type: "GET",
    traditional: true,
    data: json,
    dataType: "json",
    success: function (d) {
        for (var i = 0; i < names.length; i++) {
            for (var v in d.data) {
                if (names[i] == v) {
                    console.log(d.data[v]);
                    var id = "#" + names[i] + ":last-child";
                }
            }
        }
    }
});
