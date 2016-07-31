<%@ page language="java" pageEncoding="UTF-8"%>
<%@include file="/WEB-INF/view/page/taglib.jsp" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<title>首页----嘉定区村居社会管理信息系统</title>
<meta name="keywords" content="嘉定区村居社会管理信息系统"></meta>
<link rel="stylesheet" type="text/css" href="/styles/css/home.css?a=1" ></link>
<script type="text/javascript" src="/styles/js/jquery.min.js"></script>
<script type="text/javascript" src="/styles/js/baes.js"></script>
 
 <script src="/scripts/amcharts/amcharts.js" type="text/javascript"></script>
        <script src="/scripts/amcharts/serial.js" type="text/javascript"></script>
        <script src="/scripts/amcharts/pie.js" type="text/javascript"></script>
        <script src="/scripts/amcharts/exporting/amexport.js" type="text/javascript"></script>
        <script src="/scripts/amcharts/exporting/rgbcolor.js" type="text/javascript"></script>
        <script src="/scripts/amcharts/exporting/canvg.js" type="text/javascript"></script>
        <script src="/scripts/amcharts/exporting/jspdf.js" type="text/javascript"></script>
        <script src="/scripts/amcharts/exporting/filesaver.js" type="text/javascript"></script>
        <script src="/scripts/amcharts/exporting/jspdf.plugin.addimage.js" type="text/javascript"></script>
       

