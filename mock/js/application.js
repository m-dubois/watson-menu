$(document).ready(function () {
   init();
});

init = function(){
	$("#find-a-menu").parent().on("click", hideRibbon);
};

hideRibbon = function(){
	//$("#ribbon").hide();
};