<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
<head>
        <script src="/scripts/amcharts/amcharts.js" type="text/javascript"></script>
        <script src="/scripts/amcharts/serial.js" type="text/javascript"></script>
        <script src="/scripts/amcharts/pie.js" type="text/javascript"></script>
        <script src="/scripts/amcharts/exporting/amexport.js" type="text/javascript"></script>
        <script src="/scripts/amcharts/exporting/rgbcolor.js" type="text/javascript"></script>
        <script src="/scripts/amcharts/exporting/canvg.js" type="text/javascript"></script>
        <script src="/scripts/amcharts/exporting/jspdf.js" type="text/javascript"></script>
        <script src="/scripts/amcharts/exporting/filesaver.js" type="text/javascript"></script>
        <script src="/scripts/amcharts/exporting/jspdf.plugin.addimage.js" type="text/javascript"></script>
        <jsp:include page="/page/head.jsp"></jsp:include>
<script type="text/javascript">
	var chart;
	var chartData = [ {
		year : 1+"月份",
		italy : "${map['01']}",
		germany : "${stmap['01']}",
		uk : "${slmap['01']}",
		zt:"${ztmap['01']}"
	}, {
		year : 2+"月份",
		italy : "${map['02']}",
		germany :"${stmap['02']}",
		uk : "${slmap['02']}",
		zt:"${ztmap['02']}"
	}, {
		year : 3+"月份",
		italy : "${map['03']}",
		germany : "${stmap['03']}",
		uk : "${slmap['03']}",
		zt:"${ztmap['03']}"
	}, {
		year : 4+"月份",
		italy :"${map['04']}",
		germany : "${stmap['04']}",
		uk : "${slmap['04']}",
		zt:"${ztmap['04']}"
	}, {
		year : 5+"月份",
		italy : "${map['05']}",
		germany : "${stmap['05']}",
		uk : "${slmap['05']}",
		zt:"${ztmap['05']}"
	}, {
		year : 6+"月份",
		italy : "${map['06']}",
		germany : "${stmap['06']}",
		uk : "${slmap['06']}",
		zt:"${ztmap['06']}"
	}, {
		year : 7+"月份",
		italy : "${map['07']}",
		germany : "${stmap['07']}",
		uk : "${slmap['07']}",
		zt:"${ztmap['07']}"
	}, {
		year : 8+"月份",
		italy : "${map['08']}",
		germany : "${stmap['08']}",
		uk : "${slmap['08']}",
		zt:"${ztmap['08']}"
	}, {
		year : 9+"月份",
		italy : "${map['09']}",
		germany :  "${stmap['09']}",
		uk :  "${slmap['09']}",
		zt:"${ztmap['09']}"
	}, {
		year : 10+"月份",
		italy : "${map['10']}",
		germany : "${stmap['10']}",
		uk : "${slmap['10']}",
		zt:"${ztmap['10']}"
	}, {
		year : 11+"月份",
		italy : "${map['11']}",
		germany : "${stmap['11']}",
		uk : "${slmap['11']}",
		zt:"${ztmap['11']}"
	},{
		year : 12+"月份",
		italy : "${map['12']}",
		germany : "${stmap['12']}",
		uk : "${slmap['12']}",
		zt:"${ztmap['12']}"
	}  ];

	AmCharts.ready(function() {
				// SERIAL CHART
				chart = new AmCharts.AmSerialChart();
				chart.dataProvider = chartData;
				chart.categoryField = "year";
				chart.startDuration = 0.5;
				chart.balloon.color = "#0000";

				//chart.angle = 30;
				//chart.depth3D = 25;


				// AXES
				// category
				var categoryAxis = chart.categoryAxis;
				categoryAxis.fillAlpha = 1;
				categoryAxis.fillColor = "#FAFAFA";
				//categoryAxis.gridAlpha = 0;
				categoryAxis.axisAlpha = 0;
				categoryAxis.gridPosition = "start";
				categoryAxis.position = "top";
				// value
				var valueAxis = new AmCharts.ValueAxis();
			//	valueAxis.title = "无证无照经营总户数";
				//valueAxis.dashLength = 5;
				//valueAxis.axisAlpha = 0;
				valueAxis.minimum = 1;
				valueAxis.maximum = ${max};
				valueAxis.integersOnly = true;
				valueAxis.gridCount = 10;
				valueAxis.reversed = false; // this line makes the value axis reversed
				chart.addValueAxis(valueAxis);

				// GRAPHS
				// Italy graph              
				var graph = new AmCharts.AmGraph();
				graph.title = "农村公厕";
				graph.valueField = "italy";
				graph.hidden = false; // this line makes the graph initially hidden           
				graph.balloonText = " [[category]]数量: [[value]]";
				graph.lineAlpha = 1;
				 
				graph.bullet = "round";
				graph.lineColor = "#CD0D74";
				
		
			
				
				//graph.fillAlphas = 0.8; 
				graph.clickSlice = function(a) {
					alert(a.category);
					a = {
						type : "clickSlice",
						dataItem : a,
						chart : this
					};
					this.fire(a.type, a);
				};
				chart.addGraph(graph);

				//Germany graph
				var graph = new AmCharts.AmGraph();
				graph.title = "乱设摊";
				graph.valueField = "germany";
				graph.balloonText = " [[category]]数量: [[value]]";
				graph.bullet = "round";
				chart.addGraph(graph);
				//渣土
				var graph = new AmCharts.AmGraph();
				graph.title = "渣土卸点";
				graph.valueField = "zt";
				graph.balloonText = " [[category]]数量: [[value]]";
				graph.bullet = "round";
				chart.addGraph(graph);
				 //United Kingdom graph
				var graph = new AmCharts.AmGraph();
				graph.title = "三乱小广告";
				graph.valueField = "uk";
				graph.balloonText = " [[category]]数量: [[value]]";
				graph.bullet = "round";
				chart.addGraph(graph);
				// LEGEND
				var legend = new AmCharts.AmLegend();
				legend.markerType = "circle";
				chart.addLegend(legend);

				// WRITE
				chart.write("chartdiv");
			});
</script>
       
</head>

<body >
<ul class="breadcrumb" style="margin-bottom: 5px;">
	 <li><a href="/centent"><i class="icon-home"></i>首页</a> <span class="divider">/</span></li>
    <li><a href="#">${2014}年市容环卫走势图</a> <span class="divider"> /</span></li>
  
  </ul>

	<div id="chartdiv" style="width: 100%; height: 400px;"></div>
</body>
</html>