<script type="text/javascript">
		$(function() {			
			$.ajax({
				type : 'get',
				url : '/business/findRemind',
				dataType : 'json',
				async : false,
				success : function(data) {				
				  if(data.length==0){
					  html = '<dd style="padding-left: 20px">暂无待填写表单 </dd>';
					  $('#daitianxie').append(html);
					
					}				 
					var html = '';
					for(var i=0;i<data.length;i++){
						//alert(i)
						var light = '';
						switch (data[i].type) {
						case 1:
							light = 'greenIcon';
							break;
						case 2:
							light = 'yeowlIcon';
							break;
						case 3:
							light = 'redIcon';
							break;
						default:
							break;
						}						
						html = '<dd><code class=' + light + '></code><a href="' + data[i].url + '">' + data[i].name + '</a></dd>';
						$('#daitianxie').append(html);
						if(i==5){
								break;
						}
					}
					if(data.length>5){
						$('#daitianxie').append(' <dd style="padding: 0;margin: 0;"><a style="margin-left: 80%"  href="/business/findRemindMore"><B>更多待填写表单....</B></a></dd>');
						}							
				}
			});
		});
		//饼图
		 var chart1;
		var json=[
		          {"name":"沪籍人口","value":'${peoplesummary.hjrks}'},
		          {"name":"外来人员","value":"${peoplesummary.outcome}"},
		          {"name":"来沪人员","value":"${peoplesummary.lhzlfwrs}"},
		         {"name":"人户分离人数","value":"${peoplesummary.residencePermit}"}
		          ];
		        //根据json数据生成饼状图，并将饼状图显示到div中
		       
            AmCharts.ready(function () {
                // PIE CHART
                chart1 = new AmCharts.AmPieChart();

                // title of the chart
                chart1.addTitle("${peoplesummary.aloneCount}"+"人口分布图", 16);

                chart1.dataProvider = json;
                chart1.titleField = "name";
                chart1.valueField = "value";
                chart1.sequencedAnimation = false;
                chart1.startEffect = "elastic";
                chart1.innerRadius = "30%";
                chart1.startDuration = 0;
                chart1.labelRadius = 1;
                chart1.radius = 100;//调整大小
                // the following two lines makes the chart 3D
                chart1.depth3D = 10;
                chart1.angle = 30;

                // WRITE                                 
                chart1.write("mainDiv");
            });
	//柱状图
	  var chart;
            var chartData = [{
                "country": "一月",
                    "visits": '${map["01"]}',
                    "color": "#FF0F00"
            }, {
                "country": "二月",
                    "visits": '${map["02"]}',
                    "color": "#FF6600"
            }, {
                "country": "三月",
                    "visits": '${map["03"]}',
                    "color": "#FF9E01"
            }, {
                "country": "四月",
                    "visits": '${map["04"]}',
                    "color": "#FCD202"
            }, {
                "country": "五月",
                    "visits": '${map["05"]}',
                    "color": "#F8FF01"
            }, {
                "country": "六月",
                    "visits": '${map["06"]}',
                    "color": "#B0DE09"
            }, {
                "country": "七月",
                    "visits": '${map["07"]}',
                    "color": "#04D215"
            }, {
                "country": "八月",
                    "visits": '${map["08"]}',
                    "color": "#0D8ECF"
            }, {
                "country": "九月",
                    "visits": '${map["09"]}',
                    "color": "#0D52D1"
            }, {
                "country": "十月",
                    "visits": '${map["10"]}',
                    "color": "#2A0CD0"
            }, {
                "country": "十一月",
                    "visits": '${map["11"]}',
                    "color": "#8A0CCF"
            }, {
                "country": "十二月",
                    "visits": '${map["12"]}',
                    "color": "#CD0D74"
            }];


            var chart = AmCharts.makeChart("chartdiv", {
                type: "serial",
                dataProvider: chartData,
                categoryField: "country",
                pathToImages:"/scripts/amcharts/images/",
                depth3D: 20,
                angle: 30,
				
                categoryAxis: {
                    labelRotation: 0,
                    gridPosition: "start",
                    //title:"月份"
                },

              //  valueAxes: [{
             //       title: "实有人口数"
            //    }],

                graphs: [{

                    valueField: "visits",
                    colorField: "color",
                    type: "column",
                    lineAlpha: 0,
                    fillAlphas: 1
                }],

                chartCursor: {
                    cursorAlpha: 0,
                    zoomable: false,
                    categoryBalloonEnabled: false
                },

                amExport: {
                    top: 21,
                    right: 21,
                    buttonColor: '#EFEFEF',
                    buttonRollOverColor:'#DDDDDD',
                    exportPNG:true,
                    exportJPG:true,
                    exportPDF:true,
                    exportSVG:true
                }
            });
	
        	var browser=navigator.appName ;	
        	var b_version=navigator.appVersion; 
        	var version=b_version.split(";"); 
        	var trim_Version=version[1].replace(/[ ]/g,""); 	
        	trim_Version=trim_Version.substr(4,trim_Version.length);	
        	trim_Version=parseInt(trim_Version);
        	if(browser=="Microsoft Internet Explorer" && trim_Version<8) { 
        		 parent.$.jBox.tip('您的浏览器版本过低，请升级到IE8或以上', 'error');
        		} 
	</script>

<style type="text/css">
#Main{
	width: 500px;
	height: 200px;
	overflow:hidden;
}
#mainDiv {
	width:100%;
	height:200px;
}
</style>
</head>
<body>  

