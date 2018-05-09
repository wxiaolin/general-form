/**
 * Created by haibao on 2018/4/5.
 */

function setKey(obj) {
    obj.parent().attr("name", obj.val());
    obj.parent().attr("id", obj.val());
    setValue(obj);
}

function setValue(obj) {
    obj.attr("value", obj.val());
}

function savedefine(id) {
    if (id == 0) {
        var form = $("#form");
        $("#form-title").attr("value", $("#form-title").val());
        var formName = $("#form-title").val();
        var define = form.html();
        var json = {"name": formName, "define": define};
        $.ajax({
            url: '/form',
            type: 'POST',
            traditional: true,
            data: JSON.stringify(json),
            contentType: "application/json",
            dataType: 'json',
            success: function (d) {
                alert(d.msg);
            }
        });
    } else {
        var form = $("#form");
        var define = form.html();
        var json = {"id": id, "define": define};
        $.ajax({
            url: '/form',
            type: 'PUT',
            traditional: true,
            data: JSON.stringify(json),
            contentType: "application/json",
            dataType: 'json',
            success: function (d) {
                alert(d.msg);
            }
        });
    }
}

function mode1Line1() {
    for (var i = 0; i < 3; i++) {
        var wrap = $('<div class="cells-wrapper float-left"></div>');
        var input1 = $('<input />');
        input1.addClass("cell cell-normal text-center");
        input1.width(90);
        input1.blur(function () {
            setKey($(this));
        });
        var textarea2 = $('<textarea rows=1 />');
        textarea2.addClass("cell cell-normal text-center");
        textarea2.width(190);
        textarea2.blur(function () {
            setValue($(this));
        });
        wrap.append(input1);
        wrap.append(textarea2);
        $("#form-field-area").append(wrap);
    }
}

function mode1Line2() {
    var wrap = $('<div class="cells-wrapper float-left"></div>');
    var input1 = $('<input />');
    input1.addClass("cell cell-normal text-center");
    input1.width(90);
    input1.blur(function () {
        setKey($(this));
    });
    var textarea2 = $('<textarea rows=1 />');
    textarea2.addClass("cell cell-normal text-center");
    textarea2.width(190);
    textarea2.blur(function () {
        setValue($(this));
    });
    var wrap2 = $('<div class="cells-wrapper float-left"></div>');
    var input3 = $('<input />');
    input3.blur(function () {
        setKey($(this));
    });
    input3.addClass("cell cell-normal text-center");
    input3.width(90);
    var textarea4 = $('<textarea rows=1 />');
    textarea4.addClass("cell cell-normal text-center");
    textarea4.width(470);
    textarea4.blur(function () {
        setValue($(this));
    });
    wrap.append(input1);
    wrap.append(textarea2);
    wrap2.append(input3);
    wrap2.append(textarea4);
    $("#form-field-area").append(wrap);
    $("#form-field-area").append(wrap2);
}

function mode1Line3() {
    var input1 = $('<input />');
    input1.addClass("cell cell-normal text-center");
    input1.width(90);
    input1.blur(function () {
        setKey($(this));
    });
    var textarea2 = $("<textarea rows=1 />");
    textarea2.addClass("cell cell-normal text-center");
    textarea2.width(750);
    textarea2.blur(function () {
        setValue($(this));
    });
    var wrap = $('<div class="cells-wrapper float-left"></div>');
    wrap.append(input1);
    wrap.append(textarea2);
    $("#form-field-area").append(wrap);
}

function mode2Line1() {
    for (var i = 0; i < 4; i++) {
        var input1 = $('<input />');
        input1.addClass("cell cell-normal text-center");
        input1.width(90);
        input1.blur(function () {
            setKey($(this));
        });
        var textarea2 = $("<textarea rows=1 />");
        textarea2.addClass("cell cell-normal text-center");
        textarea2.width(120);
        textarea2.blur(function () {
            setValue($(this));
        });
        var wrap = $('<div class="cells-wrapper float-left"></div>');
        wrap.append(input1);
        wrap.append(textarea2);
        $("#form-field-area").append(wrap);
    }
}

function mode2Line2() {
    for (var i = 0; i < 2; i++) {
        var input1 = $('<input />');
        input1.addClass("cell cell-normal text-center");
        input1.width(90);
        input1.blur(function () {
            setKey($(this));
        });
        var textarea2 = $("<textarea rows=1 />");
        textarea2.addClass("cell cell-normal text-center");
        textarea2.width(120);
        textarea2.blur(function () {
            setValue($(this));
        });
        var wrap = $('<div class="cells-wrapper float-left"></div>');
        wrap.append(input1);
        wrap.append(textarea2);
        $("#form-field-area").append(wrap);
    }
    var input1 = $('<input />');
    input1.addClass("cell cell-normal text-center");
    input1.width(90);
    input1.blur(function () {
        setKey($(this));
    });
    var textarea2 = $("<textarea rows=1 />");
    textarea2.addClass("cell cell-normal text-center");
    textarea2.width(330);
    textarea2.blur(function () {
        setValue($(this));
    });
    var wrap = $('<div class="cells-wrapper float-left"></div>');
    wrap.append(input1);
    wrap.append(textarea2);
    $("#form-field-area").append(wrap);
}

