
var articleTemplate;

function setFontSize(size) {
    var sizeNames = {
        '1': 'small',
        '2': 'medium',
        '3': 'large'
    },
    sizeName = sizeNames[size] ? sizeNames[size] : 'small';
    
    $('body').removeClass().addClass(sizeName)
    
    return 'current size = ' + sizeName;
};



function setCommentsLink(commentsFlag) {
    
    if (commentsFlag > 0)  {
        $("#comments1").show();
        $("#comment-top").show();
    }  else {
        $("#comments1").remove()
        $("#comment-top").hide();
        $("#comment-separator").hide();
    };
}


function setSlidesLink(slidesFlag) {
    // this function is used to link out to a slideshow, when necessary
    
    if (slidesFlag > 0) {
    
        var firstImageWidth = $('img:first').attr('width');
        var firstImageHeight = $('img:first').attr('height');
        $('img:first').wrap('<a id="slideshow-link" href="http://bi.slideshow/"></a>');
        $('#slideshow-link').prepend('<span id="slideshow-overlay">View</span>');
    
        $('article').append('<p><span id="slideshow-text">Start &raquo;&nbsp;</span><a id="slideshow-text-link" href="http://bi.slideshow/"> slides</a> / <a id="slideshow-text-link" href="http://bi.slideshowonepage/">one page</a></p>');
    
        var p = $("#comments1");
        var offset = p.offset();
    }
};



function getArticleTemplate() {
    var source   = $("#article-webview-tmpl").html();
    var template = Handlebars.compile(source);
    
    return template;
};

function renderAndReturn() {
    
};

function markupToStr(dataSource) {
    
    console.log('Markup as string');
    
    //To reformat incoming date
    dataSource.published = moment(dataSource.published).format('MMM. DD, YYYY h:mm A');
    //To reformat comment count
    dataSource.comment_count = numberWithCommas(dataSource.comment_count);
    
    if (dataSource.comment_count > 0)  {
        $("#comments1").show();
//        $("#comment-separator").show(); // was commented out
    }  else {
        $("#comments1").remove()
        $("#comment-separator").hide();
    };
    
    //To reformat page view count
    dataSource.views = numberWithCommas(dataSource.views);
    
    var ooyalaJsFileRegex = /player\.js\?/;
    // add targetReplaceId url param to ooyala player js source
    // dataSource.content = dataSource.content.replace(ooyalaJsFileRegex, 'player.js?targetReplaceId=ooyalaplayer&amp;');
    
    var html = articleTemplate(dataSource);
    
    return html.toString();
};

function numberWithCommas(x) {
    if (x) {
        return x.toString().replace(/\B(?=(\d{3})+(?!\d))/g, ",");
    } else {
        return '0';
    }
};


function getWidth()
{
    xWidth = null;
    if(window.screen != null)
        xWidth = window.screen.availWidth;
    
    if(window.innerWidth != null)
        xWidth = window.innerWidth;
    
    if(document.body != null)
        xWidth = document.body.clientWidth;
    
    return xWidth;
}

function getHeight() {
    xHeight = null;
    if(window.screen != null)
        xHeight = window.screen.availHeight;
    
    if(window.innerHeight != null)
        xHeight =  window.innerHeight;
    
    if(document.body != null)
        xHeight = document.body.clientHeight;
    
    return xHeight;
}



function refreshAllAds() {
    googletag.pubads().refresh();
}




