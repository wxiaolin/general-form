/**
 * Created by haibao on 2018/4/5.
 */
function mode1Line1() {
    for (var i = 0; i < 3; i++) {
        var input1 = $('<input class="cell" />');
        input1.addClass("cell cell-normal");
        input1.width(90);
        $("#form").append(input1);
        var input2 = $('<input class="cell" />');
        input2.addClass("cell cell-normal");
        input2.width(190);
        $("#form").append(input2);
    }
}
function mode1Line2() {
    var input1 = $('<input class="cell" />');
    input1.addClass("cell cell-normal");
    input1.width(90);
    $("#form").append(input1);
    var input2 = $('<input class="cell" />');
    input2.addClass("cell cell-normal");
    input2.width(190);
    $("#form").append(input2);
    var input3 = $('<input class="cell" />');
    input3.addClass("cell cell-normal");
    input3.width(90);
    $("#form").append(input3);
    var input4 = $('<input class="cell" />');
    input4.addClass("cell cell-normal");
    input4.width(470);
    $("#form").append(input4);
}
function mode1Line3() {
    var input1 = $("<input />");
    input1.addClass("cell cell-normal");
    input1.width(90);
    $("#form").append(input1);
    var input2 = $("<input />");
    input2.addClass("cell cell-normal");
    input2.width(750);
    $("#form").append(input2);
}
function mode2Line1() {
    for (var i = 0; i < 4; i++) {
        var input1 = $("<input />");
        input1.addClass("cell cell-normal");
        input1.width(90);
        $("#form").append(input1);
        var input2 = $("<input />");
        input2.addClass("cell cell-normal");
        input2.width(120);
        $("#form").append(input2);
    }
}
function mode2Line2() {
    for (var i = 0; i < 2; i++) {
        var input1 = $("<input />");
        input1.addClass("cell cell-normal");
        input1.width(90);
        $("#form").append(input1);
        var input2 = $("<input />");
        input2.addClass("cell cell-normal");
        input2.width(120);
        $("#form").append(input2);
    }
    var input1 = $("<input />");
    input1.addClass("cell cell-normal");
    input1.width(90);
    $("#form").append(input1);
    var input2 = $("<input />");
    input2.addClass("cell cell-normal");
    input2.width(330);
    $("#form").append(input2);
}
function mode2Line3() {
    var input1 = $("<input />");
    input1.addClass("cell cell-normal");
    input1.width(90);
    $("#form").append(input1);
    var input2 = $("<input />");
    input2.addClass("cell cell-normal");
    input2.width(120);
    $("#form").append(input2);
    var input3 = $("<input />");
    input3.addClass("cell cell-normal");
    input3.width(90);
    $("#form").append(input3);
    var input4 = $("<input />");
    input4.addClass("cell cell-normal");
    input4.width(540);
    $("#form").append(input4);
}
function middleLine() {
    var input1 = $("<input />");
    input1.addClass("cell cell-middle");
    input1.width(90);
    $("#form").append(input1);
    var input2 = $("<input />");
    input2.addClass("cell cell-middle");
    input2.width(750);
    $("#form").append(input2);
}
function bigLine() {
    var input1 = $("<input />");
    input1.addClass("cell cell-big");
    input1.width(90);
    $("#form").append(input1);
    var input2 = $("<input />");
    input2.addClass("cell cell-big");
    input2.width(750);
    $("#form").append(input2);
}
function biggerLine() {
    var input1 = $("<input />");
    input1.addClass("cell cell-bigger");
    input1.width(90);
    $("#form").append(input1);
    var input2 = $("<input />");
    input2.addClass("cell cell-bigger");
    input2.width(750);
    $("#form").append(input2);
}
function biggestLine() {
    var input1 = $("<input />");
    input1.addClass("cell cell-biggest");
    input1.width(90);
    $("#form").append(input1);
    var input2 = $("<input />");
    input2.addClass("cell cell-biggest");
    input2.width(750);
    $("#form").append(input2);
}

