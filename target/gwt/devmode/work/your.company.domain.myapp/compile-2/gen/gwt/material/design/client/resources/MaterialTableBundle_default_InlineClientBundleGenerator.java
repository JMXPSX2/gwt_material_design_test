package gwt.material.design.client.resources;

import com.google.gwt.core.client.GWT;
import com.google.gwt.resources.client.ResourcePrototype;

public class MaterialTableBundle_default_InlineClientBundleGenerator implements gwt.material.design.client.resources.MaterialTableBundle {
  private static MaterialTableBundle_default_InlineClientBundleGenerator _instance0 = new MaterialTableBundle_default_InlineClientBundleGenerator();
  private void darkCssInitializer() {
    darkCss = new com.google.gwt.resources.client.TextResource() {
      // jar:file:/Users/jmxpsx/.m2/repository/com/github/gwtmaterialdesign/gwt-material-table/2.4.0/gwt-material-table-2.4.0.jar!/gwt/material/design/client/resources/css/table-dark.min.css
      public String getText() {
        return ".table-body,.table-container,section.table-container .top-panel,table.table thead tr th{background-color:#424242;color:#fff}table.table tbody td{color:#fff}table.table tbody tr.data-row:hover{background-color:rgba(255,255,255,.2);color:#fff}table.table tbody tr.data-row td.hover{background-color:rgba(255,255,255,.2);color:#fff}.table-container .top-panel{border-bottom:2px solid #4a4a4a}table.table thead{border-bottom:1px solid #4a4a4a!important}table.table tbody tr.data-row{border-bottom:1px solid #4a4a4a}table.table tbody tr.data-row:hover{background-color:rgba(255,255,255,.2)}table.table tbody tr.selected,table.table tbody tr.selected td{background-color:rgba(255,255,255,.04)!important}table.striped>tbody>tr:nth-child(odd){background-color:#4a4a4a}table.table tbody tr.subheader{background-color:#424242;border-bottom:1px solid #525252;color:#fff}table.table tbody>div{background:0 0!important}table.table thead th.selected,table.table thead tr th,table.table thead tr th.sortable:hover{color:rgba(255,255,255,.52)}table.table tbody tr.expansion td div .content{background-color:#4a4a4a}table.table tbody tr.expansion td div.expanded{border-bottom:none}table.striped>tbody>tr:nth-child(odd) td.frozen-col{background-color:#4a4a4a!important}table tr td.frozen-col{border-bottom:1px solid #4a4a4a!important}table tr.selected td.frozen-col{background:#4f4f4f!important}.inner-shadow{-moz-box-shadow:inset 18px 0 20px -20px #272727;-webkit-box-shadow:inset 18px 0 20px -20px #272727;box-shadow:inset 18px 0 20px -20px #272727}table tr.stickyExclude{height:2px;background-color:transparent!important}.data-pager .input-field .select-wrapper input.select-dropdown,.data-pager .num-page-panel .input-field input[type=number]{color:#fff;border-bottom:1px solid #818181}.table-container .data-pager{border:none}.data-pager .action-page-panel i.disabled{background:#424242!important;color:rgba(153,153,153,.2)!important}.data-pager .action-page-panel i{color:rgba(255,255,255,.6)}.data-pager .action-page-panel i:hover{color:#fff}@media only screen and (max-width:520px),(max-device-width:519px) and (min-device-width:0px){table.table tbody{background:#292929}.selection-none table.table tbody tr.data-row,table.table tbody tr.data-row{background:#424242}table.table tbody td{border-top:1px solid #4a4a4a}table.table .cell{color:#fff}tr.data-row td:before{color:rgba(255,255,255,.52)}.selection-none table.table tbody tr.data-row,table.table tbody tr.data-row,table.table tbody tr.data-row.selected,table.table tbody tr.data-row:hover,table.table tbody tr.selected td,table.table tbody tr.selected td.hover{background-color:rgba(255,255,255,.04)!important}tbody tr td#colex #expand{background:#292929}table.table tbody tr.data-row #col0:not([data-title]){background:#414141}}";
      }
      public String getName() {
        return "darkCss";
      }
    }
    ;
  }
  private static class darkCssInitializer {
    static {
      _instance0.darkCssInitializer();
    }
    static com.google.gwt.resources.client.TextResource get() {
      return darkCss;
    }
  }
  public com.google.gwt.resources.client.TextResource darkCss() {
    return darkCssInitializer.get();
  }
  private void greedyScrollInitializer() {
    greedyScroll = new com.google.gwt.resources.client.TextResource() {
      // jar:file:/Users/jmxpsx/.m2/repository/com/github/gwtmaterialdesign/gwt-material-table/2.4.0/gwt-material-table-2.4.0.jar!/gwt/material/design/client/resources/js/greedyscroll.min.js
      public String getText() {
        return "!function(o,n){\"use strict\";function t(t,i){var d=this;d.$el=o(t),d.el=t,d.id=e++,d.$window=o(n),d.$body=o(\"body\"),d.locked=[],d.$el.bind(\"destroyed\",o.proxy(d.teardown,d)),d.init=function(){d.options=o.extend({},r,i),d.$el.attr(\"tabindex\",0),d.bind()},d.destroy=function(){d.$el.unbind(\"destroyed\",d.teardown),d.teardown()},d.teardown=function(){o.removeData(d.el,\"plugin_\"+l),d.unbind(),d.el=null,d.$el=null},d.bind=function(){d.$el.on(\"focus.\"+l,d.lockParents).on(\"blur.\"+l,d.unlockParents).on(\"scroll.\"+l,o.throttle(100,d.scroll))},d.unbind=function(){d.$el.off(\".\"+l)},d.scroll=function(){var n=o(this);n.isScrollEnd()||n.isScrollStart()?n.is(\":focus\")||d.unlockParents():d.lockParents()},d.lockParents=function(){if(d.options.topScrollOnFocus){var n=d.$el.offset().top,t=d.$body.scrollTop();t>n&&d.$body.scrollTop(n-d.options.topScrollMargin)}d.$body.addClass(\"overflow-hidden\"),o(this).parents().each(function(n){var t=o(this);t.hasScrollBar()&&(d.locked[n]=t,t.addClass(\"overflow-hidden\"))})},d.unlockParents=function(){d.$body.removeClass(\"overflow-hidden\");for(var o in d.locked)d.locked[o].removeClass(\"overflow-hidden\")},d.init()}var l=\"greedyScroll\",e=0,r={topScrollOnFocus:!0,topScrollMargin:3};o.fn[l]=function(n){return this.each(function(){var e=o.data(this,\"plugin_\"+l);e?\"string\"==typeof n?e[n].apply(e):e.updateOptions(n):\"destroy\"!==n&&o.data(this,\"plugin_\"+l,new t(this,n))})}}(jQuery,window);\r\n";
      }
      public String getName() {
        return "greedyScroll";
      }
    }
    ;
  }
  private static class greedyScrollInitializer {
    static {
      _instance0.greedyScrollInitializer();
    }
    static com.google.gwt.resources.client.TextResource get() {
      return greedyScroll;
    }
  }
  public com.google.gwt.resources.client.TextResource greedyScroll() {
    return greedyScrollInitializer.get();
  }
  private void jQueryExtInitializer() {
    jQueryExt = new com.google.gwt.resources.client.TextResource() {
      // jar:file:/Users/jmxpsx/.m2/repository/com/github/gwtmaterialdesign/gwt-material-table/2.4.0/gwt-material-table-2.4.0.jar!/gwt/material/design/client/resources/js/jquery-ext.min.js
      public String getText() {
        return "!function(t,e){var n,i=t.jQuery||t.Cowboy||(t.Cowboy={});i.throttle=n=function(t,n,r,o){function s(){function i(){a=+new Date,r.apply(c,d)}function s(){l=e}var c=this,u=+new Date-a,d=arguments;o&&!l&&i(),l&&clearTimeout(l),o===e&&u>t?i():n!==!0&&(l=setTimeout(o?s:i,o===e?t-u:t))}var l,a=0;return\"boolean\"!=typeof n&&(o=r,r=n,n=e),i.guid&&(s.guid=r.guid=r.guid||i.guid++),s},i.debounce=function(t,i,r){return r===e?n(t,i,!1):n(t,r,i!==!1)}}(this),function(t){t.fn.forceRedraw=function(){var t=this[0],e=document.createTextNode(\" \"),n=t.style.display;return t.appendChild(e),t.style.display=\"none\",setTimeout(function(){t.style.display=n,e.parentNode.removeChild(e)},10),this},t.fn.insertAt=function(t,e){var n=this.children().size();return 0>t&&(t=Math.max(0,n+1+t)),this.append(e),n>t&&this.children().eq(t).before(this.children().last()),this},t.fn.longpress=function(e,n,i){return\"undefined\"==typeof i&&(i=500),this.each(function(){function r(n){l=(new Date).getTime();var r=t(this);a=setTimeout(function(){\"function\"==typeof e?e.call(r,n):t.error(\"Callback required for long press. You provided: \"+typeof e)},i)}function o(e){var r=(new Date).getTime()-l;i>r&&(clearTimeout(a),\"function\"==typeof n?n.call(t(this),e):\"undefined\"==typeof n||t.error(\"Optional callback for short press should be a function.\"))}function s(){clearTimeout(a)}var l,a,c=t(this);return c.on(\"mousedown\",r),c.on(\"mouseup\",o),c.on(\"mousemove\",s),c.on(\"touchstart\",r),c.on(\"touchend\",o),c.on(\"touchmove\",s),this})},t.fn.hasVerticalScrollBar=function(){return this.get(0)?this.get(0).scrollHeight>this.innerHeight():!1},t.fn.hasHorizontalScrollBar=function(){return this.get(0)?this.get(0).scrollWidth>this.innerWidth():!1},t.fn.hasScrollBar=function(){return this.hasVerticalScrollBar()||this.hasHorizontalScrollBar()},t.scrollBarWidth=function(t){(null===t||\"undefined\"==typeof t)&&(t=document.body);var e=document.createElement(\"p\");e.style.width=\"100%\",e.style.height=\"200px\";var n=document.createElement(\"div\");n.style.position=\"absolute\",n.style.top=\"0px\",n.style.left=\"0px\",n.style.visibility=\"hidden\",n.style.width=\"200px\",n.style.height=\"150px\",n.style.overflow=\"hidden\",n.appendChild(e),t.appendChild(n);var i=e.offsetWidth;n.style.overflow=\"scroll\";var r=e.offsetWidth;return i===r&&(r=n.clientWidth),t.removeChild(n),i-r},t.fn.isScrollEnd=function(){return this.scrollTop()>=this[0].scrollHeight-this.outerHeight()},t.fn.isScrollStart=function(){return this.scrollTop()<=this[0].scrollHeight-this.outerHeight()},t.fn.scrollHandler=function(e,n,i){var r=this,o={x:0,y:0};return r.on(\"scroll.\"+n,function(n){var r=t(this),s=r.scrollTop(),l=r.scrollLeft(),a={dirs:[],isUp:function(){return t.inArray(\"up\",this.dirs)>-1},isDown:function(){return t.inArray(\"down\",this.dirs)>-1},isLeft:function(){return t.inArray(\"left\",this.dirs)>-1},isRight:function(){return t.inArray(\"right\",this.dirs)>-1},isX:function(){return this.isLeft()||this.isRight()},isY:function(){return this.isUp()||this.isDown()}},c=0;if(o.y>s?a.dirs[c++]=\"up\":o.y!==s&&(a.dirs[c++]=\"down\"),o.x>l?a.dirs[c++]=\"left\":o.x!==l&&(a.dirs[c++]=\"right\"),e)if(t.isArray(e)){for(var u in a.dirs)if(t.inArray(a.dirs[u],e)>-1){i(n,a);break}}else(\"any\"===e||t.inArray(e,a.dirs)>-1)&&i(n,a);else i(n,a);o={x:l,y:s}})},t.fn.smartScroll=function(t,e){return this.scrollHandler(\"any\",t,e)},t.fn.scrollY=function(t,e){return this.scrollHandler([\"up\",\"down\"],t,e)},t.fn.scrollX=function(t,e){return this.scrollHandler([\"left\",\"right\"],t,e)},t.fn.onScrollUp=function(t,e){return this.scrollHandler(\"up\",t,e)},t.fn.onScrollDown=function(t,e){return this.scrollHandler(\"down\",t,e)},t.fn.onScrollLeft=function(t,e){return this.scrollHandler(\"left\",t,e)},t.fn.onScrollRight=function(t,e){return this.scrollHandler(\"right\",t,e)}}(jQuery);\r\n";
      }
      public String getName() {
        return "jQueryExt";
      }
    }
    ;
  }
  private static class jQueryExtInitializer {
    static {
      _instance0.jQueryExtInitializer();
    }
    static com.google.gwt.resources.client.TextResource get() {
      return jQueryExt;
    }
  }
  public com.google.gwt.resources.client.TextResource jQueryExt() {
    return jQueryExtInitializer.get();
  }
  private void mutateInitializer() {
    mutate = new com.google.gwt.resources.client.TextResource() {
      // jar:file:/Users/jmxpsx/.m2/repository/com/github/gwtmaterialdesign/gwt-material-table/2.4.0/gwt-material-table-2.4.0.jar!/gwt/material/design/client/resources/js/mutate.min.js
      public String getText() {
        return "/* @license ! jQuery-mutate - v0.0.1 -\r\n * Licensed under the MIT license\r\n * http://www.opensource.org/licenses/mit-license.php\r\n * Date: 2015-04-19 */\r\n\r\n!function(a){function b(){var c=mutate;\"undefined\"!=c.event_stack&&c.event_stack.length&&a.each(c.event_stack,function(a,b){mutate.add_event(b)}),c.event_stack=[],a.each(c.stack,function(b,d){a(d.selector).each(function(a,b){c.events[d.event_name](b)===!0?d.callback&&d.callback(b,d):d.false_callback&&d.false_callback(b,d)})}),setTimeout(b,mutate.speed)}mutate={speed:100,event_stack:mutate_event_stack,stack:[],events:{},add_event:function(a){mutate.events[a.name]=a.handler},add:function(a,b,c,d){mutate.stack[mutate.stack.length]={event_name:a,selector:b,callback:c,false_callback:d}}},b(),a.fn.extend({mutate:function(){var b=!1,c=arguments[1],d=this,e=arguments[2]?arguments[2]:function(){};return\"extend\"==arguments[0].toLowerCase()?(mutate.add_event(c),this):(a.each(a.trim(arguments[0]).split(\" \"),function(a,f){b=f,mutate.add(b,d,c,e)}),this)}})}(jQuery);";
      }
      public String getName() {
        return "mutate";
      }
    }
    ;
  }
  private static class mutateInitializer {
    static {
      _instance0.mutateInitializer();
    }
    static com.google.gwt.resources.client.TextResource get() {
      return mutate;
    }
  }
  public com.google.gwt.resources.client.TextResource mutate() {
    return mutateInitializer.get();
  }
  private void mutateEventsInitializer() {
    mutateEvents = new com.google.gwt.resources.client.TextResource() {
      // jar:file:/Users/jmxpsx/.m2/repository/com/github/gwtmaterialdesign/gwt-material-table/2.4.0/gwt-material-table-2.4.0.jar!/gwt/material/design/client/resources/js/mutate-events.min.js
      public String getText() {
        return "/* @license ! jQuery-mutate - v0.0.2 -\r\n * Licensed under the MIT license\r\n * http://www.opensource.org/licenses/mit-license.php\r\n * Date: 2015-04-19 */\r\n\r\n!function(t){mutate_event_stack=[{name:\"width\",handler:function(a){var e=t(a);return e.data(\"mutate-width\")||e.data(\"mutate-width\",e.width()),e.data(\"mutate-width\")&&e.width()!=e.data(\"mutate-width\")?(e.data(\"mutate-width\",e.width()),!0):!1}},{name:\"height\",handler:function(a){var e=t(a);return e.data(\"mutate-height\")||e.data(\"mutate-height\",e.height()),e.data(\"mutate-height\")&&e.height()!=e.data(\"mutate-height\")?(e.data(\"mutate-height\",e.height()),!0):void 0}},{name:\"top\",handler:function(a){var e=t(a);return e.data(\"mutate-top\")||e.data(\"mutate-top\",e.css(\"top\")),e.data(\"mutate-top\")&&e.css(\"top\")!=e.data(\"mutate-top\")?(e.data(\"mutate-top\",e.css(\"top\")),!0):void 0}},{name:\"bottom\",handler:function(a){var e=t(a);return e.data(\"mutate-bottom\")||e.data(\"mutate-bottom\",e.css(\"bottom\")),e.data(\"mutate-bottom\")&&e.css(\"bottom\")!=e.data(\"mutate-bottom\")?(e.data(\"mutate-bottom\",e.css(\"bottom\")),!0):void 0}},{name:\"right\",handler:function(a){var e=t(a);return e.data(\"mutate-right\")||e.data(\"mutate-right\",e.css(\"right\")),e.data(\"mutate-right\")&&e.css(\"right\")!=e.data(\"mutate-right\")?(e.data(\"mutate-right\",e.css(\"right\")),!0):void 0}},{name:\"left\",handler:function(a){var e=t(a);return e.data(\"mutate-left\")||e.data(\"mutate-left\",e.css(\"left\")),e.data(\"mutate-left\")&&e.css(\"left\")!=e.data(\"mutate-left\")?(e.data(\"mutate-left\",e.css(\"left\")),!0):void 0}},{name:\"hide\",handler:function(a){var e=t(a),r=e.is(\":hidden\"),d=void 0==e.data(\"prev-hidden\")?r:e.data(\"prev-hidden\");return e.data(\"prev-hidden\",r),r&&r!=d?!0:void 0}},{name:\"show\",handler:function(a){var e=t(a),r=e.is(\":visible\"),d=void 0==e.data(\"prev-visible\")?r:e.data(\"prev-visible\");return e.data(\"prev-visible\",r),r&&r!=d?!0:void 0}},{name:\"scrollHeight\",handler:function(a){var e=t(a);return e.data(\"prev-scrollHeight\")||e.data(\"prev-scrollHeight\",e[0].scrollHeight),e.data(\"prev-scrollHeight\")&&e[0].scrollHeight!=e.data(\"prev-scrollHeight\")?(e.data(\"prev-scrollHeight\",e[0].scrollHeight),!0):void 0}},{name:\"scrollWidth\",handler:function(a){var e=t(a);return e.data(\"prev-scrollWidth\")||e.data(\"prev-scrollWidth\",e[0].scrollWidth),e.data(\"prev-scrollWidth\")&&e[0].scrollWidth!=e.data(\"prev-scrollWidth\")?(e.data(\"prev-scrollWidth\",e[0].scrollWidth),!0):void 0}},{name:\"scrollTop\",handler:function(a){var e=t(a);return e.data(\"prev-scrollTop\")||e.data(\"prev-scrollTop\",e[0].scrollTop()),e.data(\"prev-scrollTop\")&&e[0].scrollTop()!=e.data(\"prev-scrollTop\")?(e.data(\"prev-scrollTop\",e[0].scrollTop()),!0):void 0}},{name:\"scrollLeft\",handler:function(a){var e=t(a);return e.data(\"prev-scrollLeft\")||e.data(\"prev-scrollLeft\",e[0].scrollLeft()),e.data(\"prev-scrollLeft\")&&e[0].scrollLeft()!=e.data(\"prev-scrollLeft\")?(e.data(\"prev-scrollLeft\",e[0].scrollLeft()),!0):void 0}}]}(jQuery);";
      }
      public String getName() {
        return "mutateEvents";
      }
    }
    ;
  }
  private static class mutateEventsInitializer {
    static {
      _instance0.mutateEventsInitializer();
    }
    static com.google.gwt.resources.client.TextResource get() {
      return mutateEvents;
    }
  }
  public com.google.gwt.resources.client.TextResource mutateEvents() {
    return mutateEventsInitializer.get();
  }
  private void stickythInitializer() {
    stickyth = new com.google.gwt.resources.client.TextResource() {
      // jar:file:/Users/jmxpsx/.m2/repository/com/github/gwtmaterialdesign/gwt-material-table/2.4.0/gwt-material-table-2.4.0.jar!/gwt/material/design/client/resources/js/stickyth.min.js
      public String getText() {
        return "!function(e,t){\"use strict\";function i(i,r){var a=this;a.$el=e(i),a.el=i,a.id=l++,a.name=a.name+a.id,a.$window=e(t),a.$document=e(document),a.$el.bind(\"destroyed\",e.proxy(a.teardown,a)),a.$clonedHeader=null,a.$originalHeader=null,a.isSticky=!1,a.hasBeenSticky=!1,a.leftOffset=null,a.topOffset=null,a.scrollBarWidth=13,a.init=function(){a.$el.each(function(){var t=e(this);t.css(\"padding\",0),a.$originalHeader=e(\"thead:first\",this),a.$clonedHeader=a.$originalHeader.clone(),t.trigger(\"clonedHeader.\"+o,[a.$clonedHeader]),a.$clonedHeader.addClass(\"tableFloatingHeader\"),a.$clonedHeader.css(\"display\",\"none\"),a.$originalHeader.addClass(\"tableFloatingHeaderOriginal\"),a.$originalHeader.after(a.$clonedHeader),a.$clonedHeader.find(\".stickyExclude\").remove(),a.$printStyle=e('<style type=\"text/css\" media=\"print\">.tableFloatingHeader{display:none !important;}.tableFloatingHeaderOriginal{position:static !important;}</style>'),e(\"head\").append(a.$printStyle)}),a.setOptions(r),a.updateWidth(),a.toggleHeaders(),a.bind()},a.destroy=function(){a.$el.unbind(\"destroyed\",a.teardown),a.teardown()},a.teardown=function(){a.isSticky&&a.$originalHeader.css(\"position\",\"static\"),e.removeData(a.el,\"plugin_\"+o),a.unbind(),a.$clonedHeader.remove(),a.$originalHeader.removeClass(\"tableFloatingHeaderOriginal\"),a.$originalHeader.css(\"visibility\",\"visible\"),a.$printStyle.remove(),a.el=null,a.$el=null},a.bind=function(){a.$scrollableArea.on(\"scroll.\"+o,a.toggleHeaders),a.$scrollableArea.find(\".inner-scroll\").on(\"scroll.\"+o,a.toggleHeaders),a.isWindowScrolling||(a.$window.on(\"scroll.\"+o+a.id,a.setPositionValues),a.$window.on(\"resize.\"+o+a.id,a.toggleHeaders)),a.$scrollableArea.on(\"resize.\"+o,a.toggleHeaders),a.$scrollableArea.on(\"resize.\"+o,a.updateWidth),a.$window.on(\"resize.\"+o,a.updateWidth),a.detectOuterScrolls()},a.unbind=function(){a.$scrollableArea.off(\".\"+o,a.toggleHeaders),a.isWindowScrolling||(a.$window.off(\".\"+o+a.id,a.setPositionValues),a.$window.off(\".\"+o+a.id,a.toggleHeaders)),a.$scrollableArea.off(\".\"+o,a.updateWidth),a.$window.off(\".\"+o+a.id,a.updateWidth),a.$scrollableArea.parents().each(function(){e(this).off(\".\"+o)})},a.detectOuterScrolls=function(){a.$scrollableArea.parents().each(function(){var t=e(this);t.off(\".\"+o),t.hasScrollBar()&&t.on(\"scroll.\"+o,a.toggleHeaders)})},a.toggleHeaders=function(){a.$el&&a.$el.each(function(){var t,i=e(this),o=a.isWindowScrolling?isNaN(a.options.fixedOffset)?a.options.fixedOffset.outerHeight():a.options.fixedOffset:a.$scrollableArea.offset().top+(isNaN(a.options.fixedOffset)?0:a.options.fixedOffset),l=a.$scrollableArea.find(\".inner-scroll\"),n=i.offset(),r=l.scrollTop()+o,s=(l.scrollLeft(),a.isWindowScrolling?r>n.top:o>n.top);(a.isWindowScrolling?r:0)<n.top+i.height()-a.$clonedHeader.height()-(a.isWindowScrolling?0:o);s?(t=n.left+a.options.leftOffset,a.$originalHeader.css({position:\"fixed\",\"margin-top\":a.options.marginTop,left:t,\"z-index\":3}),a.leftOffset=t,a.topOffset=o,a.$clonedHeader.css(\"display\",\"\"),a.isSticky||(a.isSticky=!0,a.updateWidth(),a.$el.trigger(\"sticky-change\",[!0])),a.setPositionValues()):a.isSticky&&(a.$originalHeader.css(\"position\",\"static\"),a.$clonedHeader.css(\"display\",\"none\"),a.isSticky=!1,a.resetWidths(e(\"td,th\",a.$clonedHeader),e(\"td,th\",a.$originalHeader)),a.$el.trigger(\"sticky-change\",[!1]))})},a.setPositionValues=function(){var t=a.$window.scrollTop(),i=a.$window.scrollLeft();if(!(!a.isSticky||0>i||i+a.$window.width()>a.$document.width())){a.detectOuterScrolls(),a.scrollBarWidth=e.scrollBarWidth(a.el);var o=a.$scrollableArea.find(\".inner-scroll\").scrollLeft(),l=o+a.getOuterScrollLeft(),n=Math.max(a.getOuterScrollTop()-a.$scrollableArea.position().top-a.options.marginTop,0),r=a.$originalHeader.outerHeight();a.$originalHeader.css({top:a.topOffset-(a.isWindowScrolling?0:t),left:a.leftOffset-(a.isWindowScrolling?0:i),clip:\"rect(\"+n+\"px, \"+(a.$scrollableArea.outerWidth()+o-a.scrollBarWidth)+\"px, \"+(r+50)+\"px, \"+l+\"px)\"})}},a.updateWidth=function(){if(a.isSticky){a.$originalHeaderCells||(a.$originalHeaderCells=e('tr:not(\".stickyExclude\") th,td',a.$originalHeader)),a.$clonedHeaderCells||(a.$clonedHeaderCells=e('tr:not(\".stickyExclude\") th,td',a.$clonedHeader));var t=a.getWidths(a.$clonedHeaderCells);a.setWidths(t,a.$clonedHeaderCells,a.$originalHeaderCells),a.$originalHeader.css(\"width\",a.$clonedHeader.width())}},a.getWidths=function(i){var o=[];return i.each(function(i){var l,n=e(this);if(\"border-box\"===n.css(\"box-sizing\"))l=n[0].getBoundingClientRect().width;else{var r=e(\"th\",a.$originalHeader);if(\"collapse\"===r.css(\"border-collapse\"))if(t.getComputedStyle)l=parseFloat(t.getComputedStyle(this,null).width);else{var s=parseFloat(n.css(\"padding-left\")),d=parseFloat(n.css(\"padding-right\")),c=parseFloat(n.css(\"border-width\"));l=n.outerWidth()-s-d-c}else l=n.width()}o[i]=l}),o},a.setWidths=function(e,t,i){t.each(function(t){var o=e[t];i.eq(t).css({\"min-width\":o,\"max-width\":o})})},a.resetWidths=function(t,i){t.each(function(t){var o=e(this);i.eq(t).css({\"min-width\":o.css(\"min-width\"),\"max-width\":o.css(\"max-width\")})})},a.getOuterScrollTop=function(){var t=0;return a.$scrollableArea.parents(\":not(body,html)\").each(function(){t+=e(this).scrollTop()}),t},a.getOuterScrollLeft=function(){var t=0;return a.$scrollableArea.parents(\":not(body)\").each(function(){t+=e(this).scrollLeft()}),t},a.setOptions=function(i){a.options=e.extend({},n,i),a.$scrollableArea=e(a.options.scrollableArea),a.isWindowScrolling=a.$scrollableArea[0]===t},a.updateOptions=function(e){a.setOptions(e),a.unbind(),a.bind(),a.updateWidth(),a.toggleHeaders()},a.init()}var o=\"stickyTableHeaders\",l=0,n={fixedOffset:0,leftOffset:0,marginTop:0,scrollableArea:t};e.fn[o]=function(t){return this.each(function(){var l=e.data(this,\"plugin_\"+o);l?\"string\"==typeof t?l[t].apply(l):l.updateOptions(t):\"destroy\"!==t&&e.data(this,\"plugin_\"+o,new i(this,t))})}}(jQuery,window);\r\n";
      }
      public String getName() {
        return "stickyth";
      }
    }
    ;
  }
  private static class stickythInitializer {
    static {
      _instance0.stickythInitializer();
    }
    static com.google.gwt.resources.client.TextResource get() {
      return stickyth;
    }
  }
  public com.google.gwt.resources.client.TextResource stickyth() {
    return stickythInitializer.get();
  }
  private void styleInitializer() {
    style = new com.google.gwt.resources.client.TextResource() {
      // jar:file:/Users/jmxpsx/.m2/repository/com/github/gwtmaterialdesign/gwt-material-table/2.4.0/gwt-material-table-2.4.0.jar!/gwt/material/design/client/resources/css/style.min.css
      public String getText() {
        return "*{margin:0;padding:0}body,html{height:100%;padding:0}table{font-family:Roboto,sans-serif}section.table-container ::-webkit-scrollbar{-webkit-overflow-scrolling:auto;-webkit-appearance:none;height:8px!important;width:8px}section.table-container ::-webkit-scrollbar-thumb{background-color:rgba(0,0,0,.3);-webkit-box-shadow:0 0 1px rgba(255,255,255,.5)}th{text-transform:uppercase;padding:12px 5px 4px 20px}th span{display:inline-block;white-space:nowrap;overflow:hidden;text-overflow:ellipsis;max-width:100px;-webkit-touch-callout:none;-webkit-user-select:none;-khtml-user-select:none;-moz-user-select:none;-ms-user-select:none;user-select:none}tr{text-align:left}.selection-none table.table tbody tr.data-row,.selection-none table.table tbody tr.data-row td.hover,.selection-none table.table tbody tr.data-row.selected td,.selection-none table.table tbody tr.data-row:hover{background:0 0}table.table thead{border-bottom:1px solid #e3e3e3!important;font-size:12px;color:rgba(0,0,0,.54);z-index:500}table.table thead tr{height:56px;background-color:#fff}table.table tbody{font-size:13px;color:rgba(0,0,0,.87)}.overflow-hidden{overflow:hidden!important}tbody [type=checkbox]+label:before{border-radius:0!important}tbody [type=checkbox]+label{top:2px}tbody [type=checkbox].filled-in+label{top:6px}table.table th#col0.selection.frozen-col,tbody .frozen-col,thead .frozen-col div{display:flex;align-items:center}.frozen-col{left:0;top:auto;position:absolute}table.striped>tbody>tr:nth-child(odd) td.frozen-col{background-color:#f2f2f2!important}.max-height{height:100%!important}.inner-shadow{-moz-box-shadow:inset 18px 0 20px -20px #aaa;-webkit-box-shadow:inset 18px 0 20px -20px #aaa;box-shadow:inset 18px 0 20px -20px #aaa}.inner-scroll{overflow-x:hidden;overflow-y:visible}.x-scroll{overflow-x:scroll;height:15px;width:100%;overflow-y:hidden}.table-container{height:100%;width:100%;background-color:#fff}.table-container.stretch{width:100%!important;height:100%!important;max-height:100%!important}.table-container .progress{height:3px;top:-.6rem;margin:0;margin-bottom:-3px;z-index:9001}table.table .widget-cell{white-space:nowrap;-o-text-overflow:ellipsis;text-overflow:ellipsis}table.table .cell{white-space:nowrap;overflow:hidden;-o-text-overflow:ellipsis;text-overflow:ellipsis}table.table tbody td{border-radius:0;padding:0 5px 0 20px}table.table td#col0.selection{width:45px}table.table tbody tr.data-row #col0.frozen-col:not([data-title]){padding-top:0!important;padding-left:20px!important}table.table tbody tr.data-row #col0.frozen-col:not([data-title]) label{top:0}table.table #colex{text-align:center}table.table #colex i{width:100%}table.table tbody tr.subheader{cursor:pointer;background-color:#fff;width:100%;height:46px;left:0;right:0;z-index:2;position:absolute;border-bottom:1px solid #e3e3e3;-webkit-touch-callout:none;-webkit-user-select:none;-khtml-user-select:none;-moz-user-select:none;-ms-user-select:none;user-select:none;-webkit-backface-visibility:hidden;-moz-backface-visibility:hidden;backface-visibility:hidden}table.table tbody tr.subheader.expanded{-webkit-box-shadow:0 2px 5px 0 rgba(0,0,0,.16),0 2px 10px 0 rgba(0,0,0,.12);-moz-box-shadow:0 2px 5px 0 rgba(0,0,0,.16),0 2px 10px 0 rgba(0,0,0,.12);box-shadow:0 2px 5px 0 rgba(0,0,0,.16),0 2px 10px 0 rgba(0,0,0,.12)}table.table .table-header{width:100%;display:inline-block}table.table thead th.selected{color:#000}table.table tbody tr.subheader.fixed{position:fixed}table.table tbody tr.subheader td{padding:10px 5px!important}table.table tbody tr.subheader span{position:relative;top:2px}table.table tbody tr.subheader td,table.table tbody tr.subheader th{white-space:nowrap;padding-top:8px!important;padding-bottom:8px!important}table.table tbody tr.subheader td:first-child,table.table tbody tr.subheader th:first-child{padding-left:18px!important}table.table tbody tr.selected,table.table tbody tr.selected td{background-color:#f5f5f5}table.table .mask{position:absolute;width:100%;height:100%;top:0;opacity:.2;background-color:#000;z-index:9002}div.tool-panel ul.dropdown-content li{padding-left:8px}div.tool-panel ul.dropdown-content li label{height:50px;width:100%;padding-top:12px}div.tool-panel ul.dropdown-content li label:after,div.tool-panel ul.dropdown-content li label:before{top:11px}div.tool-panel ul.dropdown-content li input.filled-in+label:after,div.tool-panel ul.dropdown-content li input.filled-in+label:before{top:14px}section.table-container div.tool-panel ul.dropdown-content{max-height:350px!important;overflow-y:auto;overflow-x:hidden}section.table-container div.tool-panel ul.dropdown-content li>span{padding:3px 5px}.top-panel{width:100%;height:64px;position:relative;display:inline-block;background-color:#9e9e9e;border-bottom:3px solid #d3d3d3;padding:19px 12px 3px 16px;color:#fff;z-index:5}.tool-panel i{margin-left:5px}.info-panel{float:left}.tool-panel{float:right}.title{top:-6px;position:relative;margin-left:10px;font-size:16px}.table-body{width:calc(100% - 1px);height:100vh;position:relative;overflow-y:auto;overflow-x:hidden}.table-body:focus{outline:0}.table-footer{width:100%}.table-footer span.footer-left{float:left;text-align:left;width:33.333%}.table-footer span.footer-center{display:inline-block;text-align:center;margin:0 auto;width:33.333%}.table-footer span.footer-right{float:right;text-align:right;width:33.333%}tr.disabled *{opacity:.7;background:#e9e9e9;cursor:not-allowed;-webkit-touch-callout:none;-webkit-user-select:none;-khtml-user-select:none;-moz-user-select:none;-ms-user-select:none;user-select:none}tr.disabled:hover{color:rgba(0,0,0,.87);cursor:not-allowed;background-color:transparent!important}tr .numeric{text-align:right}table.table thead tr th{background-color:#fff;-webkit-touch-callout:none;-webkit-user-select:none;-khtml-user-select:none;-moz-user-select:none;-ms-user-select:none;user-select:none;padding-left:20px}table.table thead tr th.sortable,tr.data-row{cursor:pointer}table.table tbody tr.data-row{border-bottom:1px solid #e6e6e6;-webkit-touch-callout:none;-webkit-user-select:none;-khtml-user-select:none;-moz-user-select:none;-ms-user-select:none;user-select:none}table.table tbody tr.data-row:hover{background:#eee;color:#000}table.table tbody tr.data-row td.hover{background:#eee;color:#000}table.table thead tr th.sortable:hover{color:rgba(0,0,0,.87)}table.table tbody tr.expansion td{padding:0!important}table.table tbody tr.expansion td div.expanded{max-height:600px;overflow:hidden;border-bottom:1px solid #e6e6e6}table.table tbody tr.expansion td div.expanded section.overlay{position:absolute;background:#fff;opacity:.5;font-size:28px;width:100%}table.table tbody tr.expansion td div.expanded section.overlay i{position:relative;left:50%;top:calc(40% - 19px)}table.table tbody tr.expansion td>div{display:block;width:100%;max-height:0;line-height:150%;overflow-y:hidden;-webkit-transition:all .25s cubic-bezier(.35,0,.35,1);-moz-transition:all .25s cubic-bezier(.35,0,.35,1);-o-transition:all .25s cubic-bezier(.35,0,.35,1);-ms-transition:all .25s cubic-bezier(.35,0,.35,1);transition:all .25s cubic-bezier(.35,0,.35,1)}table.table tbody tr.expansion td div .content{width:100%;height:100%;display:block;float:left;overflow:auto;background:#f5f5f5}table.table tbody tr.expansion td div h3.expanded_header{margin:0 0 15px 0;padding:0;font-size:16px;font-weight:400;color:#000;text-shadow:0 1px 0 #fff}table.table tbody tr.expansion td div h4.expanded_header{margin:0;padding:8px;font-size:14px;font-weight:400;color:#000;text-shadow:0 1px 0 #fff;background:#f5f5f5}table.table tbody tr.expansion td>div p{margin:4px 0 4px 0!important;padding:0!important}table.table.comfortable tr td{padding-top:0;padding-bottom:0}table.table.comfortable thead tr th.frozen-col{height:44px!important}table.table.comfortable thead tr{height:40px}table.table.comfortable tr td .letter-avatar,table.table.comfortable tr td img{width:32px!important;height:32px!important}table.table.comfortable tr td .input-field.listbox-wrapper{margin-top:0}table.table.comfortable tr td .input-field input.select-dropdown{height:28px;font-size:1em;padding-bottom:4px;margin-bottom:6px}table.table.compact tr td{padding-top:0;padding-bottom:0}table.table.compact thead tr th.frozen-col{height:38px!important}table.table.compact thead tr{height:32px}table.table.compact tr td .letter-avatar,table.table.compact tr td img{width:20px!important;height:20px!important}table.table.compact tr td .input-field.listbox-wrapper{margin-top:0}table.table.compact tr td .input-field input.select-dropdown{margin-bottom:0;height:20px;font-size:1em;padding-bottom:4px}@media only screen and (max-width:520px),(min-device-width:0px) and (max-device-width:519px){table.table tbody,table.table td:not(tr.expansion),table.table thead,table.table tr{display:inline-block}table.table{display:block!important}.top-panel{height:64px;padding-top:20px;padding-bottom:20px}.top-panel i{margin-top:-4px!important}table.table thead{display:none}table.table tbody tr.subheader.fixed{margin-top:-2px}tr.data-row td:before{content:attr(data-title);color:#000;padding-right:8px;white-space:nowrap;text-overflow:ellipsis;overflow:hidden}table.table .cell{color:#00000082}table.table tbody td>div,tr.data-row td:before{width:50%;display:inline-block;vertical-align:middle;text-align:left}table.table .numeric{text-align:left!important}table.table tbody tr.data-row td:first-child:before{padding-right:6px!important}table.table tbody tr.data-row td:first-child label{top:6px}table.table tbody{display:table;width:100%;background:#e9e9e9}.table-body{background:#fff;height:440px;top:-6px}.selection-none table.table tbody tr.data-row,table.table tbody tr.data-row{display:table;width:94%!important;margin:auto!important;margin-top:12px!important;margin-bottom:12px!important;box-shadow:0 2px 5px 0 rgba(0,0,0,.16),0 2px 10px 0 rgba(0,0,0,.12);background:#fff;position:relative}table.table tbody tr.data-row.disabled{box-shadow:0 2px 5px 0 rgba(0,0,0,.16),0 2px 10px 0 rgba(0,0,0,.12)!important}table.table tbody tr.data-row.disabled td{border:1px solid #d7d7d7}table.table tbody tr.data-row.selected{position:relative;background:#fff!important}table.table tbody tr.expansion td{width:94%!important;padding-top:0!important;margin:auto;margin-top:-12px}table.table tbody tr.expansion td div.expanded{box-shadow:0 2px 5px 0 rgba(0,0,0,.16),0 2px 10px 0 rgba(0,0,0,.12)}tbody tr td#colex:before{display:none}tbody tr td#colex #expand{cursor:pointer;width:100px!important;background:#e9e9e9;border-radius:20px}table.table tbody tr.data-row #col0:not([data-title]){width:40px!important;height:40px!important;background:#e9e9e9;border-radius:100%;position:absolute;z-index:1;right:6px;left:initial!important;top:2px;box-shadow:none!important;padding-left:0!important;padding-top:0!important}table.table tbody tr.data-row #col0:not([data-title]) label{padding:0!important;margin-left:-4px;margin-top:3px}table.table tbody tr.data-row:hover,table.table tbody tr.selected td,table.table tbody tr.selected td.hover{background:#fff}table.table tbody td{padding:12px!important;line-height:150%!important;border-top:1px solid #e9e9e9;position:relative;width:100%!important;display:block!important;left:0!important;height:auto!important;border-bottom:none!important}table.table tbody tr.data-row #col0.frozen-col:not([data-title]){padding-left:0!important}table.table tbody tr.subheader th{min-width:initial!important;max-width:initial!important}table.table tbody tr td .widget-cell .input-field{margin:0}.inner-scroll{margin-left:0!important}.x-scroll{display:none}}";
      }
      public String getName() {
        return "style";
      }
    }
    ;
  }
  private static class styleInitializer {
    static {
      _instance0.styleInitializer();
    }
    static com.google.gwt.resources.client.TextResource get() {
      return style;
    }
  }
  public com.google.gwt.resources.client.TextResource style() {
    return styleInitializer.get();
  }
  private void tableSubHeadersInitializer() {
    tableSubHeaders = new com.google.gwt.resources.client.TextResource() {
      // jar:file:/Users/jmxpsx/.m2/repository/com/github/gwtmaterialdesign/gwt-material-table/2.4.0/gwt-material-table-2.4.0.jar!/gwt/material/design/client/resources/js/table-subheaders.min.js
      public String getText() {
        return "function TableSubHeaders(e,t){TableSubHeaders.id++;var i=this,o=$(i);i.name=\"subheaders\"+TableSubHeaders.id,i.$window=$(window),i.$document=$(document),i.$tableBody=e.find(\"tbody\"),i.$tableParents=e.parents(),i.$stickies=null,i.options=[],i.cache=[],i.loaded=!1,i.scrollBarWidth=13,i.debug={enabled:!1,smartScroll:{table:0,window:0,outer:0},touchmove:{table:0,window:0,outer:0},resize:{table:0,window:0}};var a={marginTop:0,marginLeft:0,scrollThrottle:10,resizeThrottle:100};i.load=function(e){i.options=$.extend({},a,e),i.bind(),i.detect(),i.recalculate(!0),i.loaded=!0},i.unload=function(){i.options=[],i.unbind(),i.$stickies.each(function(){var t=$(this);t.removeClass(\"fixed\").removeClass(\"passed\").removeAttr(\"style\"),t.unwrap(),e.scrollTop(0)}),i.loaded=!1},i.reload=function(){i.unload(),i.load()},i.detect=function(){if(i.$stickies=$(t,e),!(i.$stickies.length<1)){i.$stickies.off(\".\"+i.name),i.$stickies.on(\"tap.\"+i.name+\" click.\"+i.name,function(){i.toggle($(this))});var o=$(t,e).filter(function(){return $(this).parent().is(\":not(div)\")}),a=i.isChrome();o.each(function(){$(this).wrap(\"<div style='width:100%;z-index:2;cursor:pointer;background-color:#fff;\"+(a?\"\":\"display:table-row;\")+\"'/>\")})}},i.bind=function(){i.unbind();var t=i.options.scrollThrottle,o=i.options.resizeThrottle;e.smartScroll(i.name,$.throttle(t,function(e,t){i.debug.enabled&&i.debug.smartScroll.table++,i.scroll(e,t)})),e.find(\".inner-scroll\").smartScroll(i.name,$.throttle(t,function(e,t){i.debug.enabled&&i.debug.smartScroll.table++,i.scroll(e,t)})),e.on(\"resize.\"+i.name,$.debounce(o,function(){i.debug.enabled&&i.resize.table++,i.recalculate(!0)})),i.$window.smartScroll(i.name,$.throttle(t,function(e,t){i.debug.enabled&&i.debug.smartScroll.window++,i.alignment(t)})),i.$window.on(\"resize.\"+i.name,$.debounce(o,function(){i.debug.enabled&&i.debug.resize.window++,i.recalculate(!0)})),i.detectOuterScrolls()},i.unbind=function(){e.off(\".\"+i.name),i.$window.off(\".\"+i.name),i.$stickies&&i.$stickies.off(\".\"+i.name),i.$tableParents.each(function(){$(this).off(\".\"+i.name)})},i.detectOuterScrolls=function(){var e=i.options.scrollThrottle;i.$tableParents.off(\".\"+i.name),i.$tableParents.filter(function(){return $(this).hasScrollBar()}).smartScroll(i.name,$.throttle(e,function(e,t){i.debug.enabled&&i.debug.smartScroll.outer++,i.alignment(t)}))},i.toggle=function(e){e.hasClass(\"expanded\")?i.close(e):i.open(e)},i.open=function(e){e.addClass(\"expanded\"),o.trigger(\"opening\",[e]);var t=e.find(\"i\");if(null!==t){var a=e.attr(\"data-close-icon\");void 0===a&&(a=\"remove\"),t.text(a)}var n=e.parent(),s=n.nextUntil(\"div\",\"tr\");$.when(s.show(200)).then(function(){i.recalculate(!0),e.trigger(\"opened\",[e])})},i.close=function(e){e.removeClass(\"expanded\"),o.trigger(\"closing\",[e]);var t=e.find(\"i\");if(null!==t){var a=e.attr(\"data-open-icon\");void 0===a&&(a=\"add\"),t.text(a)}var n=e.parent().nextUntil(\"div\");$.when(n.hide(200)).then(function(){i.recalculate(!0),e.trigger(\"closed\",[e])})},i.recalculate=function(t){if(!(i.$stickies.length<1)){t&&o.trigger(\"before-recalculate\"),i.scrollBarWidth=$.scrollBarWidth(i.$tableBody.get(0)),i.detectOuterScrolls(),i.updateHeights();var a=e.scrollTop(),n=i.getOuterScrollTop(),s=i.$tableBody.outerWidth();i.$stickies.each(function(){var e=$(this);e.removeClass(\"fixed\").removeClass(\"passed\").removeAttr(\"style\"),$.data(this,\"pos\",e.offset().top+n+a+1),i.updateWidth(e,s-2)}),t&&o.trigger(\"after-recalculate\"),i.scroll()}},i.scroll=function(t,o){var a=e.offset(),n=e.innerWidth(),s=i.$tableBody.outerWidth(),l=a.top+i.options.marginTop,r=e.scrollTop()+i.getOuterScrollTop(),c=i.$window.scrollTop(),d=a.left+i.options.marginLeft,u=e.find(\".inner-scroll\").scrollLeft(),f=i.getOuterScrollLeft();i.$stickies.each(function(e){var t=$(this),a=!1;if(!o||o.isY()){var h=i.$stickies.eq(e+1),p=i.$stickies.eq(e-1),g=$.data(this,\"pos\");if(r+l>=g)i.emulateYScroll(t,l,c,r),t.hasClass(\"passed\")||(t.hasClass(\"fixed\")||(t.addClass(\"fixed\"),a=o&&!o.isX()),i.updateWidth(t,s),p.css(\"display\",\"none\"),t.css({display:\"\"}),h.length>0&&r+l>=g-p.outerHeight()&&t.addClass(\"passed\"));else{t.outerWidth();t.removeClass(\"fixed\").removeAttr(\"style\"),p.css({display:\"\"}),p.length>0&&r+l<=g-p.outerHeight()&&p.removeClass(\"passed\")}}(!o||o.isX()||a)&&t.hasClass(\"fixed\")&&i.emulateXScroll(t,n,d,u,f)}),i.$stickies.filter(\".passed\").each(function(e){var t=$(this),o=i.$stickies.eq(e+1),a=$.data(o[0],\"pos\")-r-t.outerHeight()-c;t.data(\"push-back\",parseInt(t.css(\"top\").replace(\"px\",\"\")-a)),t.css({top:a})})},i.emulateYScroll=function(t,o,a,n,s){var l=(e.offset(),t.outerHeight()+50),r=(s?s:i.getOuterScrollTop())-i.options.marginTop-e.position().top,c=r+\"px\",d=l+\"px\",u=t.data(\"clip-right\"),f=t.data(\"clip-left\");if(t.hasClass(\"passed\")){var h=t.data(\"push-back\");c=Math.max(h,r+h)+\"px\"}t.data(\"clip-top\",c).data(\"clip-bottom\",d),t.css({top:o-a,clip:\"rect(\"+c+\", \"+u+\", \"+d+\", \"+f+\")\"})},i.emulateXScroll=function(e,t,o,a,n){var s=a+(n?n:i.getOuterScrollLeft())+\"px\",l=t+a-i.scrollBarWidth+\"px\",r=e.data(\"clip-top\")||\"auto\",c=e.data(\"clip-bottom\")||\"auto\";e.data(\"clip-left\",s).data(\"clip-right\",l),e.css({left:o-a-i.$window.scrollLeft(),clip:\"rect(\"+r+\", \"+l+\", \"+c+\", \"+s+\")\"})},i.alignment=function(t){if(!(i.$stickies.length<1)){var o=e.offset(),a=e.innerWidth(),n=i.$tableBody.outerWidth(),s=!t||t.isX(),l=!t||t.isY(),r=l?i.$window.scrollTop():0,c=l?o.top+i.options.marginTop:0,d=l?e.scrollTop()+i.getOuterScrollTop():0,u=s?o.left+i.options.marginLeft:0,f=s?e.find(\".inner-scroll\").scrollLeft():0,h=s?i.getOuterScrollLeft():0;i.$stickies.filter(\".fixed\").each(function(e){var o=$(this);if(!t||t.isY()){var l=c;if(o.hasClass(\"passed\")){var p=i.$stickies.eq(e+1);l=$.data(p[0],\"pos\")-d-o.outerHeight()}i.emulateYScroll(o,l,r,d),i.updateWidth(o,n)}s&&i.emulateXScroll(o,a,u,f,h)})}},i.getOuterScrollTop=function(){var e=0;return i.$tableParents.filter(\":not(body,html)\").each(function(){e+=$(this).scrollTop()}),e},i.getOuterScrollLeft=function(){var e=0;return i.$tableParents.filter(\":not(body,html)\").each(function(){e+=$(this).scrollLeft()}),e},i.updateCellWidths=function(t){var o=i.getCellWidths($(\"th,td\",$(\"thead\",e)));i.setCellWidths(o,t)},i.setCellWidths=function(e,t){t.find(\"th,td\").each(function(t){var i=$(this),o=e[t];i.css({\"min-width\":o,\"max-width\":o})})},i.getCellWidths=function(e){var t=[];return e.each(function(e){var o,a=$(this);if(\"border-box\"===a.css(\"box-sizing\"))o=this.getBoundingClientRect().width;else{var n=$(\"th\",i.$originalHeader);if(\"collapse\"===n.css(\"border-collapse\"))if(window.getComputedStyle)o=parseFloat(window.getComputedStyle(this,null).width);else{var s=parseFloat(a.css(\"padding-left\")),l=parseFloat(a.css(\"padding-right\")),r=parseFloat(a.css(\"border-width\"));o=a.outerWidth()-s-l-r}else o=a.width()}t[e]=o}),t},i.updateWidth=function(e){i.updateCellWidths(e)},i.updateWidths=function(){i.$stickies.each(function(){i.updateWidth($(this))})},i.updateHeights=function(){i.$stickies.each(function(){var e=$(this),t=e.attr(\"data-height\");\"undefined\"==typeof t&&(t=e.outerHeight()),e.parent().height(t+1)})},i.updateHeight=function(e,t){$.contains(i.$stickies,$(e))&&$(e).parent().height(t)},i.setMarginTop=function(e){i.options.marginTop=e},i.setMarginLeft=function(e){i.options.marginLeft=e},i.isLoaded=function(){return i.loaded},i.getDebugInfo=function(){return i.debug},i.isChrome=function(){return!!window.chrome&&!i.isOpera()},i.isOpera=function(){return!!window.opera||navigator.userAgent.indexOf(\" OPR/\")>=0}}TableSubHeaders.id=0,TableSubHeaders.newInstance=function(e,t){return new TableSubHeaders(e,t)};\r\n";
      }
      public String getName() {
        return "tableSubHeaders";
      }
    }
    ;
  }
  private static class tableSubHeadersInitializer {
    static {
      _instance0.tableSubHeadersInitializer();
    }
    static com.google.gwt.resources.client.TextResource get() {
      return tableSubHeaders;
    }
  }
  public com.google.gwt.resources.client.TextResource tableSubHeaders() {
    return tableSubHeadersInitializer.get();
  }
  private static java.util.HashMap<java.lang.String, com.google.gwt.resources.client.ResourcePrototype> resourceMap;
  private static com.google.gwt.resources.client.TextResource darkCss;
  private static com.google.gwt.resources.client.TextResource greedyScroll;
  private static com.google.gwt.resources.client.TextResource jQueryExt;
  private static com.google.gwt.resources.client.TextResource mutate;
  private static com.google.gwt.resources.client.TextResource mutateEvents;
  private static com.google.gwt.resources.client.TextResource stickyth;
  private static com.google.gwt.resources.client.TextResource style;
  private static com.google.gwt.resources.client.TextResource tableSubHeaders;
  
