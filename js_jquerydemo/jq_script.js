// $(document).ready(
//     function(){
        
//         // //alert("Welcome to jQuery");
//         // $("#btn1").click(function() {
//         //     alert("You clicked the button");
//         //     $("input[type='text']").css("background-color", "darkgreen");
//         //     $(".header").css("font-size", "78px");
//         //     $("form :password").css("background-color", "lightblue");
//        //    })
//         $("p").hover(function() {
//                 $(this).addClass("para");
//             }, function() {
//                 $(this).removeClass("para");
//             }
//         );    
        
//     }
// );


$(document).ready(function(){
    // $("div").click(function(){
    //     $(this).addClass("para");
    // });
    // $("#hide").click(function() {
    //     $(".para").hide(2000);
    // });

    // $("#show").click(function() {
    //     $(".para").show(2000);
    // });

    // $("#toggle").click(function() {
    //     $(".para").toggle(2000);
    // });

    // $("p").hover(function() {
    //     $(this).addClass("para");
    // }, function() {
    //     $(this).removeClass("para");
    // });

    $("#fadein").click(function(){
        $("#img").fadeIn();
    });
    $("#fadeout").click(function(){
        $("#img").fadeOut();
    });
});