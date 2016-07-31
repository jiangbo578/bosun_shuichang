<%@ page language="java" pageEncoding="UTF-8"%>
<%@include file="/WEB-INF/view/page/taglib.jsp" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<title>统计----嘉定区村居社会管理信息系统</title>
<meta name="keywords" content="嘉定区村居社会管理信息系统"></meta>
<link rel="stylesheet" type="text/css" href="/styles/css/home.css?a=1" ></link>
<script type="text/javascript" src="/styles/js/jquery.min.js"></script>
<script type="text/javascript" src="/styles/js/baes.js"></script>
 <script type="text/javascript" src="/scripts/base.js"></script>
 <script src="/scripts/amcharts/amcharts.js" type="text/javascript"></script>
        <script src="/scripts/amcharts/serial.js" type="text/javascript"></script>
         <script src="/scripts/amcharts/pie.js" type="text/javascript"></script>
	
        <!-- scripts for exporting chart as an image -->
        <!-- Exporting to image works on all modern browsers except IE9 (IE10 works fine) -->
        <!-- Note, the exporting will work only if you view the file from web server -->
        <!--[if (!IE) | (gte IE 10)]> -->
        <script src="/scripts/amcharts/exporting/amexport.js" type="text/javascript"></script>
        <script src="/scripts/amcharts/exporting/rgbcolor.js" type="text/javascript"></script>
        <script src="/scripts/amcharts/exporting/canvg.js" type="text/javascript"></script>
        <script src="/scripts/amcharts/exporting/jspdf.js" type="text/javascript"></script>
        <script src="/scripts/amcharts/exporting/filesaver.js" type="text/javascript"></script>
        <script src="/scripts/amcharts/exporting/jspdf.plugin.addimage.js" type="text/javascript"></script>
        <!-- <![endif]-->
<script type="text/javascript">
		//饼图
		 var chart1;
		var json=[
		          {"name":"沪籍人口","value":'${peoplesummary.hjrks}'},
		          {"name":"境外人员","value":"${peoplesummary.outcome}"},
		          {"name":"来沪人员","value":"${peoplesummary.lhzlfwrs}"},
		          {"name":"人户分离人数","value":"${peoplesummary.residencePermit}"}
		          ]
		        //根据json数据生成饼状图，并将饼状图显示到div中
		       
            AmCharts.ready(function () {
                // PIE CHART
                chart1 = new AmCharts.AmPieChart();

                // title of the chart
                chart1.addTitle("人口分布图", 14);

                chart1.dataProvider = json;
                chart1.titleField = "name";
                chart1.valueField = "value";
                chart1.sequencedAnimation = false;
                chart1.startEffect = "elastic";
                chart1.innerRadius = "30%";
                chart1.startDuration = 0;
                chart1.labelRadius = 7;
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

               // valueAxes: [{
               //     title: "实有人口数"
              //  }],

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
     	<div class="summary fl">
     		<form method="get" action="/summary" id="summaryFormId">
     			选择年份:
     			<select name="summaryDate" id="summaryDate">
     				<option value="2014" onclick="submitForm('summaryFormId')">2014</option>
     				<option value="2013" onclick="submitForm('summaryFormId')">2013</option>
     			</select>
     			选择类型:
     			<select name="type" >
     				<option value="Syrkzs" onclick="submitForm('summaryFormId')">实有人口数</option>
     				<option value="ManCount" onclick="submitForm('summaryFormId')">男性</option>
     				<option value="WomanCount" onclick="submitForm('summaryFormId')">女性</option>
     				<option value="Hjrks" onclick="submitForm('summaryFormId')">户籍人口数</option>
     				<option value="Outcome" onclick="submitForm('summaryFormId')">外来人口</option>
     				<option value="Lhzlfwrs" onclick="submitForm('summaryFormId')">来沪租赁房屋人数</option>
     				<option value="ResidencePermit" onclick="submitForm('summaryFormId')">办居住证</option>
     			</select>
     		</form>
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
							<div id="mainDiv" > </div>
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
$(function(){
	$("select option[value=${selectDate}]").attr("selected","selected");
	$("select option[value=${type}]").attr("selected","selected");
});
</script>

</body>
</html>


