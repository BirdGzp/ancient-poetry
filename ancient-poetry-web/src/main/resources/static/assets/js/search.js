function user_search() {
    $("#user-search").addClass("am-active");
    $("#ancient-search").removeClass("am-active");
    $("#article-search").removeClass("am-active");

    $("#result-list").empty();
    $("#result-list").append("<li><span><a href='#'>123</a></span></li><li><span><a href='#'>123</a>123</span></li>");
}

function article_search() {
    $("#user-search").removeClass("am-active");
    $("#ancient-search").removeClass("am-active");
    $("#article-search").addClass("am-active");

    $("#result-list").empty();

    $("#result-list").append("<li>456</li><li>456</li>");
}

function ancient_search() {
    $("#user-search").removeClass("am-active");
    $("#ancient-search").addClass("am-active");
    $("#article-search").removeClass("am-active");

    $("#result-list").empty();

    $("#result-list").append("<li>789</li><li>789</li>");
}