<div class="warp">
 <div class="warpContent fl">
 		
     <div class="rightContent fl">
       <div class="news fl">
          <div class="form fl">
            <ul>
            	<span class="fl"></span>
            	<shiro:hasAnyRoles name="ganshi">
           		 	<li class="onForm"><a href="#">待填写表单</a></li>
           		 	
           	   </ul>
           	   <dl id="daitianxie" >
           	  
           	   </dl>
            	</shiro:hasAnyRoles>
            	<shiro:hasAnyRoles name="shuji">
           		 	<li class="onForm"><a href="#">待审核表单</a></li>
            	</shiro:hasAnyRoles>
            	<shiro:hasAnyRoles name="lxd,qznbm">
           		 	<li class="onForm"><a href="#">统计汇总</a></li>
            	</shiro:hasAnyRoles>
            </ul>
            <div class="formHide formShow" >
           <shiro:hasAnyRoles name="shuji">
              <dl id="stayFill" >
              <!-- 集合止跌带1-8的，其他的跳到跟多页面 -->
	              <c:forEach items="${businessForms}" var="businessForm" varStatus="num" begin="0" end="7">
	               <dd  style="padding: 0;margin: 0;"><code class="redIcon"></code><a href="/${businessForm.business.lowerCode }/check/${businessForm.id}">${businessForm.name}</a><cite>${businessForm.submitdate}</cite></dd>
	            
	              </c:forEach> 
	                <c:if  test="${fn:length(businessForms)>6}">
                <dd style="padding: 0;margin: 0;"><a style="margin-left: 80%"  href="/taizhang/gengduo/"><B>更多待审核表单....</B></a></dd>
              </c:if>
              </dl>
            </shiro:hasAnyRoles>
            <shiro:hasAnyRoles name="admin">
           		 	 <dl id="stayFill" >
             
              </dl>
            	</shiro:hasAnyRoles>
            </div> 
            	 <shiro:hasAnyRoles name="lxd,qznbm">
           		 	 <dl id="stayFill" >
             <dd style="padding-left: 20px">暂无统计汇总</dd>
              </dl>
            	</shiro:hasAnyRoles> 	
       
          </div>
          <div class="notice fl " id="gd">
            <ul>
            	<span class="fl"></span>
                <li class="onForm"><a href="#">最新通知</a></li>
            </ul>
            <dl id="news" >
                   <c:forEach items="${newslist}" var="news" varStatus="num">
              			<dd><code class="redIcon"></code><a href="/news/detail/${news.id}">${news.titles}</a><cite style="font-size:12px; color:#808080; position:absolute; right:15px; top:0">${ news.adddate}</cite></dd>
              	</c:forEach>
            </dl>
          </div>
          
       </div>
       <div class="summary fl">
         <ul>
         		<span class="fl"></span>
         		 <li class="onForm">统计汇总</li>
         </ul>
         <div class="summaryContent">
           <div class="summaryData fl">
               <dl>
	                 <dd class="text"><code>实有人口数：</code>${peoplesummary.syrkzs }</dd>
	                 <dd><code>户籍人口：</code>${peoplesummary.hjrks }</dd>
               </dl>
               <dl class="bgColor">
	                 <dd class="text"><code>来沪租借房屋户数：</code>${peoplesummary.zjfwhs }</dd>
	                 <dd><code>来沪租赁房屋人数：</code>${peoplesummary.lhzlfwrs }</dd>
               </dl>
               <dl>
                 <dd class="text"><code>居住证发放数：</code>${peoplesummary.residencePermit }</dd>
                 <dd><code>统战对象统计：</code>${peoplesummary.tzCount}</dd>
               </dl>
               <dl class="bgColor">
                 <dd class="text"><code>志愿者总人数：</code>${peoplesummary.sqzyzrs}</dd>
                 <dd><code>优抚对象总人数：</code>${peoplesummary.yfdxrs}</dd>
               </dl>
               <dl>
                 <dd class="text"><code>文体团队：</code>${peoplesummary.wttd}</dd>
                 <dd><code>党员人数：</code>${peoplesummary.partyCount}</dd>
               </dl>
               <dl class="bgColor">
                 <dd class="text"><code></code></dd>
                 <dd><code></code></dd>
               </dl>
           </div>
           
			<div class="summaryPic fl">
					<div id="Main">
							<div id="mainDiv"> </div>
					</div>
			</div>
         </div>
       </div>
       <div class="summary fl">
         <ul><span class="fl"></span> 
      		   <li style="background-color:#797979; color:#fff">月度分布图</li>
         </ul>
         <div class="summaryPic" style="text-align:center">
          	<%--<img src="/styles/images/summaryPic_1.png" width="823" height="238"  alt=""/>
          	--%><div id="chartdiv" style="width: 100%; height: 400px;"></div>
      	   <!-- <div id="container1" style="min-width:700px;height:300px"></div> --> 
      	 </div>
       </div>
     </div>
 </div>  
</div>
<script >

parent.changeheight(document.body.offsetHeight);
</script>

</body>
</html>


