;(function( jQuery, window, undefined ) {
	
	$.extend({
		calcNum : function(obj){
			return obj <=9 ? "0"+obj:obj;
		},
		weeks : ['星期日','星期一','星期二','星期三','星期四','星期五','星期六']
	})
	
	/** 定义对象方法
	 *   [] {}
	 *  
	 *  */
	$.fn.extend({
		runTimer : function(){
			/** 获取系统的当前时间 */
			var date = new Date();
			
			/** 获取年 */
			var year = date.getFullYear();
			/** 获取月 */
			var month = date.getMonth()+1;
			/** 获取日  */
			var today = date.getDate();
			/** 获取时 */
			var hh = date.getHours();
			/** 获取分 */
			var mm = date.getMinutes();
			/** 获取秒 */
			var ss= date.getSeconds();
			/** 获取星期 */
			var weekDay = date.getDay(); // 0 
			
			/** 获取时间格式 */
			var timer = year+"年"+$.calcNum(month)+"月"+$.calcNum(today)+"日"+" "+$.calcNum(hh)+":"+$.calcNum(mm)+":"+$.calcNum(ss)
			 +" "+$.weeks[weekDay];
			
			$(this).html(timer);
			
			/**
			 * if(条件)  
			 *  条件：true 或者 false
			 *  条件 ：判断变量是否存在 存在就是true 不存在就false
			 * */
			if(it){
				/** 清楚上一次的时间周期调度 */
				clearTimeout(it);
			}
			
			var t = this;  // 调用此方法的对象 this就代表nowTime<span>
			
			var it = setTimeout(function(){
				 /** 用对象的方法调用走时的函数 */
				 // 这里面的this代表的是窗口
				 t.runTimer();
			}, 1000);
			
			
		}
	});
    $.fn.extend({
        runTimer3 : function(){
            /** 获取系统的当前时间 */
            var date = new Date();

            /** 获取年 */
            var year = date.getFullYear();
            /** 获取月 */
            var month = date.getMonth()+1;
            /** 获取日  */
            var today = date.getDate();
            /** 获取时 */
            var hh = date.getHours();
            /** 获取分 */
            var mm = date.getMinutes();
            /** 获取秒 */
            var ss= date.getSeconds();
            /** 获取星期 */
            var weekDay = date.getDay(); // 0

            /** 获取时间格式 */
            var timer = year+"年"+$.calcNum(month)+"月"+$.calcNum(today)+"日"+" "+$.calcNum(hh)+":"+$.calcNum(mm)+":"+$.calcNum(ss);

            $(this).html(timer);

            /**
             * if(条件)
             *  条件：true 或者 false
             *  条件 ：判断变量是否存在 存在就是true 不存在就false
             * */
            if(it){
                /** 清楚上一次的时间周期调度 */
                clearTimeout(it);
            }

            var t = this;  // 调用此方法的对象 this就代表nowTime<span>

            var it = setTimeout(function(){
                /** 用对象的方法调用走时的函数 */
                // 这里面的this代表的是窗口
                t.runTimer3();
            }, 1000);


        }
    });
    $.fn.extend({
        runTimer2 : function(){
            /** 获取系统的当前时间 */
            var date = new Date();
            /** 获取年 */
            var year = date.getFullYear();
            /** 获取月 */
            var month = date.getMonth()+1;
            /** 获取日  */
            var today = date.getDate();
            /** 获取时 */
            var hh = date.getHours();
            /** 获取分 */
            var mm = date.getMinutes();


            /** 获取时间格式 */
            var timer = year+"-"+$.calcNum(month)+"-"+$.calcNum(today)+"-"+$.calcNum(hh)+"-"+$.calcNum(mm);

            $(this).html(timer);

            /**
             * if(条件)
             *  条件：true 或者 false
             *  条件 ：判断变量是否存在 存在就是true 不存在就false
             * */
            if(it){
                /** 清楚上一次的时间周期调度 */
                clearTimeout(it);
            }

            var t = this;  // 调用此方法的对象 this就代表nowTime<span>

            var it = setTimeout(function(){
                /** 用对象的方法调用走时的函数 */
                // 这里面的this代表的是窗口
                t.runTimer2();
            }, 60000);


        }
    });


})( jQuery, window );
//计算订单开始时间和结束退房两个日期之间相差几天，精确到0.00天
function calTime(start,end) {
    2019-12-30-01-37
    var yearS = start.split("-")[0];
    var monthS = start.split("-")[1];
    var dayS = start.split("-")[2];
    var hourS = parseInt(start.split("-")[3]);
    var secondS = parseInt(start.split("-")[4]);

    var yearE = end.split("-")[0];
    var monthE = end.split("-")[1];//12
    var dayE = end.split("-")[2];//30
    var hourE =parseInt( end.split("-")[3]);//12
    var secondE = parseInt(end.split("-")[4]);//60

    var oDate1  =  new  Date(monthS  +  '-'  +  dayS  +  '-'  +  yearS)    //转换为12-18-2002格式
    var oDate2  =  new  Date(monthE  +  '-'  +  dayE  +  '-'  +  yearE)
    var iDays  =  parseInt(Math.abs(oDate1  -  oDate2)  /  1000  /  60  /  60)
    var day = ((hourE+secondE/60)-(hourS+secondS/60)+iDays)/24;
    return day;

}