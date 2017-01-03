
function returnYPos () {
    var element = document.getElementById("banner2");
    var rect = element.getBoundingClientRect();
    var elementLeft,elementTop; //x and y
    var scrollTop = document.documentElement.scrollTop?
    document.documentElement.scrollTop:document.body.scrollTop;
    var scrollLeft = document.documentElement.scrollLeft?
    document.documentElement.scrollLeft:document.body.scrollLeft;
    elementTop = rect.top+scrollTop;
    elementLeft = rect.left+scrollLeft;
    var messgeToPost = {'BottomAdYPos':''+elementTop};
    window.webkit.messageHandlers.adSpaceMoved3.postMessage(messgeToPost);
}
