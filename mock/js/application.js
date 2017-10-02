$(document).ready(function () {
   displayOpening();
   nextDay();
});

displayOpening = function() {
    var circle = $("#circle");
    var w = window.innerWidth;
    var h = window.innerHeight;
    circle.animate({
      "width":w+100+"px",
      "height":w+100+"px",
      "margin-left":-(w/2)-50+"px",
      "margin-top":-(w/2)-50+"px"
    }, 1000, function() {
      circle.css({
        "width":"100%",
        "border-radius":"0px",
        "margin":"0px",
        "top":"0px",
        "left":"0px"
      });
    })
};

nextDay = function() {
    $("#nextDay").click(function() {
        $(".mdl-grid").children(".day-card").not(".animated").first().addClass("animated flipInY");
    });
};
