<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<%@taglib  uri="http://java.sun.com/jsp/jstl/functions" prefix="fn"%> 
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>

<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<jsp:include page="/page/head.jsp"></jsp:include>
<link rel="stylesheet" href="/scripts/tab/tab.css" type="text/css"></link>
	
<title>人口信息查询</title>


</head>
<body>
	
 <div class="mianpan">
  <div class="panhead">
  <i class="icon-list">&nbsp;&nbsp;</i><strong>人口信息查询</strong>
   
  </div>
  <div id="panbody">
	<div class="container" >
		<p>  <input placeholder="请输入姓名或身份证号码"  type="text" name="code" id="code" />&nbsp;&nbsp;
	  <a class="btn btn-primary" type="button"  onclick="cx()" ><i class="icon-search"></i>查询</a></p>
      
	<input type="hidden" value="${code}" id="code1">
		<table class="table table-striped table-bordered table-hover" style="margin-top: 10px">
			<thead>
				 <tr>    
              
                <th  width="5%">序号</th>    
                <th width="8%">姓名</th>    
                <th width="6%">性别</th>
                <th width="8%">出生年月</th>
                <th width="6%">民族</th>
                <th width="6%">身份证</th>
                <th width="15%">家庭住址</th>   
                <th width="15%">户籍地址</th>   
                <th width="8%">婚姻状况</th>    
                <th width="10%">文化程度</th>    
           <!--      <th width="10%">操作</th>     -->
            </tr>   
			</thead>
			<tbody>
				<c:forEach items="${datas }" var="person" varStatus="num">
					<tr>
					<td>${current==1?num.count+0:num.count+(10*(current-1))}</td>
					<td>${person.XM}</td>
					<td>${person.XBHZ}</td>
					<td>${person.CSRQ}</td>
					<td>${person.MZHZ}</td>
					<td>${person.ZJHM}</td>
					<td>
					    <label rel="tooltip" data-placement="bottom" data-original-title="${person.JZDZ }" title="${person.JZDZ }" href='javascript:' >${fn:substring(person.JZDZ, 0, 10)}..</label>
											</td>
					<td>
				<label rel="tooltip" data-placement="bottom" data-original-title="${person.HJDZ }" title="${person.HJDZ }" href='javascript:' >${fn:substring(person.HJDZ, 0, 10)}..</label> 
			
					</td>
					<td>${person.HYZKHZ}</td>
					<td>${person.WHCDHZ }</td>
					<%--
						<td>
						<div class="btn-group">
						<a  class="btn " href="/aidingwork/item/update/${aidingwork.id}/${businessFormId }"><i class="icon-pencil"></i>修改</a> 
					 <a class="btn  b_delete_item" href="/aidingwork/item/delete/${aidingwork.id }/${businessFormId }" ><i class="icon-trash"></i>删除</a> 
							
						</div>
						</td>
						 --%>
					</tr>
				</c:forEach>
			</tbody>
		</table>
	
		<div class="pagination">
			<input type="text" name="page"  id="page" style="float: right;width: 80px" onblur="on(this.value)"  placeholder="请输入页数" />
		<ul class="" style="float: right;" id="b_pagination"></ul>
		
		</div>
		
	</div>

  </div>
<link href="/scripts/jquery.alerts.css" rel="stylesheet">
<script src="/scripts/jquery.alerts.js"></script>
	<jsp:include page="/page/footer.jsp"></jsp:include>	
	<script>
	function on(page){
		     var reg = new RegExp("^[0-9]*$");
			 if  (!reg.test(page)){ 
				 jAlert('只能输入数字','警告');
			 } else{
				if(page>${pages}){
                   page=${pages};
					}
				if(page<=0){
page=1;
					}			
	      var code=document.getElementById("code1").value;
		 location.href="/person/find/"+page+"?code="+code;
			 }
		}
	function cx(){
	      var code=document.getElementById("code").value;
	      location.href="/person/find/1?code="+code;
			}
		$(function() {
			//分页
			var pagination = new buguPagination('${current}',
					'${pages}', '${count}', '/person/find/', '?code=${code}');
			$('#b_pagination').html(pagination.show());
	
			var dialog = buguDialog.init('删除确认', '确认要删除该名单吗?');
			$('.b_delete_item').on('click', function() {
				dialog.setHref(this.href);
				dialog.show();
				return false;
			});

		});
		  (function($) {
			    $(document).ready(function () {
			      $('label[rel=tooltip]').tooltip({});

			      $(".popover").show();
			    });
			  })(jQuery);
	</script>
</body>
</html>