function mode2Line3() {
    var input1 = $('<input />');
    input1.addClass("cell cell-normal text-center");
    input1.width(90);
    input1.blur(function () {
        setKey($(this));
    });
    var textarea2 = $("<textarea rows=1 />");
    textarea2.addClass("cell cell-normal text-center");
    textarea2.width(120);
    textarea2.blur(function () {
        setValue($(this));
    });
    var input3 = $('<input />');
    input3.addClass("cell cell-normal text-center");
    input3.width(90);
    input3.blur(function () {
        setKey($(this));
    });
    var textarea4 = $("<textarea rows=1 />");
    textarea4.addClass("cell cell-normal text-center");
    textarea4.width(540);
    textarea4.blur(function () {
        setValue($(this));
    });
    var wrap = $('<div class="cells-wrapper float-left"></div>');
    var wrap2 = $('<div class="cells-wrapper float-left"></div>');
    wrap.append(input1);
    wrap.append(textarea2);
    wrap2.append(input3);
    wrap2.append(textarea4);
    $("#form-field-area").append(wrap);
    $("#form-field-area").append(wrap2);
}

/* 大格子*/
function middleLine() {
    var input1 = $('<input />');
    input1.addClass("cell cell-middle text-center");
    input1.width(90);
    input1.blur(function () {
        setKey($(this));
    });
    var textarea2 = $("<textarea rows=1 />");
    textarea2.addClass("cell cell-middle");
    textarea2.width(750);
    textarea2.blur(function () {
        setValue($(this));
    });
    var wrap = $('<div class="cells-wrapper float-left"></div>');
    wrap.append(input1);
    wrap.append(textarea2);
    $("#form-field-area").append(wrap);
}

function bigLine() {
    var input1 = $('<input />');
    input1.addClass("cell cell-big text-center");
    input1.width(90);
    input1.blur(function () {
        setKey($(this));
    });
    var textarea2 = $("<textarea rows=1 />");
    textarea2.addClass("cell cell-big");
    textarea2.width(750);
    textarea2.blur(function () {
        setValue($(this));
    });
    var wrap = $('<div class="cells-wrapper float-left"></div>');
    wrap.append(input1);
    wrap.append(textarea2);
    $("#form-field-area").append(wrap);
}

function biggerLine() {
    var input1 = $('<input />');
    input1.addClass("cell cell-bigger text-center");
    input1.width(90);
    input1.blur(function () {
        setKey($(this));
    });
    var textarea2 = $("<textarea rows=1 />");
    textarea2.addClass("cell cell-bigger");
    textarea2.width(750);
    textarea2.blur(function () {
        setValue($(this));
    });
    var wrap = $('<div class="cells-wrapper float-left"></div>');
    wrap.append(input1);
    wrap.append(textarea2);
    $("#form-field-area").append(wrap);
}

function biggestLine() {
    var input1 = $('<input />');
    input1.addClass("cell cell-biggest text-center");
    input1.width(90);
    input1.blur(function () {
        setKey($(this));
    });
    var textarea2 = $("<textarea rows=1 />");
    textarea2.addClass("cell cell-biggest");
    textarea2.width(750);
    textarea2.blur(function () {
        setValue($(this));
    });
    var wrap = $('<div class="cells-wrapper float-left"></div>');
    wrap.append(input1);
    wrap.append(textarea2);
    $("#form-field-area").append(wrap);
}

/** 虚线格*/
function dottedLine1() {
    var input1 = $('<input />');
    input1.addClass("cell cell-dotted text-center");
    input1.width(90);
    input1.blur(function () {
        setKey($(this));
    });
    var textarea2 = $("<textarea rows=1 />");
    textarea2.addClass("cell cell-dotted text-left");
    textarea2.width(750);
    textarea2.blur(function () {
        setValue($(this));
    });
    var wrap = $('<div class="cells-wrapper float-left"></div>');
    wrap.append(input1);
    wrap.append(textarea2);
    $("#form-dotted-area").append(wrap);
}

function dottedLine2() {
    for (var i = 0; i < 2; i++) {
        var input1 = $('<input />');
        input1.addClass("cell cell-dotted text-center");
        input1.width(90);
        input1.blur(function () {
            setKey($(this));
        });
        var textarea2 = $("<textarea rows=1 />");
        textarea2.addClass("cell cell-dotted text-left");
        textarea2.width(330);
        textarea2.blur(function () {
            setValue($(this));
        });
        var wrap = $('<div class="cells-wrapper float-left"></div>');
        wrap.append(input1);
        wrap.append(textarea2);
        $("#form-dotted-area").append(wrap);
    }
}

function dottedLine3() {
    for (var i = 0; i < 3; i++) {
        var input1 = $('<input />');
        input1.addClass("cell cell-dotted text-center");
        input1.width(90);
        input1.blur(function () {
            setKey($(this));
        });
        var textarea2 = $("<textarea rows=1 />");
        textarea2.addClass("cell cell-dotted text-left");
        textarea2.width(170);
        textarea2.blur(function () {
            setValue($(this));
        });
        var wrap = $('<div class="cells-wrapper float-left"></div>');
        wrap.append(input1);
        wrap.append(textarea2);
        $("#form-dotted-area").append(wrap);
    }
}

function dottedLine4() {
    for (var i = 0; i < 4; i++) {
        var input1 = $('<input />');
        input1.addClass("cell cell-dotted text-center");
        input1.width(90);
        input1.blur(function () {
            setKey($(this));
        });
        var textarea2 = $("<textarea rows=1 />");
        textarea2.addClass("cell cell-dotted text-left");
        textarea2.width(120);
        textarea2.blur(function () {
            setValue($(this));
        });
        var wrap = $('<div class="cells-wrapper float-left"></div>');
        wrap.append(input1);
        wrap.append(textarea2);
        $("#form-dotted-area").append(wrap);
    }
}