  public ResourcePrototype[] getResources() {
    return new ResourcePrototype[] {
      darkCss(), 
      greedyScroll(), 
      jQueryExt(), 
      mutate(), 
      mutateEvents(), 
      stickyth(), 
      style(), 
      tableSubHeaders(), 
    };
  }
  public ResourcePrototype getResource(String name) {
    if (GWT.isScript()) {
      return getResourceNative(name);
    } else {
      if (resourceMap == null) {
        resourceMap = new java.util.HashMap<java.lang.String, com.google.gwt.resources.client.ResourcePrototype>();
        resourceMap.put("darkCss", darkCss());
        resourceMap.put("greedyScroll", greedyScroll());
        resourceMap.put("jQueryExt", jQueryExt());
        resourceMap.put("mutate", mutate());
        resourceMap.put("mutateEvents", mutateEvents());
        resourceMap.put("stickyth", stickyth());
        resourceMap.put("style", style());
        resourceMap.put("tableSubHeaders", tableSubHeaders());
      }
      return resourceMap.get(name);
    }
  }
  private native ResourcePrototype getResourceNative(String name) /*-{
    switch (name) {
      case 'darkCss': return this.@gwt.material.design.client.resources.MaterialTableBundle::darkCss()();
      case 'greedyScroll': return this.@gwt.material.design.client.resources.MaterialTableBundle::greedyScroll()();
      case 'jQueryExt': return this.@gwt.material.design.client.resources.MaterialTableBundle::jQueryExt()();
      case 'mutate': return this.@gwt.material.design.client.resources.MaterialTableBundle::mutate()();
      case 'mutateEvents': return this.@gwt.material.design.client.resources.MaterialTableBundle::mutateEvents()();
      case 'stickyth': return this.@gwt.material.design.client.resources.MaterialTableBundle::stickyth()();
      case 'style': return this.@gwt.material.design.client.resources.MaterialTableBundle::style()();
      case 'tableSubHeaders': return this.@gwt.material.design.client.resources.MaterialTableBundle::tableSubHeaders()();
    }
    return null;
  }-*/;
}
