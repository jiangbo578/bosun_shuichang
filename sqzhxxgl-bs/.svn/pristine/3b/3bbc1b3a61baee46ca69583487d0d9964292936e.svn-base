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
		italy : '${map["01"]}',
		germany : 4.2,
		uk : 3
	}, {
		year : 2+"月份",
		italy : '${map["02"]}',
		germany : 2,
		uk : 6
	}, {
		year : 3+"月份",
		italy : '${map["03"]}',
		germany : 3,
		uk : 1
	}, {
		year : 4+"月份",
		italy : '${map["04"]}',
		germany : 4,
		uk : 1
	}, {
		year : 5+"月份",
		italy : '${map["05"]}',
		germany : 1,
		uk : 2
	}, {
		year : 6+"月份",
		italy : '${map["06"]}',
		germany : 2,
		uk : 1
	}, {
		year : 7+"月份",
		italy : '${map["07"]}',
		germany : 2,
		uk : 3
	}, {
		year : 8+"月份",
		italy : '${map["08"]}',
		germany : 1,
		uk : 5
	}, {
		year : 9+"月份",
		italy : '${map["09"]}',
		germany : 5,
		uk : 2
	}, {
		year : 10+"月份",
		italy : '${map["10"]}',
		germany : 3,
		uk : 6
	}, {
		year : 11+"月份",
		italy : '${map["11"]}',
		germany : 2,
		uk : 4
	},{
		year : 12+"月份",
		italy : '${map["12"]}',
		germany : 2,
		uk : 4
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
				graph.title = "切换";
				graph.valueField = "italy";
				graph.hidden = false; // this line makes the graph initially hidden           
				graph.balloonText = " [[category]]数量: [[value]]";
				graph.lineAlpha = 1;
				 
				graph.bullet = "round";
				graph.lineColor = "#000093";
				
		
			
				
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

				// Germany graph
				//var graph = new AmCharts.AmGraph();
				//graph.title = "Germany";
				//graph.valueField = "germany";
				//graph.balloonText = "place taken by Germany in [[category]]: [[value]]";
				///graph.bullet = "round";
				//chart.addGraph(graph);

				// United Kingdom graph
				//var graph = new AmCharts.AmGraph();
				//graph.title = "United Kingdom";
				//graph.valueField = "uk";
				//graph.balloonText = "place taken by UK in [[category]]: [[value]]";
				///graph.bullet = "round";
				//chart.addGraph(graph);
				// LEGEND
				var legend = new AmCharts.AmLegend();
				legend.markerType = "circle";
			//	chart.addLegend(legend);

				// WRITE
				chart.write("chartdiv");
			});
</script>
       
</head>

<body >
<ul class="breadcrumb" style="margin-bottom: 5px;">
	 <li><a href="/centent"><i class="icon-home"></i>首页</a> <span class="divider">/</span></li>
    <li><a href="#">${date}年不规范生猪养殖户总数走势图</a> <span class="divider"> /</span></li>
  
  </ul>

	<div id="chartdiv" style="width: 100%; height: 400px;"></div>
</body>
</html>
