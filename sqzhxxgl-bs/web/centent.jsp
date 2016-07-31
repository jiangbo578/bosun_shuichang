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
   <link rel="stylesheet" href="style.css" type="text/css">
        <script src="/scripts/amcharts/amcharts.js" type="text/javascript"></script>
        <script src="/scripts/amcharts/serial.js" type="text/javascript"></script>

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
            var chart;

            var chartData = [{
                "country": "USA",
                    "visits": 4025,
                    "color": "#FF0F00"
            }, {
                "country": "China",
                    "visits": 1882,
                    "color": "#FF6600"
            }, {
                "country": "Japan",
                    "visits": 1809,
                    "color": "#FF9E01"
            }, {
                "country": "Germany",
                    "visits": 1322,
                    "color": "#FCD202"
            }, {
                "country": "UK",
                    "visits": 1122,
                    "color": "#F8FF01"
            }, {
                "country": "France",
                    "visits": 1114,
                    "color": "#B0DE09"
            }, {
                "country": "India",
                    "visits": 984,
                    "color": "#04D215"
            }, {
                "country": "Spain",
                    "visits": 711,
                    "color": "#0D8ECF"
            }, {
                "country": "Netherlands",
                    "visits": 665,
                    "color": "#0D52D1"
            }, {
                "country": "Russia",
                    "visits": 580,
                    "color": "#2A0CD0"
            }, {
                "country": "South Korea",
                    "visits": 443,
                    "color": "#8A0CCF"
            }, {
                "country": "Canada",
                    "visits": 441,
                    "color": "#CD0D74"
            }, {
                "country": "Brazil",
                    "visits": 395,
                    "color": "#754DEB"
            }, {
                "country": "Italy",
                    "visits": 386,
                    "color": "#DDDDDD"
            }, {
                "country": "Australia",
                    "visits": 384,
                    "color": "#999999"
            }, {
                "country": "Taiwan",
                    "visits": 338,
                    "color": "#333333"
            }, {
                "country": "Poland",
                    "visits": 328,
                    "color": "#000000"
            }];


            var chart = AmCharts.makeChart("chartdiv", {
                type: "serial",
                dataProvider: chartData,
                categoryField: "country",
                pathToImages:"../amcharts/images/",
                depth3D: 20,
                angle: 30,
				
                categoryAxis: {
                    labelRotation: 90,
                    gridPosition: "start"
                },

                valueAxes: [{
                    title: "Visitors"
                }],

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
</head>
<body>  

</head>
<span style="font-family: Arial; font-size: 10; color: #CC0000;">
	<p>Warning! Exporting to image works only if you view this file from web server. Exporting works with all modern browsers except IE9 (works fine with IE10)</p>
</span>
<div id="chartdiv" style="width: 100%; height: 400px;"></div>
</body>
</html>