function adjustDivSizes() {
    
    var dateTimeStats = document.getElementById("info2");
    dateTimeStats.style.visibility = 'visible';

    var portraitMode = false;
    var landscapeMode = false;
    var iPhone4 = false;
    var iPhone5 = false;
    var iPhone6 = false;
    var iPhone6Plus = false;
    
    var deviceOrientWidth = getWidth();
    
    var deviceHeight = window.screen.height;
    if (deviceHeight < 481) {
        iPhone4 = true;
        if (deviceOrientWidth < 321) {
            portraitMode = true;
            landscapeMode = false;
        } else {
            portraitMode = false;
            landscapeMode = true;
        }
    }
    if ((deviceHeight > 500) && (deviceHeight < 600)) {
        iPhone5 = true;

        if (deviceOrientWidth < 321) {
            portraitMode = true;
            landscapeMode = false;
        } else {
            portraitMode = false;
            landscapeMode = true;
        }
    }
    if ((deviceHeight > 600) && (deviceHeight < 700)) {
        iPhone6 = true;
        if (deviceOrientWidth < 400) {
            portraitMode = true;
            landscapeMode = false;
        } else {
            portraitMode = false;
            landscapeMode = true;
        }
    }
    if (deviceHeight > 700) {
        iPhone6Plus = true;
        if (deviceOrientWidth < 500) {
            portraitMode = true;
            landscapeMode = false;
        } else {
            portraitMode = false;
            landscapeMode = true;
        }
    }
    
    //
    var w = 320;
    var h = 180;
    
    if ((iPhone4) || (iPhone5)) {
        w = 320;
        h = 180;
    }
    
    if (iPhone6) {
        w = 375;
        h = 212;
    }
    
    if (iPhone6Plus) {
        w = 414;
        h = 234;
    }
    
    var iframesArray = document.getElementsByTagName('iframe');
//    if (landscapeMode) {
//    } else {
        document.getElementsByTagName('article')[0].className = '';
        if ((iPhone4) || (iPhone5)) {
            document.getElementsByTagName('article')[0].className = 'portrait5';
            if (iframesArray.length > 0) document.getElementsByTagName('iframe')[0].className = '';
        }
        if (iPhone6) {
            document.getElementsByTagName('article')[0].className = 'portrait6';
            if (iframesArray.length > 0) document.getElementsByTagName('iframe')[0].className = 'portrait6';
        }
        if (iPhone6Plus) {
            document.getElementsByTagName('article')[0].className = 'portrait6plus';
            if (iframesArray.length > 0) document.getElementsByTagName('iframe')[0].className = 'portrait6plus';
        }
//    }

//    // applies all non-images
//    $('*').each(function() {
//                if ($(this).width() > deviceOrientWidth && $(this).prop("tagName") !== "IMAGE") {
//                $(this).width(w);
//                $(this).height(h);
//                if($(this).prop("tagName") == "IFRAME") {
//                $(this).parent().parent().height('auto');
//                $(this).parent().parent().width($(this).parent().parent().width() + 4);
//                }
//                }
//                });
//    
//    
//    if (iframesArray.length > 0) {
//        $("iframe").each(function() {
//                         var src= $(this).attr('src');
//                         if (src) {
//                         $(this).attr('src').replace(/width=\d+/, 'width='+w);
//                         $(this).attr('src').replace(/height=\d+/, 'height='+h);
//                         $(this).attr('src',src);
//                         }
//                         });
//    }
//    
//    $('*').each(function() {
//                if ($(this).attr("id") == "ooyalaplayer") {
//                $(this).width(w);
//                $(this).height(h);
//                }
//                });
//    
    
    
    // set class on youtube iframes
    var iframeTags = document.getElementsByTagName("iframe");
    
    for (i=0; i < iframeTags.length; i++) {
        var srcAttrib = iframeTags[i].getAttribute("src");
        
        if (srcAttrib) {
            if (srcAttrib.length > 0) {
                
                var position = srcAttrib.indexOf("youtube.com");
                if (position > -1) {
                    iframeTags[i].className = "youTubeVid";
                    if (portraitMode) {
                        if (iPhone4) {
                            iframeTags[i].className = "portrait5 youTubeVid";
                        } else if (iPhone5) {
                            iframeTags[i].className = "portrait5 youTubeVid";
                        } else if (iPhone6) {
                            iframeTags[i].className = "portrait6 youTubeVid";
                        } else if (iPhone6Plus) {
                            iframeTags[i].className = "portrait6plus youTubeVid";
                        }
                    }
                }
                
                var position2 = srcAttrib.indexOf("dailymotion.com/embed/video");
                if (position2 > -1) {
                    iframeTags[i].className = "dailyMotionVid";
                    if (portraitMode) {
                        if (iPhone4) {
                            iframeTags[i].className = "portrait5 dailyMotionVid";
                        } else if (iPhone5) {
                            iframeTags[i].className = "portrait5 dailyMotionVid";
                        } else if (iPhone6) {
                            iframeTags[i].className = "portrait6 dailyMotionVid";
                        } else if (iPhone6Plus) {
                            iframeTags[i].className = "portrait6plus dailyMotionVid";
                        }
                    }
                }
                
                var position3 = srcAttrib.indexOf("soundcloud.com");
                if (position3 > -1) {
                    iframeTags[i].className = "soundCloud";
                    if (portraitMode) {
                        if (iPhone4) {
                            iframeTags[i].className = "portrait5 soundCloud";
                        } else if (iPhone5) {
                            iframeTags[i].className = "portrait5 soundCloud";
                        } else if (iPhone6) {
                            iframeTags[i].className = "portrait6 soundCloud";
                        } else if (iPhone6Plus) {
                            iframeTags[i].className = "portrait6plus soundCloud";
                        }
                    }
                }
                
                var position4 = srcAttrib.indexOf("vine.co");
                if (position4 > -1) {
                    iframeTags[i].className = "vine";
                    if (portraitMode) {
                        if (iPhone4) {
                            iframeTags[i].className = "portrait5 vine";
                        } else if (iPhone5) {
                            iframeTags[i].className = "portrait5 vine";
                        } else if (iPhone6) {
                            iframeTags[i].className = "portrait6 vine";
                        } else if (iPhone6Plus) {
                            iframeTags[i].className = "portrait6plus vine";
                        }
                    }
                }
                
                var position5 = srcAttrib.indexOf("hulu.com");
                if (position5 > -1) {
                    iframeTags[i].className = "huluVid";
                    if (portraitMode) {
                        if (iPhone4) {
                            iframeTags[i].className = "portrait5 huluVid";
                        } else if (iPhone5) {
                            iframeTags[i].className = "portrait5 huluVid";
                        } else if (iPhone6) {
                            iframeTags[i].className = "portrait6 huluVid";
                        } else if (iPhone6Plus) {
                            iframeTags[i].className = "portrait6plus huluVid";
                        }
                    }
                }
                var position6 = srcAttrib.indexOf("instagram.com");
                if (position6 > -1) {
                    iframeTags[i].className = "instagramPost";
                    if (portraitMode) {
                        if (iPhone4) {
                            iframeTags[i].className = "portrait5 instagramPost";
                        } else if (iPhone5) {
                            iframeTags[i].className = "portrait5 instagramPost";
                        } else if (iPhone6) {
                            iframeTags[i].className = "portrait6 instagramPost";
                        } else if (iPhone6Plus) {
                            iframeTags[i].className = "portrait6plus instagramPost";
                        }
                    }
                }
            }
        }
    }
}


