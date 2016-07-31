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
 <jsp:include page="/page/head.jsp"></jsp:include>
        <script type="text/javascript">
            var chart;

            var chartData = [{
                "country": "1月份",
                    "visits": "${map['01']}",
                    "color": "#FF0F00"
            }, {
                "country": "2月份",
                    "visits": "${map['02']}",
                    "color": "#FF6600"
            }, {
                "country": "3月份",
                    "visits": "${map['03']}",
                    "color": "#FF9E01"
            }, {
                "country": "4月份",
                    "visits": "${map['04']}",
                    "color": "#FCD202"
            }, {
                "country": "5月份",
                    "visits": "${map['05']}",
                    "color": "#F8FF01"
            }, {
                "country": "6月份",
                    "visits": "${map['06']}",
                    "color": "#B0DE09"
            }, {
                "country": "7月份",
                    "visits": "${map['07']}",
                    "color": "#04D215"
            }, {
                "country": "8月份",
                    "visits": "${map['08']}",
                    "color": "#0D8ECF"
            }, {
                "country": "9月份",
                    "visits": "${map['09']}",
                    "color": "#0D52D1"
            }, {
                "country": "10月份",
                    "visits": "${map['10']}",
                    "color": "#2A0CD0"
            }, {
                "country": "11月份",
                    "visits": "${map['11']}",
                    "color": "#8A0CCF"
            }, {
                "country": "12月份",
                    "visits": "${map['12']}",
                    "color": "#CD0D74"
            }];


            var chart = AmCharts.makeChart("chartdiv", {
                type: "serial",
                dataProvider: chartData,
                categoryField: "country",
                pathToImages:"../amcharts/images/",
                depth3D: 20,
                angle: 30,
				
                categoryAxis: {
                    labelRotation: 0,
                    gridPosition: "start",
                  //  title:"月份"
                },

              //  valueAxes: [{
               //     title: "Visitors"
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

               // amExport: {
                 //   top: 21,
                  //  right: 21,
                  //  buttonColor: '#EFEFEF',
                  //  buttonRollOverColor:'#DDDDDD',
                  //  exportPNG:true,
                  //  exportJPG:true,
                 //   exportPDF:true,
                 //   exportSVG:true
              //  }
            });
        </script>
</head>
<body>  
<ul class="breadcrumb" style="margin-bottom: 5px;">
	 <li><a href="/centent"><i class="icon-home"></i>首页</a> <span class="divider">/</span></li>
    <li><a href="#">${date }非法行医总户数统计图</a> <span class="divider"> /</span></li>
  
  </ul>
<div id="chartdiv" style="width: 100%; height: 400px;"></div>
</body>
</html>


