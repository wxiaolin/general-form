/**
 * Created by haibao on 2018/4/5.
 */
function mode1Line1() {
    for (var i = 0; i < 3; i++) {
        var input1 = $('<input class="cell" />');
        input1.addClass("cell cell-normal text-center");
        input1.width(90);
        $("#form-field-area").append(input1);
        var input2 = $('<input class="cell" />');
        input2.addClass("cell cell-normal text-center");
        input2.width(190);
        $("#form-field-area").append(input2);
    }
}

function mode1Line2() {
    var input1 = $('<input class="cell" />');
    input1.addClass("cell cell-normal text-center");
    input1.width(90);
    $("#form-field-area").append(input1);
    var input2 = $('<input class="cell" />');
    input2.addClass("cell cell-normal text-center");
    input2.width(190);
    $("#form-field-area").append(input2);
    var input3 = $('<input class="cell" />');
    input3.addClass("cell cell-normal text-center");
    input3.width(90);
    $("#form-field-area").append(input3);
    var input4 = $('<input class="cell" />');
    input4.addClass("cell cell-normal text-center");
    input4.width(470);
    $("#form-field-area").append(input4);
}

function mode1Line3() {
    var input1 = $("<input />");
    input1.addClass("cell cell-normal text-center");
    input1.width(90);
    $("#form-field-area").append(input1);
    var input2 = $("<input />");
    input2.addClass("cell cell-normal text-center");
    input2.width(750);
    $("#form-field-area").append(input2);
}

function mode2Line1() {
    for (var i = 0; i < 4; i++) {
        var input1 = $("<input />");
        input1.addClass("cell cell-normal text-center");
        input1.width(90);
        $("#form-field-area").append(input1);
        var input2 = $("<input />");
        input2.addClass("cell cell-normal text-center");
        input2.width(120);
        $("#form-field-area").append(input2);
    }
}

function mode2Line2() {
    for (var i = 0; i < 2; i++) {
        var input1 = $("<input />");
        input1.addClass("cell cell-normal text-center");
        input1.width(90);
        $("#form-field-area").append(input1);
        var input2 = $("<input />");
        input2.addClass("cell cell-normal text-center");
        input2.width(120);
        $("#form-field-area").append(input2);
    }
    var input1 = $("<input />");
    input1.addClass("cell cell-normal text-center");
    input1.width(90);
    $("#form-field-area").append(input1);
    var input2 = $("<input />");
    input2.addClass("cell cell-normal text-center");
    input2.width(330);
    $("#form-field-area").append(input2);
}

function mode2Line3() {
    var input1 = $("<input />");
    input1.addClass("cell cell-normal text-center");
    input1.width(90);
    $("#form-field-area").append(input1);
    var input2 = $("<input />");
    input2.addClass("cell cell-normal text-center");
    input2.width(120);
    $("#form-field-area").append(input2);
    var input3 = $("<input />");
    input3.addClass("cell cell-normal text-center");
    input3.width(90);
    $("#form-field-area").append(input3);
    var input4 = $("<input />");
    input4.addClass("cell cell-normal text-center");
    input4.width(540);
    $("#form-field-area").append(input4);
}

function middleLine() {
    var input1 = $("<input />");
    input1.addClass("cell cell-middle text-center");
    input1.width(90);
    $("#form-field-area").append(input1);
    var input2 = $("<input />");
    input2.addClass("cell cell-middle");
    input2.width(750);
    $("#form-field-area").append(input2);
}

function bigLine() {
    var input1 = $("<input />");
    input1.addClass("cell cell-big text-center");
    input1.width(90);
    $("#form-field-area").append(input1);
    var input2 = $("<input />");
    input2.addClass("cell cell-big");
    input2.width(750);
    $("#form-field-area").append(input2);
}

function biggerLine() {
    var input1 = $("<input />");
    input1.addClass("cell cell-bigger text-center");
    input1.width(90);
    $("#form-field-area").append(input1);
    var input2 = $("<input />");
    input2.addClass("cell cell-bigger");
    input2.width(750);
    $("#form-field-area").append(input2);
}

function biggestLine() {
    var input1 = $("<input />");
    input1.addClass("cell cell-biggest text-center");
    input1.width(90);
    $("#form-field-area").append(input1);
    var input2 = $("<input />");
    input2.addClass("cell cell-biggest");
    input2.width(750);
    $("#form-field-area").append(input2);
}

/** 虚线格*/
function dottedLine1() {
    var input1 = $("<input />");
    input1.addClass("cell cell-dotted text-center");
    input1.width(90);
    $("#form-dotted-area").append(input1);
    var input2 = $("<input />");
    input2.addClass("cell cell-dotted text-left");
    input2.width(750);
    $("#form-dotted-area").append(input2);
}

function dottedLine2() {
    for (var i = 0; i < 2; i++) {
        var input1 = $("<input />");
        input1.addClass("cell cell-dotted text-center");
        input1.width(90);
        $("#form-dotted-area").append(input1);
        var input2 = $("<input />");
        input2.addClass("cell cell-dotted text-left");
        input2.width(330);
        $("#form-dotted-area").append(input2);
    }
}

function dottedLine3() {
    for (var i = 0; i < 3; i++) {
        var input1 = $("<input />");
        input1.addClass("cell cell-dotted text-center");
        input1.width(90);
        $("#form-dotted-area").append(input1);
        var input2 = $("<input />");
        input2.addClass("cell cell-dotted text-left");
        input2.width(170);
        $("#form-dotted-area").append(input2);
    }
}

function dottedLine4() {
    for (var i = 0; i < 4; i++) {
        var input1 = $("<input />");
        input1.addClass("cell cell-dotted text-center");
        input1.width(90);
        $("#form-dotted-area").append(input1);
        var input2 = $("<input />");
        input2.addClass("cell cell-dotted text-left");
        input2.width(120);
        $("#form-dotted-area").append(input2);
    }
}