function render(dataSource) {
    
    console.log('Render started');
    console.dir(dataSource);
    var html = markupToStr(dataSource);
    $('#article-webview').html(html);
    
    return 'true';
    
}



function setSlideshowLink() {
    // this function is used to link out to a slideshow, when necessary
    
    var firstImageWidth = $('img:first').attr('width');
    var firstImageHeight = $('img:first').attr('height');
    $('img:first').wrap('<a id="slideshow-link" href="http://bi.slideshow/"></a>');
    $('#slideshow-link').prepend('<span id="slideshow-overlay">View</span>');
    
    //	$('article').append('<p><a id="slideshow-text-link" href="http://bi.slideshow/">Start &raquo; slides</a> / <a id="slideshow-text-link" href="http://bi.slideshowonepage/">one page</a></p>');
    
    $('article').append('<p><span id="slideshow-text">Start &raquo;&nbsp;</span><a id="slideshow-text-link" href="http://bi.slideshow/"> slides</a> / <a id="slideshow-text-link" href="http://bi.slideshowonepage/">one page</a></p>');
    
    var p = $("#comments1");
    var offset = p.offset();
};



function pauseVideos() {
    
    if (window.bi_pp) window.bi_pp.pause();
}


function rewindVideos() {
    
    if (window.bi_pp) {
        var playheadTime = window.bi_pp.getPlayheadTime();
        window.bi_pp.setPlayheadTime(playheadTime);
    }
}



$(function() {
  articleTemplate = getArticleTemplate();
  
  /* Temp onClick */
  $('.change-size-btn').click(function() {
                              setFontSize($(this).data('size'));
                              });
  
  //render(testData);
  });
